/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Logica.Cliente;
import Logica.Controlador2;
import Logica.Datatypes.DataFecha;
import Logica.Desarrollador;
import Logica.postgres;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;





/**
 *
 * @author Nicole
 */
public class AltaPerfil2 extends javax.swing.JFrame {
 Controlador2 control2= Controlador2.getInstance();

 String paraImagen=null;
//    /**
//     * Creates new form AltaPerfil2
//     */
    public AltaPerfil2() {
        initComponents();
         setLocationRelativeTo(null);
        r_cliente.setSelected(true);
        t_sitioweb.setEnabled(false);
        
        ///imagbe///
        
         this.setTitle("Prog Aplig Market");
        this.setLocationRelativeTo(null); 
        
      
                }

//    /**
//     * This method is called from within the constructor to initialize the form.
//     * WARNING: Do NOT modify this code. The content of this method is always
//     * regenerated by the Form Editor.
//     */
//    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botones_grupo = new javax.swing.ButtonGroup();
        jLabel12 = new javax.swing.JLabel();
        t_dia = new javax.swing.JComboBox();
        t_imagen = new javax.swing.JTextField();
        t_sitioweb = new javax.swing.JTextField();
        b_aceptar = new javax.swing.JButton();
        t_mes = new javax.swing.JComboBox();
        t_anio = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        b_Cancelar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        r_cliente = new javax.swing.JRadioButton();
        r_desarrollador = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        t_apellido = new javax.swing.JTextField();
        t_nombre = new javax.swing.JTextField();
        b_imagen = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(745, 453));
        setPreferredSize(new java.awt.Dimension(745, 453));
        getContentPane().setLayout(null);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 102));
        jLabel12.setText("Tipo");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(100, 280, 26, 17);

        t_dia.setForeground(new java.awt.Color(0, 51, 102));
        t_dia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        t_dia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        t_dia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_diaActionPerformed(evt);
            }
        });
        getContentPane().add(t_dia);
        t_dia.setBounds(200, 210, 50, 20);
        getContentPane().add(t_imagen);
        t_imagen.setBounds(160, 240, 270, 30);

        t_sitioweb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_sitiowebActionPerformed(evt);
            }
        });
        getContentPane().add(t_sitioweb);
        t_sitioweb.setBounds(170, 310, 270, 30);

        b_aceptar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        b_aceptar.setForeground(new java.awt.Color(0, 51, 102));
        b_aceptar.setText("Aceptar");
        b_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_aceptarActionPerformed(evt);
            }
        });
        getContentPane().add(b_aceptar);
        b_aceptar.setBounds(520, 370, 80, 30);

        t_mes.setForeground(new java.awt.Color(0, 51, 102));
        t_mes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        t_mes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        t_mes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_mesActionPerformed(evt);
            }
        });
        getContentPane().add(t_mes);
        t_mes.setBounds(260, 210, 50, 20);

        t_anio.setForeground(new java.awt.Color(0, 51, 102));
        t_anio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1900", "1901", "1902", "1903", "1904", "1905", "1906", "1907", "1908", "1909", "1910", "1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918", "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013" }));
        t_anio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        t_anio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_anioActionPerformed(evt);
            }
        });
        getContentPane().add(t_anio);
        t_anio.setBounds(320, 210, 70, 20);

        jLabel14.setForeground(new java.awt.Color(0, 51, 102));
        jLabel14.setText("Año");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(330, 190, 30, 14);

        jLabel13.setForeground(new java.awt.Color(0, 51, 102));
        jLabel13.setText("Mes");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(270, 190, 30, 14);

        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText("Dia");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(210, 190, 30, 14);

        b_Cancelar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        b_Cancelar.setForeground(new java.awt.Color(0, 51, 102));
        b_Cancelar.setText("Cancelar");
        b_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_CancelarActionPerformed(evt);
            }
        });
        getContentPane().add(b_Cancelar);
        b_Cancelar.setBounds(620, 370, 80, 30);

        jLabel8.setForeground(new java.awt.Color(0, 51, 102));
        jLabel8.setText("(opcional)");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(440, 250, 47, 14);

        botones_grupo.add(r_cliente);
        r_cliente.setForeground(new java.awt.Color(0, 51, 102));
        r_cliente.setText("Cliente");
        r_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_clienteActionPerformed(evt);
            }
        });
        getContentPane().add(r_cliente);
        r_cliente.setBounds(210, 280, 59, 23);

        botones_grupo.add(r_desarrollador);
        r_desarrollador.setForeground(new java.awt.Color(0, 51, 102));
        r_desarrollador.setText("Desarrollador");
        r_desarrollador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r_desarrolladorMouseClicked(evt);
            }
        });
        r_desarrollador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_desarrolladorActionPerformed(evt);
            }
        });
        getContentPane().add(r_desarrollador);
        r_desarrollador.setBounds(290, 280, 89, 23);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 102));
        jLabel5.setText("Nombre");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(90, 110, 70, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 102));
        jLabel6.setText("Apellido");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(90, 160, 90, 17);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 102));
        jLabel7.setText("Fecha nacimiento");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 210, 190, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 102));
        jLabel9.setText("Imagen");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(90, 240, 80, 17);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 102));
        jLabel10.setText("Sitio Web");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(70, 310, 110, 17);

        t_apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_apellidoActionPerformed(evt);
            }
        });
        t_apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_apellidoKeyTyped(evt);
            }
        });
        getContentPane().add(t_apellido);
        t_apellido.setBounds(160, 150, 270, 30);

        t_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_nombreActionPerformed(evt);
            }
        });
        t_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t_nombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_nombreKeyTyped(evt);
            }
        });
        getContentPane().add(t_nombre);
        t_nombre.setBounds(160, 110, 270, 30);

        b_imagen.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        b_imagen.setForeground(new java.awt.Color(0, 51, 102));
        b_imagen.setText("Examinar..");
        b_imagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_imagenActionPerformed(evt);
            }
        });
        getContentPane().add(b_imagen);
        b_imagen.setBounds(500, 250, 100, 20);

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("Alta perfil");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 0, 360, 80);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrador\\Music\\TAREA13333\\fondoprograma.jpg")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -20, 980, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t_sitiowebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_sitiowebActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_sitiowebActionPerformed

    private void b_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_aceptarActionPerformed

        String img="",url=null;
        String tipo;
        if(verificarCampos()==true){
            
            String ape=t_apellido.getText();
            String nom=t_nombre.getText();
            
//            img=t_imagen.getText();
            DataFecha fecha= obtenerFecha();

            /////////////////////////////////guardamos en la base de datos//////////////////////////////////////////////
            if(r_cliente.isSelected()){
                tipo="Cliente";
                Cliente cli=new Cliente(control2.getNickAux(),control2.getCorreoAux(),nom,ape,fecha,paraImagen);
                cli.addCliente();
//                
//                if( Pg.guardarfoto( GenerarCodigo() , control2.getNickAux(), paraImagen ) )
//            {
//                JOptionPane.showMessageDialog(this,"Imagen almacenada en la base de datos");
//                Actualizar_lista();
//            }
            }
           
            else{
                tipo="Desarrollador";
                url=t_sitioweb.getText();
                Desarrollador des=new Desarrollador(control2.getNickAux(),control2.getCorreoAux(),nom,ape,fecha,img,url);
                des.addDesarrollador();

            }
            

        }
        this.setVisible(false);
        Inicio vista = new Inicio();
        vista.setVisible(true);

    }//GEN-LAST:event_b_aceptarActionPerformed

    private void r_desarrolladorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r_desarrolladorMouseClicked

    }//GEN-LAST:event_r_desarrolladorMouseClicked

    private void r_desarrolladorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_desarrolladorActionPerformed
        t_sitioweb.setEnabled(true);
    }//GEN-LAST:event_r_desarrolladorActionPerformed

    private void t_apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_apellidoActionPerformed
        t_apellido.transferFocus();
    }//GEN-LAST:event_t_apellidoActionPerformed

    private void t_apellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_apellidoKeyTyped
        char c=evt.getKeyChar();
        if((c<'a'||c>'z')&&(c<'A')|(c>'Z')){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_t_apellidoKeyTyped

    private void t_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_nombreActionPerformed
        t_nombre.transferFocus();
    }//GEN-LAST:event_t_nombreActionPerformed

    private void t_nombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_nombreKeyPressed

    }//GEN-LAST:event_t_nombreKeyPressed

    private void t_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_nombreKeyTyped
        char c=evt.getKeyChar();
        if((c<'a'||c>'z')&&(c<'A')|(c>'Z')){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }

    }//GEN-LAST:event_t_nombreKeyTyped

    private void r_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_clienteActionPerformed
        t_sitioweb.setEnabled(false);
    }//GEN-LAST:event_r_clienteActionPerformed

    private void t_anioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_anioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_anioActionPerformed

    private void t_mesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_mesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_mesActionPerformed

    private void t_diaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_diaActionPerformed

    }//GEN-LAST:event_t_diaActionPerformed

    private void b_imagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_imagenActionPerformed
       JFileChooser fileChooser = new JFileChooser();
       fileChooser.setFileFilter( new FileNameExtensionFilter("Archivo de Imagen","jpg") );
       fileChooser.setCurrentDirectory(new java.io.File("e:/imagenes_tmp/"));
       int result = fileChooser.showOpenDialog(null);
        if ( result == JFileChooser.APPROVE_OPTION ){
            //obtiene ruta y nombre del archivo
            String ruta = fileChooser.getSelectedFile().getAbsolutePath();
            String name = fileChooser.getSelectedFile().getName();
            String ni=control2.getNickAux();
            
            
           paraImagen=ruta;
//            if( Pg.guardarfoto( GenerarCodigo() , ni, ruta ) )
//            {
//                JOptionPane.showMessageDialog(this,"Imagen ["+name+"] almacenada en la base de datos");
//                Actualizar_lista();
//            }
        }
         
    }//GEN-LAST:event_b_imagenActionPerformed

    private void b_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_CancelarActionPerformed
         this.setVisible(false);
      Inicio view;
        view = new Inicio();
      view.setVisible(true); 
    }//GEN-LAST:event_b_CancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AltaPerfil2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaPerfil2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaPerfil2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaPerfil2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AltaPerfil2().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_Cancelar;
    private javax.swing.JButton b_aceptar;
    private javax.swing.JButton b_imagen;
    private javax.swing.ButtonGroup botones_grupo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton r_cliente;
    private javax.swing.JRadioButton r_desarrollador;
    private javax.swing.JComboBox t_anio;
    private javax.swing.JTextField t_apellido;
    private javax.swing.JComboBox t_dia;
    private javax.swing.JTextField t_imagen;
    private javax.swing.JComboBox t_mes;
    private javax.swing.JTextField t_nombre;
    private javax.swing.JTextField t_sitioweb;
    // End of variables declaration//GEN-END:variables


/********************************************  F U N C I O N E S  ********************************************/ 

void limpiar(){
    t_nombre.setText("");
    t_apellido.setText("");
    t_imagen.setText("");
    t_sitioweb.setText("");
    
}

void bloquear(){
     t_sitioweb.setEnabled(false);
         
}

boolean isNumeric(String cadena){
	try {
		Integer.parseInt(cadena);
		return true;
	} catch (NumberFormatException nfe){
		return false;
	}
}

boolean verificarCampos(){
    if(t_nombre.getText().trim().length()==0||t_apellido.getText().trim().length()==0){
        JOptionPane.showMessageDialog(null, "Todos los campos obligatorios deben ser completados","Error",JOptionPane.ERROR_MESSAGE);
        return false;
    }
    else{
        if(r_desarrollador.isSelected()==true&&t_sitioweb.getText().trim().length()==0){
        JOptionPane.showMessageDialog(null, "Todos los campos obligatorios deben ser completados","Error",JOptionPane.ERROR_MESSAGE);    
        return false;
        }
        else
            return true;
    }

}

public DataFecha obtenerFecha(){
            String ddd = (String) t_dia.getSelectedItem();
            String mmm = (String) t_mes.getSelectedItem();
            String aaa = (String) t_anio.getSelectedItem();
            int dd=Integer.parseInt(ddd);
            int aa=Integer.parseInt(aaa);
            int mm=Integer.parseInt(mmm);
            DataFecha fecha = new DataFecha(dd,mm,aa);
            return fecha;
           
}

////////////////////////////////////// i m a g e n ////////////////////////////

private postgres Pg = new postgres();
    //Para almacenar la clase imagen
    private DefaultListModel modListaImagen = new DefaultListModel();

    
    //skadlN.CEDAS
    
    //Genera un código unico para la imagen
 private String GenerarCodigo()
    {
        SimpleDateFormat sdf= new SimpleDateFormat("hhmmss");
        return sdf.format(new Date());
    }


}
