/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Datatypes;


/**
 *
 * @author Nicole
 */

public abstract class dataPerfil {
    public String nombre;
    public String nick;
    public String apellido;
    public String correo;
    public String imagen;
    public DataFecha fechaNacim;
      
    public abstract String DameTipo();
   
      public dataPerfil(){
        nombre="o";
        nick="o";
        apellido="o";
        correo="o";
        imagen="o";
        fechaNacim=new DataFecha();
    }
}
