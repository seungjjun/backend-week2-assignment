import java.util.Scanner;

public class EscapeRoom2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 1;

        while (i <= 3) {
            // 입력

            System.out.print("Input 2 number: ");

            int a = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.println(a + " + " + b + " = ?");

            // 답 입력
            int result = scanner.nextInt();

            boolean answer = result == a + b;

            if (answer) {
                System.out.println("You`re right! (" + i + ")");
                i += 1;
            }

            if (!answer) {
                System.out.println("What?");
            }
        }
        System.out.println("Escape!");
    }
}
