
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
        jTid = new javax.swing.JTextField();
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
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Materias2.png"))); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 204));
        jDesktopPane1.setPreferredSize(new java.awt.Dimension(400, 480));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Materia");

        jbBuscar.setForeground(new java.awt.Color(0, 0, 0));
        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jTid.setBackground(new java.awt.Color(255, 255, 255));
        jTid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTidKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("codigo");

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Año");

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Estado");

        jTnombre.setBackground(new java.awt.Color(255, 255, 255));
        jTnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTnombreKeyTyped(evt);
            }
        });

        jTanio.setBackground(new java.awt.Color(255, 255, 255));
        jTanio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTanioKeyTyped(evt);
            }
        });

        jRestado.setBackground(new java.awt.Color(204, 204, 204));
        jRestado.setContentAreaFilled(false);

        jBlimpiar.setForeground(new java.awt.Color(0, 0, 0));
        jBlimpiar.setText("Limpiar");
        jBlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBlimpiarActionPerformed(evt);
            }
        });

        jbEliminar.setForeground(new java.awt.Color(0, 0, 0));
        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbGuardar.setForeground(new java.awt.Color(0, 0, 0));
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jBmodificar.setForeground(new java.awt.Color(0, 0, 0));
        jBmodificar.setText("Modificar");
        jBmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmodificarActionPerformed(evt);
            }
        });

        jbSalir.setForeground(new java.awt.Color(0, 0, 0));
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

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

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbBuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTid, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTnombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTanio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jRestado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBlimpiar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbEliminar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbGuardar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBmodificar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(43, 43, 43)
                .addComponent(jTid, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143)
                .addComponent(jbBuscar))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addGap(38, 38, 38)
                .addComponent(jTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(70, 70, 70)
                .addComponent(jTanio, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(jLabel5)
                .addGap(35, 35, 35)
                .addComponent(jRestado))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jBlimpiar)
                .addGap(8, 8, 8)
                .addComponent(jbEliminar)
                .addGap(7, 7, 7)
                .addComponent(jbGuardar)
                .addGap(8, 8, 8)
                .addComponent(jBmodificar))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(jbSalir))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jTid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbBuscar))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTanio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jRestado))
                .addGap(38, 38, 38)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBlimpiar)
                    .addComponent(jbEliminar)
                    .addComponent(jbGuardar)
                    .addComponent(jBmodificar))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jbSalir))
        );

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed

        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        
            int id = Integer.parseInt(jTid.getText());
            Materia buscarMat = materiaDat.buscarMateria(Integer.parseInt(jTid.getText()));

            if (buscarMat != null) {

                cargarMateriasId( id);
      
            }else {
                Utilidades.mostrarDialogoTemporal("Tabla materia", "Materia no encontrada", 2000);
            }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed

        Materia guardarMat = new Materia();

        if (!jTid.getText().isEmpty() && !jTnombre.getText().isEmpty() && !jTanio.getText().isEmpty()) {

            guardarMat.setIdMateria(Integer.parseInt(jTid.getText()));
            guardarMat.setNombre(jTnombre.getText());

            int anioIn = Integer.parseInt(jTanio.getText());

            if (anioIn >= 1 && anioIn <= 6) {

                guardarMat.setAnio(anioIn);
                guardarMat.setEstado(jRestado.isSelected());
                materiaDat.guardarMateria(guardarMat);
                limpiar();

            } else {

                Utilidades.mostrarDialogoTemporal("Error", "Ingrese Años de Materias entre: 1 y 6 ", 2000);
            }

        } else {

            Utilidades.mostrarDialogoTemporal("Error", "Debe ingresar todos los datos", 2000);
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed

        materiaDat.eliminarMateria(Integer.parseInt(jTid.getText()));
        limpiar();

    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jBlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlimpiarActionPerformed
        
        limpiar();   
    }//GEN-LAST:event_jBlimpiarActionPerformed

    private void jTidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTidKeyTyped
        
       soloNumeros(evt);
    }//GEN-LAST:event_jTidKeyTyped
    
    private void jTnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTnombreKeyTyped
        
        soloLetras(evt);
    }//GEN-LAST:event_jTnombreKeyTyped

    private void jTanioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTanioKeyTyped
        
        soloNumeros(evt);
    }//GEN-LAST:event_jTanioKeyTyped

    private void jBmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmodificarActionPerformed
        
        Materia materia = new Materia();
        
        materia.setIdMateria(Integer.parseInt(jTid.getText()));
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
        
        jTid.setText(jTmaterias.getValueAt(fila, 0) + "");
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
    private javax.swing.JTextField jTid;
    private javax.swing.JTable jTmaterias;
    private javax.swing.JTextField jTnombre;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbSalir;
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
    
    private void cargarMateriasId(int id) {

        modelo.setRowCount(0);
        
        Materia materia = materiaDat.buscarMateria(id);

            modelo.addRow(new Object[]{materia.getIdMateria(), materia.getNombre(), materia.getAnio(),
                materia.isEstado()});      
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
        
        jTid.setText("");
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