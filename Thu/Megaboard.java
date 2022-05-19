import java.util.Scanner;

public class Megaboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input
        System.out.print("이용시간(분): ");
        int usingTime = scanner.nextInt();

        System.out.print("파킹존 주차여부: ");
        String parkingZoneUsing = scanner.next();

        // process
        int basicFee = 1000 + 150 * usingTime;

        if (parkingZoneUsing.equals("O")) {
            basicFee -= basicFee / 10;
        }

        if (parkingZoneUsing.equals("X")) {
            basicFee += 3000;
        }

        // output
        System.out.print("요금: " + basicFee + "");
    }
}
