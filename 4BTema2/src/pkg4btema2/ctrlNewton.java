
package pkg4btema2;

/**
 *
 * @author laura
 */
import java.util.ArrayList;
public class ctrlNewton {
    private int i,ite;
    private double xi,error,errorCalculado=1;
    
    public ctrlNewton(double xi,int ite,double error){
        this.xi = xi;
        this.ite = ite;
        this.error = error;
    }
    
    private double getEvaluacion1(double xi){
        return Math.pow(Math.E, -xi)-xi;
    }
    
    private double getEvaluacion2(double xi){
        return -(Math.pow(Math.E, -xi))-1;
    }
    
    private boolean haySolucion(){
        boolean solucion = false;
        if(this.errorCalculado >this.error) solucion = true;
        return solucion;
    }
    
    public ArrayList<IteracionNewton> getNewton(){
         int i=1;
        //double errorCalculado=1;
        
        ArrayList<IteracionNewton> lista = null;
        
        if( this.haySolucion() ){
            
            lista = new ArrayList<IteracionNewton>();
            
          
            while( i < this.ite && errorCalculado>this.error ){
             
              double fxi = this.getEvaluacion1(this.xi);
              double fxid = this.getEvaluacion2(this.xi);
              
              IteracionNewton fila = new IteracionNewton();
              
              fila.setI(i);
              
              fila.setXi(this.xi);
              
              fila.setFxi(fxi);
              
              fila.setFxid(fxid);
              
              fila.setFxir(fila.getFxi()/fila.getFxid());
              
              fila.setFxiR(fila.getXi()-fila.getFxir());
              
                           
              if(i==1){
                errorCalculado=1;
              }
              
              else{
                
                  double xXi = fila.getXi();
                  
                  
                  double xR = fila.getFxiR();
                  
                  errorCalculado =Math.abs((xR-xXi)/xR);
                  
              }
              
              fila.setError(errorCalculado);
              
              System.out.println( fila.toString());
              
              lista.add(fila);
              
              if( fila.getXi()!= fila.getFxiR()){
               this.xi= fila.getFxiR();
              }
             
              i++;
          
          }
        }
        return lista;
        
    }
    
    
    
    public TablaNewton getTabla(){
     
        ArrayList<IteracionNewton> lista = this.getNewton();
     
        TablaNewton tabla= new TablaNewton(lista);
        
        return tabla;
    }
}

