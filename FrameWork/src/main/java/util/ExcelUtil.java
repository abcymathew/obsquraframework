package util;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelUtil {
	 String excellocation=System.getProperty("user.dir")+"\\src\\main\\resources\\";
	String filename ,sheetname;
	
	public ExcelUtil(String filename, String sheetname) {
		this.filename = filename;
		this.sheetname = sheetname;
	}

	public  String readStringData(int row,int col) throws IOException//for reading string values
	{
		FileInputStream f = new FileInputStream(excellocation+"/"+filename);
		XSSFWorkbook w = new XSSFWorkbook(f);
		XSSFSheet sh = w.getSheet(sheetname);
		XSSFRow r=sh.getRow(row);
		XSSFCell c=r.getCell(col);//inside that row choose the cell needed
		return c.getStringCellValue();//get string value of that cell
	}

}
