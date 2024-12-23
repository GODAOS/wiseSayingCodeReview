import java.util.HashMap;
import java.util.Scanner;

public class App {
    public void run() {
        String wise;
        String author;
        HashMap<Integer,String> wise_list = new HashMap<>();
        int cnt = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("== 명언 앱 ==");
        while (true){
            System.out.print("명령) ");
            String command = sc.nextLine();

            if (command.equals("종료")) {
                break;
            } else if (command.equals("등록")){
                System.out.print("명언 : ");
                wise = sc.nextLine();// 입력값 가져온다. enter로 마무리
                System.out.print("작가 : ");
                author = sc.nextLine();
                cnt++;
                wise_list.put(cnt,author+" / "+wise);
                System.out.println(cnt+"번 명언이 등록되었습니다.");
            } else if (command.equals("목록")) {
                System.out.println("번호 / 작가 / 명언");
                System.out.println("----------------------");
                for (int i = wise_list.size(); i > 0; i--) {
                    System.out.println(i+" / "+wise_list.get(i));
                }
            }
        }
    }
}
