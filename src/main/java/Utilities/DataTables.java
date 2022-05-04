package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class DataTables {
	
	public   String dataTable() throws Exception
	{
		File src= new File("C:\\Users\\manis\\eclipse-workspace\\Selenium2\\src\\main\\java\\Resources\\MyntraDetails.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook xsf = new XSSFWorkbook(fis);
		XSSFSheet sheet= xsf.getSheet("loginDetails");
		String data =sheet.getRow(1).getCell(1).getStringCellValue();
		System.out.println(data);
		return data;
	}

}
