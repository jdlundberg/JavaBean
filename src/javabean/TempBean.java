package javabean;

import java.io.Serializable;

/**
 *
 * @author Architect
 */
public class TempBean implements Serializable {

    private double temp;

    public TempBean() {

        temp = 0.0;

    }

    public double getTemp() {

        return temp;

    }

    public void setTemp(double temp) {

        this.temp = temp;

    }

}
