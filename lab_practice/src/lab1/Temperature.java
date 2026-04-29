package lab1;

public class Temperature {
    private double value;
    private char scale;

    public Temperature() {
        this.value = 0;
        this.scale = 'C';
    }

    public Temperature(double value, char scale) {
        this.value = value;
        this.scale = scale;
    }

    public Temperature(char scale) {
        this.value = 0;
        this.scale = scale;
    }

    public Temperature(double value) {
        this.value = value;
        this.scale = 'C';
    }

    public double getCelsius() {
        if (scale == 'C' || scale == 'c') {
            return value;
        }
        return 5 * (value - 32) / 9;
    }

    public double getFahrenheit() {
        if (scale == 'F' || scale == 'f') {
            return value;
        }
        return (9 * value) / 5 + 32;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setScale(char scale) {
        this.scale = scale;
    }

    public void setBoth(double value, char scale) {
        this.value = value;
        this.scale = scale;
    }

    public String getScale() {
        if(scale == 'C'){
            return "Celsius";
        } else {
            return "Fahrenheit";
        }
    }

}
