import java.text.DecimalFormat;
import java.util.Scanner;

public class SavingCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat Commas = new DecimalFormat("###,###");

        System.out.println("적금 이자 계산기");

        System.out.println("월 적립액을 입력해주세요(원): ");
        int monthMoney = scanner.nextInt();

        System.out.println("적금 기간을 입력해주세요(년): ");
        int period = scanner.nextInt();

        System.out.println("연 이자율을 입력해주세요(%): ");
        float yearRate = scanner.nextFloat();

        // 원금합계
        int sum = monthMoney * (period * 12);
        // 원금합계 세자리수마다 콤마 찍기 위한 변수 선언
        String sum2 = Commas.format(sum);
        System.out.println("원금합계: " + sum2 + "원");

        // 월 이자율
        double monthRate = (yearRate/100)/12;

        //총 이자액 선언
        double tax = 0;

        // 이전에 적립해둔 금액 + 한달원금
        double beforeMonthMoney = monthMoney;

        // 적금 이자 계산
        int i = 1;
        while (i <= (period*12)) {
            tax = beforeMonthMoney + (beforeMonthMoney * monthRate);
            beforeMonthMoney = tax + monthMoney;
            i += 1;
        }


        // 이자의 세금 선언
        double totalTax = 0;

        // 총 이자액
        tax -= sum;

        // 총 이자의 세금
        totalTax = tax * 0.154;

        // 이자액 - 세금
        tax -= totalTax;

        //세후이자 세자리수마다 콤마 찍기 위한 변수 선언
        String tax2 = Commas.format(tax);
        System.out.println("세후이자: "+ tax2 + "원");

        // 세후 총 수령액
        double taxsum = sum + tax;

        // 세후 총 수령액 세자리수마다 콤마 찍기 위한 변수 선언
        String  taxsum2 = Commas.format(taxsum);
        System.out.println("세후 총 수령액: "+ taxsum2 + "원");
    }
}
