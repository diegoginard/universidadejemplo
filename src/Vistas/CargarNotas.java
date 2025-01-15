package Vistas;

import Entidades.Inscripcion;
import Entidades.Materia;
import Entidades.Alumno;
import AccesoADatos.InscripcionData;
import AccesoADatos.AlumnoData;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Image;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.table.DefaultTableModel;

public class CargarNotas extends JInternalFrame {
    
    private InscripcionData inscripDat = new InscripcionData();
    private AlumnoData alumDat = new AlumnoData();
    
    private DefaultTableModel modelo = new DefaultTableModel(){
        
        boolean[] canEdit = new boolean[]{
                    false, true
            };

        @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
    };

    public CargarNotas() {

        initComponents();
        armarCabecera();
        cargarCombo();
        jbGuardar.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/Recursos/semestre.png"));
        Image image = icon.getImage();
        jDesktopPane1 = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){

                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jbGuardar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jcbListaAlumnos = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtAlumnoNota = new javax.swing.JTable();

        setBorder(null);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Administracion2.png"))); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setPreferredSize(new java.awt.Dimension(390, 350));

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jcbListaAlumnos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbListaAlumnosItemStateChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Carga de Notas");

        jLabel2.setText("Seleccione un Alumno: ");

        jtAlumnoNota.setModel(new javax.swing.table.DefaultTableModel(
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
        jtAlumnoNota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtAlumnoNotaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtAlumnoNota);
        if (jtAlumnoNota.getColumnModel().getColumnCount() > 0) {
            jtAlumnoNota.getColumnModel().getColumn(3).setResizable(false);
        }

        jDesktopPane1.setLayer(jbGuardar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jcbListaAlumnos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel1))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2)
                        .addGap(6, 6, 6)
                        .addComponent(jcbListaAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jbGuardar)
                        .addGap(52, 52, 52)
                        .addComponent(jButton2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(jcbListaAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbGuardar)
                    .addComponent(jButton2)))
        );

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jcbListaAlumnosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbListaAlumnosItemStateChanged

        cargarLista();
    }//GEN-LAST:event_jcbListaAlumnosItemStateChanged

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed

        int selec = jtAlumnoNota.getSelectedRow();

        try {

            Materia materia = (Materia) jtAlumnoNota.getValueAt(selec, 0);
            Alumno alumno = (Alumno) jcbListaAlumnos.getSelectedItem();
            int idMateria = materia.getIdMateria();
            int idAlumno = alumno.getIdAlumno();
            double nota = Double.parseDouble(jtAlumnoNota.getValueAt(selec, 1).toString());

            if (nota >= 0 && nota <= 10) {

                inscripDat.actualizarNota(idAlumno, idMateria, nota);
                cargarLista();    
            } else {

                Utilidades.mostrarDialogoTemporal("Error", "Ingrese un valor entre 0 y 10", 2000);
                cargarLista();
            }
            
        } catch (HeadlessException | NumberFormatException ex) {
            Utilidades.mostrarDialogoTemporal("Error", "Solo debe ingresar numeros", 2000);
            cargarLista();
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jtAlumnoNotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtAlumnoNotaMouseClicked
        
        jbGuardar.setEnabled(true);       
    }//GEN-LAST:event_jtAlumnoNotaMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JComboBox<Alumno> jcbListaAlumnos;
    private javax.swing.JTable jtAlumnoNota;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {
        
        modelo.addColumn("Materia");
        modelo.addColumn("Nota");
        jtAlumnoNota.setModel(modelo);
    }

    private void cargarCombo() {

        List<Alumno> alumnos = alumDat.listarAlumnos();

        for (Alumno alumno : alumnos) {

            jcbListaAlumnos.addItem(new Alumno(alumno.getIdAlumno(),alumno.getDni(),
                    alumno.getApellido(),alumno.getNombre()));
        }
    }
        public void cargarLista(){
            
            modelo.setRowCount(0);
            
            Alumno alumno = (Alumno) jcbListaAlumnos.getSelectedItem();
            int idAlumno = alumno.getIdAlumno();
            List<Inscripcion> inscri = inscripDat.ObternerInscripcionesPorAlumno(idAlumno);
            

            for (Inscripcion ins: inscri){

                modelo.addRow(new Object[]{ins.getMateria(),ins.getNota()});              
        }
    }
}
