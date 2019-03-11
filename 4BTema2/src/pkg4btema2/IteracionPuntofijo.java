/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4btema2;

/**
 *
 * @author laura
 */
public class IteracionPuntofijo {
    
    private int i;
    private double xi;
    private double gxi;
    private double error;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public double getXi() {
        return xi;
    }

    public void setXi(double xi) {
        this.xi = xi;
    }

    public double getGxi() {
        return gxi;
    }

    public void setGxi(double gxi) {
        this.gxi = gxi;
    }

    public double getError() {
        return error;
    }

    public void setError(double error) {
        this.error = error;
    }
    
         
    @Override
    public String toString() {
        return "IteracionPuntofijo{" + "i=" + i + ", xi=" + xi + ", gxi=" + gxi + ", error=" + error + '}';
    }

    
    
    
    
}
