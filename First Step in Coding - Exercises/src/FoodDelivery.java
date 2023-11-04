import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int veganMenu = Integer.parseInt(scanner.nextLine());
        double delivery = 2.50;

        double chickenMenuPrice = chickenMenu * 10.35;
        double fishMenuPrice = fishMenu * 12.40;
        double veganMenuPrice = veganMenu * 8.15;

        double totalMenuPrice = chickenMenuPrice + fishMenuPrice + veganMenuPrice;

        double desertPrice = totalMenuPrice * 0.20;

        double totalPrice = totalMenuPrice + desertPrice + delivery;

        System.out.println(totalPrice);

    }
}
