import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Configurations {
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
	 
	 
	      //Session Types
	      d.get("https://automation.myautoproctor.com/operations/dashboard/edit_session_type");
	      d.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[7]/div[1]/button[1]")).click();
	      
	      //Dropdown Comments
	      d.get("https://automation.myautoproctor.com/operations/Proctor_Dropdown/add_incident_dropdown");
	      d.findElement(By.id("drop_text")).sendKeys("Comments");
	      d.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/button[1]")).click();
	      
	      d.get("https://automation.myautoproctor.com/operations/Proctor_Dropdown/proctor_dropdown_list");
	      
	}
}
