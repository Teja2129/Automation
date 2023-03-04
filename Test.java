package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ravik\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://license.ntheye.com/admin/login");
		 WebElement n = d.findElement(By.id("region"));
	     Select sl = new Select(n);
	      //option by value
	      sl.selectByValue("1");
	      //get option with text
	      d.findElement(By.id("email")).sendKeys("gaurang.pohankar@ntheye.com");
	      d.findElement(By.id("password")).sendKeys("test@123Q");
	      d.findElement(By.id("password_eye_admin")).click();
	      d.findElement(By.id("login-button")).click();
	      
	  //Dashboard
	      
	  //Company management 
	      //New Company
	      d.get("https://license.ntheye.com/admin/company/add_company");
	      d.findElement(By.id("company_name")).sendKeys("Company");
	      d.findElement(By.id("company_address")).sendKeys("United states");
	      d.findElement(By.id("company_short_name")).sendKeys("Unit");
	      d.findElement(By.id("license_expire_date")).sendKeys("25/05/2023");
	      d.findElement(By.id("number_of_licenses")).sendKeys("25");
	      
	      WebElement t = d.findElement(By.id("type"));  
	      Select dropdown = new Select(t); 
	      dropdown.selectByValue("0");  
	      
	      WebElement t1 = d.findElement(By.id("license_type"));  
	      Select dropdown1 = new Select(t1); 
	      dropdown1.selectByValue("0");  
	    
	      d.findElement(By.id("contact_name")).sendKeys("Teja");
	      d.findElement(By.id("email")).sendKeys("test@gmail.com");
	      
	      WebElement t2 = d.findElement(By.id("extended_support"));  
	      Select dropdown2 = new Select(t2); 
	      dropdown2.selectByValue("1"); 
	      
	      WebElement t3 = d.findElement(By.id("service_type"));  
	      Select dropdown3 = new Select(t3); 
	      dropdown3.selectByValue("0"); 
	      
	  
	      d.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
	     d.close();
	}

}
