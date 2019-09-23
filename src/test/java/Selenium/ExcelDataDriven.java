package Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataDriven {
	
	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("E:\\softwares\\Work\\demodata.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		
		int sheets = workbook.getNumberOfSheets();
		
		for (int i=0; i<sheets ;i++ ) {
			
			if(workbook.getSheetName(i).equalsIgnoreCase("testdata")) {
				
				XSSFSheet sheet = workbook.getSheetAt(i);
				
				
				Iterator<Row> rows = sheet.iterator();
				Row firstrow = rows.next();
				
				int k =0;
				int column = 0;
				
				Iterator <Cell> ce = firstrow.cellIterator();
				
				while(ce.hasNext()) {
					Cell value = ce.next();
					if(value.getStringCellValue().equalsIgnoreCase("password")) {
						
						column = k;
				
					}
					k++;
				}
				System.out.println(column);
				
				
				
				
				
				
			}
			
		}
		
		
	}

}
