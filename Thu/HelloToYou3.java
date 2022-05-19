import java.util.Scanner;

public class HelloToYou3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input
        System.out.print("What`s your name? ");
        String name = scanner.nextLine();

        // output
        System.out.println("Hello, " + name + "!");
    }
}
