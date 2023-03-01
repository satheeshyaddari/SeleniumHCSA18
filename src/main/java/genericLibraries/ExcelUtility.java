package genericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * This class contains reusable methods to perform on Excel file
 * @author yadda
 *
 */

public class ExcelUtility {
	private Workbook wb;
	
/**
 * This method is used to initialize the Excel file
 * 
 * @param excelpath
 */
	public void excelInitializtion(String excelpath) {
		FileInputStream fis=null;
		try {
			 fis= new FileInputStream(excelpath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			wb =WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException | IOException e) {
		  e.printStackTrace();
		}
	}
	
	/**
	 * This method is used read single data from excel
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @return
	 */
	public String readDataFromExcel(String sheetName, int rowNum, int cellNum) {
		return wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
	
}
	
/**
 * This is used to read multiple data from the excel
 * @param sheetName
 * @return
 */
   	public List<String> readDataFromExcel(String sheetName){
   		Sheet sh=wb.getSheet(sheetName);
   		List<String> datalist=new ArrayList<>();
   		for(int i=0; i<=sh.getLastRowNum(); i++) {
   			datalist.add(sh.getRow(i).getCell(1).getStringCellValue());
   		}
   		return datalist;
   	}
   	
/**
 * This method is used to the excel workbook   	
 */
   	
   	public void closeExcel() {
   		try {
   			wb.close();
   		} catch (IOException e) {
   			e.printStackTrace();
   		}
   	}
	
}