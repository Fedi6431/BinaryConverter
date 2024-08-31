import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Binary converter = new Binary();

        System.out.println("Binary converter\n1) String to binary\n2) Binary to String");
        System.out.print("\n--> ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline

        if (choice == 1) {
            System.out.println("\nType the string to convert to binary");
            System.out.print("--> ");
            String message = scanner.nextLine();
            converter.StringToBinary(message);
        } else if (choice == 2) {
            System.out.println("\nType the binary string to convert");
            System.out.print("--> ");
            String message = scanner.nextLine();
            converter.BinaryToString(message);
        } else {
            System.out.println("Invalid choice. Please select 1 or 2.");
        }

        scanner.close();
    }
}