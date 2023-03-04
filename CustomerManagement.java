package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CustomerManagement {

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
	      
	      
	      d.get("https://license.ntheye.com/admin/company/company_contact_list");
	      d.get("https://license.ntheye.com/admin/request/list_request");
	      
	      d.get("https://license.ntheye.com/admin/request/view?c_uniqueid=6325d0d057c8f&request_id=64&type=0");
	      
	      d.findElement(By.xpath("//tbody/tr[4]/td[2]/div[1]/p[1]")).click();
	      d.findElement(By.xpath("//tbody/tr[5]/td[2]/div[1]/p[1]")).click();
	      d.findElement(By.xpath("//tbody/tr[6]/td[2]/div[1]/p[1]")).click();
	      d.findElement(By.xpath("//tbody/tr[7]/td[2]/div[1]/p[1]")).click();
	      d.findElement(By.xpath("//tbody/tr[8]/td[2]/div[1]/p[1]")).click();
	      
	      WebElement t = d.findElement(By.id("status"));  
	      Select dropdown = new Select(t); 
	      dropdown.selectByValue("1");  
	      
	      d.close();
	}
}
