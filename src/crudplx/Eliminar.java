package crudplx;

import static crudplx.Conexion.db;
import static crudplx.Conexion.host;
import static crudplx.Conexion.password;
import static crudplx.Conexion.user;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Eliminar extends javax.swing.JFrame {

    Fondo fondo = new Fondo();
    Conexion conexion = new Conexion();
    
    public Eliminar() {
        this.setContentPane(fondo);
        initComponents();
        txtID.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnBuscarEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        menuInsertar = new javax.swing.JMenuItem();
        menuActualizar = new javax.swing.JMenuItem();
        menuConsultas = new javax.swing.JMenuItem();
        menuReportes = new javax.swing.JMenuItem();
        menuSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 0));
        jLabel1.setText("Eliminar registros MySQL Java");

        tabla.setForeground(new java.awt.Color(0, 255, 0));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tabla);

        btnBuscarEliminar.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        btnBuscarEliminar.setText("Buscar registro");
        btnBuscarEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEliminarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtID.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N

        jMenuBar2.setForeground(new java.awt.Color(0, 255, 0));

        jMenu3.setForeground(new java.awt.Color(0, 255, 0));
        jMenu3.setText("Menú");
        jMenu3.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N

        menuInsertar.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        menuInsertar.setForeground(new java.awt.Color(0, 255, 0));
        menuInsertar.setText("Insertar");
        menuInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInsertarActionPerformed(evt);
            }
        });
        jMenu3.add(menuInsertar);

        menuActualizar.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        menuActualizar.setForeground(new java.awt.Color(0, 255, 0));
        menuActualizar.setText("Actualizar");
        menuActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActualizarActionPerformed(evt);
            }
        });
        jMenu3.add(menuActualizar);

        menuConsultas.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        menuConsultas.setForeground(new java.awt.Color(0, 255, 0));
        menuConsultas.setText("Consultas");
        menuConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultasActionPerformed(evt);
            }
        });
        jMenu3.add(menuConsultas);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(261, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(196, 196, 196))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBuscarEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarEliminar)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar)
                .addContainerGap(244, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(199, 199, 199)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInsertarActionPerformed
        Insertar insertar = new Insertar();
        insertar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuInsertarActionPerformed

    private void menuActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActualizarActionPerformed
        Actualizar actualizar = new Actualizar();
        actualizar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuActualizarActionPerformed

    private void menuConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultasActionPerformed
        Consultas consultas = new Consultas();
        consultas.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuConsultasActionPerformed

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

    private void btnBuscarEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEliminarActionPerformed
        int idBuscar = 0;
        boolean datos = false;
        try {
            idBuscar = Integer.parseInt(txtID.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El valor ingresado no es numerico: "+e.toString());
            txtID.requestFocus();
            txtID.selectAll();
            return;
        }
        //
        if(btnBuscarEliminar.getText() == "Eliminar"){
            //codigo para eliminar
            try {
                Connection conn = null;
                conn = conexion.getConnection(host, user, password, db);
                PreparedStatement ps = conn.prepareStatement("delete from clientes where idcliente = ?");
                ps.setInt(1, idBuscar);
                ps.executeUpdate();
                
                ps.close();
                conn.close();
                
                JOptionPane.showMessageDialog(this, "Registro eliminado correctamente");
                DefaultTableModel modelo = new DefaultTableModel();
                this.tabla.setModel(modelo);
                btnBuscarEliminar.setText("Buscar Registro");
                txtID.setText("");
                txtID.requestFocus();
            } catch (Exception e) {
                
            }
            
        }else{
            //codigo para buscar
            try {
                Connection conn = null;
                conn = conexion.getConnection(host, user, password, db);
                
                DefaultTableModel modelo = new DefaultTableModel();
                this.tabla.setModel(modelo);
                
                PreparedStatement psid = conn.prepareStatement("select * from clientes where idcliente = ?");
                psid.setInt(1, idBuscar);
                
                ResultSet rs = psid.executeQuery();
                if (!rs.isBeforeFirst()) {
                    JOptionPane.showMessageDialog(this, "No existe registro");
                    txtID.requestFocus();
                    txtID.selectAll();
                } else {
                    ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();

                    int cantidadColumnas = rsmd.getColumnCount();

                    for (int i = 1; i <= cantidadColumnas; i++) {
                        modelo.addColumn(rsmd.getColumnLabel(i));
                    }

                    while (rs.next()) {
                        Vector fila = new Vector();
                        for (int j = 0; j < cantidadColumnas; j++) {
                            fila.add(rs.getString(j + 1));
                        }
                        modelo.addRow(fila);
                        //datos = true;
                        JOptionPane.showMessageDialog(this, "Consulta exitosa");
                        btnBuscarEliminar.setText("Eliminar");
                    }
                }
                
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "No existe ese registro");
            }
            
        }
    }//GEN-LAST:event_btnBuscarEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtID.setText("");
        txtID.requestFocus();
        btnBuscarEliminar.setText("Buscar Registro");
        DefaultTableModel modelo = new DefaultTableModel();
        this.tabla.setModel(modelo);
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Eliminar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarEliminar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem menuActualizar;
    private javax.swing.JMenuItem menuConsultas;
    private javax.swing.JMenuItem menuInsertar;
    private javax.swing.JMenuItem menuReportes;
    private javax.swing.JMenuItem menuSalir;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables
}
