package javabean;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Architect
 */
public class TempConvertTest {
    
    TempConvert tempConvert = new TempConvert();
    
    @Test
    public void testFahrenheitToCelsius() {
        System.out.println("Testing fahrenheitToCelsius method.  Converting 32.0 F to Celsius.  Expected result is 0.0 C");
        double fahrenheit = 32.0;
        double expectedResult = 0.0;
        double actualResult = tempConvert.fahrenheitToCelsius(fahrenheit);
        assertEquals(expectedResult, actualResult, 0.0);
        
    }

    /**
     * Test of celsiusToFahrenheit method, of class TempConvert.
     */
    @Test
    public void testCelsiusToFahrenheit() {
        System.out.println("Testing celsiusToFahrenheit method.  Converting 0.0 C to Fahrenheit.  Expected result is 32.0 F");
        double celsius = 0.0;
        double expectedResult = 32.0;
        double actualResult = tempConvert.celsiusToFahrenheit(celsius);
        assertEquals(expectedResult, actualResult, 0.0);
        
    }
    
}
