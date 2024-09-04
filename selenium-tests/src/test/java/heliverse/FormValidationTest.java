package heliverse;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.BaseClass.DwsBase;
import com.crm.BaseClass.DwsBase2;
import com.crm.listeners.DwsListeners;
import com.crm.pom.FormValidationDWS;
@Listeners(com.crm.listeners.DwsListeners.class)
public class FormValidationTest extends DwsBase
{
	@Test
	public void createform() throws IOException {
		preCondition("chrome");
		FormValidationDWS fvd=new FormValidationDWS(driver);
		fvd.registerIcon();
		fvd.genderMale();
		fvd.FirstName("King");
		fvd.LastName("Martin");
		fvd.Email("kingm@gmail.com");
		fvd.PassWord("King@123");
		fvd.ConfermPass("King@123");
		fvd.createAcc();
		postCondition();
	}
}
