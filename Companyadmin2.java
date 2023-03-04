package adminPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Companyadmin2 {
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

	d.get("https://license.ntheye.com/agent/list_inactive_agent");
	//d.findElement(By.id("download")).click();
	//d.findElement(By.id("download-report")).click();
	//d.findElement(By.xpath("//button[@id='download-report']"));
	
	//d.findElement(By.xpath("//button[contains(text(),'Sort')]")).click();
	d.get("https://license.ntheye.com/agent/report?days=1");
	
	d.get("https://license.ntheye.com/data");
	d.findElement(By.xpath("//a[@id='li-download-body']")).click();
	d.findElement(By.xpath("//a[@id='li-data-body']")).click();
	
	//Reports
d.get("https://license.ntheye.com/report/generate");
d.findElement(By.id("icon_title_admin")).click();
WebElement n1 = d.findElement(By.id("report_type_detailed"));
Select s2 = new Select(n1);

 s2.selectByValue("1");
 //d.findElement(By.xpath("//button[@id='download-detailed-report']")).click();
 
 d.get("https://license.ntheye.com/report/generate");
              //Executive Report
 
 d.findElement(By.xpath("//span[contains(text(),'Executive Report')]")).click();
 WebElement n2 = d.findElement(By.id("report_type"));
 Select s3 = new Select(n2);

  s3.selectByValue("1");
  //d.findElement(By.xpath("//button[@id='download-executive-report']")).click();
  
  //Agent report
  d.get("https://license.ntheye.com/report/generate");
  d.findElement(By.xpath("//span[contains(text(),'Agent Report')]")).click();

  
	d.close();
	}
}
