package uaterp;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BOQ {

	@SuppressWarnings("deprecation")
	@Test(enabled = false)
	public void boqUpdateRate () throws InterruptedException
	{ 
		System.setProperty("webdriver.chrome.driver", "/home/mansi/Downloads/Driver/chromedriver_linux64/chromedriver");
		
		ChromeOptions options = new ChromeOptions();
		
		options.setAcceptInsecureCerts(true);
		
		//WebDriverManager.chromedriver().setup();
		ChromeDriver	 driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://uat.erp2.upda.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Enter mobile number']")).sendKeys("9838780000");
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("User@1");
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//div[@class='col-5 ng-star-inserted']//button[@type='submit'][normalize-space()='Login']")).click();
		driver.findElement(By.xpath("//div[@class='ng-select-container']//input[@role='combobox']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".ng-option-label.ng-star-inserted[ng-reflect-ng-item-label='92 - Integrated Testing Accoun']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='multi_account']//button[@class='btn btn-primary'][normalize-space()='Submit']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@src='./assets/img/dash/emb.png']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/nav[1]/div[1]/ul[1]/li[2]/a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-tender-create[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-tender-create[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-tender-create[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]")).click();
		//driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-tender-create[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/input[1]")).sendKeys("09");
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-tender-create[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[2]/input[1]")).sendKeys("5");
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-tender-create[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[6]/button[1]")).click();
		String Actualltext = driver.findElement( By.xpath("/html[1]/body[1]/div[6]/div[1]/div[1]")).getText();
		String Expected ="Some error occured at server Side. Please try again later";
		Assert.assertEquals(Actualltext, Expected,"Not matched");	
	}	
	@Test(enabled= false)
	public void boqUpdateRate1 () throws InterruptedException
	{ 
		WebDriverManager.chromedriver().setup();
		ChromeDriver	 driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://uat.erp2.upda.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Enter mobile number']")).sendKeys("9838780000");
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("User@1");
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//div[@class='col-5 ng-star-inserted']//button[@type='submit'][normalize-space()='Login']")).click();
		driver.findElement(By.xpath("//div[@class='ng-select-container']//input[@role='combobox']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".ng-option-label.ng-star-inserted[ng-reflect-ng-item-label='92 - Integrated Testing Accoun']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='multi_account']//button[@class='btn btn-primary'][normalize-space()='Submit']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@src='./assets/img/dash/emb.png']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/nav[1]/div[1]/ul[1]/li[2]/a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-tender-create[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-tender-create[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-tender-create[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-tender-create[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[2]/input[1]")).sendKeys("02");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-tender-create[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[2]/input[1]")).sendKeys("1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-tender-create[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[6]/button[1]")).click();
		Thread.sleep(2000);

		String Actualltext = driver.findElement( By.xpath("/html[1]/body[1]/div[6]/div[1]/div[1]")).getText();
		String Expected ="Some error occured at server Side. Please try again later";
		Assert.assertEquals(Actualltext, Expected,"Not matched");	
	}	
	
	@Test(enabled= false)
	public void deleteButtonUPDATErate () throws InterruptedException
	{ 
		WebDriverManager.chromedriver().setup();
		ChromeDriver	 driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://uat.erp2.upda.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Enter mobile number']")).sendKeys("9838780000");
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("User@1");
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//div[@class='col-5 ng-star-inserted']//button[@type='submit'][normalize-space()='Login']")).click();
		driver.findElement(By.xpath("//div[@class='ng-select-container']//input[@role='combobox']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".ng-option-label.ng-star-inserted[ng-reflect-ng-item-label='92 - Integrated Testing Accoun']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='multi_account']//button[@class='btn btn-primary'][normalize-space()='Submit']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@src='./assets/img/dash/emb.png']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/nav[1]/div[1]/ul[1]/li[2]/a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-tender-create[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/button[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Yes, Delete it!']")).click();
		Thread.sleep(2000);
		String Actualltext = driver.findElement( By.xpath("//button[normalize-space()='OK']")).getText();
		String Expected ="Work is not selected";
		Assert.assertEquals(Actualltext, Expected,"Not matched");	
}

@Test(enabled= true)
public void updatepaidLastPayment () throws InterruptedException
{ 
	WebDriverManager.chromedriver().setup();
	ChromeDriver	 driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://uat.erp2.upda.co.in/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@placeholder='Enter mobile number']")).sendKeys("9838780000");
	Thread.sleep(3000); 
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("User@1");
	Thread.sleep(3000); 
	driver.findElement(By.xpath("//div[@class='col-5 ng-star-inserted']//button[@type='submit'][normalize-space()='Login']")).click();
	driver.findElement(By.xpath("//div[@class='ng-select-container']//input[@role='combobox']")).click();
	Thread.sleep(3000);
	driver.findElement(By.cssSelector(".ng-option-label.ng-star-inserted[ng-reflect-ng-item-label='92 - Integrated Testing Accoun']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id='multi_account']//button[@class='btn btn-primary'][normalize-space()='Submit']")).click();
	driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//img[@src='./assets/img/dash/emb.png']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/nav[1]/div[1]/ul[1]/li[2]/a[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-tender-create[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/button[5]")).click();
	Thread.sleep(2000);
	String Actualltext = driver.findElement( By.xpath("//h2[@id='swal2-title']")).getText();
	String Expected =" ";
	Assert.assertEquals(Actualltext, Expected,"Not matched");	
}
}