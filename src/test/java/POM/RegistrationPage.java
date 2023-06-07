package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.github.javafaker.Faker;

public class RegistrationPage {
	WebDriver driver = null;

	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement firstName() {
		return driver.findElement(By.xpath("//*[@id=\"mat-input-3\"]"));
	}

	public WebElement lastName() {
		return driver.findElement(By.xpath("//*[@id=\"mat-input-4\"]"));
	}

	public WebElement email() {
		return driver.findElement(By.xpath("//*[@id=\"mat-input-5\"]"));
	}

	public WebElement phone() {
		return driver.findElement(By.xpath("//*[@id=\"mat-input-6\"]"));
		
	}

	public WebElement password() {
		return driver.findElement(By.xpath("//*[@id=\"mat-input-8\"]"));
	}

	public WebElement confirmPassword() {
		return driver.findElement(By.xpath("//*[@id=\"mat-input-9\"]"));
	}

	public WebElement registerButton() {
		return driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[1]/embryo-register/div/div/div/div/div/div[2]/mat-card/form/button"));
	}

}
