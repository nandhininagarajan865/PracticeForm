package annotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeForm {
	WebDriver driver;
	@Parameters({"browser"})
	@BeforeTest
	
	
	public void setup(String browser)
	{
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browser.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
	}
	@Test(priority=1)
	public void EnterUrl()
	{
		driver.get("https://vinothqaacademy.com/demo-site/");
	}
	@Test(priority=2)
	public void EnterFirstname()
	{
		WebElement Firstname=driver.findElement(By.id("vfb-5"));
		Firstname.sendKeys("Nandhini");
		}
	@Test(priority=3)
	public void EnterLastname()
	{
		WebElement Lastname=driver.findElement(By.id("vfb-7"));
		Lastname.sendKeys("Nagarajan");
	}
	@Test(priority=4)
	public void Gender()
	{
		WebElement Female=driver.findElement(By.id("vfb-31-2"));
		Female.click();
	}
	@Test(priority=5)
	public void EnterAddress()
	{
		WebElement Address=driver.findElement(By.id("vfb-13-address"));
		Address.sendKeys("3/46B,Murugan kovil street,Periyakkottai,Madukkur-614903");
		
		WebElement StreetAddress=driver.findElement(By.id("vfb-13-address-2"));
		StreetAddress.sendKeys("3/46B,Murugan kovil street,Periyakkottai,Madukkur-614903");
		
		WebElement City=driver.findElement(By.id("vfb-13-city"));
		City.sendKeys("Thanjavur");
		
		WebElement State=driver.findElement(By.name("vfb-13[state]"));
		State.sendKeys("Tamilnadu");
		
		WebElement Zipcode=driver.findElement(By.name("vfb-13[zip]"));
		Zipcode.sendKeys("614903");
		
		WebElement Country=driver.findElement(By.xpath(".//select[@id='vfb-13-country']"));
		Select country=new Select(Country);
		country.selectByVisibleText("India");
	}
	@Test(priority=6)
	public void EnterEmail()
	{
		WebElement Email=driver.findElement(By.id("vfb-14"));
		Email.sendKeys("nandhininagarajan@gmail.com");
	}
	@Test(priority=7)
	public void EnterDate()
	{
		WebElement EnterDate=driver.findElement(By.id("vfb-18"));
		EnterDate.click();
		
		WebElement Month=driver.findElement(By.className("ui-datepicker-month"));
		Month.click();
		
		WebElement Year=driver.findElement(By.className("ui-datepicker-year"));
		Year.click();
		
		WebElement Date=driver.findElement(By.xpath(".//a[text()='30']"));
		Date.click();
		
	}
	
	
	@Test(priority=8)
	public void EnterMobile()
	{
		WebElement phone=driver.findElement(By.id("vfb-19"));
		phone.sendKeys("6378907656");
	
	}
	@Test(priority=9)
	public void Course()
	{
		driver.findElement(By.id("vfb-20-0")).click();
		driver.findElement(By.id("vfb-20-1")).click();
		driver.findElement(By.id("vfb-20-2")).click();
		driver.findElement(By.id("vfb-20-3")).click();
		driver.findElement(By.id("vfb-20-4")).click();
	}
	@Test(priority=10)
	public void EnterQuery()
	{
		driver.findElement(By.id("vfb-23")).sendKeys("Can yoi provide an overview of  what will be covered in the selenium Webdriver course?");
		driver.findElement(By.id("vfb-3")).sendKeys("22");
	}
	@Test(priority=11)
	public void submit()
	{
		driver.findElement(By.name("vfb-submit")).click();
	}
	
}