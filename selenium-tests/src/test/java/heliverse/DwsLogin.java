package heliverse;
import static org.testng.Assert.fail;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.Status;
import com.crm.BaseClass.DwsBase;
import com.crm.BaseClass.DwsBase2;
import com.crm.listeners.DwsListeners;
import com.crm.listeners.DwsListeners2;
import com.crm.pom.Login;
@Listeners(com.crm.listeners.DwsListeners2.class)
public class DwsLogin extends DwsListeners2
{
	@Test
	public void main() throws IOException 
	{
	  	preCondition("chrome");
	  	Login l=new Login(driver);
	  	l.login_link();
	  	l.username("kingm@gmail.com");
	  	l.password("King@123");
	  	l.login_button();
	  	SoftAssert soft=new SoftAssert();
	  	try {
	  		l.loginSuccessful().isDisplayed();
	  		test.log(Status.INFO, "login is successfull......");
		} catch (Exception e) {
			test.log(Status.INFO, "login is Unsuccessfull......");
			fail();
		}
	  	postCondition();
	  	
	}
	

}
