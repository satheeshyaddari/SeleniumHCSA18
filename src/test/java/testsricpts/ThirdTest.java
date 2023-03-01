package testsricpts;

import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;

public class ThirdTest extends BaseClass {

	public void thirdTest() {
		SoftAssert soft = new SoftAssert();
		home.searchFor("core java for selenium");
		soft.assertEquals(javaVideo.getHeader(), "CORE JAVA FOR SELENIUM");

		coreJava.clickCoreJavaForSelenium();
		web.switchToFrame();
		javaVideo.clickPlayButton();
		Thread.sleep(2000);
		javaVideo.clickPauseButton();

		web.switchBackFromFrame();

		javaVideo.clickAddToWishlist();

		soft.assertAll();
	}

}
