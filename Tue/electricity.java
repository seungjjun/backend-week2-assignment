import java.util.Scanner;

public class electricity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("전기 사용량(kWh): ");
        int use = scanner.nextInt();

        double fee = 0;
        if (use <= 300) {
            fee = 88.3 * use;
        }
        if (use > 300 && use <= 450) {
            fee = (88.3 * 300) + ((use - 300) * 182.9);
        }
        if (use > 450 && use <= 1000) {
            fee = (88.3 * 300) + (182.9 * 150) + ((use - 450) * 275.6);
        }
        if (use > 1000) {
            fee = (88.3 * 300) + (182.9 * 150) + (275.6 * 550) + ((use - 1000) * 704.5);
        }

        System.out.print("사용 금액: " + (int)fee);
    }
}
