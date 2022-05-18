import java.text.DecimalFormat;
import java.util.Scanner;

public class SavingCalculator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat Commas = new DecimalFormat("###,###");

        System.out.println("적금 이자 계산기");

        // 입력
        System.out.println("월 적립액을 입력해주세요(원): ");
        double monthSavingMoney = scanner.nextDouble();

        System.out.println("적금 기간을 입력해주세(년): ");
        int period = scanner.nextInt();

        System.out.println("연 이자율을 입력해주세(%): ");
        double yearInterestRate = scanner.nextDouble();

        // 원금합계
        double sumMoney = monthSavingMoney * (period * 12);

        // 원금합계 출력
        String sumMoneyComma = Commas.format(sumMoney);
        System.out.println("원금합계: " + sumMoneyComma + "원");

        // 연 이자율 -> 월 이자율
        double monthInterestRate = (yearInterestRate / 100) / 12;

        // 이전에 적립해둔 금 + 한달 원금
        double monthSavingMoneySum = 0;

        int i = 0;

        // 원리합계
        while (i < period * 12) {
            monthSavingMoneySum += monthSavingMoney;
            monthSavingMoneySum += monthSavingMoneySum * monthInterestRate;
            i += 1;
        }

        // 총 이자
        double tax = monthSavingMoneySum - sumMoney;

        // 세후 이자
        double afterTax = tax - tax * 0.154;

        // 세후 이자 출력
        String afterTaxComma = Commas.format(afterTax);
        System.out.println("세후이자: " + afterTaxComma + "원");

        // 세후 총 수령액
        double sum = sumMoney + afterTax;

        //세후 총 수령액 출력
        String sumComma = Commas.format(sum);
        System.out.println("세후 총 수령액: " + sumComma + "원");
    }
}
