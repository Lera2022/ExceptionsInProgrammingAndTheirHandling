import java.io.FileReader;
import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        try (FileReader reader =  new FileReader("/home/lk/Документы/reps/ExceptionsInProgrammingAndTheirHandling/ErrorHandlingInProgramming/Application.java");
            FileWriter writer = new FileWriter("test")) {
                while (reader.ready()){
                    writer.write(reader.read());
                }
        } catch (RuntimeException | IOException e) {
            System.out.println("catch exception " + e.getClass().getSimpleName());
        }

        try {
            System.out.println ("test operation");
        } finally {
            System.out.println ("finally operation");
        }
        System.out.println("Copy successfully");
    }
}
