package HichemHomeWork;



import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class HW2Asel {

	public static void main(String[] args) throws IOException, InterruptedException {
		//2. Using xl file that we created to new tour 
		//application (http://www.newtours.demoaut.com/)
		//create a data driven test: 
		//	Register to an account using 3-4 different sets of data
		//	(exclude passing values to the drop down and try to use 
		//different locators that you know if possible)
		
		String filePath=System.getProperty("user.dir")+"\\testData\\testHw2.et";
		
		FileInputStream fis = new FileInputStream(filePath);
		
		Workbook book= new HSSFWorkbook(fis);
		
		Sheet sheet= book.getSheet("Sheet1");
		
		int rows =sheet.getPhysicalNumberOfRows();
		int cells= sheet.getRow(0).getLastCellNum();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bacht\\eclipse-workspace\\SeleniumBasics\\drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
		
		List<Map<String, String>> lmap= new ArrayList<>();
	
		for (int r=1;r<rows;r++) {
			Map<String,String> map=new LinkedHashMap<>();
			driver.findElement(By.partialLinkText("REGISTER")).click();;
			for(int c=0;c<cells;c++) {
				String key=sheet.getRow(0).getCell(c).toString();
				String value=sheet.getRow(r).getCell(c).toString();
				map.put(key, value);
				Thread.sleep(2000);
				switch (key) {
				case "FirstName":
					driver.findElement(By.name("//input[@name='firstName']")).sendKeys(map.get(key));
					break;
				case "LastName":
					driver.findElement(By.name("//input[@name='lastName']")).sendKeys(map.get(key));
					break;
				case"Phone":
					driver.findElement(By.name("phone")).sendKeys(map.get(key));
					break;
				case "Email":
					driver.findElement(By.id("userName")).sendKeys(map.get(key));
					break;
				case "Address":
					driver.findElement(By.name("address1")).sendKeys(map.get(key));
					break;
				case "City":
					driver.findElement(By.name("city")).sendKeys(map.get(key));
					break;
				case "State":
					driver.findElement(By.name("state")).sendKeys(map.get(key));
					break;
				case "PostalCode":
					driver.findElement(By.name("postalCode")).sendKeys(map.get(key));
					break;
				case "UserName":
					driver.findElement(By.name("email")).sendKeys(map.get(key));
					break;
				case "Password":
					driver.findElement(By.name("password")).sendKeys(map.get(key));
					driver.findElement(By.name("confirmPassword")).sendKeys(map.get(key));
					break;
				
			}
			
		}
			
		
	}
	}
}
