package TestFiles;

import org.testng.Assert;
import org.testng.annotations.Test;

import ExtentReports.ExtentTestManager;
import TestFiles.BaseTest.BaseTest;

public class TestCase1 extends BaseTest {
    @Test
    public void Hello() throws InterruptedException {
        ExtentTestManager.getTest().setDescription("Goto Google.");

        navigate.get("https://www.google.in");
        GoogleHomepagePage.SearchKey("My Frameworlk");
        
        //Assert.assertEquals(true, true);
        //navigate.get("https://www.google.in");
        //navigate.get("https://www.google.in");
        //Assert.assertEquals(true, false);
    }
}
