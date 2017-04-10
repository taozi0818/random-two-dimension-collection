import java.util.*;
import java.io.*;

public class Main {

    public static void main(String args[]) {

        int count = 100;
        Random random = new Random();

        try {

            PrintWriter out = new PrintWriter("data.txt");

            for (int i = 0; i < count; i++) {
                double x = random.nextInt(50) + random.nextDouble();
                double y = random.nextInt(50) + random.nextDouble();
                String xFormat = String.format("%.2f", x);
                String yFormat = String.format("%.2f", y);

                out.println(xFormat + "," + yFormat);
            }

            out.close();

            System.out.println("Completed!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}