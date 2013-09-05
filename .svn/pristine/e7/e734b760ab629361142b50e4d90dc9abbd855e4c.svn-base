/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Persistencia.conectar;
import Logica.Datatypes.DataFecha;
import Logica.Datatypes.DataP;
import Logica.Datatypes.dataCliente;
import Logica.Datatypes.dataDes;
import Logica.Datatypes.dataDesarrollador;
import Logica.Datatypes.dataPerfil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Nicole
 */

 public class Controlador2 {
    private List Desarrolladores;
    Desarrollador DesSelec; 
    private ArrayList Clientes;
   conectar cc= new conectar();
    Connection cn = cc.conexion();
    
    private String nickAux,correoAux;
    
    private Controlador2(){
        Desarrolladores= new LinkedList();
       Desarrollador DesSelec; 
       Clientes= new ArrayList();
        nickAux="";
        correoAux="";
    }
    
    private static Controlador2 instance = new Controlador2();
    
    
    public static Controlador2 getInstance(){
        return instance;
    }
    
    int contID=0;
//    public List listarDes(){
//        List lista= new LinkedList();
//            return lista;
//    }
//    
    public void setNickAux(String n){
        nickAux=n;
    }
    public void setCorreoAux(String c){
        correoAux=c;
    }
    public String getNickAux(){
        return nickAux;
    }
     public String getCorreoAux(){
        return correoAux;
    }
    

   public List listarDesarrolladores () throws SQLException{
    conectar cc =new conectar();
    List listaDes = new ArrayList();
    listaDes = cc.ListarDesarrolladores();
    List devolver=new ArrayList();
    
    
    Iterator it = listaDes.iterator();
    while (it.hasNext())
    {
      String niick;
      niick = (String) it.next();
      dataDes desarr = new dataDes(niick);
      devolver.add(desarr);
     }
    return devolver;
   } 
   
    public ArrayList listarDes(){
        ArrayList lista= new ArrayList();
        return lista;
    }
     
   
   
   
   
   
    public void SelecDes(String nick){
      DesSelec=new Desarrollador();
      DesSelec.setNick(nick);
   
}
    
//public int SelecDes(String n){
//       
//        int cont=0;
//        Iterator iterador=Desarrolladores.iterator();
//        boolean op=true; 
//        while(iterador.hasNext()){
//            Desarrollador com=(Desarrollador) iterador.next();
//            if(com.getNick().equals(n)){
//                op=true;
//                
//            }   
//        }
//           if(op==true){
//               cont++;
//               
//           }
//           return cont;
//        }
    
    
    
       public Desarrollador GetDes() throws SQLException{
           Desarrolladores=new LinkedList();
           conectar cc=new conectar();
           Desarrolladores=cc.cargarDesarrolladoresCompletos();
           Desarrollador dd=new Desarrollador();
           dd=findD(DesSelec.getNick());
           return dd;
       }
       
       
   public Desarrollador findD(String n){
        
    Desarrollador des=new Desarrollador();
    Iterator it=Desarrolladores.iterator();
    int fin =0;
    while(it.hasNext()&& fin==0){
        Desarrollador dAux=(Desarrollador)it.next();
         if(dAux.getNick().equals(n)){
             des=dAux;
             fin=2;
           }
        
    }
//    if(fin==2){
//        JOptionPane.showMessageDialog(null, "Desarrollador cargado con exito");
//    }
//    else
//        JOptionPane.showMessageDialog(null, "No se encontró el desarrollador");
//        
 return des;   
    
}    
   
    @SuppressWarnings("empty-statement")
   public Cliente findC(String n){
  
    Cliente cli=new Cliente();
    Clientes.clear();
    Clientes=cc.GetCliente();
    
    Iterator it=Clientes.iterator();
    int fin =0;
    while(it.hasNext()&& fin==0){
        Cliente cAux=new Cliente();
        cAux=(Cliente)it.next();
         if(cAux.getNick().equals(n)){
             
             cli=cAux;
             fin=2;
            
           }
      
    }
    if(fin!=2){
      //  JOptionPane.showMessageDialog(null, "No existe el cliente");
        return null;
    }else{
        
;         return cli; 
    }
}
       
       /*******************************DARIOOOOOOOOOOOOOOOOOOOOOO***********************************/
    
       
         
 
    
    
    
  public List listarP (){
      
  this.Desarrolladores.clear();
  Clientes.clear();
  Desarrolladores= cc.GetDes();
  Clientes = cc.GetCliente();
    ArrayList listaP = new ArrayList();
     //listaP=(ArrayList)listaP.clone();
    
    Iterator it =Clientes.iterator();
 
    while(it.hasNext()){
         Cliente pAux=(Cliente)it.next();
         
         DataP dp= new DataP(pAux.nick);
         
         listaP.add(dp);
                
               
            }
    
   Iterator it2 =Desarrolladores.iterator();
 
    while(it2.hasNext()){
         Desarrollador pAux2=(Desarrollador)it2.next();
         
         DataP dp2= new DataP(pAux2.getNick());
                      listaP.add(dp2);
                
               
            }
    
    return listaP;
   
}  
  
  
 
  
  
  public dataPerfil selecPerfil(String n){
       
  if(findC(n)!=null){
      Cliente c =findC(n);
     dataPerfil data = new dataCliente(c.nombre,c.nick,c.apellido,c.correo,c.imagen,c.fechaNac);
         return data;    
             
  }
  else{
      Desarrollador d=findD(n);
     
        dataPerfil data;
      data = new dataDesarrollador(d.nombre,d.nick,d.apellido,d.correo,d.imagen,d.fechaNac,d.webURL);
     return data;
  }
   
  }
  
  
  
    public void setDesarrollador(  Desarrollador des){
      Desarrolladores.add(des);
    }
    public void setCliente(  Cliente client){
      Clientes.add(client);
    }
    
//    public int SelecDes(String n){
//       
//        int cont=0;
//        Iterator iterador=DataDesarrolladores.iterator();
//        boolean op=true; 
//        while(iterador.hasNext()){
//            Desarrollador com=(Desarrollador) iterador.next();
//            if(com.getNick().equals(n)){
//                op=true;
//                
//            }   
//        }
//           if(op==true){
//               cont++;
//               
//           }
//           return cont;
//        }
  
       
      /*******************************NICOLEee************************/
    
     public boolean altaPerfil(String ni,String co){
        Cliente c=new Cliente();
        Desarrollador d=new Desarrollador();
        boolean r;
        if(c.existeN(ni)||c.existeC(co)){
            r=true;
        }
        else{
            if(d.existeN(ni)||d.existeC(co)){
                r=true;
            }
            else{
                r=false;
                correoAux=co;
                nickAux=ni;
            }
        }
        return r;
     }
    
    public void datosPerfilC(String nom, String ap, DataFecha fech, String img){
        Cliente cli= new Cliente(nickAux,correoAux,nom,ap,fech,img);
        cli.addCliente();
    }
    public void datosPerfilD(String nom, String ap, DataFecha fech, String img,String sw){
         Desarrollador des= new Desarrollador(nickAux,correoAux,nom,ap,fech,img,sw);
        des.addDesarrollador();
    }
        
   ////////////////// F U N C I O N E S    C O N S U L T A R     P E R F I L  ////////////////// 
        
 
//    public List listarP(){
//    conectar cc =new conectar();
//    List listarPer = new ArrayList();
//    listarPer = cc.listarPerfiles();
//    return listarPer;
//    }
        
        
         ////////////////////   F U N C I O N E S   C O M P R A R   J U E G O  ////////////////////
    
public void registrComp() throws SQLException{
    
    Controlador1 control1= Controlador1.getInstance();
    
    //obtengo nick del desarrollador, fecha de la compra y el juego a comprar del controlador 1
    Juego j=control1.getJuegoSelec();
    String n=control1.getnickComprador();
    DataFecha f=control1.getFechaCompra();
   
//    if(cc.existeNickCliente(n)){
    
    
    //vacio y competo la lista de clientes
    
    Clientes=new ArrayList();
    Clientes=cc.cargarClientes();
   
    //busco en la lista de clientes el que tenga nick "n"
    Cliente clienteSelec=this.findC(n);
   // JOptionPane.showMessageDialog(null, clienteSelec.getNombre());
    clienteSelec.crearCompra(f,j);
    
//    }
//    else{
//        JOptionPane.showMessageDialog(null, "El nick ingresado no existe en el sistema");
//    }
}
    

    
}
    
    
    
    
    
    
    
    
    
    
       
       
       
   
    

