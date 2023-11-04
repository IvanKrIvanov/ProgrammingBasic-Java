import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yearTax = Integer.parseInt(scanner.nextLine());

        double shoes = yearTax * 0.60;
        double dress = shoes * 0.80;
        double ball = dress * 0.25;
        double accessories = ball * 0.20;

        double total = yearTax + shoes + dress + ball + accessories;

        System.out.println(total);

    }
}
