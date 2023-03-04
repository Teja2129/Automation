package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PartnerAdmin {

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
	      
	      d.get("https://license.ntheye.com/admin/partner/add_partner");
	      
	      d.findElement(By.id("oz_name")).sendKeys("Organization");
	      d.findElement(By.id("firstname")).sendKeys("test");
	      d.findElement(By.id("lastname")).sendKeys("demo");
	      d.findElement(By.id("email")).sendKeys("demo@gmail.com");
	      d.findElement(By.id("address")).sendKeys("Hyderabad");
	      d.findElement(By.id("phone")).sendKeys("1452365874");
	     
	      d.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
	      
	      d.get("https://license.ntheye.com/admin/partner/list_partner");
	      d.get("https://license.ntheye.com/admin/partner/edit_partner?p_id=2");
	      d.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
	      d.get("https://license.ntheye.com/admin/activity/list_activity?usertype=2&user_id=2");
	      d.get("https://license.ntheye.com/admin/partner/block_partner?p_id=2");
	      d.get("https://license.ntheye.com/admin/partner/unblock_partner?p_id=2");
d.findElement(By.xpath("//tbody/tr[1]/td[8]/div[1]/a[4]")).click();
d.get("https://license.ntheye.com/admin/partner/list_partner_request");
d.close();
	}

}
