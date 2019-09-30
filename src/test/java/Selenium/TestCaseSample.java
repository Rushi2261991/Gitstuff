package Selenium;

import java.util.ArrayList;

public class TestCaseSample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ExcelDataDriven d = new ExcelDataDriven();
		
		ArrayList<String> data =  d.getData("Delete");
		
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));
	}

}
