import java.io.FileReader;
import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        FileReader test = null;
        try {
            test = new FileReader("/home/lk/Документы/reps/ExceptionsInProgrammingAndTheirHandling/ErrorHandlingInProgramming/Application.java");
            // test.read();
        } catch (RuntimeException | IOException e) {
            System.out.println("catch exception " + e.getClass().getSimpleName());
        } finally {
            System.out.println("finally start");
            if (test != null) {
                try {
                    test.close();
                } catch (IOException e) {
                    System.out.println("exception while close");
                }
            }
            System.out.println("finally finished");
        }
    }
}
