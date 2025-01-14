
package Vistas;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import AccesoADatos.MateriaData;
import Entidades.Materia;
import java.awt.event.KeyEvent;


public class FormularioMateria extends javax.swing.JInternalFrame {

    public FormularioMateria() {
        
        initComponents();  
    }
    
    MateriaData md = new MateriaData();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/Recursos/conocimiento.png"));
        Image image = icon.getImage();
        jDesktopPane1 = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jLabel1 = new javax.swing.JLabel();
        jbBuscar = new javax.swing.JButton();
        jtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jtAnio = new javax.swing.JTextField();
        jrEstado = new javax.swing.JRadioButton();
        jBlimpiar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jBmodificar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTmaterias = new javax.swing.JTable();

        setBorder(null);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Materias1.png"))); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 204));
        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Materia");
        jDesktopPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 20, 90, 30));

        jbBuscar.setForeground(new java.awt.Color(0, 0, 0));
        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 75, -1, -1));

        jtCodigo.setBackground(new java.awt.Color(255, 255, 255));
        jtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtCodigoKeyTyped(evt);
            }
        });
        jDesktopPane1.add(jtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 40, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("codigo");
        jDesktopPane1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 75, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nombre");
        jDesktopPane1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Año");
        jDesktopPane1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Estado");
        jDesktopPane1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, -1, -1));

        jtNombre.setBackground(new java.awt.Color(255, 255, 255));
        jtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNombreKeyTyped(evt);
            }
        });
        jDesktopPane1.add(jtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 129, -1));

        jtAnio.setBackground(new java.awt.Color(255, 255, 255));
        jtAnio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtAnioKeyTyped(evt);
            }
        });
        jDesktopPane1.add(jtAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 39, -1));

        jrEstado.setBackground(new java.awt.Color(204, 204, 204));
        jrEstado.setContentAreaFilled(false);
        jDesktopPane1.add(jrEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, -1, -1));

        jBlimpiar.setForeground(new java.awt.Color(0, 0, 0));
        jBlimpiar.setText("Limpiar");
        jBlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBlimpiarActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jBlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jbEliminar.setForeground(new java.awt.Color(0, 0, 0));
        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jbEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, -1, -1));

        jbGuardar.setForeground(new java.awt.Color(0, 0, 0));
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, -1, -1));

        jBmodificar.setForeground(new java.awt.Color(0, 0, 0));
        jBmodificar.setText("Modificar");
        jBmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmodificarActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jBmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, -1));

        jbSalir.setForeground(new java.awt.Color(0, 0, 0));
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, -1, -1));

        jTmaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTmaterias);

        jDesktopPane1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 360, 160));

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed

        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        
        try {
            
            Materia buscarMat = md.buscarMateria(Integer.parseInt(jtCodigo.getText()));

            if (buscarMat != null) {

                jtNombre.setText(buscarMat.getNombre());
                jtAnio.setText(buscarMat.getAnio() + "");
                jrEstado.setSelected(buscarMat.isEstado());
            }
            
        }catch(NumberFormatException ex) {            
            JOptionPane.showMessageDialog(null, "Ingrese un numero entero");       
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
 
        Materia guardarMat = new Materia();

        try {
            
            guardarMat.setIdMateria(Integer.parseInt(jtCodigo.getText()));
            guardarMat.setNombre(jtNombre.getText());

            int anioIn= Integer.parseInt(jtAnio.getText());
            
            if( anioIn>=1 && anioIn<=6) {
                  
                guardarMat.setAnio(anioIn);  
            
            }else{
      
                JOptionPane.showMessageDialog(null, "Ingrese Años de Materias entre: 1 y 6 ");
            }
           
        guardarMat.setEstado(jrEstado.isSelected());
        md.guardarMateria(guardarMat);
        
        } catch (NumberFormatException e) {        
            JOptionPane.showMessageDialog(null, "Ingrese En las Casillas los Datos Correspondientes: \n"
                    + " Codigo, Año Numero Enteros \n"
                    + " Nombre: Ingrese nombres que contengan letras validos ");
        }        
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        
        md.eliminarMateria(Integer.parseInt(jtCodigo.getText()));
        
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jBlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlimpiarActionPerformed
        
        jtCodigo.setText("");
        jtNombre.setText("");
        jtAnio.setText("");
        jrEstado.setSelected(false);
        
    }//GEN-LAST:event_jBlimpiarActionPerformed

    private void jtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCodigoKeyTyped
        
       soloNumeros(evt);
    }//GEN-LAST:event_jtCodigoKeyTyped
    
    private void jtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreKeyTyped
        
        soloLetras(evt);
    }//GEN-LAST:event_jtNombreKeyTyped

    private void jtAnioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtAnioKeyTyped
        
        soloNumeros(evt);
    }//GEN-LAST:event_jtAnioKeyTyped

    private void jBmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmodificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBmodificarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBlimpiar;
    private javax.swing.JButton jBmodificar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTmaterias;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JRadioButton jrEstado;
    private javax.swing.JTextField jtAnio;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables

    private void soloLetras(KeyEvent evt) {

        char validar = evt.getKeyChar();

        if (Character.isDigit(validar)) {

            getToolkit().beep();
            evt.consume();

            Utilidades.mostrarDialogoTemporal("Error", "Ingrese solo letras", 1000);
        }
    }

    private void soloNumeros(KeyEvent evt) {

        char validar = evt.getKeyChar();

        if (Character.isLetter(validar)) {

            getToolkit().beep();
            evt.consume();

            Utilidades.mostrarDialogoTemporal("Error", "Ingrese solo numeros", 1000);

        }
    }
}