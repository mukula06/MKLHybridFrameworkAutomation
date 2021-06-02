package TestFiles;

import org.testng.annotations.Test;

import ExcelOperation.ExcelUtils;

import org.testng.annotations.DataProvider;

public class DataProviderCheck {
	
	@Test(dataProvider="Authentication")
	public void Registration_data(String TestCase_Name,String sUserName,String sPassword)throws  Exception{
		System.out.println(sUserName);
		System.out.println(TestCase_Name);
		System.out.println(sPassword);
		//System.out.println("Login Successfully, now it is the time to Log Off buddy.");
	}

	@DataProvider
	public Object[][] Authentication() throws Exception{
		Object[][] testObjArray = ExcelUtils.getTableArray("C://Users//mukagraw//git//MyHybridFramework//TestData.xlsx","Sheet1");
		return (testObjArray);
	}
}