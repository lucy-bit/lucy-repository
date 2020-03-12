import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(scanner.hasNextLine());
            scanner.nextLine();
        }
    }
}
