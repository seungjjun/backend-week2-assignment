import java.util.Scanner;

public class HelloToYou2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What`s your name? ");
        String name = input.nextLine();

        System.out.println("Hello, " + name + "!");
    }
}
