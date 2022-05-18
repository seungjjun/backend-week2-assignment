import java.util.Scanner;

public class BMI2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력
        System.out.print("신장(cm): ");
        double height = scanner.nextDouble();

        System.out.print("체중(kg): ");
        Double weight = scanner.nextDouble();

        // cm -> m
        height /= 100;

        // bmi 계산
        double bmi = weight / (Math.pow(height, 2));

        // 비만도 결과 변수
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

        // 결과
        System.out.println("비만도 결과: " + result);

        System.out.println("BMI: " + bmi);
    }
}

