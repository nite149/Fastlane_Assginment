package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.FindBy;

public class LogIn_PG_POF {
	final WebDriver driver;
	//@FindBy(how = How.XPATH, using = "//a[contains(text(), 'Sign in')]") public WebElement button_Singin;
	@FindBy(how = How.XPATH, using = "//input[@id='email']") public WebElement txtbx_EmailID;
	@FindBy(how = How.XPATH, using = "//input[@id='passwd']") public WebElement txtbx_Password;
	@FindBy(how = How.XPATH, using =  "//button[@id='SubmitLogin']") public WebElement button_Signin;
	@FindBy(how = How.XPATH, using =  "//input[@name='email_create']") public WebElement txtbx_EmailCreate;
	@FindBy(how = How.XPATH, using =  "//button[@id='SubmitCreate']") public WebElement btn_CreateAccount;
	public LogIn_PG_POF(WebDriver driver) {
		this.driver = driver;
	}
}

