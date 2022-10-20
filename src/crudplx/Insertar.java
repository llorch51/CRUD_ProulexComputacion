package crudplx;

import static crudplx.Conexion.db;
import static crudplx.Conexion.host;
import static crudplx.Conexion.password;
import static crudplx.Conexion.user;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Insertar extends javax.swing.JFrame {

     Fondo fondo = new Fondo();
     Conexion conexion = new Conexion();
     
    
    public Insertar() {
        this.setContentPane(fondo);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbID = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPaterno = new javax.swing.JTextField();
        txtMaterno = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        btnInsertar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        menuConsultas = new javax.swing.JMenuItem();
        menuActualizar = new javax.swing.JMenuItem();
        menuEliminar = new javax.swing.JMenuItem();
        menuReportes = new javax.swing.JMenuItem();
        menuSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 0));
        jLabel1.setText("Insertar registros MySQL Java");

        jLabel2.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 0));
        jLabel2.setText("Materno:");

        jLabel3.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 0));
        jLabel3.setText("Paterno:");

        jLabel4.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 0));
        jLabel4.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 0));
        jLabel5.setText("Teléfono:");

        jLabel6.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 255, 0));
        jLabel6.setText("Correo:");

        lbID.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        lbID.setForeground(new java.awt.Color(0, 255, 0));
        lbID.setText("......");

        jLabel8.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 255, 0));
        jLabel8.setText("ID:");

        txtPaterno.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N

        txtMaterno.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N

        txtNombre.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N

        txtTelefono.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N

        txtCorreo.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N

        btnInsertar.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        btnInsertar.setText("Insertar");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jMenuBar2.setForeground(new java.awt.Color(0, 255, 0));

        jMenu3.setForeground(new java.awt.Color(0, 255, 0));
        jMenu3.setText("Menú");
        jMenu3.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N

        menuConsultas.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        menuConsultas.setForeground(new java.awt.Color(0, 255, 0));
        menuConsultas.setText("Consultas");
        menuConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultasActionPerformed(evt);
            }
        });
        jMenu3.add(menuConsultas);

        menuActualizar.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        menuActualizar.setForeground(new java.awt.Color(0, 255, 0));
        menuActualizar.setText("Actualizar");
        menuActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActualizarActionPerformed(evt);
            }
        });
        jMenu3.add(menuActualizar);

        menuEliminar.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        menuEliminar.setForeground(new java.awt.Color(0, 255, 0));
        menuEliminar.setText("Eliminar");
        menuEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEliminarActionPerformed(evt);
            }
        });
        jMenu3.add(menuEliminar);

        menuReportes.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        menuReportes.setForeground(new java.awt.Color(0, 255, 0));
        menuReportes.setText("Reportes");
        menuReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuReportesActionPerformed(evt);
            }
        });
        jMenu3.add(menuReportes);

        menuSalir.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        menuSalir.setForeground(new java.awt.Color(0, 255, 0));
        menuSalir.setText("Salir");
        menuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalirActionPerformed(evt);
            }
        });
        jMenu3.add(menuSalir);

        jMenuBar2.add(jMenu3);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbID)
                            .addComponent(txtPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(btnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lbID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultasActionPerformed
        Consultas consultas = new Consultas();
        consultas.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuConsultasActionPerformed

    private void menuActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActualizarActionPerformed
        Actualizar actualizar = new Actualizar();
        actualizar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuActualizarActionPerformed

    private void menuEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEliminarActionPerformed
        Eliminar eliminar = new Eliminar();
        eliminar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuEliminarActionPerformed

    private void menuReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuReportesActionPerformed
        Reporteador reporteador = new Reporteador();
        reporteador.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuReportesActionPerformed

    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed
        int respuesta;
        respuesta = JOptionPane.showConfirmDialog(this, "¿Realmente desea salir de la aplicación?");
        // si = 0, no = 1, cancelar = 2
        if (respuesta == 0) {
            JOptionPane.showMessageDialog(this, "Se cerrará la aplicación");
            System.exit(0);
        } else if (respuesta == 1) {
            JOptionPane.showMessageDialog(this, "No se cerrará la aplicación");
        } else {
            JOptionPane.showMessageDialog(this, "se canceló la operación");
        }
    }//GEN-LAST:event_menuSalirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtPaterno.setText("");
        txtMaterno.setText("");
        txtNombre.setText("");
        txtTelefono.setText("");
        txtCorreo.setText("");
        lbID.setText("......");
        
        txtPaterno.requestFocus();
        
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        //crear variables para guardar los datos de las cajas de texto
        String paterno = txtPaterno.getText().toUpperCase();
        String materno = txtMaterno.getText().toUpperCase();
        String nombre = txtNombre.getText().toUpperCase();
        String telefono = txtTelefono.getText();
        String correo = txtCorreo.getText().toLowerCase();
        
        if(paterno.length() == 0 || materno.length() == 0 || nombre.length() == 0 || telefono.length() == 0 || correo.length() == 0){
            JOptionPane.showMessageDialog(this, "Hay campos vacíos, wey");
        }else{
            try {
                Connection conn = null;
                conn = conexion.getConnection(host, user, password, db);
                //preparar el INSERT
                PreparedStatement ps = conn.prepareStatement("insert into clientes(paterno, materno, nombre, telefono, correo) values (?, ?, ?, ?, ?)");
                ps.setString(1, paterno);
                ps.setString(2, materno);
                ps.setString(3, nombre);
                ps.setString(4, telefono);
                ps.setString(5, correo);
                //ejecutar el insert
                ps.executeUpdate();
                
                //recuperar ID asignado al nuevo cliente
                PreparedStatement psid = conn.prepareStatement("select idcliente from clientes order by idcliente desc limit 1");
                ResultSet rsid = psid.executeQuery();
                rsid.next();
                lbID.setText( rsid.getString(1));
//                while(rsid.next()){
//                    lbID.setText( rsid.getString(1));
//                }
                //cerrar las conexiones
                ps.close();
                conn.close();
                JOptionPane.showMessageDialog(this, "Registro insertado correctamente");
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnInsertarActionPerformed

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
            java.util.logging.Logger.getLogger(Insertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Insertar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JLabel lbID;
    private javax.swing.JMenuItem menuActualizar;
    private javax.swing.JMenuItem menuConsultas;
    private javax.swing.JMenuItem menuEliminar;
    private javax.swing.JMenuItem menuReportes;
    private javax.swing.JMenuItem menuSalir;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtMaterno;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPaterno;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
