package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.apache.commons.mail.EmailException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.Assert;
import PageObjects.AccountCreation_PG_POF;
import PageObjects.LogIn_PG_POF;

public class CreateNewAccount {
	public WebDriver driver;
	
	ReadPropertyFile data;

  @BeforeTest
  public void beforeTest() throws IOException {
	  data = new ReadPropertyFile();
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\NiteshChaturvedi\\Desktop\\Selenium Training\\WebDriver\\chromedriver.exe");
		driver =new ChromeDriver();
		String URL = data.getUrl();
		driver.navigate().to(URL);
		driver.manage().window().maximize();
  }
  @Test
  public void f() throws IOException {
	  data = new ReadPropertyFile();
	  AccountCreation_PG_POF AcCreationPG = PageFactory.initElements(driver, AccountCreation_PG_POF.class);
	  LogIn_PG_POF LoginPG = PageFactory.initElements(driver, LogIn_PG_POF.class);
	  LoginPG.txtbx_EmailCreate.sendKeys(data.getEmail());
	  LoginPG.btn_CreateAccount.click();
	  
	  try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  if (data.getTitle().equalsIgnoreCase("Mr")) {
		AcCreationPG.radio_Mr.click();
	} else {
		AcCreationPG.radio_Mrs.click();
	}
	  AcCreationPG.txt_FirstName.sendKeys(data.getfirstName());
	  AcCreationPG.txt_LastName.sendKeys(data.getlastName());
	//  AcCreationPG.txt_Email.sendKeys(email);
	  AcCreationPG.txt_Password.sendKeys(data.getPassword());
	  Select oDays = new Select(AcCreationPG.selBx_Days);
	  oDays.selectByValue(data.getDobDay());
	  Select oMonth = new Select(AcCreationPG.selBx_Months);
	  oMonth.selectByIndex(2);
	  Select oYear = new Select(AcCreationPG.selBx_Years);
	  oYear.selectByValue(data.getDobYear());	
	  AcCreationPG.txt_Company.sendKeys(data.getCompany());
	  AcCreationPG.txt_Address.sendKeys(data.getAddress1());
	  AcCreationPG.txt_AddressLine2.sendKeys(data.getAddress2());
	  AcCreationPG.txt_City.sendKeys(data.getCity());
	  Select oState = new Select(AcCreationPG.selBx_State);
	  oState.selectByVisibleText(data.getState());
	  AcCreationPG.txt_ZipCode.sendKeys(data.getZip());
	  Select oCountry = new Select(AcCreationPG.selBx_Country);
	  oCountry.selectByVisibleText(data.getCountry());
	  AcCreationPG.txt_MobilePhn.sendKeys(data.getMobilePhone());
	  AcCreationPG.txt_Alias.clear();
	  AcCreationPG.txt_Alias.sendKeys(data.getAlias());
	 
	  AcCreationPG.btn_Submit.click();
	  validateMyAccount();
  }
public void validateMyAccount() {
	  
	  try {
			Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   String msg= driver.findElement(By.xpath("//*[text()='My account']")).getText();
		 Assert.assertEquals("My account", msg);
}
  @AfterTest
  public void afterTest() {
	  driver.quit();
  }
  
  @AfterSuite
  public void afterSuite () throws EmailException{
	  EmailTestngReport.SendEmail();
  }
}
