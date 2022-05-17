import java.util.Scanner;

public class EscapeRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = 0;
        while (cnt < 3) {
            System.out.print("Input 2 numbers: ");

            int a = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.println(a + " + " + b + " = ?");

            int result = scanner.nextInt();

            boolean answer = result == a + b;
            if (answer) {
                cnt += 1;
                System.out.println("You`re right! (" + cnt + ")");
            }
            if (!answer) {
                System.out.println("What?");
            }
        }
        System.out.println("Escape!");
    }
}
