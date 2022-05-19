import java.util.Scanner;

public class BMI3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input
        System.out.print("신장(cm): ");
        float height = scanner.nextFloat();

        System.out.print("체중(kg): ");
        float weight = scanner.nextFloat();

        // process
        double bmi = weight / Math.pow((height / 100), 2);

        String result = "";

        if (bmi <= 18.5) {
            result = "저체중";
        }

        if (bmi > 18.5 && bmi <= 23) {
            result = "정상";
        }

        if (bmi > 23 && bmi <= 25) {
            result = "과체중";
        }

        if (bmi > 25) {
            result = "비만";
        }

        // output
        System.out.println("비만도 결과: " + result);

        System.out.println("BMI: " + bmi);
    }
}
