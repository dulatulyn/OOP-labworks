package labwork1.problem1;

import java.util.Scanner;

public class Analyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Data data = new Data();

        while (true) {
            System.out.print("Enter number (Q to quit): ");

            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                data.insert(value);
            } else {
                String s = scanner.next();
                if (s.equalsIgnoreCase("Q")) break;
            }
        }

        System.out.println("Average = " + data.getAvg());
        System.out.println("Maximum = " + data.getMax());
    }
}