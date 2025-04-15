package StepDefinition;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class FBSteps {
	static WebDriver driver;	

@Given("user is on register page")
public void user_is_on_register_page() 
{
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\91937\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	 //driver= new ChromeDriver();
	driver=new EdgeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	 driver.manage().deleteAllCookies();
	 driver.get("https://www.facebook.com/reg");
	 System.out.println("RegisterPage TC created by Nikhil Tester");
	
    
}

@When("user enter valid {string},{string},{string},{string},{string},{string},{string},{string}")
public void user_enter_valid(String fname, String lname, String phn, String pass, String bday, String bmonth, String byear, String gender) throws InterruptedException 
{
	driver.findElement(By.name("firstname")).sendKeys(fname);
	driver.findElement(By.name("lastname")).sendKeys(lname);
	driver.findElement(By.name("reg_email__")).sendKeys(phn);
	driver.findElement(By.name("reg_passwd__")).sendKeys(pass);
	WebElement wb1=driver.findElement(By.name("birthday_day"));
	Select sel= new Select(wb1);
	sel.selectByVisibleText(bday);
	
	WebElement wb2=driver.findElement(By.name("birthday_month"));
	Select sel1= new Select(wb2);
	sel1.selectByVisibleText(bmonth);
	
	WebElement wb3=driver.findElement(By.name("birthday_year"));
	Select sel2= new Select(wb3);
	sel2.selectByVisibleText(byear);
	
	List<WebElement> ls=driver.findElements(By.xpath("//span[@class='_5k_2 _5dba']"));
	
	for(WebElement abc:ls)
	{
		if(abc.getText().equalsIgnoreCase(gender))
		{
			abc.click();
			break;
		}
	}
	
	Thread.sleep(5000);
	driver.quit();
    
}












}
