import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class homework9 {
    public static void main(String[] args) {

        // 1. ID - PW 저장할 해시맵
        Map<String, String> accounts = new HashMap<>();

        // 1-1. db.txt에서 ID, PW 쌍 읽어오기 (상대경로)
        try (Scanner fileScanner = new Scanner(new File("db.txt"))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine().trim();
                if (line.isEmpty()) continue;   // 빈 줄 건너뛰기

                // 공백 기준으로 나누기
                String[] tokens = line.split("\\s+");
                if (tokens.length < 2) continue; // 형식 안 맞으면 건너뛰기

                String id = tokens[0].trim();
                String pw = tokens[1].trim();

                accounts.put(id, pw);
            }
        } catch (FileNotFoundException e) {
            System.out.println("db.txt 파일을 찾을 수 없습니다. 프로그램을 종료합니다.");
            return;    // 로그인 진행 불가하니 종료
        }

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

