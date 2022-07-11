package uaterp;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateWork {
	@SuppressWarnings("deprecation")
	@Test
	public void creatework () throws InterruptedException
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
		driver.findElement(By.linkText("Administration")).click();
		Thread.sleep(2000);	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[normalize-space()='Master Data']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@routerlink='/emb/administration/work']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".btn.btn-outline-primary")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Select Project']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[9]/div[1]/div[1]/div[2]/div[1]/div[4]/ng-select[1]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='ng-option-label ng-star-inserted']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='fa fa-arrow-down']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[9]/div[1]/div[1]/div[2]/div[2]/div[4]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[9]/div[1]/div[1]/div[2]/div[2]/div[4]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();

		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[9]/div[1]/div[1]/div[2]/div[2]/div[5]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[9]/div[1]/div[1]/div[2]/div[3]/div[4]/ng-select[1]/div[1]/div[1]/div[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[9]/div[1]/div[1]/div[2]/div[3]/div[4]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[9]/div[1]/div[1]/div[2]/div[5]/button[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[2]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/ng-select[1]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[4]/ng-select[1]/div[1]/span[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[4]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[5]/button[1]/i[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[4]/ng-select[1]/div[1]/div[1]/div[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[4]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[5]/button[1]/i[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[4]/ng-select[1]/div[1]/span[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[4]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[6]/div[1]/button[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[6]/div[2]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/ng-select[1]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[4]/ng-select[1]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[4]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[5]/button[1]/i[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[4]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[1]/button[1]")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Work Order Number']")).sendKeys("2052");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id='re']")).sendKeys("canal construction");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[10]/div[2]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[10]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[11]/div[2]/input[1]")).sendKeys("001199");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Tender NIC ID']")).sendKeys("00119988");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[12]/div[2]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[12]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[12]/div[4]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[12]/div[4]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[13]/div[2]/input[1]")).sendKeys("06/06/2012");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[13]/div[4]/input[1]")).sendKeys("06/06/2013");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[14]/div[2]/input[1]")).sendKeys("21");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[14]/div[4]/input[1]")).sendKeys("06/06/2012");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[15]/div[4]/div[2]/input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[15]/div[2]/input[1]")).sendKeys("06/06/2012");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[17]/div[2]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[17]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[19]/div[2]/input[1]")).sendKeys("12");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[19]/div[2]/input[1]")).sendKeys("1212");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[19]/div[4]/input[1]")).sendKeys("12122022");
	
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[21]/div[2]/input[1]")).sendKeys("121");
		
		Thread.sleep(2000);
driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[22]/div[1]/button[1]")).click();
		
		Thread.sleep(2000);
		
	}
	
	@Test
	public void createworktest1WorkOrderNo () throws InterruptedException
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
		driver.findElement(By.linkText("Administration")).click();
		Thread.sleep(2000);	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[normalize-space()='Master Data']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@routerlink='/emb/administration/work']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".btn.btn-outline-primary")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Select Project']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[9]/div[1]/div[1]/div[2]/div[1]/div[4]/ng-select[1]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='ng-option-label ng-star-inserted']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='fa fa-arrow-down']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[9]/div[1]/div[1]/div[2]/div[2]/div[4]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[9]/div[1]/div[1]/div[2]/div[2]/div[4]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();

		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[9]/div[1]/div[1]/div[2]/div[2]/div[5]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[9]/div[1]/div[1]/div[2]/div[3]/div[4]/ng-select[1]/div[1]/div[1]/div[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[9]/div[1]/div[1]/div[2]/div[3]/div[4]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[9]/div[1]/div[1]/div[2]/div[5]/button[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[2]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/ng-select[1]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[4]/ng-select[1]/div[1]/span[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[4]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[5]/button[1]/i[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[4]/ng-select[1]/div[1]/div[1]/div[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[4]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[5]/button[1]/i[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[4]/ng-select[1]/div[1]/span[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[4]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[6]/div[1]/button[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[6]/div[2]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/ng-select[1]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[4]/ng-select[1]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[4]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[5]/button[1]/i[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[4]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[1]/button[1]")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Work Order Number']")).sendKeys("2052");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id='re']")).sendKeys("canal construction");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[10]/div[2]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[10]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[11]/div[2]/input[1]")).sendKeys("001199");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Tender NIC ID']")).sendKeys("00119988");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[12]/div[2]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[12]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[12]/div[4]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[12]/div[4]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[13]/div[2]/input[1]")).sendKeys("06/06/2012");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[13]/div[4]/input[1]")).sendKeys("06/06/2013");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[14]/div[2]/input[1]")).sendKeys("21");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[14]/div[4]/input[1]")).sendKeys("06/06/2012");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[15]/div[4]/div[2]/input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[15]/div[2]/input[1]")).sendKeys("06/06/2012");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[17]/div[2]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[17]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[19]/div[2]/input[1]")).sendKeys("12");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[19]/div[2]/input[1]")).sendKeys("1212");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[19]/div[4]/input[1]")).sendKeys("12122022");
	
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[21]/div[2]/input[1]")).sendKeys("121");
		
		Thread.sleep(2000);
driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[22]/div[1]/button[1]")).click();
		
		Thread.sleep(2000);
		String Actualltext = driver.findElement( By.xpath("//span[@class='to-message toastr-message ng-star-inserted']")).getText();
		String Expected ="Some error occured at server Side. Please try again later";
		Assert.assertEquals(Actualltext, Expected,"matched");
	}
	
	
	@Test
	public void TenderNICRefernceNumber () throws InterruptedException
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
		driver.findElement(By.linkText("Administration")).click();
		Thread.sleep(2000);	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[normalize-space()='Master Data']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@routerlink='/emb/administration/work']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".btn.btn-outline-primary")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Select Project']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[9]/div[1]/div[1]/div[2]/div[1]/div[4]/ng-select[1]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='ng-option-label ng-star-inserted']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='fa fa-arrow-down']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[9]/div[1]/div[1]/div[2]/div[2]/div[4]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[9]/div[1]/div[1]/div[2]/div[2]/div[4]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();

		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[9]/div[1]/div[1]/div[2]/div[2]/div[5]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[9]/div[1]/div[1]/div[2]/div[3]/div[4]/ng-select[1]/div[1]/div[1]/div[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[9]/div[1]/div[1]/div[2]/div[3]/div[4]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[9]/div[1]/div[1]/div[2]/div[5]/button[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[2]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/ng-select[1]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[4]/ng-select[1]/div[1]/span[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[4]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[5]/button[1]/i[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[4]/ng-select[1]/div[1]/div[1]/div[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[4]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[5]/button[1]/i[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[4]/ng-select[1]/div[1]/span[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[4]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[6]/div[1]/button[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[6]/div[2]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/ng-select[1]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[4]/ng-select[1]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[4]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[5]/button[1]/i[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[4]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[1]/button[1]")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Work Order Number']")).sendKeys("00182");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id='re']")).sendKeys("canal construction");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[10]/div[2]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[10]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[11]/div[2]/input[1]")).sendKeys("9876");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Tender NIC ID']")).sendKeys("00119988");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[12]/div[2]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[12]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[12]/div[4]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[12]/div[4]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[13]/div[2]/input[1]")).sendKeys("06/06/2012");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[13]/div[4]/input[1]")).sendKeys("06/06/2013");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[14]/div[2]/input[1]")).sendKeys("21");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[14]/div[4]/input[1]")).sendKeys("06/06/2012");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[15]/div[4]/div[2]/input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[15]/div[2]/input[1]")).sendKeys("06/06/2012");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[17]/div[2]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[17]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[19]/div[2]/input[1]")).sendKeys("12");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[19]/div[2]/input[1]")).sendKeys("1212");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[19]/div[4]/input[1]")).sendKeys("12122022");
	
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[21]/div[2]/input[1]")).sendKeys("121");
		
		Thread.sleep(2000);
driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[22]/div[1]/button[1]")).click();
		
		Thread.sleep(2000);
		String Actualltext = driver.findElement( By.xpath("//div[@class='toastr toastr-success ng-star-inserted']")).getText();
		String Expected ="Tender/ NIC Refernce Number  is not unique";
		Assert.assertEquals(Actualltext, Expected," not matched");
	}
	
	
	
	
	@Test
	public void TenderNICID () throws InterruptedException
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
		driver.findElement(By.linkText("Administration")).click();
		Thread.sleep(2000);	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[normalize-space()='Master Data']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@routerlink='/emb/administration/work']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".btn.btn-outline-primary")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Select Project']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[9]/div[1]/div[1]/div[2]/div[1]/div[4]/ng-select[1]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='ng-option-label ng-star-inserted']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='fa fa-arrow-down']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[9]/div[1]/div[1]/div[2]/div[2]/div[4]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[9]/div[1]/div[1]/div[2]/div[2]/div[4]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();

		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[9]/div[1]/div[1]/div[2]/div[2]/div[5]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[9]/div[1]/div[1]/div[2]/div[3]/div[4]/ng-select[1]/div[1]/div[1]/div[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[9]/div[1]/div[1]/div[2]/div[3]/div[4]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[9]/div[1]/div[1]/div[2]/div[5]/button[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[2]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/ng-select[1]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[4]/ng-select[1]/div[1]/span[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[4]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[5]/button[1]/i[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[4]/ng-select[1]/div[1]/div[1]/div[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[4]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[5]/button[1]/i[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[4]/ng-select[1]/div[1]/span[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[4]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[6]/div[1]/button[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[6]/div[2]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/ng-select[1]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[4]/ng-select[1]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[4]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[5]/button[1]/i[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[4]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[1]/button[1]")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Work Order Number']")).sendKeys("00183");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id='re']")).sendKeys("canal construction");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[10]/div[2]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[10]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[11]/div[2]/input[1]")).sendKeys("9876");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Tender NIC ID']")).sendKeys("00119988");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[12]/div[2]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[12]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[12]/div[4]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[12]/div[4]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[13]/div[2]/input[1]")).sendKeys("06/06/2012");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[13]/div[4]/input[1]")).sendKeys("06/06/2013");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[14]/div[2]/input[1]")).sendKeys("21");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[14]/div[4]/input[1]")).sendKeys("06/06/2012");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[15]/div[4]/div[2]/input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[15]/div[2]/input[1]")).sendKeys("06/06/2012");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[17]/div[2]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[17]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[19]/div[2]/input[1]")).sendKeys("12");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[19]/div[2]/input[1]")).sendKeys("1212");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[19]/div[4]/input[1]")).sendKeys("12122022");
	
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[21]/div[2]/input[1]")).sendKeys("121");
		
		Thread.sleep(2000);
driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[22]/div[1]/button[1]")).click();
		
		Thread.sleep(2000);
		String Actualltext = driver.findElement( By.xpath("//div[@class='toastr toastr-success ng-star-inserted']")).getText();
		String Expected ="Tender NIC ID";
		Assert.assertEquals(Actualltext, Expected," not matched");
	}
	
	@Test
	public void WorkOrderValueandAgreementAmt () throws InterruptedException
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
		driver.findElement(By.linkText("Administration")).click();
		Thread.sleep(2000);	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[normalize-space()='Master Data']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@routerlink='/emb/administration/work']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".btn.btn-outline-primary")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Select Project']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[9]/div[1]/div[1]/div[2]/div[1]/div[4]/ng-select[1]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='ng-option-label ng-star-inserted']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='fa fa-arrow-down']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[9]/div[1]/div[1]/div[2]/div[2]/div[4]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[9]/div[1]/div[1]/div[2]/div[2]/div[4]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();

		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[9]/div[1]/div[1]/div[2]/div[2]/div[5]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[9]/div[1]/div[1]/div[2]/div[3]/div[4]/ng-select[1]/div[1]/div[1]/div[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[9]/div[1]/div[1]/div[2]/div[3]/div[4]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[9]/div[1]/div[1]/div[2]/div[5]/button[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[2]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/ng-select[1]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[4]/ng-select[1]/div[1]/span[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[4]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[5]/button[1]/i[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[4]/ng-select[1]/div[1]/div[1]/div[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[4]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[5]/button[1]/i[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[4]/ng-select[1]/div[1]/span[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[4]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[6]/div[1]/button[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[6]/div[2]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/ng-select[1]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[4]/ng-select[1]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[4]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[5]/button[1]/i[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[4]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[1]/button[1]")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Work Order Number']")).sendKeys("55");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id='re']")).sendKeys("canal construction");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[10]/div[2]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[10]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[11]/div[2]/input[1]")).sendKeys("9876");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Tender NIC ID']")).sendKeys("00119988");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[12]/div[2]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[12]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[12]/div[4]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[12]/div[4]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[13]/div[2]/input[1]")).sendKeys("06/06/2012");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[13]/div[4]/input[1]")).sendKeys("06/06/2013");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[14]/div[2]/input[1]")).sendKeys("21");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[14]/div[4]/input[1]")).sendKeys("06/06/2012");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[15]/div[4]/div[2]/input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[15]/div[2]/input[1]")).sendKeys("06/06/2012");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[17]/div[2]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[17]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[19]/div[2]/input[1]")).sendKeys("1200");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[19]/div[2]/input[1]")).sendKeys("1212");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[19]/div[4]/input[1]")).sendKeys("12122022");
	
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[21]/div[2]/input[1]")).sendKeys("1800");
		
		Thread.sleep(2000);
driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-work-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[22]/div[1]/button[1]")).click();
		
		Thread.sleep(2000);
		String Actualltext = driver.findElement( By.xpath("//span[@class='to-message toastr-message ng-star-inserted']")).getText();
		String Expected ="WorkOrder Value is less than  Agreement Amount";
		Assert.assertEquals(Actualltext, Expected," not matched");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}