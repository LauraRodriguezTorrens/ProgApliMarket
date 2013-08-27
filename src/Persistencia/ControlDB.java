/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

/**
 *
 * @author Nicole
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControlDB {
        
    private final static String driver = "com.mysql.jdbc.Driver";
    private final static String bd = "jdbc:mysql://localhost/progaplimarket";
    private final static String usuario = "root";
    private final static String password = "";

    private Connection conexion;
    private java.sql.Statement st;

    private static ControlDB instancia = null;

    public static ControlDB getInstancia(){
        if(instancia == null){
            instancia = new ControlDB();
        }
        return instancia;
    }
    ////////////////////////////// se establece la conexion ///////////////////////////
    private ControlDB() {
        try{
            Class.forName(driver);
            conexion = DriverManager.getConnection(bd, usuario, password);
            st = conexion.createStatement();
            System.out.println("Conexion exitosa");
        }
        catch(Exception ex){
            System.out.println(ex.toString());
        }
    }
    ////////////////////////////////////////////////////////////////////////////////////
    public java.sql.Statement getStatement(){
        return st;
    }
    public java.sql.Statement crearStatement(){
        try {
            return conexion.createStatement();
        } catch (SQLException ex) {
            System.out.println("error crear statement"+ex.toString());
            return null;
        }
    }

     public List ListaCategorias()
    {
        ResultSet res;
        List Lista = new ArrayList();
        try {
            res = st.executeQuery("select Nombre from categorias");
            //return res;
            while(res.next())
            {
                Lista.add(res.getObject(1));
                       }
            return Lista;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return null;
        }
    }
    
}