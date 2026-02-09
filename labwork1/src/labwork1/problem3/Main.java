package labwork1.problem3;

public class Main {
    public static void main(String[] args) {
        Temperature temperature = new Temperature(20, 'C');

        System.out.println("F: " + temperature.getTemperatureinFahrenheit());
        System.out.println("C: " + temperature.getTemperatureinCelsius());
    }
}