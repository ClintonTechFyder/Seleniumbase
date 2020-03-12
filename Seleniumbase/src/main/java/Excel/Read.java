package Excel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read {

	/*
	 * Author Clinton Bates This file is for reading from an excel sheet.
	 */

	private String FILE_NAME = "";
	private ArrayList<String> userInfo = new ArrayList<String>();
	private HashMap<String, String> userDetails = new HashMap<String, String>();
	private String returnValue = "";

	public Read(String fILE_NAME) throws IOException {
		//Set the file name and reads from the list.
		FILE_NAME = "ExcelSheets/" +  fILE_NAME;
		setUserList();
	}

	public HashMap<String, String> getUserDetails() {
		return userDetails;
	}

	public String returnValueByKeyName(String keyValue) {
		//Returns a value (second entry in hash map) , based on key name (for example Email by password)
		returnValue = "";
		userDetails.forEach((key, value) -> {
			if (key.equals(keyValue)) {
				returnValue = value;
				System.out.print(value);
			}
		});
		System.out.println("The Value." + returnValue);
		return returnValue;
	}

	public String returnKeyByIndex(int index) {
		List<String> indexes = new ArrayList<String>(userDetails.keySet()); 
		return indexes.get(index);
	}

	public void setUserList() throws IOException {
		//Returns the excel file.
		Workbook workbook = new XSSFWorkbook(FILE_NAME);
		Sheet firstSheet = workbook.getSheetAt(0);
		for (int i = 1; i < firstSheet.getLastRowNum(); i++) {
			Row row = firstSheet.getRow(i);
			for (int j = 0; j < row.getLastCellNum(); j++) {
				userInfo.add("" + firstSheet.getRow(i).getCell(j));
			}
		}
	}

	public void splitPasswordandEmails() {
		//splits passwords and emails.
		for (int i = 0; i < userInfo.size(); i += 2) {
			userDetails.put(userInfo.get(i), userInfo.get(i + 1));
		}

		System.out.println(userDetails);
	}

}
