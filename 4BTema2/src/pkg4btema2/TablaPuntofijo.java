/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4btema2;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;
/**
 *
 * @author jazmin
 */
public class TablaPuntofijo extends AbstractTableModel {
    
    private String columnas[]={"i","xi","gxi","error"};
    private ArrayList<IteracionPuntofijo> lista;
    
    
    public TablaPuntofijo(ArrayList<IteracionPuntofijo> lista) {
        this.lista = lista;
    }
    
  
    public int getRowCount() {
        //To change body of generated methods, choose Tools | Templates.
    
      return this.lista.size();
    }

    
    public int getColumnCount() {
         //To change body of generated methods, choose Tools | Templates.
   
       return this.columnas.length;
    }

   
    public Object getValueAt(int rowIndex, int columnIndex) {
      //To change body of generated methods, choose Tools | Templates.
    
     IteracionPuntofijo fila = this.lista.get(rowIndex);
     switch(columnIndex){
         case 0: return fila.getI();
         case 1: return fila.getXi();
         case 2: return fila.getGxi();
         case 3: return fila.getError();
    } 
     return null;
   }
 
    public String getColumnName(int column) {
        return this.columnas[column]; //To change body of generated methods, choose Tools | Templates.
    }

      
}
    