package Utilities;

import org.testng.annotations.DataProvider;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataProviders {

    @DataProvider(name = "LoginData")
    public Object[][] getUserCredentials() throws IOException {
        String excelFilePath = "C:\\Users\\muhab.gamal\\Selenium\\src\\main\\resources\\TestDataLogIn.xlsx";
        FileInputStream fileInputStream = null;
        Workbook workbook = null;
        Object[][] data = null;

        try {
            fileInputStream = new FileInputStream(excelFilePath);
            workbook = WorkbookFactory.create(fileInputStream);
            Sheet sheet = workbook.getSheet("LoginData");

            int rowCount = sheet.getPhysicalNumberOfRows(); // Get total number of rows
            data = new Object[rowCount - 1][2]; // Assuming the first row is header

            for (int i = 1; i < rowCount; i++) { // Start from 1 to skip header row
                data[i - 1][0] = sheet.getRow(i).getCell(0).toString(); // Username
                data[i - 1][1] = sheet.getRow(i).getCell(1).toString(); // Password
            }

        } finally {
            if (workbook != null) {
                workbook.close();
            }
            if (fileInputStream != null) {
                fileInputStream.close();
            }
        }

        return data;


    }

    @DataProvider(name = "CardData")
    public Object[][] getCardDetails() throws IOException {
        String excelFilePath = "C:\\Users\\muhab.gamal\\Selenium\\src\\main\\resources\\PaymentData.xlsx"; // Path to your uploaded Excel file
        FileInputStream fileInputStream = null;
        Workbook workbook = null;
        Object[][] data = null;

        try {
            fileInputStream = new FileInputStream(excelFilePath);
            workbook = WorkbookFactory.create(fileInputStream);
            Sheet sheet = workbook.getSheet("CardData"); // Update to your sheet name

            int rowCount = sheet.getPhysicalNumberOfRows(); // Get total number of rows
            data = new Object[rowCount - 1][5]; // Assuming first row is header and there are 5 columns

            for (int i = 1; i < rowCount; i++) { // Start from 1 to skip header row
                data[i - 1][0] = sheet.getRow(i).getCell(0).toString(); // Name on Card
                data[i - 1][1] = sheet.getRow(i).getCell(1).toString(); // Card Number
                data[i - 1][2] = sheet.getRow(i).getCell(2).toString(); // CVC
                data[i - 1][3] = sheet.getRow(i).getCell(3).toString(); // Month
                data[i - 1][4] = sheet.getRow(i).getCell(4).toString(); // Year
            }

        } finally {
            if (workbook != null) {
                workbook.close();
            }
            if (fileInputStream != null) {
                fileInputStream.close();
            }
        }

        return data;
    }
}
