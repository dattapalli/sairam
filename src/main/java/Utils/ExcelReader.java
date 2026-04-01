
	package Utils;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

		public static String getCellData(String filePath, String sheetName, int row, int col) {
	        try (FileInputStream fis = new FileInputStream(filePath);
	             Workbook workbook = new XSSFWorkbook(fis)) {

	        	Sheet sheet = workbook.getSheet(sheetName);
	            Row sheetRow = sheet.getRow(row);
	            Cell cell = sheetRow.getCell(col);

	            return cell.toString();

	        } catch (Exception e) {
	            throw new RuntimeException("Failed to read Excel file", e);
	        }
		}
}

