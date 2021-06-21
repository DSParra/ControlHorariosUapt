/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import cjb.ci.Mensaje;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author DELL
 */
public class Archivo {

    static Workbook book;

    public static void AbreArchivoV1(File archivo) {
        try {
            //FileInputStream f = new FileInputStream("libroprueba.xlsx");
            FileInputStream f;
            f = new FileInputStream(archivo);
            XSSFWorkbook libro = new XSSFWorkbook(f);
            XSSFSheet hoja = libro.getSheetAt(0);

            Iterator<Row> filas = hoja.iterator();
            Iterator<Cell> celdas;

            Row fila;
            Cell celda;
            while (filas.hasNext()) {
                fila = filas.next();
                celdas = fila.cellIterator();
                while (celdas.hasNext()) {
                    celda = celdas.next();

                    if (celda.getCellType() == CellType.NUMERIC) {
                        System.out.println(celda.getNumericCellValue());
                    } else if (celda.getCellType() == CellType.STRING) {
                        if (celda.getStringCellValue().equalsIgnoreCase("nombre profesor")) {
                            System.out.println("Nombre -> Profesor");
                            System.out.println(celda.getStringCellValue());
                        } else {
                            System.out.println(celda.getStringCellValue());
                        }

                    }

//                    switch(celda.getCellType()){
//                        case i
//                            break;
//                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getCause());
        }
    }

    public static String Importar(File archivo, JTable tabla) {
        String mensaje = "Error en la Importacion";
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);

        try {
            book = WorkbookFactory.create(new FileInputStream(archivo));
            Sheet hoja = book.getSheetAt(0);
            Iterator FilaIterator = hoja.rowIterator();
            int IndiceFila = -1;

            while (FilaIterator.hasNext()) {
                IndiceFila++;
                Row fila = (Row) FilaIterator.next();
                Iterator ColumnaIterator = fila.cellIterator();
                Object[] ListaColumna = new Object[9999];
                int IndiceColumna = -1;
                int numCelda = -1;
                while (ColumnaIterator.hasNext()) {
                    IndiceColumna++;
                    Cell celda = (Cell) ColumnaIterator.next();

                    if (IndiceFila == 0) {
                        modelo.addColumn(celda.getStringCellValue());
                    } else if (celda != null) {
                        if (celda.getCellType() == CellType.BLANK) {
                            ListaColumna[IndiceColumna] = (int) Math.round(celda.getNumericCellValue());
//                                System.out.println("Int Agregando " + (int) Math.round(celda.getNumericCellValue()) +" /" +  numCelda);
                        } else if (celda.getCellType() == CellType.STRING) {
                            ListaColumna[IndiceColumna] = celda.getStringCellValue();
                            //System.out.println("String agregando " + celda.getStringCellValue() + numCelda);
                        } else if (celda.getCellType() == CellType.BOOLEAN) {
                            ListaColumna[IndiceColumna] = celda.getBooleanCellValue();
//                                System.out.println("Bolean agregando " + celda.getBooleanCellValue() + numCelda);
                        } else {
                            Date hora = new Date();
                            hora = celda.getDateCellValue();
                            String horas = (hora.getHours() < 10) ? "0"+String.valueOf(hora.getHours()) : String.valueOf(hora.getHours());
                            String minutos = (hora.getMinutes() == 0) ? "00" : String.valueOf(hora.getMinutes());
                            System.out.println(hora.getMinutes());
                            ListaColumna[IndiceColumna] = String.valueOf(horas+ ":" + minutos);
//                                System.out.println("Index agregando Fecha" + hora.getTime() + numCelda);
                        }
                    }
                }

                if (IndiceFila != 0) {
                    modelo.addRow(ListaColumna);
                }
                mensaje = "Importacion Exitosa";
            }
        } catch (Exception e) {
        }
        return mensaje;
    }

//    public static String Exportar(File archivo, JTable tabla) {
//        String mensaje = "Error en la Exportacion";
//        int NumeroFila = tabla.getRowCount();
//        int NumeroColumna = tabla.getColumnCount();
//        if (archivo.getName().endsWith("xls")) {
//            book = new HSSFWorkbook();
//        } else {
//            book = new XSSFWorkbook();
//        }
//        Sheet hoja = book.createSheet("Hoja1");
//
//        try {
//            for (int i = -1; i < NumeroFila; i++) {
//                Row fila = hoja.createRow(i + 1);
//                for (int j = 0; j < NumeroColumna; j++) {
//                    Cell celda = fila.createCell(j);
//                    if (i == -1) {
//                        celda.setCellValue(String.valueOf(tabla.getColumnName(j)));
//                    } else {
//                        celda.setCellValue(String.valueOf(tabla.getValueAt(i, j)));
//                    }
//                    book.write(new FileOutputStream(archivo));
//                }
//            }
//            mensaje = "Exportacion Exitosa";
//        } catch (Exception e) {
//        }
//        return mensaje;
//    }

    public static String Exportar(JTable tabla,String tipo,String filtro) {
        XSSFWorkbook archivo = new XSSFWorkbook();
        XSSFSheet hoja = archivo.createSheet(tipo);

        String mensaje = "Error en la Exportacion";
        int NumeroFila = tabla.getRowCount();
        int NumeroColumna = tabla.getColumnCount();
        try {
            for (int i = -1; i < NumeroFila; i++) {
                Row fila = hoja.createRow(i + 1);
                for (int j = 0; j < NumeroColumna; j++) {
                    Cell celda = fila.createCell(j);
                    if (i == -1) {
                        celda.setCellValue(String.valueOf(tabla.getColumnName(j)));
                    } else {
                        celda.setCellValue(String.valueOf(tabla.getValueAt(i, j)));
                    }
                }
            }
            JFileChooser destino = new JFileChooser();
            destino.setCurrentDirectory(new File(""));
            destino.setDialogTitle("Seleccione el destino de la carpeta");
            destino.setFileSelectionMode(JFileChooser.SAVE_DIALOG);
            destino.setAcceptAllFileFilterUsed(false);
            System.out.println("directorios"+destino.getCurrentDirectory());
            System.out.println("archivo seleccionado"+destino.getSelectedFile());
            System.out.println("archivo seleccionado"+destino.getApproveButtonToolTipText());
            
            
            
            if (destino.showSaveDialog(null) == destino.APPROVE_OPTION) {
                File carpeta = destino.getSelectedFile();   
                try (FileOutputStream outputStream = new FileOutputStream(carpeta.getAbsolutePath()+"\\"+tipo+"-"+filtro+".xlsx")) {//archivo.write(new FileOutputStream(archivo));
                    archivo.write(outputStream);
                     mensaje = "Archivo guardado en"+carpeta.getAbsolutePath();
                }
            }
        } catch (Exception e) {
        }
        return mensaje;
    }
}
