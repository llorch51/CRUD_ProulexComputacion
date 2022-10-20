package crudplx;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Reporteador extends javax.swing.JFrame {

    Fondo fondo = new Fondo();
    
    public Reporteador() {
        this.setContentPane(fondo);
        initComponents();
        // Enviar los iconos a los botones
        btnReporte1.setIcon(iconoNormal("/imagenes/1.png", btnReporte1));
        btnReporte2.setIcon(iconoNormal("/imagenes/2.png", btnReporte2));
        btnReporte3.setIcon(iconoNormal("/imagenes/3.png", btnReporte3));
        btnReporte4.setIcon(iconoNormal("/imagenes/4.png", btnReporte4));
        btnReporte5.setIcon(iconoNormal("/imagenes/5.png", btnReporte5));
        btnReporte6.setIcon(iconoNormal("/imagenes/6.png", btnReporte6));
        
        // Asociar el metodo de boton presionado
        btnReporte1.setPressedIcon(iconoPresionado("/imagenes/1.png", btnReporte1));
        btnReporte2.setPressedIcon(iconoPresionado("/imagenes/2.png", btnReporte2));
        btnReporte3.setPressedIcon(iconoPresionado("/imagenes/3.png", btnReporte3));
        btnReporte4.setPressedIcon(iconoPresionado("/imagenes/4.png", btnReporte4));
        btnReporte5.setPressedIcon(iconoPresionado("/imagenes/5.png", btnReporte5));
        btnReporte6.setPressedIcon(iconoPresionado("/imagenes/6.png", btnReporte6));
        
        // Ascociar el metodo rollover (cursor sobre el boton)
        btnReporte1.setRolloverIcon(iconoNormal("/imagenes/1bn.png", btnReporte1));
        btnReporte2.setRolloverIcon(iconoNormal("/imagenes/2bn.png", btnReporte2));
        btnReporte3.setRolloverIcon(iconoNormal("/imagenes/3bn.png", btnReporte3));
        btnReporte4.setRolloverIcon(iconoNormal("/imagenes/4bn.png", btnReporte4));
        btnReporte5.setRolloverIcon(iconoNormal("/imagenes/5bn.png", btnReporte5));
        btnReporte6.setRolloverIcon(iconoNormal("/imagenes/6bn.png", btnReporte6));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnReporte1 = new javax.swing.JButton();
        btnReporte2 = new javax.swing.JButton();
        btnReporte3 = new javax.swing.JButton();
        btnReporte4 = new javax.swing.JButton();
        btnReporte5 = new javax.swing.JButton();
        btnReporte6 = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        menuInsertar = new javax.swing.JMenuItem();
        menuActualizar = new javax.swing.JMenuItem();
        menuEliminar = new javax.swing.JMenuItem();
        menuConsultas = new javax.swing.JMenuItem();
        menuSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 0));
        jLabel1.setText("Reportes MySQL Java");

        btnReporte1.setContentAreaFilled(false);

        btnReporte2.setContentAreaFilled(false);

        btnReporte3.setContentAreaFilled(false);

        btnReporte4.setContentAreaFilled(false);

        btnReporte5.setContentAreaFilled(false);

        btnReporte6.setContentAreaFilled(false);

        jMenuBar2.setForeground(new java.awt.Color(0, 255, 0));
        jMenuBar2.setOpaque(false);

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

        menuConsultas.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        menuConsultas.setForeground(new java.awt.Color(0, 255, 0));
        menuConsultas.setText("Consultas");
        menuConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultasActionPerformed(evt);
            }
        });
        jMenu3.add(menuConsultas);

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
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnReporte4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnReporte5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnReporte6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnReporte1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnReporte2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnReporte3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(258, 258, 258))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReporte1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReporte2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReporte3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReporte4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReporte5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReporte6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Metodo para el icono normal
    public Icon iconoNormal(String url, JButton boton){
        // Recibo el icono con sus medidas naturales
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        // Recupero el ancho del boton
        int ancho = boton.getWidth() - 10;
        // Recupero el alto del boton
        int alto = boton.getHeight() - 10;
        // Genero un icono adaptado a las dimensiones del boton
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(
        ancho,alto,Image.SCALE_AREA_AVERAGING));
        
        return icono;
    }
    
    // Metodo para el icono cuando sea presionado
    public Icon iconoPresionado(String url, JButton boton){
        // Recibo el icono con sus medidas naturales
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        // Recupero el ancho del boton
        int ancho = boton.getWidth() - 25;
        // Recupero el alto del boton
        int alto = boton.getHeight() - 25;
        // Genero un icono adaptado a las dimensiones del boton
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(
        ancho,alto,Image.SCALE_AREA_AVERAGING));
        
        return icono;
    }
    
    
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

    private void menuConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultasActionPerformed
        Consultas consultas = new Consultas();
        consultas.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuConsultasActionPerformed

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
            java.util.logging.Logger.getLogger(Reporteador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reporteador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reporteador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reporteador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reporteador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReporte1;
    private javax.swing.JButton btnReporte2;
    private javax.swing.JButton btnReporte3;
    private javax.swing.JButton btnReporte4;
    private javax.swing.JButton btnReporte5;
    private javax.swing.JButton btnReporte6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem menuActualizar;
    private javax.swing.JMenuItem menuConsultas;
    private javax.swing.JMenuItem menuEliminar;
    private javax.swing.JMenuItem menuInsertar;
    private javax.swing.JMenuItem menuSalir;
    // End of variables declaration//GEN-END:variables
}
