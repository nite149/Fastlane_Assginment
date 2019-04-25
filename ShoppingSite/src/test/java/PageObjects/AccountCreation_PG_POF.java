package PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.FindBy;

public class AccountCreation_PG_POF {
	final WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "//input[@id='id_gender1']") public WebElement radio_Mr;
	@FindBy(how = How.XPATH, using = "//input[@id='id_gender2']") public WebElement radio_Mrs;
	@FindBy(how = How.XPATH, using = "//input[@id='customer_firstname']") public WebElement txt_FirstName;
	@FindBy(how = How.XPATH, using = "//input[@id='customer_lastname']") public WebElement txt_LastName;
	@FindBy(how = How.XPATH, using = "//input[@id='email']") public	WebElement txt_Email;
	@FindBy(how = How.XPATH, using = "//input[@id='passwd']") public WebElement txt_Password;
	@FindBy(how = How.XPATH, using = "//select[@id='days']") public WebElement selBx_Days;
	@FindBy(how = How.XPATH, using = "//select[@id='months']") public WebElement selBx_Months;
	@FindBy(how = How.XPATH, using = "//select[@id='years']") public WebElement selBx_Years;
	@FindBy(how = How.XPATH, using = "//input[@id='company']") public WebElement txt_Company;
	@FindBy(how = How.XPATH, using = "//input[@id='address1']") public WebElement txt_Address;
	@FindBy(how = How.XPATH, using = "//input[@id='address2']") public WebElement txt_AddressLine2;
	@FindBy(how = How.XPATH, using = "//input[@id='city']") public WebElement txt_City;
	@FindBy(how = How.XPATH, using = "//select[@id='id_state']") public WebElement selBx_State;
	@FindBy(how = How.XPATH, using = "//input[@id='postcode']") public WebElement txt_ZipCode;
	@FindBy(how = How.XPATH, using = "//select[@id='id_country']") public WebElement selBx_Country;
	@FindBy(how = How.XPATH, using = "//input[@id='phone_mobile']") public WebElement txt_MobilePhn;
	@FindBy(how = How.XPATH, using = "//input[@id='alias']") public WebElement txt_Alias;
	@FindBy(how = How.XPATH, using = "//button[@id='submitAccount']") public WebElement btn_Submit;
		
	
	public AccountCreation_PG_POF(WebDriver driver) {
		this.driver = driver;
		
	}
}
