package src;

public class Converter {
    Double magnitude;
    String unit;

    public Converter(Double magnitude, String unit) {
        this.magnitude = magnitude;
        this.unit = unit;
    }

    public Double toFahrenheit() {
        if (this.unit.equalsIgnoreCase("F")) {
            return this.magnitude;
        } else if (this.unit.equalsIgnoreCase("C")) {
            return this.magnitude * 9 / 5 + 32;
        } else if (this.unit.equalsIgnoreCase("K")) {
            return (this.magnitude - 32) * 5 / 9 + 273.15;
        } else if (this.unit.equalsIgnoreCase("R")) {
            return (this.magnitude + 459.67);
        } else {
            return null;
        }
    }

    public Double toCelsius() {
        if (this.unit.equalsIgnoreCase("F")) {
            return (this.magnitude - 32) * 5 / 9;
        } else if (this.unit.equalsIgnoreCase("C")) {
            return this.magnitude;
        } else if (this.unit.equalsIgnoreCase("K")) {
            return this.magnitude + 273.15;
        } else if (this.unit.equalsIgnoreCase("R")) {
            return (this.magnitude + 273.15) * 9 / 5;
        } else {
            return null;
        }
    }

    public Double toKelvin() {
        if (this.unit.equalsIgnoreCase("F")) {
            return (this.magnitude - 32) * 5 / 9 + 273.15;
        } else if (this.unit.equalsIgnoreCase("C")) {
            return this.magnitude + 273.15;
        } else if (this.unit.equalsIgnoreCase("K")) {
            return this.magnitude;
        } else if (this.unit.equalsIgnoreCase("R")) {
            return this.magnitude * 9 / 5;
        } else {
            return null;
        }
    }

    public Double toRankine() {
        if (this.unit.equalsIgnoreCase("R")) {
            return this.magnitude;
        } else if (this.unit.equalsIgnoreCase("F")) {
            return this.magnitude - 459.67;
        } else if (this.unit.equalsIgnoreCase("C")) {
            return (this.magnitude - 491.67) * 5 / 9;
        } else if (this.unit.equalsIgnoreCase("K")) {
            return this.magnitude * 5 / 9;
        } else {
            return null;
        }
    }
}
