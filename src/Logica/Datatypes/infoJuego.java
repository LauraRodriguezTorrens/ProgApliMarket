/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Datatypes;
import java.util.*;

/**
 *
 * @author Nicole
 */
public class infoJuego {
    private String nombre;
    private String descripcion;
    private Double tamanio;
    private String nickD;
    private List categorias;
    private List clientes;
    private List comentarios;
    
    public infoJuego(String n, String d, Double tm, String nd, List ca, List cl, List co){
        nombre=n;
        descripcion=d;
        tamanio=tm;
        nickD=nd;
        categorias= ca;
        clientes=ca;
        comentarios=co;
    }
    
}
