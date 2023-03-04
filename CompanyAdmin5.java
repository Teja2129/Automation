package adminPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CompanyAdmin5 {
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
	 
	      d.get("https://license.ntheye.com/support/ticket");
	      d.findElement(By.id("subject")).sendKeys("test");
	      
	      d.get("https://license.ntheye.com/support/list_tickets");
	      d.get("https://license.ntheye.com/support/view_resolved_blocked_tickets");
	      
	      d.get("https://license.ntheye.com/support/logout");
	      d.close();
	}
}
