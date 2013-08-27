/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Logica.Desarrollador;
import java.util.*;
/**
 *
 * @author Nicole
 */
public class Controlador2 {
    private List Desarrolladores;
    
    public Controlador2(){
        Desarrolladores= new LinkedList();
       
    }
    
    
    int contID=0;
    public List listarDes(){
        List lista= new LinkedList();
        
        
        
        
        return lista;
    }
    public int SelecDes(String n){
       
        int cont=0;
        Iterator iterador=Desarrolladores.iterator();
        boolean op=true; 
        while(iterador.hasNext()){
            Desarrollador com=(Desarrollador) iterador.next();
            if(com.getNick().equals(n)){
                op=true;
                
            }   
        }
           if(op==true){
               cont++;
               
           }
           return cont;
        }
        
    
        
        
        
        
        
        
    }
    

