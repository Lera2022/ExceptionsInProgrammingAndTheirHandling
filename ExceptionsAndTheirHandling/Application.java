package ExceptionsAndTheirHandling;

import java.io.FileNotFoundException;
// import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

// import java.io.File;

public class Application {
    public static void main(String[] args) {
        // String name = null;
        // System.out.println(name.length());

        // Object object = new String("123");
        // File file = (File) object;
        // System.out.println(file);

        // String number = "123fq";
        // int result = Integer.parseInt(number);
        // System.out.println(result);

        // List<Object> emptyList = Collections.emptyList();
        // emptyList.add(new Object());

        // int number = 1;
        // try {
        // number = 10 / 1;
        // String test = null;
        // // System.out.println(test.length());
        // Collections.emptyList().add(new Object());
        // } catch (ArithmeticException e) {
        // System.out.println("division by zero is not supported");
        // } catch (NullPointerException e) {
        // System.out.println("string is null");
        // } catch (Exception e) {
        // System.out.println("exception");
        // }
        // System.out.println(number);
        FileReader test = null;
        try {
            test = new FileReader(
                    "/Users/User/Documents/ExceptionsInProgrammingAndTheirHandling/ErrorHandlingInProgramming/Homework1/Task1.java");
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
