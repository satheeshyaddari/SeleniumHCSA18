package testsricpts;

import java.util.List;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;

public class FourthTest extends BaseClass {
	@Test
	
	public void fourthTest() {
		SoftAssert soft = new SoftAssert();
		home.clickGears();
		home.clickSkillraryDemoApp();
		web.switchToChildBrowser();
		soft.assertEquals(demoApp.getHeader(),"SkillRary-ECommerce");
		
		web.scrollToElement(demoApp.clickContactUs());
		demoApp.clickContactUs();
		
		soft.assertTrue(contact.getHeader().isDisplayed());
		List<String> dataList = excel.readDataFromExcel("Sheet");
		contact.sendContactDetails(dataList.get(0),dataList.get(1),dataList.get(2),dataList.get(3));
		
		soft.assertAll();
	}

}
