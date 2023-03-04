import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SiteOperations {
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
	      
	      
//Site Operations
	      d.get("https://automation.myautoproctor.com/operations/terms/index");
	      
	      d.get("https://automation.myautoproctor.com/operations/terms/edit_account_terms");
	  
	      //generate Coupon 
	      d.get("https://automation.myautoproctor.com/operations/coupon/add_coupon");
	      
	      d.findElement(By.id("perm_coupon_code")).sendKeys("Code");

	      Select s1 = new Select(d.findElement(By.name("discount_per")));
	      s1.selectByValue("5");
	      
	      d.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/button[1]")).click();
	      
	      d.get("https://automation.myautoproctor.com/operations/coupon/coupon_list");
	      d.get("https://automation.myautoproctor.com/operations/coupon/disable_coupon?perm_coupon_id=1");
	      d.get("https://automation.myautoproctor.com/operations/coupon/enable_coupon?perm_coupon_id=1");
	      d.get("https://automation.myautoproctor.com/operations/coupon/edit_coupon?perm_coupon_id=1");
	      d.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/button[1]")).click();
	      
	     //Blocked Programs 
	      d.get("https://automation.myautoproctor.com/operations/blocked_Exe/blocked_exe_list");
	      d.get("https://automation.myautoproctor.com/operations/blocked_Exe/add_exe");
	      
	      d.findElement(By.id("exe_label")).sendKeys("Label");
	      
	      d.findElement(By.id("exe_name")).sendKeys("Name");
	      
	      Select s2 = new Select(d.findElement(By.id("os_id")));
	      s2.selectByValue("1");
      
	      d.findElement(By.id("add_alert")).click();
	      
	      d.get("https://automation.myautoproctor.com/operations/blocked_Exe/blocked_exe_list");
	      
	      d.get("https://automation.myautoproctor.com/operations/blocked_Exe/disable_exe?blocked_exe_id=10");
	      d.get("https://automation.myautoproctor.com/operations/blocked_Exe/enable_exe?blocked_exe_id=10");
	      d.get("https://automation.myautoproctor.com/operations/blocked_Exe/edit_exe?blocked_exe_id=10");
	      
	      d.findElement(By.id("add_alert")).click();
	      
	      //Allowed Programs
	      
	      d.get("https://automation.myautoproctor.com/operations/allowed_Exe/add_exe");
	      
          d.findElement(By.id("exe_label")).sendKeys("Label");
	      
	      d.findElement(By.id("exe_name")).sendKeys("Name");
	      
	      Select s3 = new Select(d.findElement(By.id("os_id")));
	      s3.selectByValue("1");
      
	      d.findElement(By.id("add_alert")).click();
	      
	      //Excluded Systme process
	      d.get("https://automation.myautoproctor.com/operations/exclude_System_Process/process_list");
	      
	      d.get("https://automation.myautoproctor.com/operations/exclude_System_Process/add_process");
	      
	      d.findElement(By.id("exclude_system_process")).sendKeys("Name");
	      
	      Select s4 = new Select(d.findElement(By.id("os_id")));
	      s4.selectByValue("1");
	      
	      d.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/button[1]")).click();
	      
	      d.get("https://automation.myautoproctor.com/operations/exclude_System_Process/process_list");
	      
	      //Session Blocks
	      
	      d.get("https://automation.myautoproctor.com/operations/blocks/blocks_list");
	      d.get("https://automation.myautoproctor.com/operations/blocks/add_session_block");
	      
	      d.findElement(By.id("block_date")).sendKeys("02/05/2024");
	      
	      Select s5 = new Select(d.findElement(By.name("start_time")));
	      s5.selectByValue("1");
	      
	      Select s6 = new Select(d.findElement(By.name("end_time")));
	      s6.selectByValue("1");
	      
	      d.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/button[1]")).click();
	      
	      
	      d.findElement(By.id("multi_block_date")).sendKeys("25/05/2024");
	    //  d.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/button[1]")).click();
	      
	      
	      //Bucket slots
	      d.get("https://automation.myautoproctor.com/operations/bucket/edit_bucket");
	      
	      d.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/button[1]"));
	      
	      d.get("https://automation.myautoproctor.com/operations/Auto_Keyword_Check/keyword_list");
	      d.get("https://automation.myautoproctor.com/operations/Auto_Keyword_Check/add_keyword");
	      d.findElement(By.id("keyword")).sendKeys("keyword");
	      d.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/button[1]")).click();
	      
	      d.get("https://automation.myautoproctor.com/operations/Auto_Keyword_Check/keyword_list");
	      //Title
	      
	      d.get("https://automation.myautoproctor.com/operations/title/list_titles");
	      
	      d.get("https://automation.myautoproctor.com/operations/title/add_titles");
	      d.findElement(By.id("title_page")).sendKeys("title_page");
	      d.findElement(By.id("title_pageurl")).sendKeys("titlepage@ntheye.com");
	      d.findElement(By.id("title_text")).sendKeys("success");
	      
	      d.findElement(By.id("add_instructions")).click();

	d.get("https://automation.myautoproctor.com/operations/title/list_titles");
	
	
	d.close();
	
	
	
	}
}
