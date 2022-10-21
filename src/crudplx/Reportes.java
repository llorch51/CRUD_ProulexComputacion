/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Reportes {
    
    //private Exportar exp = null;
    private String query;
    
    public void generarReportes(String query){
        this.query = query;
        try {
            Conexion conexion = new Conexion();
            Connection conn = conexion.getConnection(host, user, password, db);
            JTable tabla = new JTable();
            DefaultTableModel model = new DefaultTableModel();
            tabla.setModel(model);
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsmd = (ResultSetMetaData)rs.getMetaData();
             int columnas = rsmd.getColumnCount();
             for (int i = 1; i <= columnas; i++) {
                    model.addColumn(rsmd.getColumnLabel(i));
                }
             while (rs.next()) {
                Vector fila = new Vector();
                for (int i = 0; i < columnas; i++) {
                    fila.add(rs.getString(i +1));
                }
                model.addRow(fila);
            }
             
             if (tabla.getRowCount() <= 0) {
                JOptionPane.showMessageDialog(null, "No hay datos por exportar");
            } else {
                Exportar exportar = new Exportar();
                exportar.exportarArchivo(tabla);
            }
             
             rs.close();
             conn.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
