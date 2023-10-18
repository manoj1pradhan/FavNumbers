import java.util.Scanner;

class UserInputValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int favoriteInteger = getInt(scanner, "Enter your favorite integer: ");

        double favoriteDouble = getDouble(scanner, "Enter your favorite double: ");

        System.out.println("Your favorite integer is: " + favoriteInteger);
        System.out.println("Your favorite double is: " + favoriteDouble);

        scanner.close();
    }

    public static int getInt(Scanner scanner, String prompt) {
        int favoriteInteger = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print(prompt);

            if (scanner.hasNextInt()) {
                favoriteInteger = scanner.nextInt();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next();
            }
        }

        return favoriteInteger;
    }

    public static double getDouble(Scanner scanner, String prompt) {
        double favoriteDouble = 0.0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print(prompt);

            if (scanner.hasNextDouble()) {
                favoriteDouble = scanner.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid double.");
                scanner.next();
            }
        }

        return favoriteDouble;
    }
}
