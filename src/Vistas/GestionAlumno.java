
package Vistas;

import Entidades.Alumno;
import AccesoADatos.AlumnoData;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;


public class GestionAlumno extends javax.swing.JInternalFrame {
   
    private AlumnoData alumDat = new AlumnoData();
    
    public GestionAlumno() {

        initComponents();
        armarCabecera();
        cargarAlumnos(); 
        jBmodificar.setEnabled(false);
        jbEliminar.setEnabled(false);
        jTidAlumno.setEnabled(false);
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

        ImageIcon icon = new ImageIcon(getClass().getResource("/Recursos/alumnoB.png"));
        Image image = icon.getImage();
        jDesktopPane1 = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }

        };
        jrEstado = new javax.swing.JRadioButton();
        fechaNacabel4 = new javax.swing.JLabel();
        jBlimpiar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jBmodificar = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jLtitulo = new javax.swing.JLabel();
        jtDni = new javax.swing.JTextField();
        jLdni = new javax.swing.JLabel();
        jtApellido = new javax.swing.JTextField();
        jLapellido = new javax.swing.JLabel();
        jLnombre = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jLestado = new javax.swing.JLabel();
        jdFecha = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTlistaAlum = new javax.swing.JTable();
        jTidAlumno = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 102, 102));
        setBorder(null);
        setTitle("Gestor de alumnos");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/alumno2.png"))); // NOI18N
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(430, 530));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setPreferredSize(null);
        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jrEstado.setContentAreaFilled(false);
        jDesktopPane1.add(jrEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        fechaNacabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        fechaNacabel4.setText("Fecha de Nacimiento");
        jDesktopPane1.add(fechaNacabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, 23));

        jBlimpiar.setText("Limpiar");
        jBlimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBlimpiar.setIconTextGap(3);
        jBlimpiar.setMaximumSize(new java.awt.Dimension(81, 23));
        jBlimpiar.setPreferredSize(new java.awt.Dimension(81, 23));
        jBlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBlimpiarActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jBlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 90, -1));

        jbEliminar.setText("Eliminar");
        jbEliminar.setMaximumSize(new java.awt.Dimension(81, 23));
        jbEliminar.setPreferredSize(new java.awt.Dimension(81, 23));
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jbEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 90, -1));

        jbGuardar.setText("Guardar");
        jbGuardar.setMaximumSize(new java.awt.Dimension(81, 23));
        jbGuardar.setPreferredSize(new java.awt.Dimension(81, 23));
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 90, -1));

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, 74, -1));

        jBmodificar.setText("Modificar");
        jBmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmodificarActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jBmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 90, -1));

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, -1));

        jLtitulo.setBackground(new java.awt.Color(0, 0, 0));
        jLtitulo.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLtitulo.setText("Gestionar Alumno");
        jLtitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jDesktopPane1.add(jLtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 311, 33));

        jtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtDniKeyTyped(evt);
            }
        });
        jDesktopPane1.add(jtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 103, -1));

        jLdni.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLdni.setText("Documento :");
        jDesktopPane1.add(jLdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtApellidoKeyTyped(evt);
            }
        });
        jDesktopPane1.add(jtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 202, -1));

        jLapellido.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLapellido.setText("Apellido :");
        jDesktopPane1.add(jLapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLnombre.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLnombre.setText("Nombre :");
        jDesktopPane1.add(jLnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNombreKeyTyped(evt);
            }
        });
        jDesktopPane1.add(jtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 202, -1));

        jLestado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLestado.setText("Estado");
        jDesktopPane1.add(jLestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));
        jDesktopPane1.add(jdFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 161, -1));

        jTlistaAlum.setModel(new javax.swing.table.DefaultTableModel(
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
        jTlistaAlum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTlistaAlumMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTlistaAlum);

        jDesktopPane1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 370, 130));
        jDesktopPane1.add(jTidAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 150, 24, -1));

        jLabel1.setText("ID");
        jDesktopPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 113, -1, -1));

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        
        int dni = Integer.parseInt(jtDni.getText());
        Alumno buscarAlumnoDni = alumDat.buscarAlumnoDni(dni);

        if (buscarAlumnoDni != null) {

            cargarAlumnosXdni(dni);
        }else {
            Utilidades.mostrarDialogoTemporal("Tabla alumno", "Alumno no encontrada", 2000);
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed

        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed

        Alumno guardarAlum = new Alumno();

        if (!jtNombre.getText().isEmpty() && !jtApellido.getText().isEmpty() && !jtApellido.getText().isEmpty()
                && !jtDni.getText().isEmpty() && jdFecha.getDate()!= null) {
            
            guardarAlum.setNombre(jtNombre.getText());
            guardarAlum.setApellido(jtApellido.getText());
            guardarAlum.setDni(Integer.parseInt(jtDni.getText()));
            guardarAlum.setFechaNacimiento(jdFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            guardarAlum.setActivo(jrEstado.isSelected());
            alumDat.guardarAlumno(guardarAlum);
            limpiarForm();
            
        }else{
            
            Utilidades.mostrarDialogoTemporal("Error", "Debe ingresar todos los datos", 2000);
        }
        
        limpiarForm();
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed

        alumDat.eliminarAlumnoDni (Integer.parseInt(jtDni.getText()));
        limpiarForm();
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jBlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlimpiarActionPerformed

        limpiarForm();  
    }//GEN-LAST:event_jBlimpiarActionPerformed

    private void jtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDniKeyTyped
        
        soloNumeros(evt);
    }//GEN-LAST:event_jtDniKeyTyped

    private void jtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtApellidoKeyTyped
        
        soloLetras(evt);
    }//GEN-LAST:event_jtApellidoKeyTyped

    private void jtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreKeyTyped
        
       soloLetras(evt);
    }//GEN-LAST:event_jtNombreKeyTyped

    private void jBmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmodificarActionPerformed
        
        Alumno alumno = new Alumno();
        
        alumno.setDni(Integer.parseInt(jtDni.getText()));
        alumno.setApellido(jtApellido.getText());
        alumno.setNombre(jtNombre.getText());
        alumno.setFechaNacimiento(jdFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        alumno.setActivo(jrEstado.isSelected()); 
        alumno.setIdAlumno(Integer.parseInt(jTidAlumno.getText()));
        
        alumDat.modificarAlumno(alumno); 
        limpiarForm();   
    }//GEN-LAST:event_jBmodificarActionPerformed

    private void jTlistaAlumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTlistaAlumMouseClicked
        
        jBmodificar.setEnabled(true);
        jbEliminar.setEnabled(true);
        jbGuardar.setEnabled(false);
        jbBuscar.setEnabled(false);
        
        int fila = jTlistaAlum.getSelectedRow();
        
        jTidAlumno.setText(jTlistaAlum.getValueAt(fila, 0) + "");
        jtNombre.setText(jTlistaAlum.getValueAt(fila, 1) + "");
        jtApellido.setText(jTlistaAlum.getValueAt(fila, 2) + "");
        jtDni.setText(jTlistaAlum.getValueAt(fila, 3) + "");
        jdFecha.setDate(Date.from(((LocalDate) jTlistaAlum.getValueAt(fila, 4))
                .atStartOfDay(ZoneId.systemDefault()).toInstant()));
        jrEstado.setSelected((boolean) jTlistaAlum.getValueAt(fila, 5));
    }//GEN-LAST:event_jTlistaAlumMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fechaNacabel4;
    private javax.swing.JButton jBlimpiar;
    private javax.swing.JButton jBmodificar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLapellido;
    private javax.swing.JLabel jLdni;
    private javax.swing.JLabel jLestado;
    private javax.swing.JLabel jLnombre;
    private javax.swing.JLabel jLtitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTidAlumno;
    private javax.swing.JTable jTlistaAlum;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbSalir;
    private com.toedter.calendar.JDateChooser jdFecha;
    private javax.swing.JRadioButton jrEstado;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables
    
    private void armarCabecera() {

        modelo.addColumn("idAlumno");
        modelo.addColumn("nombre");
        modelo.addColumn("apellido");
        modelo.addColumn("dni");
        modelo.addColumn("fechaNacimiento");
        modelo.addColumn("estado");
        jTlistaAlum.setModel(modelo);
    }
    
    private void cargarAlumnos() {

        modelo.setRowCount(0);
        List<Alumno> alumnos = alumDat.listarAlumnos();

        for (Alumno alumno : alumnos) {

            modelo.addRow(new Object[]{alumno.getIdAlumno(), alumno.getNombre(), alumno.getApellido(),
                alumno.getDni(), alumno.getFechaNacimiento(), alumno.isActivo()});
        }
    }
    
    private void cargarAlumnosXdni(int dni) {

        modelo.setRowCount(0);
        Alumno alumno = alumDat.buscarAlumnoDni(dni);
        
        modelo.addRow(new Object[]{alumno.getIdAlumno(), alumno.getNombre(), alumno.getApellido(),
                alumno.getDni(), alumno.getFechaNacimiento(), alumno.isActivo()});
        
        jBmodificar.setEnabled(true);
        jbEliminar.setEnabled(true);
        jbGuardar.setEnabled(false);
        
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
    
    private void limpiarForm(){
             
        jtDni.setText(null);
        jtNombre.setText(null);
        jtApellido.setText(null);
        jrEstado.setSelected(false);
        jdFecha.setDate(null);
        
        jBmodificar.setEnabled(false);
        jbEliminar.setEnabled(false);
        jbGuardar.setEnabled(true);
        jbBuscar.setEnabled(true);
        cargarAlumnos();
    }
}
