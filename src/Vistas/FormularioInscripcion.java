
package Vistas;

import Entidades.Inscripcion;
import Entidades.Materia;
import Entidades.Alumno;
import AccesoADatos.MateriaData;
import AccesoADatos.InscripcionData;
import AccesoADatos.AlumnoData;
import java.awt.Graphics;
import java.awt.Image;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class FormularioInscripcion extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            
            return false;
        }
    };

    public FormularioInscripcion() {

        initComponents();
        armarCabecera();
        cargarCombo();

    }

    MateriaData md = new MateriaData();
    InscripcionData id = new InscripcionData();
    AlumnoData ad = new AlumnoData();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbGrupoMat = new javax.swing.ButtonGroup();
        ImageIcon icon = new ImageIcon(getClass().getResource("/Recursos/semestre.png"));
        Image image = icon.getImage();
        jDesktopPane1 = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }

        };
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbListaAlumnos = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jrMateriaInscripta = new javax.swing.JRadioButton();
        jrMateriaNoInscripta = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMateria = new javax.swing.JTable();
        jbInscribir = new javax.swing.JButton();
        jbNoInscribir = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        setBorder(null);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Administracion1.png"))); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setText("Formulario de Inscripcion");
        jDesktopPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 6, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setText("Seleccione un Alumno");
        jDesktopPane1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 50, -1, -1));

        jcbListaAlumnos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbListaAlumnosItemStateChanged(evt);
            }
        });
        jDesktopPane1.add(jcbListaAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 50, 186, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel3.setText("Listado de Materias");
        jDesktopPane1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 84, -1, 26));

        jbGrupoMat.add(jrMateriaInscripta);
        jrMateriaInscripta.setText("Materias Inscriptas");
        jrMateriaInscripta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrMateriaInscriptaActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jrMateriaInscripta, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 122, -1, -1));

        jbGrupoMat.add(jrMateriaNoInscripta);
        jrMateriaNoInscripta.setSelected(true);
        jrMateriaNoInscripta.setText("Materias no Inscriptas");
        jrMateriaNoInscripta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrMateriaNoInscriptaActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jrMateriaNoInscripta, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 122, -1, -1));

        jtMateria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtMateria);
        if (jtMateria.getColumnModel().getColumnCount() > 0) {
            jtMateria.getColumnModel().getColumn(0).setResizable(false);
        }

        jDesktopPane1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 155, 319, 162));

        jbInscribir.setText("Inscribir");
        jbInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInscribirActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jbInscribir, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 335, 76, -1));

        jbNoInscribir.setText("Anular Inscripcion");
        jbNoInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNoInscribirActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jbNoInscribir, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 335, 118, -1));

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 335, 63, -1));

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed

        dispose();

    }//GEN-LAST:event_jbSalirActionPerformed

    private void jrMateriaInscriptaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrMateriaInscriptaActionPerformed

        llenarLista();

    }//GEN-LAST:event_jrMateriaInscriptaActionPerformed

    private void jrMateriaNoInscriptaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrMateriaNoInscriptaActionPerformed

        llenarLista();

    }//GEN-LAST:event_jrMateriaNoInscriptaActionPerformed

    private void jcbListaAlumnosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbListaAlumnosItemStateChanged

        llenarLista();
        
    }//GEN-LAST:event_jcbListaAlumnosItemStateChanged

    private void jbInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInscribirActionPerformed
        
        int fila = jtMateria.getSelectedRow();
        
        if (fila >= 0) {

            Alumno itemSelec = (Alumno) jcbListaAlumnos.getSelectedItem();
            int selectID = itemSelec.getIdAlumno();
            Alumno aID = ad.buscarAlumno(selectID);
            Materia mID = md.buscarMateria((int) jtMateria.getValueAt(fila, 0));
            Inscripcion ins = new Inscripcion(aID, mID, 0);
            id.guardarInscripcion(ins);

        }else{
            
            JOptionPane.showMessageDialog(null, "Eliga una fila");
        
        }
    }//GEN-LAST:event_jbInscribirActionPerformed

    private void jbNoInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNoInscribirActionPerformed
        
        int fila = jtMateria.getSelectedRow();
        
        if (fila >= 0) {

            Alumno itemSelec = (Alumno) jcbListaAlumnos.getSelectedItem();
            int selectID = itemSelec.getIdAlumno();
            id.borrarInscripcionMateriaAlumno(selectID, (int) jtMateria.getValueAt(fila, 0));

        }else{
            
            JOptionPane.showMessageDialog(null, "Eliga una fila");
        
        } 
    }//GEN-LAST:event_jbNoInscribirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.ButtonGroup jbGrupoMat;
    private javax.swing.JButton jbInscribir;
    private javax.swing.JButton jbNoInscribir;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Alumno> jcbListaAlumnos;
    private javax.swing.JRadioButton jrMateriaInscripta;
    private javax.swing.JRadioButton jrMateriaNoInscripta;
    private javax.swing.JTable jtMateria;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera(){
        
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Anio");
        jtMateria.setModel(modelo);
        
    }
    
    private void cargarCombo() {

        List<Alumno> cblistaAlu = ad.listarAlumnos();
        
        for (int i = 0; i < cblistaAlu.size(); i++) {

            jcbListaAlumnos.addItem(new Alumno(cblistaAlu.get(i).getIdAlumno(),
                    cblistaAlu.get(i).getDni(),
                    cblistaAlu.get(i).getApellido(),
                    cblistaAlu.get(i).getNombre()));

        }
    }    
    
    private void llenarLista() {
        
        Alumno itemSelec = (Alumno) jcbListaAlumnos.getSelectedItem();
        int selectID = itemSelec.getIdAlumno();

        if (jrMateriaNoInscripta.isSelected()) {
            
            jbInscribir.setEnabled(true);
            jbNoInscribir.setEnabled(false);
            List<Materia> noInsc = id.ObtenerMateriasNOCursadas(selectID);
            modelo.setRowCount(0);

            for (Materia mat : noInsc) {

                modelo.addRow(new Object[]{mat.getIdMateria(),
                    mat.getNombre(), mat.getAnio()});
            }
        }

        if (jrMateriaInscripta.isSelected()) {
            
            jbNoInscribir.setEnabled(true);
            jbInscribir.setEnabled(false);
            modelo.setRowCount(0);
            List<Materia> insc = id.ObtenerMateriasCursadas(selectID);

            for (Materia mat : insc) {

                modelo.addRow(new Object[]{mat.getIdMateria(),
                    mat.getNombre(), mat.getAnio()});

            }
        }
    }
}

