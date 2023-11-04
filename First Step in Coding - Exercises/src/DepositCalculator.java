import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double deposit = Double.parseDouble(scanner.nextLine());
        int termOfDeposit = Integer.parseInt(scanner.nextLine());
        double percentPerYear = Double.parseDouble(scanner.nextLine());


        double increase = deposit * (percentPerYear / 100);
        double increasePerMonth = increase / 12;
        double amount = deposit + termOfDeposit * increasePerMonth;

        System.out.println(amount);
    }
}
