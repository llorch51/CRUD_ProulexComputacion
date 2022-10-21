package crudplx;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exportar {
    
    //manipulacion del archivo
    public void abrirArchivo(String archivo){
        try {
            File ruta = new File(archivo);
            Desktop.getDesktop().open(ruta);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
    
    //exportacion
    public void exportarArchivo(JTable tabla){
        try {
            //generar un cuadro de dialogo para guardar archivos
            JFileChooser seleccionador = new JFileChooser();
            seleccionador.showSaveDialog(null);
            File archivo = seleccionador.getSelectedFile();
            //si el archivo se puede generar, entonces intentamos exportar
            if (archivo != null) {
                //transformar el objeto 'archivo' a documento de Excel
                archivo = new File(archivo.toString() + ".xlsx");
                //archivo = new File(archivo.toString() + ".csv");
                //generar el libro de excel
                Workbook libro = new XSSFWorkbook();
                //generar una hoja de excel
                Sheet hoja = libro.createSheet("Hoja1");
                //generar una fila para los nombres de los campos de la hoja
                Row etiqueta = hoja.createRow(0);
                //pasar los nombres de la JTable a la fila 0 de la hoja
                for (int campo = 0; campo < tabla.getColumnCount(); campo++) {
                    Cell celda = etiqueta.createCell(campo);
                    celda.setCellValue(tabla.getColumnName(campo));
                }
                //enviar los datos de la JTable a la hoja del archivo
                for (int f = 0; f < tabla.getRowCount(); f++) {
                    //creamos una nuev fila
                    Row fila = hoja.createRow(f + 1);
                    for (int c = 0; c < tabla.getColumnCount(); c++) {
                        //creamos una nueva celda para la fila donde nos encontramos
                        Cell celda = fila.createCell(c);
                        //Si la celda de la JTable es diferente de null, entonces...
                        if (tabla.getValueAt(f, c) != null) {
                            celda.setCellValue(tabla.getValueAt(f, c).toString());
                        }
                    }
                }
                FileOutputStream salida = new FileOutputStream(new File(archivo.toString()));
                libro.write(salida);
                libro.close();
                salida.close();
                abrirArchivo(archivo.toString());
                JOptionPane.showMessageDialog(null, "Información exportada exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error al generar el archivo");
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
