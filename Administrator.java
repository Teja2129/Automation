import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Administrator {
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
	 
	      
	 //Pilot institute
	      d.get("https://automation.myautoproctor.com/operations/institute/pilot_list");
	      
	     //Administrator
	      
	      d.get("https://automation.myautoproctor.com/operations/institute/institute_admin");
	      //Institute access
	      d.get("https://automation.myautoproctor.com/operations/institute/door_to_institute?user_id=3098&usertype=2");
	      
	      //Switch back the Operations Dashboard
	      
	      d.navigate().to("https://automation.myautoproctor.com/operations/institute/institute_admin");
	      
	      //Instructions
	      d.get("https://automation.myautoproctor.com/operations/instructions/list_instructions");
	      
	      d.get("https://automation.myautoproctor.com/operations/instructions/add_instructions");
	      Select s1 = new Select(d.findElement(By.name("institute_code")));
	      s1.selectByValue("168737");
	      
	      Select s2 = new Select(d.findElement(By.name("type")));
	      s2.selectByValue("ID");
	      
	     d.findElement(By.id("instructions")).sendKeys("Please follow the Instructions");
	     d.findElement(By.id("add_instructions")).click();
	     
	     d.get("https://automation.myautoproctor.com/operations/instructions/list_instructions");
	     
	     d.get("https://automation.myautoproctor.com/operations/instructions/edit_instructions?instructions_id=41");
	     
	     d.close();
	}
}
