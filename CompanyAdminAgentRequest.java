package adminPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CompanyAdminAgentRequest {
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
	      d.get("https://license.ntheye.com/request/request_new_with_software");
	      WebElement n1 = d.findElement(By.id("os"));
		     Select s2 = new Select(n1);
		  
		      s2.selectByValue("Windows 11");
		      WebElement n2 = d.findElement(By.id("reason"));
			     Select s3 = new Select(n2);
			  
			      s3.selectByValue("Agent was not provisioned"); 
			      
			 d.findElement(By.id("support_link")).sendKeys("https://license.ntheye.com/request/request_new_with_software");
			 d.findElement(By.id("baseURL")).sendKeys("https://license.ntheye.com/ca/");
			 d.findElement(By.id("licenseApiInterval")).sendKeys("1");
			 d.findElement(By.id("hardwareInformationInterval")).sendKeys("1");
			 d.findElement(By.id("hideNewProcessesInterval")).sendKeys("1");
			 d.findElement(By.id("processInformationInterval")).sendKeys("1");
			 d.findElement(By.id("operationsApiInterval")).sendKeys("1");
			 d.findElement(By.id("softwareInformationInterval")).sendKeys("1");
			 d.findElement(By.id("softListInterval")).sendKeys("1");
			 d.findElement(By.id("updateHideListInterval")).sendKeys("1");
	     d.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
			 
		 d.close();
	      
	}
}
