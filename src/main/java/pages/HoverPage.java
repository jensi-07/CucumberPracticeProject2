package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverPage {
	WebDriver driver;

	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\QA\\SeleniumJars\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	public void openHomePage() {
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	}
	public String getTitle() {
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		return actualTitle;
	}
	public void closePopUpPage() throws InterruptedException {
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
	}
	public void hoverOnFashion() throws InterruptedException {
		WebElement fashion = driver.findElement(By.xpath("//div[@class='_37M3Pb']/div[3]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(fashion).build().perform();
		Thread.sleep(2000);
	}
	public void getFashionList() {
		List<WebElement> menList = driver.findElements(By.xpath("//div[@class='_3XS_gI _7qr1OC']/a"));
		System.out.println(menList.size());

		for (WebElement a : menList) {
			System.out.println(a.getText());
		}
	}
	public void closeBrowser() {
		 driver.quit();
	}
	public void hoverOnElectronics() throws InterruptedException {
		WebElement electronics = driver.findElement(By.xpath("//div[@class='_37M3Pb']/div[4]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(electronics).build().perform();
	Thread.sleep(2000);
	}
	public void getElectronicsList() {
		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='_3XS_gI _7qr1OC']/a"));
		System.out.println(ele.size());

		for (WebElement e : ele) {
			System.out.println(e.getText());
		}
	}
	public void hoverOnFurniture() throws InterruptedException {
		WebElement home = driver.findElement(By.xpath("//div[@class='_37M3Pb']/div[5]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(home).build().perform();
		Thread.sleep(2000);
	}
	public void getFurnitureList() {
		List<WebElement> hm = driver.findElements(By.xpath("//div[@class='_3XS_gI _7qr1OC']/a"));
		System.out.println(hm.size());

		for (WebElement h : hm) {
			System.out.println(h.getText());
		}
	}
	public void hoverOntoysAndMore() throws InterruptedException {
		WebElement toys = driver.findElement(By.xpath("//div[@class='_37M3Pb']/div[9]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(toys).build().perform();
		Thread.sleep(2000);
	}
	public void getToysAndMoreList() {
		List<WebElement> tb = driver.findElements(By.xpath("//div[@class='_3XS_gI _7qr1OC']/a"));
		System.out.println(tb.size());

		for (WebElement t : tb) {
			System.out.println(t.getText());
		}	
	}
	public void hoverOnMotorBike() throws InterruptedException {
		WebElement bike = driver.findElement(By.xpath("//div[@class='_37M3Pb']/div[10]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(bike).build().perform();
		Thread.sleep(2000);
	}
	public void getMotorBikeList() {
		List<WebElement> mb = driver.findElements(By.xpath("//div[@class='_3XS_gI _7qr1OC']/a"));
		System.out.println(mb.size());

		for (WebElement b : mb) {
			System.out.println(b.getText());
		}
	}
	
	}

