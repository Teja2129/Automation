package assetspackage;


import java.io.IOException;

import javax.lang.model.util.Elements;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import graphql.language.Document;


public class NewOpen {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ravik\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.seniorliving.com/");
		
		
		//Search
	
	d.findElement(By.id("edit-distance-origin")).sendKeys("00001");
	
	Select s1 = new Select(d.findElement(By.name("care_type")));
    s1.selectByValue("assisted_living");	
    
    d.findElement(By.id("edit-submit-find-a-senior-living-community")).click();

    
    //scrapping the data 
    
   d.close();
		
	}
}
