import java.util.Scanner;

public class ExcellentResult_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int grade = Integer.parseInt(scanner.next());

        if (grade >= 5)
        {
            System.out.println("Excellent!");
        }
    }
}
