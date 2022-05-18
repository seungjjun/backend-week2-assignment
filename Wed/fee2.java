import java.util.Scanner;

public class fee2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력
        System.out.print("이용시간(분): ");
        int time = scanner.nextInt();

        System.out.print("파킹 주차여부: ");
        String ox = scanner.next();

        // 기본요금
        int fee = 1000 + time * 150;

        // 파킹존 주차여부 판별
        if (ox.equals("O")) {
            fee -= (fee / 10);
        }

        if (ox.equals("X")) {
            fee += 3000;
        }

        // 결과
        System.out.println("요금: " + fee + " 원");
    }
}
