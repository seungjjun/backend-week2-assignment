import java.util.Scanner;

public class TestYourMath2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력
        System.out.print("Input 2 number: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        //답 입력
        System.out.println(a + " + " + b + " = ?");
        int answer1 = scanner.nextInt();
        System.out.println(a + " * " + b + " = ?");
        int answer2 = scanner.nextInt();

        // 답이 정답인지 참/거짓으로 판별
        boolean result1 = answer1 == a + b;
        boolean result2 = answer2 == a * b;

        // 문구 출력을 위한 변수 선언
        String output = "";

        // 정답인지 판별
        if (result1 && result2) {
            output = "Genius!";
        }

        if ((result1 && !result2) || (!result1 && result2)) {
            output = "Muggle!";
        }

        if (!result1 && !result2) {
            output = "Stupid!";
        }

        // 결과
        System.out.println(output);
    }
}
