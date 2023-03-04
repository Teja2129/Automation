import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class HomePages {

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
	      
	      //Dashboard HOME
	      
	      d.get("https://automation.myautoproctor.com/operations/dashboard");
	      d.get("https://automation.myautoproctor.com/operations/Manage_Operations/operations_list");
	      d.get("https://automation.myautoproctor.com/operations/partner/partner_list");
	      d.get("https://automation.myautoproctor.com/operations/dashboard/proctor_list");
	      d.get("https://automation.myautoproctor.com/operations/dashboard/support_list");
	      d.get("https://automation.myautoproctor.com/operations/blocks/blocks_list");5
	      +23+++++++++++++++++++++++++++++++++.
	      args.+0
	      ---------------------------------------------------
	      
	      //INSTITUTE
	      
	      d.get("https://automation.myautoproctor.com/operations/institute/institute_list");
	      d.get("https://automation.myautoproctor.com/operations/institute/pilot_list");
	      d.get("https://automation.myautoproctor.com/operations/institute/institute_admin");
	      d.get("https://automation.myautoproctor.com/operations/institute/add_college");
	      d.get("https://automation.myautoproctor.com/operations/institute/add_department");
	      d.get("https://automation.myautoproctor.com/operations/institute/add_professors");
	      d.get("https://automation.myautoproctor.com/operations/instructions/list_instructions");
	      
	      //Site Operations
	      
	      d.get("https://automation.myautoproctor.com/operations/terms/index");
	      d.get("https://automation.myautoproctor.com/operations/coupon/coupon_list");
	      d.get("https://automation.myautoproctor.com/operations/blocked_Exe/blocked_exe_list");
	      d.get("https://automation.myautoproctor.com/operations/allowed_Exe/allowed_exe_list");
	      d.get("https://automation.myautoproctor.com/operations/exclude_System_Process/process_list");
	      
	     d.get("https://automation.myautoproctor.com/operations/blocks/blocks_list");
	     d.get("https://automation.myautoproctor.com/operations/bucket/edit_bucket");
	     d.get("https://automation.myautoproctor.com/operations/Auto_Keyword_Check/keyword_list");
	     d.get("https://automation.myautoproctor.com/operations/title/list_titles");
	     
	     //Users
	     
	     //Configurations
	     
	     d.get("https://automation.myautoproctor.com/operations/dashboard/edit_session_type");
	     d.get("https://automation.myautoproctor.com/operations/Proctor_Dropdown/proctor_dropdown_list");
	     d.get("https://automation.myautoproctor.com/operations/modal/alert_list");
	     d.get("https://automation.myautoproctor.com/operations/tooltips/tooltips_list");
	     d.get("https://automation.myautoproctor.com/operations/email/email_list");
	     d.get("https://automation.myautoproctor.com/operations/email/edit_email_config");
	     d.get("https://automation.myautoproctor.com/operations/stripe/edit_stripe_key");
	     d.get("https://automation.myautoproctor.com/operations/resolution/update");
	     d.get("https://automation.myautoproctor.com/operations/notifications/notifications_list");
	     d.get("https://automation.myautoproctor.com/operations/password/update_password");
	     
	     
	  d.close();
	      

	}

}
