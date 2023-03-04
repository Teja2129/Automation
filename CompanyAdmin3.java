package adminPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CompanyAdmin3 {

	public static void main(String[] args) {
	
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ravik\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver d=new ChromeDriver();
			d.manage().window().maximize();
			//d.get("https://license.ntheye.com");
			
			d.get("https://license.ntheye.com/login");
			 WebElement n = d.findElement(By.id("region"));
		     Select sl = new Select(n);
		  
		      sl.selectByValue("1");
		      d.findElement(By.id("login_company_code")).sendKeys("DBHSDB");
		      d.findElement(By.id("email")).sendKeys("magedev424@orlydns.com");
		      d.findElement(By.id("password")).sendKeys("test@123Q");
		      d.findElement(By.id("password_eye_login")).click();
		      d.findElement(By.id("login-button")).click();
		    //Request a new agent in Dashboard
		      
		      d.get("https://license.ntheye.com/software/list_software");
		      d.get("https://license.ntheye.com/software/list_company_unique_software?type=11");
		      d.get("https://license.ntheye.com/software/list_company_unique_software?type=10");
		//Global software
		      d.get("https://license.ntheye.com/software/add_default_software");
		//Protected software   
		      d.get("https://license.ntheye.com/software/protected_software");
		// Custom software
		      d.get("https://license.ntheye.com/software/custom_software");
		      
		      d.get("https://license.ntheye.com/software/add_new_software");
		      
		      d.findElement(By.id("label")).sendKeys("Label");
		      
		      d.findElement(By.id("program_name")).sendKeys("Label");

		      
		      d.findElement(By.xpath("//button[contains(text(),'Request Validation')]")).click();
		      d.close();
	}

}
