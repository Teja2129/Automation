import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AddCustomer {

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
	      
	      
	      //ADD Customer 
	      
	      d.get("https://automation.myautoproctor.com/operations/institute/add_institute");
	      
	      d.findElement(By.id("institute_name")).sendKeys("Institute");
	      d.findElement(By.id("short_institute_name")).sendKeys("Insti");
			 WebElement n = d.findElement(By.id("institute_lti_version"));
		     Select sl = new Select(n);
		      sl.selectByValue("1.3");
		      WebElement n1 = d.findElement(By.id("institute_lms_type"));
			     Select s2 = new Select(n1);
			      s2.selectByValue("Moodle");
			      
			      WebElement n2 = d.findElement(By.id("sales_rep"));
				     Select s3 = new Select(n2);
				      s3.selectByValue("1");
				      
	    d.findElement(By.xpath("//button[contains(text(),'Generate Code')]")).click();
	    
	     WebElement n3 = d.findElement(By.id("institute_type"));
	     Select s4 = new Select(n3);
	      s4.selectByValue("1");
	      
	      WebElement n4 = d.findElement(By.id("p_s_r"));
		     Select s5 = new Select(n4);
		      s5.selectByValue("9");
		      
		      WebElement n5 = d.findElement(By.id("is_self_proctor_enabled"));
			     Select s6 = new Select(n5);
			      s6.selectByValue("0");
			      
			      WebElement n6 = d.findElement(By.id("is_quiz_enabled"));
				     Select s7 = new Select(n6);
				      s7.selectByValue("0");
				      
				      WebElement n7 = d.findElement(By.id("is_exe_status_change_enabled"));
					     Select s8 = new Select(n7);
					      s8.selectByValue("0");
					
					      WebElement n8 = d.findElement(By.id("is_private_storage_enabled"));
						     Select s9 = new Select(n8);
						      s9.selectByValue("1");
						    
		 d.findElement(By.id("expiration_date")).sendKeys("02/02/2024");
	      WebElement n9 = d.findElement(By.id("institute_program"));
		     Select s10 = new Select(n9);
		      s10.selectByValue("1");
		      
		      
		      //Portal admin details
		      
		      d.findElement(By.id("firstname")).sendKeys("Teja");
		      d.findElement(By.id("lastname")).sendKeys("Teja");
		      d.findElement(By.id("superuser_email")).sendKeys("teja@gmail.com");
		      d.findElement(By.id("superuser_phone")).sendKeys("0123456789");
		      
		      // Invoice details
		      WebElement n10 = d.findElement(By.id("insitute_billing_terms"));
			     Select s11 = new Select(n10);
			      s11.selectByValue("N/A");
			      d.findElement(By.id("insitute_billing_name")).sendKeys("Teja");
			      d.findElement(By.id("address_1")).sendKeys("Hyderabad");
			      d.findElement(By.id("address_2")).sendKeys("Hyderabad");
			      d.findElement(By.id("city")).sendKeys("Hyderabad");
			      d.findElement(By.id("pincode")).sendKeys("012345");
			      WebElement n11 = d.findElement(By.id("country"));
				     Select s12 = new Select(n11);
				      s12.selectByValue("India");
				      WebElement n12 = d.findElement(By.id("timezone"));
					     Select s13 = new Select(n12);
					      s13.selectByValue("Asia/Kolkata");
					      
					      
				//Pricing conditions
					      
					      d.findElement(By.id("base_price")).sendKeys("0");
					      d.findElement(By.id("next_hour_price")).sendKeys("0");
					      d.findElement(By.id("base_price_2")).sendKeys("1");
					      d.findElement(By.id("next_hour_price2")).sendKeys("1");
					      WebElement n13 = d.findElement(By.id("per_institute_cut_price"));
						     Select s14 = new Select(n13);
						      s14.selectByValue("0");
						      WebElement n14 = d.findElement(By.id("per_base_price"));
							     Select s15 = new Select(n14);
							      s15.selectByValue("100"); 
							      
							      d.findElement(By.id("price_tier_2")).sendKeys("1");  
							      
							      
					// Business contact
							      
							      d.findElement(By.id("business_contact_name")).sendKeys("Teja");     
							      d.findElement(By.id("business_contact_email")).sendKeys("Teja@gmail.com");
							      d.findElement(By.id("business_contact_phone")).sendKeys("0123456789");
						      
				      //Accounts contact
							      
							      d.findElement(By.id("accounts_contact_name")).sendKeys("Teja");     
							      d.findElement(By.id("accounts_contact_email")).sendKeys("Teja@gmail.com");
							      d.findElement(By.id("accounts_contact_phone")).sendKeys("0123456789");
				      
				      d.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[9]/button[1]")).click();
				      
				      d.close();

	}

}
