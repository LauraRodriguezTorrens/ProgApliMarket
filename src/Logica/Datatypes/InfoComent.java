/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Datatypes;
import Logica.Date;
import java.util.*;

/**
 *
 * @author Nicole
 */
public class InfoComent {
    private int id;
    private String texto;
    private String nomcli;
    private Date Fecha;
    private List respuesta;
    
    public InfoComent (int i, String t, String n, Date f, List l){
        id=i;
        texto=t;
        nomcli=n;
        Fecha=f;
        respuesta=l;
    }
    public InfoComent (){
        id=0;
        texto="o";
        nomcli="o";
        Fecha= new Date();
        respuesta= new LinkedList();
    }
}
