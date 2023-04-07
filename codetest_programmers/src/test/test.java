package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class test {

	public static void main(String[] args) {
        // Create a Workbook object
        Workbook workbook = new XSSFWorkbook();

        // Create a Sheet object
        Sheet sheet = workbook.createSheet("Sheet1");

        // Create a Row object and add some data to the row
        Row row = sheet.createRow(0);
        Cell cell = row.createCell(0);
        cell.setCellValue("Hello, World!");

        // Write the workbook to a file
        try {
            FileOutputStream outputStream = new FileOutputStream("example.xlsx");
            workbook.write(outputStream);
            workbook.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}