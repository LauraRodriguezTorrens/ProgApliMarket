/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Datatypes;
/**
 * 
 * @author Nicole
 */
public class dataDesarrollador extends dataPerfil {
    public String webURL;
   
 public dataDesarrollador(String n,String nk,String a, String c, String i, DataFecha fn, String w){
        nombre=n;
        nick=nk;
        apellido=a;
        correo=c;
        imagen=i;
        fechaNacim=fn;  
        webURL=w;

    }
  public dataDesarrollador(){
        nombre="";
        nick="";
        apellido="";
        correo="";
        imagen="";
        fechaNacim=new DataFecha();  
        webURL="";

    }
 

public String DameTipo(){
         String c="Desarrollador";
         return c;
     }
    
   
    

  
   
    
}



