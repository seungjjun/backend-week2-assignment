import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //입력
        System.out.print("운동 종류: ");
        String type = scanner.nextLine();

        System.out.print("체중(kg): ");
        int weight = scanner.nextInt();

        System.out.print("운동 시간(분): ");
        double time = scanner.nextDouble();

        // 칼로리 계산을 위한 변수 선언
        double kcal = 0;

        if (type.equals("자전거")) {
            kcal = 2.3 * weight * (time / 15);
        }

        if (type.equals("걷기")) {
            kcal = 0.9 * weight * (time / 15);
        }

        if (type.equals("달리기")) {
            kcal = 2 * weight * (time / 15);
        }

        // 결과
        System.out.println("칼로리 소모: " + kcal + "kcal");
    }
}
