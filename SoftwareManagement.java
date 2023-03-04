package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SoftwareManagement {

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
	      
	      d.get("https://license.ntheye.com/admin/software/list_software");
	     // d.findElement(By.xpath("//a[contains(text(),'Download software list')]")).click();
	      
	      d.get("https://license.ntheye.com/admin/software/add_new_software");
	      d.findElement(By.id("label")).sendKeys("software");
	      d.findElement(By.id("program_name")).sendKeys("software");
	      d.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
	      d.get("https://license.ntheye.com/admin/software/edit_software?software_id=1");
	      d.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
	      d.get("https://license.ntheye.com/admin/software/block_software?software_id=1");
	      d.get("https://license.ntheye.com/admin/software/unblock_software?software_id=1");
	      
	      
	      d.get("https://license.ntheye.com/admin/software/list_unique_software");
	      d.get("https://license.ntheye.com/admin/software/list_ignore_software");
	      d.close();
	}

}
