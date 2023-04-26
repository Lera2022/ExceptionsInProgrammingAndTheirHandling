package ExceptionsAndTheirHandling.Homework2;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        int[] intArray = { 20, 19, 18, 4, 16, 15, 14, 4, 12, 11, 9 };
        divideNum(intArray);

    }

    private static void divideNum(int A[]) {
        try {
            int d = inputInt();
            double catchedRes1 = A[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }

    private static int inputInt() {
        boolean incorrect = true;
        String input = "";
        Scanner scanner = new Scanner(System.in);
        while (incorrect) {
            try {
                incorrect = false;
                System.out.println("Ввод целого числа (типа integer)");
                input = scanner.nextLine();
                incorrect = false;
                Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Введены некорректные данные");
                incorrect = true;
            }
        }
        scanner.close();
        return Integer.parseInt(input);
    }
}
