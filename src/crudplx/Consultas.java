package crudplx;

import com.formdev.flatlaf.FlatDarculaLaf;
import static crudplx.Conexion.db;
import static crudplx.Conexion.host;
import static crudplx.Conexion.password;
import static crudplx.Conexion.user;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class Consultas extends javax.swing.JFrame {

    Fondo fondo = new Fondo();
        
    public Consultas() {
        this.setContentPane(fondo);
        initComponents();
        txtConsultas.setText("select * from clientes");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnConsultar = new javax.swing.JButton();
        btnExportar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtConsultas = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        menuInsertar = new javax.swing.JMenuItem();
        menuActualizar = new javax.swing.JMenuItem();
        menuEliminar = new javax.swing.JMenuItem();
        menuReportes = new javax.swing.JMenuItem();
        menuSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnConsultar.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnExportar.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        btnExportar.setText("Exportar");
        btnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarActionPerformed(evt);
            }
        });

        txtConsultas.setColumns(20);
        txtConsultas.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        txtConsultas.setForeground(new java.awt.Color(0, 255, 0));
        txtConsultas.setRows(5);
        jScrollPane1.setViewportView(txtConsultas);

        tabla.setForeground(new java.awt.Color(0, 255, 0));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tabla);

        jLabel1.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 0));
        jLabel1.setText("Consultas a bases de datos MySQL Java");

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
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jLabel1)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(btnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
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

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        String consulta = txtConsultas.getText();
        
        if(consulta.length() == 0){
            JOptionPane.showMessageDialog(this, "No hay Query escrito");
        }else{
            try {
                Conexion conexion = new Conexion();
                Connection con = null;
                con = conexion.getConnection(host, user, password, db);
                //establecer modelo para la JTable
                DefaultTableModel model = new DefaultTableModel();
                this.tabla.setModel(model);
                //preparar la consulta
                PreparedStatement ps = con.prepareStatement(consulta);
                //Ejecutar la consuta
                ResultSet rs = ps.executeQuery();
                //Obtener el nombre de las columnas
                ResultSetMetaData rsmd = (ResultSetMetaData)rs.getMetaData();
                //saber cantidad de columnas que contiene
                int columnas = rsmd.getColumnCount();
                //nviar el nombre de las columnas al modelo
                for (int i = 1; i <= columnas; i++) {
                    model.addColumn(rsmd.getColumnLabel(i));
                }
                //enviar las filas de datos a la JTable
                while(rs.next()){
                    Object[] fila = new Object[columnas];
                    for(int i = 0; i < columnas; i++){
                        fila[i] = rs.getObject(i + 1);
                    }
                    model.addRow(fila);
                }
                this.tabla.getColumnModel().getColumn(0).setPreferredWidth(3);
                rs.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
        //Validar que haya datos para exportar
        if(tabla.getRowCount() <= 0){
            JOptionPane.showMessageDialog(null, "No hay datos por exportar");
        }else{
            Exportar exportar = new Exportar();
            exportar.exportarArchivo(tabla);
        }
    }//GEN-LAST:event_btnExportarActionPerformed

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
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                try {
                    UIManager.setLookAndFeel(new FlatDarculaLaf());
                } catch (Exception ex) {
                    System.err.println("Failed to initialize LaF");
                }
                
                new Consultas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExportar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem menuActualizar;
    private javax.swing.JMenuItem menuEliminar;
    private javax.swing.JMenuItem menuInsertar;
    private javax.swing.JMenuItem menuReportes;
    private javax.swing.JMenuItem menuSalir;
    private javax.swing.JTable tabla;
    private javax.swing.JTextArea txtConsultas;
    // End of variables declaration//GEN-END:variables

}
