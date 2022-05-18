import java.util.Scanner;

public class electricity2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("전기 사용랑(kWh): ");
        int amount = scanner.nextInt();

        double fee = 0;

        if (amount <= 300) {
            fee = 88.3 * amount;
        }

        if (amount > 300 && amount <= 450) {
            fee = 88.3 * 300 + (amount - 300) * 182.9;
        }

        if (amount > 450 && amount <= 1000) {
            fee = (88.3 * 300) + (182.9 * 150) + (amount - 450) * 275.6;
        }

        if (amount > 1000) {
            fee = (88.3 * 300) + (182.9 * 150) + (275.6 * 550) + (amount - 1000) * 704.5;
        }

        System.out.println("사용 금액: " + (int) fee);
    }
}
