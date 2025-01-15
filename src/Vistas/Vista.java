
package Vistas;

import java.awt.Graphics;
import java.awt.Image;
import java.sql.Connection;
import javax.swing.ImageIcon;
import AccesoADatos.Conexion;
import javax.swing.JInternalFrame;


public class Vista extends javax.swing.JFrame {
    
    private Connection con = null;
        
    public Vista() {
        
        initComponents();
        
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/Recursos/colegio2.png")).getImage());            
        con = Conexion.getConexion();        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        ImageIcon icono = new ImageIcon(getClass().getResource("/Recursos/Universidad.jpg"));
        Image imagen = icono.getImage();
        escritorio = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){

                g.drawImage(imagen,0,0,getWidth(),getHeight(),this);

            }
        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jmAlumno = new javax.swing.JMenu();
        jmForAlumno = new javax.swing.JMenuItem();
        jmMateria = new javax.swing.JMenu();
        jmForMateria = new javax.swing.JMenuItem();
        jmAdminitracion = new javax.swing.JMenu();
        jmManeIncripcion = new javax.swing.JMenuItem();
        jmManiNotas = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmCAMateria = new javax.swing.JMenuItem();
        jmSalir = new javax.swing.JMenu();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        escritorio.setToolTipText("");
        escritorio.setPreferredSize(new java.awt.Dimension(550, 520));
        escritorio.setRequestFocusEnabled(false);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 568, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 533, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
        );

        jMenuBar1.setPreferredSize(new java.awt.Dimension(385, 50));

        jmAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/alumno1.png"))); // NOI18N

        jmForAlumno.setText("Gestion de Alumnos");
        jmForAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmForAlumnoActionPerformed(evt);
            }
        });
        jmAlumno.add(jmForAlumno);

        jMenuBar1.add(jmAlumno);

        jmMateria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Materias1.png"))); // NOI18N

        jmForMateria.setText("Gestion de Materias");
        jmForMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmForMateriaActionPerformed(evt);
            }
        });
        jmMateria.add(jmForMateria);

        jMenuBar1.add(jmMateria);

        jmAdminitracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Administracion1.png"))); // NOI18N

        jmManeIncripcion.setText("Manejo de Inscripciones");
        jmManeIncripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmManeIncripcionActionPerformed(evt);
            }
        });
        jmAdminitracion.add(jmManeIncripcion);

        jmManiNotas.setText("Manipulacion de Notas");
        jmManiNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmManiNotasActionPerformed(evt);
            }
        });
        jmAdminitracion.add(jmManiNotas);

        jMenuBar1.add(jmAdminitracion);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Consultas1.png"))); // NOI18N

        jmCAMateria.setText("Alumnos por Materia");
        jmCAMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCAMateriaActionPerformed(evt);
            }
        });
        jMenu4.add(jmCAMateria);

        jMenuBar1.add(jMenu4);

        jmSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Salir1.png"))); // NOI18N
        jmSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmSalirMouseClicked(evt);
            }
        });
        jMenuBar1.add(jmSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmForAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmForAlumnoActionPerformed
        
        GestionAlumno ga = new GestionAlumno();
        mostrarFormulario(ga);       
    }//GEN-LAST:event_jmForAlumnoActionPerformed

    private void jmForMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmForMateriaActionPerformed

        FormularioMateria fm = new FormularioMateria();
        mostrarFormulario(fm);
    }//GEN-LAST:event_jmForMateriaActionPerformed

    private void jmCAMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCAMateriaActionPerformed
        
        ListadoAlumnoPorMateria apm = new ListadoAlumnoPorMateria();
        mostrarFormulario(apm);
    }//GEN-LAST:event_jmCAMateriaActionPerformed

    private void jmManeIncripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmManeIncripcionActionPerformed

        FormularioInscripcion fi = new FormularioInscripcion();
        mostrarFormulario(fi);
    }//GEN-LAST:event_jmManeIncripcionActionPerformed

    private void jmManiNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmManiNotasActionPerformed
    
        CargarNotas cn = new CargarNotas();
        mostrarFormulario(cn);
    }//GEN-LAST:event_jmManiNotasActionPerformed

    private void jmSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmSalirMouseClicked
        
        System.exit(0);
        
    }//GEN-LAST:event_jmSalirMouseClicked

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu jmAdminitracion;
    private javax.swing.JMenu jmAlumno;
    private javax.swing.JMenuItem jmCAMateria;
    private javax.swing.JMenuItem jmForAlumno;
    private javax.swing.JMenuItem jmForMateria;
    private javax.swing.JMenuItem jmManeIncripcion;
    private javax.swing.JMenuItem jmManiNotas;
    private javax.swing.JMenu jmMateria;
    private javax.swing.JMenu jmSalir;
    // End of variables declaration//GEN-END:variables

    private void mostrarFormulario(JInternalFrame formulario) {
        
        escritorio.removeAll();
        escritorio.repaint();
        formulario.setVisible(true);
        escritorio.add(formulario);
        escritorio.moveToFront(formulario);
    }
}
