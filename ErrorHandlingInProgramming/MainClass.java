package ErrorHandlingInProgramming;

public class MainClass {
    public static void main(String[] args) {
        int a = 0;
        int b = 10 / a;
    }

    public static int div(int a, int b) {
        if (b == 0) {
            throw new RuntimeException("Нельзя делить на 0");
        }
        return a / b;
    }
}

// 26:27