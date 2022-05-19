import java.util.Scanner;

public class TestYourMath3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input
        System.out.print("Input 2 number: ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a + " + " + b + " = ?");
        int answerSum = scanner.nextInt();
        System.out.println(a + " * " + b + " = ?");
        int answerMul = scanner.nextInt();

        // process
        boolean resultSum = answerSum == a + b;
        boolean resultMul = answerMul == a * b;

        String result = "";

        if (resultSum && resultMul) {
            result = "Genius!";
        }

        if (resultSum && !resultMul || !resultSum && resultMul) {
            result = "Muggle!";
        }

        if (!resultSum && !resultMul) {
            result = "Stupid!";
        }

        // output
        System.out.print(result);
    }
}
