package labwork1.problem3;

public class Temperature {

    private double temperature;
    private char unit;

    public Temperature() {
        this(0, 'C');
    }

    public Temperature(double temperature) {
        this(temperature, 'C');
    }

    public Temperature(char unit) {
        this(0, unit);
    }

    public Temperature(double temperature, char unit) {
        this.temperature = temperature;
        this.unit = unit;
    }

    public double getTemperatureinCelsius() {
        if (unit == 'C') return temperature;
        return 5 * (temperature - 32) / 9;
    }

    public double getTemperatureinFahrenheit() {
        if (unit == 'F') return temperature;
        return 9 * (temperature / 5) + 32;
    }

    public char getScale() {
        return unit;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setScale(char unit) {
        this.unit = unit;
    }

    public void setBoth(double temperature, char unit) {
        this.temperature = temperature;
        this.unit = unit;
    }
}