import java.util.Scanner;

public class exercise {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("운동 종류: ");
        String kind = scanner.nextLine();
        System.out.print("체중(kg): ");
        int weight = scanner.nextInt();
        System.out.print("운동 시간: ");
        float time = scanner.nextFloat();

        double kcal = 0;

        if (kind.equals("자전거")) {
            kcal = 2.3 * weight * (time/15);
        }
        if (kind.equals("걷기")) {
            kcal = 0.9 * weight * (time/15);
        }
        if (kind.equals("달리기")) {
            kcal = 2 * weight * (time/15);
        }
        System.out.println("칼로리 소모: " + kcal + "kcal");
    }
}
