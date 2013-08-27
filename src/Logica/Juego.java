/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;
import Logica.Datatypes.Money;
import java.util.*;

/**
 *
 * @author Nicole
 */
public class Juego {
private String nombre;
private String descripcion;
private int tamanio;
private int id;
private Money precio;
private List listaCategorias;

public Juego(String no,String de,int ta,int i){
    nombre = no;
    descripcion = de;
    tamanio = ta;
    id = i;
}
public String getNombre(){
    return nombre;
}
public String getDescripcion(){
    return descripcion;
}
public int getTamanio(){
    return tamanio;
}
public int getId(){
    return id;
}
public void setNombre (String no){
    nombre = no ;
}
public void setDescripcion (String de){
    descripcion = de ;
}
public void setTamanio (int ta){
    tamanio = ta ;
}
public void setId (int i){
   id = i ;
}

}