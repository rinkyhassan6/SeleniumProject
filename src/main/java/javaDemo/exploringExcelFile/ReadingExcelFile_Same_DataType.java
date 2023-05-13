package exploringExcelFile;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcelFile_Same_DataType {

	public static void main(String[] args) throws IOException {


		// Open/Enter the workbook

				//XSSFWorkbook wb = new XSSFWorkbook ("./data/ReadData.xlsx");
				
				XSSFWorkbook wb = new XSSFWorkbook ("./data/ReadData.xlsx");
				
				//Get Sheet from wb
						XSSFSheet sheet = wb.getSheet("BOA Employee List");

	
						int rowCount = sheet.getLastRowNum();
						System.out.println("Total Row count of this sheeet is : " + rowCount);

						//Get column count
						//int columnCount = sheet.getRow(0).getLastCellNum();
						//System.out.println(columnCount);
						
						
						int ColumnCount = sheet.getRow(0).getLastCellNum();
						System.out.println("Total column of this sheeet is : " + ColumnCount);
						
						
						
						
						//Using For LOOP and SWITCH-BREAK Statement
						
						int rows = sheet.getLastRowNum();
						int columns = sheet.getRow(0).getLastCellNum();
						
						for (int i = 1; i <= rowCount; i++) 
						{
							XSSFRow row = sheet.getRow(i);
							
							for (int j = 0; j < ColumnCount; j++) 
							{
								XSSFCell cell = row.getCell(j);

						String cellValue = cell.getStringCellValue();
		                        System.out.println(cellValue);
								}
						}
			
			}

		}