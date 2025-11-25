import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class homework8 {
    public static void main(String[] args) {
        // 1. ID - PW 저장할 해시맵
        Map<String, String> accounts = new HashMap<>();
        accounts.put("myId", "myPass");
        accounts.put("myId2", "myPass2");
        accounts.put("myId3", "myPass3");

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id : ");
            String inputId = sc.nextLine().trim();   // 공백 제거

            // 2. ID 존재 여부 확인
            if (!accounts.containsKey(inputId)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
                continue;   // 처음으로 돌아가서 다시 입력
            }

            System.out.print("password : ");
            String inputPw = sc.nextLine().trim();   // 공백 제거
            String realPw = accounts.get(inputId);

            // 3. 비밀번호 일치 여부 확인
            if (!realPw.equals(inputPw)) {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
                continue;
            }

            // 4. 모두 일치
            System.out.println("id와 비밀번호가 일치합니다.");
            break;  // 로그인 성공 후 종료
        }

        sc.close();
    }
}

