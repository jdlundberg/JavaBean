package javabean;

/**
 *
 * @author Architect
 */
public class JavaBean {
    
    public static void main(String[] args) {
        
        TempBean tempBean = new TempBean();
        TempConvert tempConvert = new TempConvert();
        double temp = 96.3;
        
        System.out.println("The current temperature in Lousiana is " + temp + " degrees, Fahrenheit");
        
        tempBean.setTemp(temp);
        
        tempConvert.fahrenheitToCelsius(tempBean.getTemp());
        
        System.out.println("That's " + tempConvert.fahrenheitToCelsius(temp) + " degrees, Celsius!");
        
    }
    
}
