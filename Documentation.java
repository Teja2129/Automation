package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Documentation {

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
	      
	      
	      d.get("https://license.ntheye.com/admin/documentation/add_category");
	      d.findElement(By.id("category_name")).sendKeys("name");
	      d.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
	      
	      d.get("https://license.ntheye.com/admin/documentation/list_category");
	      d.get("https://license.ntheye.com/admin/documentation/edit_category?doc_category_id=14");
	      d.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
	      
	      d. navigate(). back();
	      d. navigate(). back();
	      
	      d.get("https://license.ntheye.com/admin/documentation/hide_category?doc_category_id=14");
	      d.get("https://license.ntheye.com/admin/documentation/unhide_category?doc_category_id=14");
	      
	      d.get("https://license.ntheye.com/admin/documentation/add_content");
	      WebElement t = d.findElement(By.id("category_id"));  
	      Select dropdown = new Select(t); 
	      dropdown.selectByValue("0");  
	      d.findElement(By.id("title")).sendKeys("title");
	      d.findElement(By.id("subtext")).sendKeys("subtext");
	      //d.findElement(By.id("cke_1_contents")).sendKeys("test");
	      d.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
	      d.get("https://license.ntheye.com/admin/documentation/list_documentation");
	      d.get("https://license.ntheye.com/admin/documentation/edit_content?content_id=12");
	      
	      d.get("https://license.ntheye.com/admin/documentation/add_release_notes");
	      d.findElement(By.id("title")).sendKeys("title");
	      d.findElement(By.id("subtext")).sendKeys("subtext");
	      //d.findElement(By.id("cke_1_contents")).sendKeys("test");
	    //  d.findElement(By.id("cke_2_contents")).sendKeys("test");
	      d.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
	      
	      d.get("https://license.ntheye.com/admin/documentation/list_release_notes");
	      d.get("https://license.ntheye.com/admin/documentation/edit_release_notes?release_notes_id=3");
	      d.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
	      d.close();
	}

}
