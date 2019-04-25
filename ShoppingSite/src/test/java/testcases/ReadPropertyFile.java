package testcases;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class ReadPropertyFile {
	protected Properties prop = null;
	protected InputStream input = ReadPropertyFile.class.getClassLoader().getResourceAsStream("Data/config.properties");
	public ReadPropertyFile() throws IOException {
		// TODO Auto-generated method stub
		prop = new Properties();
		prop.load(input);
	}
	public String getUrl() {
		return prop.getProperty("url");
	}
	public String getTitle() {
		return prop.getProperty("title");
	}
	public String getfirstName () {
		return prop.getProperty("firstName");
	}
	public String getlastName() {
		return prop.getProperty("lastName");
	}
	public String getEmail() {
		return prop.getProperty("email");
	}
	
	public String getPassword() {
		return prop.getProperty("passwd");
	}
	
	public String getDobDay() {
		return prop.getProperty("dobDay");
	}
	
	public String getDobMonth() {
		return prop.getProperty("dobMonth");
	}
	
	public String getDobYear() {
		return prop.getProperty("dobYear");
	}
	
	public String getCompany() {
		return prop.getProperty("company");
	}
	
	public String getAddress1() {
		return prop.getProperty("address1");
	}
	
	public String getAddress2() {
		return prop.getProperty("address2");
	}
	
	public String getCity() {
		return prop.getProperty("city");
	}
	
	public String getState() {
		return prop.getProperty("state");
	}
	public String getZip() {
		return prop.getProperty("zip");
	}
	
	public String getCountry() {
		return prop.getProperty("country");
	}
	
	public String getMobilePhone() {
		return prop.getProperty("mobilePhone");
	}
	
	public String getAlias() {
		return prop.getProperty("alias");
	}
}
