import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Users {
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
	 
	//Add Proctor      
	   d.get("https://automation.myautoproctor.com/operations/dashboard/add_proctor");
	   d.findElement(By.id("firstname")).sendKeys("firstname");
	   d.findElement(By.id("lastname")).sendKeys("lastname");
	   d.findElement(By.id("email")).sendKeys("test@gmail.com");
	   d.findElement(By.id("phone")).sendKeys("0123456789");
	   
	   Select s1 = new Select(d.findElement(By.name("time")));
	      s1.selectByValue("Asia/Kolkata");
	      Select s2 = new Select(d.findElement(By.name("select_country")));
	      s2.selectByValue("99");
	    //  Select s3 = new Select(d.findElement(By.name("state")));
	     // s3.selectByValue("Telangana"); 
	      d.findElement(By.id("address")).sendKeys("Hyderabad");
	      d.findElement(By.id("city")).sendKeys("Hyderabad");
	      d.findElement(By.id("zip")).sendKeys("Hyderabad");
	      
	      d.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[11]/div[1]/button[1]")).click();
	     
	      
	   //Add Sales
	      
	      d.get("https://automation.myautoproctor.com/operations/dashboard/add_sales_rep");
		   Select s4 = new Select(d.findElement(By.name("sales_rep_geography")));
		      s4.selectByValue("North America");
		      Select s5 = new Select(d.findElement(By.name("reports_to")));
		      s5.selectByValue("1");
		      
			   d.findElement(By.id("sales_rep_firstname")).sendKeys("firstname");
			   d.findElement(By.id("sales_rep_lastname")).sendKeys("lastname");
			   d.findElement(By.id("sales_rep_email")).sendKeys("test@gmail.com");
			   d.findElement(By.id("sales_rep_phone")).sendKeys("0123456789");
			   
			   d.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[7]/div[1]/button[1]")).click();
			   
       //Add partner
			   
			   d.get("https://automation.myautoproctor.com/operations/partner/add_partner");
			   
			   
			   d.findElement(By.id("oz_name")).sendKeys("Organization");
						   d.findElement(By.id("firstname")).sendKeys("teja");
						   d.findElement(By.id("lastname")).sendKeys("Ntheye");
						   d.findElement(By.id("email")).sendKeys("test@gmail.com");
						   d.findElement(By.id("phone")).sendKeys("0123456789");
						  
						   
						   Select s6 = new Select(d.findElement(By.name("time")));
						      s6.selectByValue("Asia/Kolkata");
						      Select s7 = new Select(d.findElement(By.name("select_country")));
						      s7.selectByValue("99");
						    //  Select s3 = new Select(d.findElement(By.name("state")));
						     // s3.selectByValue("Telangana"); 
						      d.findElement(By.id("address")).sendKeys("Hyderabad");
						      d.findElement(By.id("city")).sendKeys("Hyderabad");
						      d.findElement(By.id("zip")).sendKeys("Hyderabad");
						      Select s8 = new Select(d.findElement(By.name("is_proctor_required")));
						      s8.selectByValue("1");
						      Select s9 = new Select(d.findElement(By.name("p_private_storage")));
						      s9.selectByValue("AWS");
						      
						      d.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[14]/div[1]/button[1]")).click();
						 
						      d.close();
	}
}
