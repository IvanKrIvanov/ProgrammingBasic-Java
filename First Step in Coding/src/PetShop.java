import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double dogFoodCount = Double.parseDouble(scanner.nextLine());
        double catFoodCount = Double.parseDouble(scanner.nextLine());

        double dogFoodPrice = dogFoodCount * 2.5;
        double carFoodPrice = catFoodCount * 4;

        double finalPrice = carFoodPrice + dogFoodPrice;

        System.out.printf("%f lv.", finalPrice);

    }
}
