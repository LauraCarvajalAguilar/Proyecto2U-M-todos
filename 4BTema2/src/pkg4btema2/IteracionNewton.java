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
public class IteracionNewton {
    
    private int i;
    private double xi;
    private double fxi;
    private double Fxid;
    private double fxir;
    private double fxiR;
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

    public double getFxi() {
        return fxi;
    }

    public void setFxi(double fxi) {
        this.fxi = fxi;
    }

    public double getFxid() {
        return Fxid;
    }

    public void setFxid(double Fxid) {
        this.Fxid = Fxid;
    }

    public double getFxir() {
        return fxir;
    }

    public void setFxir(double fxir) {
        this.fxir = fxir;
    }

    public double getFxiR() {
        return fxiR;
    }

    public void setFxiR(double fxiR) {
        this.fxiR = fxiR;
    }

    public double getError() {
        return error;
    }

    public void setError(double error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "IteracionNewton{" + "i=" + i + ", xi=" + xi + ", fxi=" + fxi + ", Fxid=" + Fxid + ", fxir=" + fxir + ", fxiR=" + fxiR + ", error=" + error + '}';
    }

    Object getGxi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
