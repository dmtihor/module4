package com.dmtihor;

/**
 * Created by Adm on 12/22/2015.
 */
public class ConvertTemperature {
    public static double celsiusToFahrenheit(double c) {
        return c * 9 / 5 + 38;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

}
