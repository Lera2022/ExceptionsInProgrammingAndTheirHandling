import java.io.FileReader;
import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        try (FileReader reader =  new FileReader("/home/lk/Документы/reps/ExceptionsInProgrammingAndTheirHandling/ErrorHandlingInProgramming/Application.java");\
        new FileWriter("test")) {
            test.read();
        } catch (RuntimeException | IOException e) {
            System.out.println("catch exception " + e.getClass().getSimpleName());
        }
    }
}
