package sets;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo_Example_Excel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File src = new File("E:\\Workspace_Nag\\Project_Sample\\src\\com\\data\\Testing.xlsx");
		FileInputStream stream = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(stream);
		XSSFSheet sheet = wb.getSheetAt(0);
		
		System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
		System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
		System.out.println(sheet.getRow(9).getCell(0).getStringCellValue());
		
		sheet.getRow(3).createCell(2).setCellValue("Line11");
		sheet.getRow(5).createCell(2).setCellValue("Line 13");
		sheet.getRow(10).createCell(1).setCellValue("Line 14");
		/*sheet.getRow(10).createCell(0).setCellValue("Line 14");*/
		FileOutputStream outStream = new FileOutputStream(src);
		wb.write(outStream);
		
		outStream.close();
	}

}
