package practice1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelsheet {


public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	
	FileInputStream file = new FileInputStream("C:\\Users\\Maruti\\Desktop\\selenium file\\Sheet1.xlsx");
	
Sheet sh = WorkbookFactory.create(file).getSheet("sheet1");
  int lastcellindex =  sh.getRow(2).getLastCellNum()-1;
  
  for(int i=0;i<=lastcellindex ;i++)
  {
	  
	String value =   sh.getRow(2).getCell(i).getStringCellValue();
	
	System.out.println(value+ " ");
  }
	
}
}