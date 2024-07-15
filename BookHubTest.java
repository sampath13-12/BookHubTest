package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BookHubTest {

	@SuppressWarnings("null")
	public static void main(String[] args) throws Exception{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://finalbookhub.ccbp.tech/login");
		Thread.sleep(1000);
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("rahul");
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("rahul@2021");
		Thread.sleep(1000);
		
		WebElement LoginBtn = driver.findElement(By.className("login-button"));
		LoginBtn.click();
		Thread.sleep(3000);
		
		
		WebElement body = driver.findElement(By.tagName("body"));
		body.sendKeys(Keys.PAGE_DOWN); // Scroll down one page
		Thread.sleep(1000);
		body.sendKeys(Keys.UP);
		Thread.sleep(1000);
//		
		WebElement book1 = driver.findElement(By.className("link-item"));
		book1.click();
		Thread.sleep(1000);
		body.sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(2000);
		body.sendKeys(Keys.PAGE_UP);
		Thread.sleep(1000);
//		
		WebElement homePage = driver.findElement(By.linkText("Home"));
		homePage.click();
		body.sendKeys(Keys.DOWN);
		Thread.sleep(2000);
//		
		WebElement book2 = driver.findElement(By.cssSelector("img.logo-image[src='https://assets.ccbp.in/frontend/react-js/rich-dad-poor-dad-book.png']"));
		book2.click();
		Thread.sleep(1000);
		body.sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(2000);
		body.sendKeys(Keys.PAGE_UP);
		Thread.sleep(1000);
//		
		if (book2.equals(book2)) {
		    driver.navigate().back();
		}

		body.sendKeys(Keys.DOWN);
		Thread.sleep(2000);
		
		WebElement bookShelves = driver.findElement(By.cssSelector("a.nav-link[href='/shelf'] > li.nav-menu-item"));
		bookShelves.click();
		Thread.sleep(2000);
																
		WebElement readBS = driver.findElement(By.cssSelector("button.list-item-button-mobile.false"));
		readBS.click();
		Thread.sleep(1000);
		body.sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(2000);
		body.sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(2000);
//		
		WebElement BSbook1 = driver.findElement(By.cssSelector("img.cover-image[src='https://assets.ccbp.in/frontend/react-js/the-fault-in-our-stars-book.png']"));
		BSbook1.click();
		Thread.sleep(1000);
		body.sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(2000);
		body.sendKeys(Keys.PAGE_UP);
		Thread.sleep(1000);
//		
		if(BSbook1.equals(BSbook1)) {
			driver.navigate().back();
		}
		Thread.sleep(1000);

		
		WebElement WantToReadBS = driver.findElement(By.cssSelector("button.list-item-button-mobile.selected-status"));
		WantToReadBS.click();
		Thread.sleep(1000);
		body.sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(2000);
		body.sendKeys(Keys.PAGE_DOWN);
		body.sendKeys(Keys.END);
		Thread.sleep(2000);
		body.sendKeys(Keys.HOME);
				
		
	}

}

