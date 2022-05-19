import java.text.DecimalFormat;
import java.util.Scanner;

public class SavingCalculator3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat commasDisplay = new DecimalFormat("###,###");

        System.out.println("적금 이자 계산기");

        // input
        System.out.println("월 적립액을 입력해주세요(원): ");
        int monthSavingCash = scanner.nextInt();

        System.out.println("적금 기간을 입력해주세요(년): ");
        int savingPeriod = scanner.nextInt();

        System.out.println("연 이자을 입력해주세요(%): ");
        double yearInterestRate = scanner.nextDouble();

        // process
        double monthInterestRate = yearInterestRate / 100 / 12;

        int originalCashSum = monthSavingCash * savingPeriod * 12;

        double beforeMonthSavingCash = 0;

        int count = 0;

        while (count < savingPeriod * 12) {
            beforeMonthSavingCash += monthSavingCash;
            beforeMonthSavingCash += beforeMonthSavingCash * monthInterestRate;
            count += 1;
        }

        double afterTax = (beforeMonthSavingCash - originalCashSum) - (beforeMonthSavingCash - originalCashSum) * 0.154;

        double totalAfterTaxCash = originalCashSum + afterTax;

        // output
        String originalCashSumCommaDisplay = commasDisplay.format(originalCashSum);
        System.out.println("원금합계: " + originalCashSumCommaDisplay + "원");

        String afterTaxCommaDisplay = commasDisplay.format(afterTax);
        System.out.println("세후이자: " + afterTaxCommaDisplay + "원");

        String totalAfterTaxCashCommaDisplay = commasDisplay.format(totalAfterTaxCash);
        System.out.println("세후 총 수령액: " + totalAfterTaxCashCommaDisplay + "원");
    }
}
