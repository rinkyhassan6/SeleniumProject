package exploringExcelFile;
import java.io.IOException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile_Different_DataType {

	public static void main(String[] args) throws IOException {

		// Open/Enter the workbook and  //Get Sheet from wb
		XSSFWorkbook wb = new XSSFWorkbook ("./data/ReadData.xlsx");
		XSSFSheet sheet = wb.getSheet("BOA Employee List");

		//Get row Count and Get column Count

		//int rowCount = sheet.getLastRowNum();
		int rowCount = sheet.getLastRowNum();
		System.out.println("Total Row count of this sheeet is : " + rowCount);

		//int columnCount = sheet.getRow(0).getLastCellNum();
		int ColumnCount = sheet.getRow(0).getLastCellNum();
		System.out.println("Total column of this sheeet is : " + ColumnCount);

		//Using For LOOP and SWITCH-BREAK Statement

		for (int i = 1; i <=rowCount; i++) 
		{
			XSSFRow row = sheet.getRow(i);               // Get Row

			for (int j = 0; j < ColumnCount; j++) 
			{
				XSSFCell cell = row.getCell(j);            //Get Column

				switch(cell.getCellType())
				{
				case STRING : System.out.println(cell.getStringCellValue());
				break;
				case NUMERIC : System.out.println(cell.getNumericCellValue());
				break;
				case BOOLEAN : System.out.println(cell.getBooleanCellValue());
				break;
				default:
					break;
				}

			}
			System.out.println();
		}
		
		//Read/print particular CellValue from excelSheet
		XSSFRow row = sheet.getRow(5);
		XSSFCell cell = row.getCell(3);
		String sCellValue = cell.getStringCellValue();
		System.out.println("Printing particular cell row 6 and column or cell 4 : " + sCellValue );    

	}
}
