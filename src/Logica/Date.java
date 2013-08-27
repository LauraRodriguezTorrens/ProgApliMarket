/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Nicole
 */

public class Date {
    private int dia;
    private int mes;
    private int anio;
    
    public Date(int dia1, int mes1, int anio1){
        dia = dia1;
        mes = mes1;
        anio = anio1;
    }
     public Date(){
        dia = 0;
        mes = 0;
        anio = 0;
    }
    
    public int getDia(){
        return dia;
    }
     public int getMes(){
        return mes;
    }
      public int getAnio(){
        return anio;
    }
      public void setDia(int d){
          dia= d;
      }
      public void setMes(int m){
          mes= m;
      }
      public void setAnio(int a){
          anio=a;
      }
      
      public void imprimirFecha(){
          System.out.println(dia+"/"+mes+"/"+anio);
      }
      public String getFecha(Date f){
          String fechaS=anio+"-"+mes+"-"+dia;
          return fechaS;
      }
       @Override
      public boolean equals (Object obj){
          if ((obj instanceof Date)){
              Date objDate = (Date)obj; 
              if(this.dia==objDate.dia && this.mes==objDate.mes && this.anio==objDate.anio ){
                  return true;
              }
              else
                  return false;
          }
          else
              return false;
        
      }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + this.dia;
        hash = 83 * hash + this.mes;
        hash = 83 * hash + this.anio;
        return hash;
    }

    
}
