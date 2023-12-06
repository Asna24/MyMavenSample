package excelread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode {
	static FileInputStream f ; // library class
	static XSSFWorkbook w;
	static XSSFSheet s;
	
	public static String getStringData(int a, int b) throws IOException 
	{
		f = new FileInputStream("E:\\excelread\\Book1.xlsx");
		w = new XSSFWorkbook(f);
		s = w.getSheet("sheet1");
		Row r = s.getRow(a);
		Cell c =r.getCell(b);
		return c.getStringCellValue();
		
		
	}
	public static String getIntegerData(int a, int b) throws IOException
	{
		
		f = new FileInputStream("E:\\excelread\\Book1.xlsx");
		w = new XSSFWorkbook(f);
		s = w.getSheet("sheet1");
		Row r = s.getRow(a);
		Cell c =r.getCell(b);
		int x = (int) c.getNumericCellValue(); // convert to int 
		return String.valueOf(x);
		
	}

}
