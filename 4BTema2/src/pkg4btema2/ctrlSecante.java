
package pkg4btema2;

import java.util.ArrayList;

/**
 *
 * @author laura
 */
public class ctrlSecante {
    private int ite;
    private double x1,xo,error;
    
    public ctrlSecante(double x1,int ite,double xo,double error){
        this.x1 = x1;
        this.xo = xo;
        this.ite = ite;
        this.error = error;
    }
    
    private double getEvaluacion(double x){
        return Math.pow(x,2)-(3*x)-4;
    }
    
   
    
    public ArrayList<IteracionSecante> getSecante(){
         int i=1;
        //double errorCalculado=1;
        
        ArrayList<IteracionSecante> lista = null;
        
        
            
            lista = new ArrayList<IteracionSecante>();
            
          do{
              double fx1 = this.getEvaluacion(this.x1);
              double fxo = this.getEvaluacion(this.xo);
              
              IteracionSecante fila = new IteracionSecante();
              
              fila.setI(i);
              
              fila.setX1(this.x1);
              
              fila.setXo(this.xo);
              
              
              fila.setFx1(fx1);

              fila.setFxo(fxo);
              
              fila.setX2(fila.getX1()-(fila.getFx1()*(fila.getXo()-fila.getX1()))/(fila.getFxo()-fila.getFx1()));
              fila.setError((fila.getX2()-fila.getX1())/fila.getX2()*100);
                           
            
              System.out.println( fila.toString());
              
              lista.add(fila);
              
              if( fila.getX1()!= fila.getX2()){
               this.x1= fila.getX2();
               this.xo = fila.getX1();
              }
              
             // double e = fila.getError();
             
              i++;
              
          }while(i < this.ite /*&& (e >this.error)*/);
          
        
        return lista;
        
    }
    
    
    
    public TablaSecante getTabla(){
     
        ArrayList<IteracionSecante> lista = this.getSecante();
     
        TablaSecante tabla= new TablaSecante(lista);
        
        return tabla;
    }
}
