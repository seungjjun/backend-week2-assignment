import java.util.Scanner;

public class TestYourMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input 2 number: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a + " + " + b + " = ?");
        int ans1 = scanner.nextInt();
        System.out.println(a + " * " + b + " = ?");
        int ans2 = scanner.nextInt();

        boolean res1 = ans1 == a + b;
        boolean res2 = ans2 == a * b;

        if (res1 && res2) {
            System.out.println("Genius!");
        }
        if ((res1 && !res2) || (!res1 && res2)) {
            System.out.println("Muggle!");
        }
        if (!res1 && !res2) {
            System.out.println("Stupid!");
        }
    }
}
