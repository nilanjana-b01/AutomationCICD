package ExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven {

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream fis = new FileInputStream("C://Users//nilan//eclipse-workspace//ExcelWithDataProvider//demoData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		int sheets = wb.getNumberOfSheets();
		
		for(int i=0;i<sheets;i++)
		{
			XSSFSheet sheet = wb.getSheetAt(i);
			int rowCount = sheet.getLastRowNum();
			//System.out.println("Row Count   "+ rowCount);
			for(int j=1;j<=rowCount;j++)
			{
				String cellValue1 = sheet.getRow(j).getCell(1).getStringCellValue();
				String cellValue2 = sheet.getRow(j).getCell(2).getStringCellValue();
				System.out.println("Cell Value 1 "+cellValue1);
				System.out.println("Cell Value 2 "+cellValue2);
				
			}
			
		
		}
	}

}
