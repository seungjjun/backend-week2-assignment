import java.util.Scanner;

public class ElectricBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input
        System.out.print("전기 사용량(kWh): ");
        int electricityUsage = scanner.nextInt();

        // process
        double electricityFee = 0;

        double electricityUsage300 = 88.3 * 300;
        double electricityUsage450 = electricityUsage300 + (182.9 * 150);
        double electricityUsage1000 = electricityUsage450 + (275.6 * 550);

        if (electricityUsage <= 300) {
            electricityFee = 88.3 * electricityUsage;
        }

        if (electricityUsage > 300 && electricityUsage <= 450) {
            electricityFee = electricityUsage300 + (electricityUsage - 300) * 182.9;
        }

        if (electricityUsage > 450 && electricityUsage <= 1000) {
            electricityFee = electricityUsage450 + (electricityUsage - 450) * 275.6;
        }

        if (electricityUsage > 1000) {
            electricityFee = electricityUsage1000 + (electricityUsage - 1000) * 704.5;
        }

        // output
        System.out.print("사용 금액: " + (int) electricityFee);
    }
}
