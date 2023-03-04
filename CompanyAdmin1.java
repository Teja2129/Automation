package adminPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class CompanyAdmin1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ravik\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		//d.get("https://license.ntheye.com");
		
		d.get("https://license.ntheye.com/login");
		 WebElement n = d.findElement(By.id("region"));
	     Select sl = new Select(n);
	      sl.selectByValue("1");
	      d.findElement(By.id("login_company_code")).sendKeys("DBHSDB");
	      d.findElement(By.id("email")).sendKeys("magedev424@orlydns.com");
	      d.findElement(By.id("password")).sendKeys("test@123Q");
	      d.findElement(By.id("password_eye_login")).click();
	      d.findElement(By.id("login-button")).click();
	      
	      //Registered agent
	      
	      d.get("https://license.ntheye.com/agent/list_agent");
	      d.get("https://license.ntheye.com/agent/view?agent_id=1");
	     // d.findElement(By.xpath("//a[@id='system-process']")).click();
	     // d.findElement(By.xpath("//a[@id='installed-software']")).click();
         d.findElement(By.xpath("//a[@id='protected-software']")).click();
     
  //  d.findElement(By.id("one1")).click();
//         d.findElement(By.id("one4")).click();
        
         //Instantiate Action Class        
//         Actions actions = new Actions(d);
//         //Retrieve WebElemnt 'slider' to perform mouse hover 
//     	WebElement slider = d.findElement(By.xpath("//tbody/tr[4]/td[5]/div[1]/div[1]/label[1]"));
//     	
//     	//Move mouse to x offset 50 i.e. in horizontal direction
//     	actions.moveToElement(slider,50,0).perform();
//     	
//     	slider.click();
//     	System.out.println("Moved slider in horizontal directions");
     
      
//         
//         WebElement slider = d.findElement(By.xpath("//tbody/tr[1]/td[5]/div[1]/div[1]/label[1]"));
//         Actions move = new Actions(d);
//         Action action = (Action) move.dragAndDropBy(slider, 30, 0).build();
//         action.perform();
//         
         d.findElement(By.id("savechanges")).click();
         d.findElement(By.id("requester_first_name")).sendKeys("Teja");
         d.findElement(By.id("requester_last_name")).sendKeys("Teja");
         d.findElement(By.id("approver_first_name")).sendKeys("Teja");
         d.findElement(By.id("approver_last_name")).sendKeys("Teja");	
         d.findElement(By.id("requester_mail")).sendKeys("teja@gmail.com");
         d.findElement(By.id("approver_email")).sendKeys("teja1@gmail.com");
         d.findElement(By.id("ticket_id")).sendKeys("123456");
         d.findElement(By.id("ticket_link")).sendKeys("https://license.ntheye.com/agent/view?agent_id=1");
		 WebElement m = d.findElement(By.id("reason"));
	     Select q = new Select(m);
	      q.selectByValue("Customer Requirement");
	      d.findElement(By.id("till_date")).sendKeys("25/05/2023");
	      d.findElement(By.id("notes")).sendKeys("Ticket");
	      
	      d.findElement(By.id("saveStatus")).click();
	      d.close();
	      
	}

}
