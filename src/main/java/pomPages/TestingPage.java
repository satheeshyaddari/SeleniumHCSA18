package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {

	// Initialization
	@FindBy(xpath = "//h1[@class='page-header']")
	private WebElement pageHeader;
	@FindBy(id = "//img[@id='java']")
	private WebElement javaImage;
	@FindBy(id = "//div[@id='cartArea']")
	private WebElement myCartArea;
	@FindBy(id = "//footer/descendant::i[@class='fa fa-facebook']")
	private WebElement facebookIcon;

	// initialization
	public TestingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// utilization
	public String getHeader() {
		return pageHeader.getText();
	}

	public WebElement getJavaImage() {
		return javaImage;
	}

	public WebElement getMyCartArea() {
		return myCartArea;
	}

	public void clickFacebookIcon() {
		facebookIcon.click();
	}

}
