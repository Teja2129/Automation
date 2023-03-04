import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AddSystemUsers {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ravik\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://automation.myautoproctor.com/operations/login");
		
	      //Login Page
	      d.findElement(By.id("user")).sendKeys("operations@ntheye.com");
	      d.findElement(By.id("pass")).sendKeys("test123Q");
	      d.findElement(By.id("togglePasswordLogin")).click();
	      d.findElement(By.xpath("//button[@id='login']")).click();
	      
//Operations list
		d.get("https://automation.myautoproctor.com/operations/Manage_Operations/operations_list");
		d.get("https://automation.myautoproctor.com/operations/dashboard/add_system_user");

	      
	      Select s1 = new Select(d.findElement(By.name("user_role")));
	      s1.selectByVisibleText("Operations");
	     d.findElement(By.id("firstname")).sendKeys("Firstname");
	     d.findElement(By.id("lastname")).sendKeys("lastname");
	     d.findElement(By.id("email")).sendKeys("test@gmail.com");
	     d.findElement(By.id("phone")).sendKeys("0123456789");
	     
	     Select s2 = new Select(d.findElement(By.name("time")));
	      s2.selectByValue("Asia/Kolkata");
	      
		     Select s3 = new Select(d.findElement(By.name("select_country")));
		      s3.selectByValue("99");
		
			     Select s4 = new Select(d.findElement(By.name("get_states")));
			      s4.selectByValue("1476");

			      d.findElement(By.id("address")).sendKeys("Hyderbad");   
			      d.findElement(By.id("city")).sendKeys("Hyderbad"); 
			      d.findElement(By.id("zip")).sendKeys("013245"); 
			      d.findElement(By.id("role")).sendKeys("Operations"); 
	
	d.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[14]/div[1]/button[1]")).click();
	}
	

}
