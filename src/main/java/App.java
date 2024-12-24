import java.util.*;

public class App {
    private Scanner sc = new Scanner(System.in);
    private Map<Integer, WiseList> wise_list = new HashMap<>();

    public void run() {// 명령 실행

        System.out.println("== 명언 앱 ==");
        while (true) {
            System.out.print("명령) ");
            String command = sc.nextLine();

            if (command.equals("종료")) {
                System.exit(0);// 프로그램 종료
                break;
            } else if (command.equals("등록")) {
                add();
            } else if (command.equals("목록")) {
                showList();
            } else if (command.contains("삭제")) {
                deleteWise(command);
            } else if (command.contains("수정")) {
                modifyWise(command);
            } else {
                System.out.println("잘못된 명령입니다.");
            }
        }
    }



    // 등록 처리
    private void add() {
        System.out.print("명언 : ");
        String text = sc.nextLine();// 입력값 가져온다. enter로 마무리
        System.out.print("작가 : ");
        String author = sc.nextLine();

        WiseList wiseList = new WiseList(text, author);

        wise_list.put(wiseList.getId(), wiseList);
        System.out.println(wiseList.getId() + "번 명언이 등록되었습니다.");
    }

    // 목록 처리
    private void showList() {
        System.out.println("번호 / 작가 / 명언");
        System.out.println("----------------------");
        if (wise_list.isEmpty()) {
            System.out.println("등록된 명언이 없습니다.");
        } else {
            for (int i = WiseList.getIdCount(); i > 0; i--) {
                if (wise_list.get(i) == null){ // 명언이 비어있을때
                    continue;
                }
                wise_list.get(i).display();// 목록 역순 출력
            }
        }
    }

    // 삭제처리
    private void deleteWise(String command) {
        // '삭제?id=' 분리
        String[] arr = command.split("=");
        Integer id = Integer.parseInt((arr[1]));

        // 해당 명언 존재 여부
        if(wise_list.get(id)==null){ // 해당 명언이 존재하지 않는다면
            System.out.println(id+"번 명언이 존재하지 않습니다.");
        } else if (wise_list.get(id)!=null) {// 존재한다면
            wise_list.remove(id);
            System.out.println(arr[1] + "번 명언이 삭제되었습니다.");
        }

    }

    //수정
    private void modifyWise(String command) {
        // '수정?id=' 분리
        String[] arr = command.split("=");
        Integer id = Integer.parseInt((arr[1]));

        if(wise_list.get(id)==null){ // 해당 명언이 존재하지 않는다면
            System.out.println(id+"번 명언이 존재하지 않습니다.");
        } else if (wise_list.get(id)!=null) {// 존재한다면
            // 수정할 코드
            WiseList targetList = wise_list.get(id);

        }

    }

}


