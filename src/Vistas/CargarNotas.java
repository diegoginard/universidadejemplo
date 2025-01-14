package Vistas;

import Entidades.Inscripcion;
import Entidades.Materia;
import Entidades.Alumno;
import AccesoADatos.MateriaData;
import AccesoADatos.InscripcionData;
import AccesoADatos.AlumnoData;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Image;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CargarNotas extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel(){
        
        boolean[] canEdit = new boolean[]{
                    false, false, true
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
    
    InscripcionData id = new InscripcionData();
    AlumnoData ad = new AlumnoData();
    MateriaData md = new MateriaData();

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
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Administracion1.png"))); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setPreferredSize(new java.awt.Dimension(383, 380));
        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 300, -1, -1));

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, -1, -1));

        jcbListaAlumnos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbListaAlumnosItemStateChanged(evt);
            }
        });
        jDesktopPane1.add(jcbListaAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 79, 224, -1));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Carga de Notas");
        jDesktopPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 18, -1, 27));

        jLabel2.setText("Seleccione un Alumno: ");
        jDesktopPane1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 82, -1, -1));

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

        jDesktopPane1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 363, 149));

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 385, 338));

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

            Materia mat = (Materia) jtAlumnoNota.getValueAt(selec, 1);
            int idA = (Integer) jtAlumnoNota.getValueAt(selec, 0);
            int idM = mat.getIdMateria();
            double nota = Double.parseDouble(jtAlumnoNota.getValueAt(selec, 2).toString());

            if (nota >= 0 && nota <= 10) {

                id.actualizarNota(idA, idM, nota);

            } else {

                JOptionPane.showMessageDialog(null, "Ingrese un valor entre 0 y 10 ");

            }
            
        } catch (HeadlessException | NumberFormatException ex) {

            JOptionPane.showMessageDialog(null, "Solo debe ingresar numeros entre 0 y 10");

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

        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Nota");
        jtAlumnoNota.setModel(modelo);

    }

    private void cargarCombo() {

        List<Alumno> cblistaAlu = ad.listarAlumnos();

        for (int i = 0; i < cblistaAlu.size(); i++) {

            jcbListaAlumnos.addItem(new Alumno(cblistaAlu.get(i).getIdAlumno(),cblistaAlu.get(i).getDni(),
                    cblistaAlu.get(i).getApellido(),
                    cblistaAlu.get(i).getNombre()));

        }
    }
        public void cargarLista(){
            
            Alumno itemSelec = (Alumno) jcbListaAlumnos.getSelectedItem();
            int selectID = itemSelec.getIdAlumno();
            List<Inscripcion> inscri = id.ObternerInscripcionesPorAlumno(selectID);
            modelo.setRowCount(0);

            for (Inscripcion ins: inscri){

                modelo.addRow(new Object[]{ ins.getAlumno().getIdAlumno(), ins.getMateria(),ins.getNota()});
              
        }
    }
}