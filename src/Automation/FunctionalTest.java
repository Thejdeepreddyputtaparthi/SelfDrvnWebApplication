package Automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class FunctionalTest {
	
	    static WebDriver webdriver;
	    public static XSSFWorkbook workbook;
	    public static XSSFSheet worksheet;
	    public static DataFormatter formatter= new DataFormatter();
	    static String xlFilePath = "C:\\Users\\puttaparthi\\Desktop\\InputData.xlsx";
	    static String SheetName = "Data";
	    public  String Res;  
	    public int DataSet=-1;
	
	@BeforeMethod
	public void setup()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\puttaparthi\\Desktop\\chromedriver.exe");
		webdriver=new ChromeDriver(options);
		webdriver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		webdriver.manage().window().maximize();
		
	}
	
	@AfterMethod
	public void screenCapture(ITestResult testresult) throws IOException
	{
	if(ITestResult.FAILURE==testresult.getStatus()) {
	// Call method to capture screenshot
	String methodname = testresult.getName(); 
	File scrFile = ((TakesScreenshot)webdriver).getScreenshotAs(OutputType.FILE);


	String location = "C:\\Users\\puttaparthi\\Desktop\\TESTNG_ScreenShots\\";


	org.openqa.selenium.io.FileHandler.copy(scrFile,new File(location + methodname + "_" + ".png" ));
	

	}	
	else
	System.out.println("Test is passed");
	}
	
	@DataProvider
	public static Object[][] InputData() throws IOException
	{
	FileInputStream fileInputStream= new FileInputStream(xlFilePath); //Excel sheet file location get mentioned here
	    workbook = new XSSFWorkbook (fileInputStream); 
	    worksheet=workbook.getSheet(SheetName);
	    XSSFRow Row=worksheet.getRow(0);     
	 
	    int RowNum = worksheet.getPhysicalNumberOfRows();
	    int ColNum= Row.getLastCellNum(); 
	     
	    Object Data[][]= new Object[RowNum-1][ColNum]; 
	     
	        for(int i=0; i<RowNum-1; i++) 
	        {  
	        	XSSFRow row= worksheet.getRow(i+1);
	             
	            for (int j=0; j<ColNum; j++) 
	            {
	                if(row==null)
	                    Data[i][j]= "";
	                else
	                {
	                	XSSFCell cell= row.getCell(j);
	                    if(cell==null)
	                        Data[i][j]= ""; 
	                    else
	                    {
	                        String value=formatter.formatCellValue(cell);
	                        Data[i][j]=value; 
	                    }
	                }
	            }
	        }

	    return Data;
	}


}
