package ApachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {
	
		public static String[] readRowData(int intRow, int intCol) throws IOException {
			
			FileInputStream inputstream = null;
			XSSFWorkbook wb1 = null;
			String StrCellData = null;
			
			try {
				//open file object
				File f1 = new File ("");
				inputstream = new FileInputStream(f1);
				wb1 = new XSSFWorkbook(inputstream);
				XSSFSheet ws1 = wb1.getSheet("Sheet1");
				//create row object
				Row r1 = ws1.getRow(intRow);
				StrCellData = r1.getCell(intCol).getStringCellValue();		
				
			}
			
			
			return data;
			}

		
		
}
