package heliverse;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.BaseClass.DwsBase2;
import com.crm.pom.UiTestCase;
@Listeners(com.crm.listeners.DwsListeners.class)
public class UiTest extends DwsBase2{
	
	@Test
	public void uiTest(){
		
		UiTestCase ut=new UiTestCase(driver);
		assertTrue(ut.searchField().isDisplayed(), "Searchfield is displayed");
		assertTrue(ut.footerArea().isDisplayed(), "Footerarea is displayed");
		
		
	}

}
