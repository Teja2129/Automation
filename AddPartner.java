import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AddPartner {
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
	      
//Add partner
		d.get("https://automation.myautoproctor.com/operations/partner/partner_list");
		d.get("https://automation.myautoproctor.com/operations/partner/add_partner");
		
		
		 d.findElement(By.id("oz_name")).sendKeys("Organization");
		 d.findElement(By.id("firstname")).sendKeys("firstname");
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
			      
			      Select s5 = new Select(d.findElement(By.name("is_proctor_required")));
			      s5.selectByValue("3");
	
			      Select s6 = new Select(d.findElement(By.name("p_private_storage")));
			      s6.selectByValue("AWS");
			      
			      d.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[11]/div[1]/button[1]")).click();
	
	}
}
