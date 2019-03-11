/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4btema2;

import java.util.ArrayList;

/**
 *
 * @author jazmin
 */
public class ctrlPuntoFijo {
    private double xi;
    
    private int iteraciones;
    
    private double error;

    public ctrlPuntoFijo(double xi, int iteraciones, double error) {
        this.xi = xi;
        this.iteraciones = iteraciones;
        this.error = error;
    }
    
    
    private double getEvaluacion(double x){
     return Math.pow(Math.E, -x );

    }
    
    private boolean haySolucion(){
     boolean solucion=false;
     
     if(this.getEvaluacion(this.xi)!=0 /*!=this.getEvaluacion(this.gxi)*/ )
         solucion=true;
     return solucion;
    
    }
    
    public ArrayList<IteracionPuntofijo> getPuntoFijo(){
    
        int i=1;
        double errorCalculado=1;
        
        ArrayList<IteracionPuntofijo> lista = null;
        
        if( this.haySolucion() ){
            
            lista = new ArrayList<IteracionPuntofijo>();
            
          
            while( i < this.iteraciones && errorCalculado>this.error ){
             
              double gxi = this.getEvaluacion(this.xi);
              
              IteracionPuntofijo fila = new IteracionPuntofijo();
              
              fila.setI(i);
              
              fila.setXi(this.xi);
              
              fila.setGxi(gxi);
              
                           
              if(i==1){
                errorCalculado=1;
              }
              
              else{
                
                  double xXi = fila.getXi();
                  
                  
                  double xGxi = fila.getGxi();
                  
                  errorCalculado =Math.abs((xGxi-xXi)/xGxi);
                  
              }
              
              fila.setError(errorCalculado);
              
              System.out.println( fila.toString());
              
              lista.add(fila);
              
              if( fila.getXi()!= fila.getGxi()){
               this.xi= gxi;
              }
              
              i++;
          
          }
        }
        return lista;
        
    }
    
    
    
    public TablaPuntofijo getTabla(){
     
        ArrayList<IteracionPuntofijo> lista = this.getPuntoFijo();
     
        TablaPuntofijo tabla= new TablaPuntofijo(lista);
        
        return tabla;
    }
}
