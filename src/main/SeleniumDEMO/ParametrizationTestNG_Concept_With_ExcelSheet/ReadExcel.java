package ParametrizationTestNG_Concept_With_ExcelSheet;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	//public static main(String[] args) throws IOException {

	public String[][] readExcel() throws IOException {

		XSSFWorkbook wb = new XSSFWorkbook ("./data/ReadData.xlsx");
		XSSFSheet sheet = wb.getSheet("CreateLead_DataProvider");

		//Get row Count and Get column Count
		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("Total Row count of this sheeet is : " + rowCount);
		System.out.println(   "                                                            " );

		//int columnCount = sheet.getRow(0).getLastCellNum();
		int columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println("Total column of this sheeet is : " + columnCount);

		System.out.println(  "By Using For Loop and DATA FORMATTER  Printing all of the cell values from the Excel file by ROW..........." );
		// creating 'For Loop' and 2D Arrays 

		String [][] data= new String [rowCount-1][columnCount];   //(rowcount-1)= excluding the header Row

		for (int i = 0; i < rowCount-1; i++) {

			for (int j = 0; j < columnCount; j++) {

				//System.out.println( sheet.getRow(i).getCell(j).getStringCellValue());

				DataFormatter df = new DataFormatter (); 
				//System.out.print(df.formatCellValue(sheet.getRow(i).getCell(j)));
				data [i][j]  = df.formatCellValue(sheet.getRow(i+1).getCell(j));
			}
		}

		for (String [] dataArrays : data) {
			System.out.println(Arrays.toString(dataArrays));
		}
		return data;
	}
}
