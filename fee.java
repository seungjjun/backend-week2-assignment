import java.util.Scanner;

public class fee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("이용시간(분): ");
        int time = scanner.nextInt();
        System.out.print("파킹존 주차여부: ");
        String park = scanner.next();

        int fee = 1000 + (150 * time);

        if (park.equals("O")) {
            fee -= fee/10;
        }
        if (park.equals("X")) {
            fee += 3000;
        }

        System.out.println("요금: "+ fee + "원");
    }
}
