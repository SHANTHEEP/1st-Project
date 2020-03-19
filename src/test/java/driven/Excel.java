package driven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream location = new FileInputStream("C:\\Users\\dell\\sandeep\\driven\\data\\Book1.xlsx");
		Workbook w = new XSSFWorkbook(location);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(1);
		Cell c = r.getCell(2);
		System.out.println(c);

	}

}
