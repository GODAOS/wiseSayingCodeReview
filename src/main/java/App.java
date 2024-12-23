import java.util.Scanner;

public class App {
    public void run() {
        String wise;
        String author;
        int cnt = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("== 명언 앱 ==");
        while (true){
            cnt++;
            System.out.print("명령) ");
            String registration = sc.nextLine();

            if (registration.equals("등록")){
                System.out.print("명언 : ");
                wise = sc.nextLine();// 입력값 가져온다. enter로 마무리
                System.out.print("작가 : ");
                author = sc.nextLine();
                System.out.println(cnt+"번 명언이 등록되었습니다.");
            } else if (registration.equals("종료")) {
                break;
            }
        }
    }
}
