package driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;

public class ExcelAll {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        File f = new File("C:\\Users\\dell\\sandeep\\driven\\data\\Book1.xlsx");
        FileInputStream in = new FileInputStream(f);
        Workbook w = new XSSFWorkbook(in);
        Sheet s = w.getSheet("Sheet1");
        for(int i =0; i<s.getPhysicalNumberOfRows();i++)
        {
        	Row r = s.getRow(i);
        	for(int j=0; j<r.getPhysicalNumberOfCells();j++)
        	{
        		Cell c = r.getCell(j);
        		CellType type = c.getCellType();
        		System.out.println(type);
            if(type==CellType.STRING)
            {
            	String cellValue = c.getStringCellValue();
            	System.out.println(cellValue);
            }
        	}
        }
        
        
	}

}
