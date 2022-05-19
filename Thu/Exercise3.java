import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input
        System.out.print("운동 종류: ");
        String exerciseType = scanner.nextLine();

        if (!exerciseType.equals("자전거") && !exerciseType.equals("걷기") && !exerciseType.equals("달리기")) {
            System.out.println("운동 종류를 올바르게 입력하세요!");
            System.exit(0);
        }

        System.out.print("체중(kg): ");
        int weight = scanner.nextInt();

        System.out.print("운동 시(분): ");
        double exerciseTime = scanner.nextDouble();

        // process
        double exerciseCoefficient = weight * (exerciseTime / 15);

        double calorieConsumption = 0;

        if (exerciseType.equals("자전거")) {
            calorieConsumption = 2.3 * exerciseCoefficient;
        }

        if (exerciseType.equals("걷기")) {
            calorieConsumption = 0.9 * exerciseCoefficient;
        }

        if (exerciseType.equals("달리기")) {
            calorieConsumption = 2.0 * exerciseCoefficient;
        }

        // output
        System.out.print("칼로리 소모: " + calorieConsumption + "kcal");
    }
}
