package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Profile {

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
	      
	      d.findElement(By.xpath("//body/div[1]/div[2]/div[1]/nav[1]/div[2]/div[1]/ul[1]/div[2]/button[1]")).click();
	      d.get("https://license.ntheye.com/admin/profile/edit_profile");
	      d.findElement(By.xpath("//body/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/button[1]")).click();
	      d.findElement(By.xpath("//b[contains(text(),'Change Password')]")).click();
	      
	     // d.findElement(By.xpath("//input[@id='current_password']")).sendKeys("test@123Q");
//	      d.findElement(By.id("password_eye1")).click();
//	      d.findElement(By.id("new_password")).sendKeys("test@123Q");
//	      d.findElement(By.id("password_eye2")).click();
//	      d.findElement(By.id("confirm_password")).sendKeys("test@123Q");
//	      d.findElement(By.id("password_eye3")).click();
	 //     d.findElement(By.xpath("//body/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/button[1]")).click();
	      
	      d.close();
	}

}
