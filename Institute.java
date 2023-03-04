import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Institute {
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
	 
	      
	      
	      //Institute
	      d.get("https://automation.myautoproctor.com/operations/institute/institute_list");

//View Report	      
	      d.get("https://automation.myautoproctor.com/operations/report?institute_code=129");
	      d.findElement(By.id("start")).sendKeys("05/04/2023");
	      d.findElement(By.id("end")).sendKeys("05/04/2024");
	      d.findElement(By.id("tax_1_name")).sendKeys("tax1");
	      d.findElement(By.id("tax_1")).sendKeys("10");
	      d.findElement(By.id("tax_2_name")).sendKeys("tax2");
	      d.findElement(By.id("tax_2")).sendKeys("10");
	      d.findElement(By.id("add_College_submit")).click();
	     
	 //View Details
	      d.get("https://automation.myautoproctor.com/operations/institute/view_institute_details?institute_code=129");
	      d.get("https://automation.myautoproctor.com/operations/institute/edit_logo?institute_code=129");
	      
	      d.get("https://automation.myautoproctor.com/operations/institute/edit_wallet?institute_code=129");
	      
	      d.get("https://automation.myautoproctor.com/operations/institute/edit_institute?institute_code=129");
	      
	      d.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[9]/button[1]")).click();
	  //Edit logo  
	      d.get("https://automation.myautoproctor.com/operations/institute/department_colleges?institute_code=129");
	     
	     //Add college
	      d.get("https://automation.myautoproctor.com/operations/institute/add_college");
	      
	      Select s1 = new Select(d.findElement(By.name("institute_code")));
	      s1.selectByValue("129");
	     
	      d.findElement(By.id("college_name")).sendKeys("Quiz");
	      d.findElement(By.id("add_college")).click();
	      
	      //Add Department
	      d.get("https://automation.myautoproctor.com/operations/institute/add_department");
	      
	      Select s2 = new Select(d.findElement(By.name("institute_code")));
	      s2.selectByValue("129");
	     
	      
	      Select s3 = new Select(d.findElement(By.name("institute_college_code")));
	      s3.selectByValue("63874a1f7c6dd");
	      
	      d.findElement(By.id("department_name")).sendKeys("CSE");
	      
	      d.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/button[1]")).click();
	      
	      //EDIT storage
	      
	      d.get("https://automation.myautoproctor.com/operations/storage/edit_storage?institute_code=129");
	      
	      
	      
	      d.close();
	}
}
