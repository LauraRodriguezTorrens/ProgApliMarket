/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Datatypes;

import Logica.Date;
/**
 * 
 * @author Nicole
 */
public class dataDesarrollador extends dataPerfil {
    private String webURL;
    
 public dataDesarrollador(String n,String nk,String a, String c, String i, Date fn, String w){
        nombre=n;
        nick=nk;
        apellido=a;
        correo=c;
        imagen=i;
        fechaNacim=fn;  
        webURL=w;
        
    }
   
    
}



