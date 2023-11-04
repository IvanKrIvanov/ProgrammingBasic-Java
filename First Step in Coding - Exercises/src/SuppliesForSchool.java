import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pen = Integer.parseInt(scanner.nextLine());
        int marker = Integer.parseInt(scanner.nextLine());
        int cleaning = Integer.parseInt(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());

        double pricePen = pen * 5.8;
        double priceMarker = marker * 7.2;
        double priceCleaning = cleaning * 1.2;

        double totalPrice = priceCleaning + priceMarker + pricePen;

        double finalPrice = totalPrice - (totalPrice * (discount / 100));

        System.out.println(finalPrice);

    }
}
