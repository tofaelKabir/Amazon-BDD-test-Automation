package com.amazonbdd.test.qa.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazonbdd.test.qa.helper.WaitHelper;



public class SignInPage {
	
	private WebDriver driver;
	
	
//	@FindBy(xpath="//span[@class='nav-action-inner']")
//	public WebElement signIn;
	
	@FindBy(xpath="//*[@id='form']/div/div[2]/input")
	public WebElement userName;
	
	@FindBy(xpath="//input[@class='a-button-input']")
	public WebElement cont;
	
	@FindBy(xpath="//*[@id='form']/div/div[4]/input")
	public WebElement password;
	
	@FindBy(xpath="//*[@id='submitButton']")
	public WebElement loginButton;
	
	WaitHelper waitHelper;
	
	public SignInPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		//waitHelper.WaitForElement(userName, 60);
	}
	
	public void enterUserName(String userName){
		this.userName.sendKeys(userName);
	}
	
	public void enterPassword(String password){
		this.password.sendKeys(password);
	}
	
	public void clickLoginButton(){
		loginButton.click();
	}
	public String validateSignInPageTitle() {
		return driver.getTitle();
	}

}
