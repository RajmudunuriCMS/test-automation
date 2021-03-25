package org.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.util.WebDriverUtil;


public class HomePage {

	public WebDriver webDriver;


	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Customers')]")
	private static WebElement customersLink;

		
	public HomePage(WebDriver driver) {
		super();
		this.webDriver = driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(how = How.XPATH, using = "//input[@id='global-search-input']")
	private static WebElement searchKeyword;
	
	
	
	@FindBy(how = How.XPATH, using = "//body/div[1]/div[1]/div[1]/div[1]/section[1]/section[1]/div[2]/div[1]/div[3]/div[2]/div[1]/form[1]/button[3]/span[1]/img[1]")
	private static WebElement searchButton;
	
	
	public void searchPage(String keyword) throws InterruptedException {
		
		searchKeyword.sendKeys(keyword);
		Thread.sleep(1000);
		searchKeyword.clear();
		Thread.sleep(1000);
		searchButton.click();
		Thread.sleep(3000);

	}
	
	
	@FindBy(how = How.XPATH, using = "//select[contains(@aria-label,'Pick-up time')]")
	private static WebElement pickuptime;
	
	@FindBy(how = How.XPATH, using = "//select[contains(@aria-controls,'wizard-car-pwa')]")
	private static WebElement car;
	
	@FindBy(how = How.XPATH, using = "//button[contains(@data-day,'10')]")
	private static WebElement pickDate;
	
	public void searchCars() throws InterruptedException {
		
		Thread.sleep(1000);
		
		Actions act = new Actions(webDriver);
		act.sendKeys(Keys.ESCAPE).build().perform();
		
		Thread.sleep(1000);
		
	
		webDriver.findElement(By.xpath("//span[contains(text(),'Cars')]")).click();;
		
		webDriver.findElement(By.xpath("//input[@id='location-field-locn']"));

		
		webDriver.findElement(By.xpath("//*[@id=\"location-field-locn-menu\"]/div[1]/button")).click();;

		webDriver.findElement(By.xpath("//*[@id=\"location-field-locn-menu\"]/div[1]/button")).sendKeys("Chicago");

		Thread.sleep(1000);
		webDriver.findElement(By.xpath("//*[@id=\"location-field-locn-menu\"]/div[2]/ul/li[1]/button")).click();
		
		//WebDriverUtil.selectFromDpDnByIndex(webDriver, webDriver.findElement(By.xpath("//*[@id=\"location-field-locn-menu\"]/div[2]/ul/li[1]")), 0);
		Thread.sleep(1000);
		webDriver.findElement(By.xpath("//button[@id='d1-btn']")).click();;
		Thread.sleep(1000);

		pickDate.click();
		Thread.sleep(1000);

		webDriver.findElement(By.xpath("//*[@id=\"Rental-cars-transportation\"]/div[2]/div[1]/div/div/div[1]/div/div[2]/div/div[3]/button")).click();;

		Thread.sleep(1000);

		webDriver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();;
		
		
	}
	

	

	
	

	

	
	


}
