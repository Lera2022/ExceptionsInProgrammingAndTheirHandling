package ExceptionsAndTheirHandling.Homework2;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        inputFloat();
    }

    private static float inputFloat() {
        boolean incorrect = true;
        String input = "";
        Scanner scanner = new Scanner(System.in);
        while (incorrect) {
            try {
                incorrect = false;
                System.out.println("Ввод дробного числа (типа float)");
                input = scanner.nextLine();
                Float.parseFloat(input);
            } catch (NumberFormatException e) {
                System.out.println("Введены некорректные данные");
                incorrect = true;
            }
        }
        scanner.close();
        return Float.parseFloat(input);
    }
}
