/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;
import Logica.Datatypes.InfoComent;
import java.util.*;

/**
 *
 * @author Nicole
 */
public class Comentario {
    private Date Fecha;
    private int id;
    private String Texto;
    private Cliente cliente;
    private List comentarios;
    
    //maybe maybe maybe.. ver la lista que esta pero no se crea. 
    public Comentario (Date f, int i, String t, Cliente cli){
        Fecha=f;
        id=i; 
        Texto=t;
        cliente=cli;
        
     
    } 
    public int getId(){
        return id;
 
}
    public Date getFecha(){
        return Fecha;
    }
    public String getTexto(){
        return Texto;
    }
    
    public String getNombreCliente(){
        return cliente.getNombre();
         
    }
    public List getComAnidados(){
        List listaCom=new LinkedList();
        
        Iterator iterador=comentarios.iterator();
        while(iterador.hasNext()){
            Comentario com=(Comentario) iterador.next();
            InfoComent data= new InfoComent(com.getId(),com.getTexto(),com.getNombreCliente(),com.getFecha(),com.getComAnidados());
            listaCom.add(data);
        
        }
            
        return listaCom;
        
        }
       
    }
    
    
   
    





