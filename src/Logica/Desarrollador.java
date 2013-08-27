/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Nicole
 */
public class Desarrollador extends Perfil {
    private String webURL;


     public Desarrollador(String ni,String co,String no,String ap,int ed,Date fe,String im,String we){
         nick = ni;
         correo = co;
         nombre = no;
         apellido = ap;
         edad = ed;
         fechaNac = fe;
         imagen = im;
         webURL = we;
     }

     public String getWebURL(){
         return webURL;
     }
     public void setWebURL(String se){
         webURL=se;
     }

}
