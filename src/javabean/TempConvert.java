package javabean;

/**
 *
 * @author Architect
 */
public class TempConvert {

    private double convertedTemp;

    public double fahrenheitToCelsius(double fahrenheit) {

        this.convertedTemp = ((fahrenheit - 32.0) * (5.0 / 9.0));

        return this.convertedTemp;

    }

    public double celsiusToFahrenheit(double celsius) {

        this.convertedTemp = ((celsius * (9.0 / 5.0)) + 32.0);

        return this.convertedTemp;

    }

}
