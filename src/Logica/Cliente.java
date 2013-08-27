/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Nicole
 */
public class Cliente extends Perfil{

     public Cliente(String ni,String co,String no,String ap,int ed,Date fe,String im){
         nick = ni;
         correo = co;
         nombre = no;
         apellido = ap;
         edad = ed;
         fechaNac = fe;
         imagen = im;

     }

}
