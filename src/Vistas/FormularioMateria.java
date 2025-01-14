
package Vistas;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import AccesoADatos.MateriaData;
import Entidades.Materia;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class FormularioMateria extends javax.swing.JInternalFrame {
    
    private MateriaData materiaDat = new MateriaData();
    
    public FormularioMateria() {
        
        initComponents();
        armarCabecera();
        jBmodificar.setEnabled(false);
        jbEliminar.setEnabled(false);
        cargarMaterias();
    }

    private DefaultTableModel modelo = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {

            return false;
        }
    };
    
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
        jTnombre = new javax.swing.JTextField();
        jTanio = new javax.swing.JTextField();
        jRestado = new javax.swing.JRadioButton();
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

        jTnombre.setBackground(new java.awt.Color(255, 255, 255));
        jTnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTnombreKeyTyped(evt);
            }
        });
        jDesktopPane1.add(jTnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 129, -1));

        jTanio.setBackground(new java.awt.Color(255, 255, 255));
        jTanio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTanioKeyTyped(evt);
            }
        });
        jDesktopPane1.add(jTanio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 39, -1));

        jRestado.setBackground(new java.awt.Color(204, 204, 204));
        jRestado.setContentAreaFilled(false);
        jDesktopPane1.add(jRestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, -1, -1));

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
        jTmaterias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTmateriasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTmaterias);

        jDesktopPane1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 360, 160));

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed

        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        
            int id = Integer.parseInt(jtCodigo.getText());
            Materia buscarMat = materiaDat.buscarMateria(Integer.parseInt(jtCodigo.getText()));

            if (buscarMat != null) {

                jTnombre.setText(buscarMat.getNombre());
                jTanio.setText(buscarMat.getAnio() + "");
                jRestado.setSelected(buscarMat.isEstado());
                
                
            }else {
                Utilidades.mostrarDialogoTemporal("Tabla materia", "Materia no encontrada", 2000);
            }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed

        Materia guardarMat = new Materia();

        if (!jtCodigo.getText().isEmpty() && !jTnombre.getText().isEmpty() && jTanio.getText().isEmpty()) {
            
            guardarMat.setIdMateria(Integer.parseInt(jtCodigo.getText()));
            guardarMat.setNombre(jTnombre.getText());

            int anioIn = Integer.parseInt(jTanio.getText());

            if (anioIn >= 1 && anioIn <= 6) {

                guardarMat.setAnio(anioIn);

            } else {

                Utilidades.mostrarDialogoTemporal("Error", "Ingrese Años de Materias entre: 1 y 6 ", 2000);
            }

            guardarMat.setEstado(jRestado.isSelected());
            materiaDat.guardarMateria(guardarMat);
            limpiar();
            
        } else {
            
             Utilidades.mostrarDialogoTemporal("Error", "Debe ingresar todos los datos", 2000);
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed

        materiaDat.eliminarMateria(Integer.parseInt(jtCodigo.getText()));

    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jBlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlimpiarActionPerformed
        
        limpiar();   
    }//GEN-LAST:event_jBlimpiarActionPerformed

    private void jtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCodigoKeyTyped
        
       soloNumeros(evt);
    }//GEN-LAST:event_jtCodigoKeyTyped
    
    private void jTnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTnombreKeyTyped
        
        soloLetras(evt);
    }//GEN-LAST:event_jTnombreKeyTyped

    private void jTanioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTanioKeyTyped
        
        soloNumeros(evt);
    }//GEN-LAST:event_jTanioKeyTyped

    private void jBmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmodificarActionPerformed
        
        Materia materia = new Materia();
        
        materia.setIdMateria(Integer.parseInt(jtCodigo.getText()));
        materia.setNombre(jTnombre.getText());
        materia.setAnio(Integer.parseInt(jTanio.getText()));
        materia.setEstado(jRestado.isSelected());
        
        materiaDat.modificarMateria(materia);
        limpiar();
    }//GEN-LAST:event_jBmodificarActionPerformed

    private void jTmateriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTmateriasMouseClicked
        
        jBmodificar.setEnabled(true);
        jbBuscar.setEnabled(false);
        jbEliminar.setEnabled(true);
        jbGuardar.setEnabled(false);
        
        int fila = jTmaterias.getSelectedRow();
        
        jtCodigo.setText(jTmaterias.getValueAt(fila, 0) + "");
        jTnombre.setText(jTmaterias.getValueAt(fila, 1) + "");
        jTanio.setText(jTmaterias.getValueAt(fila, 2) + "");
        jRestado.setSelected((boolean) jTmaterias.getValueAt(fila,3));
    }//GEN-LAST:event_jTmateriasMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBlimpiar;
    private javax.swing.JButton jBmodificar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRestado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTanio;
    private javax.swing.JTable jTmaterias;
    private javax.swing.JTextField jTnombre;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTextField jtCodigo;
    // End of variables declaration//GEN-END:variables
    
    private void armarCabecera() {

        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Anio");
        modelo.addColumn("estado");
        jTmaterias.setModel(modelo);
    }
    
    private void cargarMaterias() {

        modelo.setRowCount(0);
        
        List<Materia> materias = materiaDat.ListarMaterias();

        for (Materia materia : materias) {

            modelo.addRow(new Object[]{materia.getIdMateria(), materia.getNombre(), materia.getAnio(),
                materia.isEstado()});
        }
    }
    
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
    
    private void limpiar(){
        
        jtCodigo.setText("");
        jTnombre.setText("");
        jTanio.setText("");
        jRestado.setSelected(false);
        
        jBmodificar.setEnabled(false);
        jbBuscar.setEnabled(true);
        jbEliminar.setEnabled(false);
        jbGuardar.setEnabled(true);
        
        cargarMaterias();
    }
}