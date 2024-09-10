package Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class Data_Driven {

	public static String username1;
	public static String password1;

	public void credentials() throws EncryptedDocumentException, IOException  {

		FileInputStream f1 = new FileInputStream(
				"C:\\Users\\hp\\eclipse-workspace\\Amazon_Project_01\\DDT\\Login.xlsx");

		Workbook w1 = WorkbookFactory.create(f1);
		username1 = NumberToTextConverter.toText(w1.getSheet("Sheet1").getRow(0).getCell(0).getNumericCellValue());
		password1 = w1.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		System.out.println("username is"+username1);
		System.out.println("password is"+password1);
		

	}

}
