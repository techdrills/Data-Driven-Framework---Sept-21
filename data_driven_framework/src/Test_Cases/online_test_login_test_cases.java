package Test_Cases;

import Utilities.excelUtility;

public class online_test_login_test_cases {

	public static void main(String[] args) {
		
		excelUtility read = new excelUtility("F:\\Test_Projects\\data_driven_framework\\src\\Test_Data\\online_exam_login_test_data.xlsx");
		int rowcount = read.getRowCount("Sheet1");
		System.out.println("Total rows in excel sheet are : " + rowcount);
		
		for(int i = 1; i <= rowcount; i++) {
			String uname = read.getCellData("Sheet1", "username", i);
			String password = read.getCellData("Sheet1", "password", i);
			System.out.println(uname + "  " + password);		
		}
		
		
		
	}

}
