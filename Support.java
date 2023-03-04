package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Support {

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
	      
	      d.get("https://license.ntheye.com/admin/faq/add_new_faq");
	      d.get("https://license.ntheye.com/admin/faq/list_faq");
	      d.get("https://license.ntheye.com/admin/faq/view_faq?faq_id=12");
	      d.get("https://license.ntheye.com/admin/faq/edit_faq?faq_id=12");
	      d.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
	      
	      d. navigate(). back();
	      d. navigate(). back();
	      
	      d.get("https://license.ntheye.com/admin/tickets/list_tickets");
	      d.get("https://license.ntheye.com/admin/tickets/add_reason");
	      d.findElement(By.id("reason")).sendKeys("reason");
	      d.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
	      
	      d.get("https://license.ntheye.com/admin/tickets/list_reason");
	      d.get("https://license.ntheye.com/admin/tickets/edit_reason?reason_id=23");
	      d.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
	      d. navigate(). back();
	      d. navigate(). back();
	      d.get("https://license.ntheye.com/admin/tickets/hide_reason?reason_id=23");
	      d.get("https://license.ntheye.com/admin/tickets/unhide_reason?reason_id=23");
	      
	      
	      d.get("https://license.ntheye.com/admin/tooltip/list_tooltip");
	      d.get("https://license.ntheye.com/admin/tooltip/add_tooltip");
	      
	      d.findElement(By.id("page_link")).sendKeys("test@123Q");
	      d.findElement(By.id("pagename")).sendKeys("test@123Q");
	      d.findElement(By.id("related")).sendKeys("test@123Q");
	      d.findElement(By.id("text")).sendKeys("test@123Q");
	      d.findElement(By.id("text")).sendKeys("test@123Q");
	      d.findElement(By.xpath("//body/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/button[1]")).click();
	      d.get("https://license.ntheye.com/admin/tooltip/list_tooltip");
	      d.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/a[1]")).click();
	      //d.findElement(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/th[1]/p[1]")).click();
	      
	      d.get("https://license.ntheye.com/admin/tooltip/edit_tooltip?tooltips_id=400");
	      
	      d.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
	      d.get("https://license.ntheye.com/admin/activity/list_activity?usertype=1&user_id=33");
	      d.get("https://license.ntheye.com/admin/notifications/list_notifications");
	      d.get("https://license.ntheye.com/admin/help/list_help");
	      d.get("https://license.ntheye.com/admin/help/add_help");
	      d.findElement(By.id("page")).sendKeys("test");
	      d.findElement(By.id("url")).sendKeys("www.test.com");
	      d.findElement(By.id("title")).sendKeys("test");
	      d.findElement(By.id("description")).sendKeys("test");
	      d.findElement(By.id("video_link")).sendKeys("test");
	      d.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
	      
	      d.get("https://license.ntheye.com/admin/help/list_help");
	      d.get("https://license.ntheye.com/admin/help/edit_help?help_id=2");
	      d.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
	      
	      d.close();

	}

}
