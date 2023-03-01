package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUtility;

public class SkillraryDemoApp {

	// Declaration
	@FindBy(xpath = "//div[@class='navbar-header']")
	private WebElement pageHeader;
	@FindBy(id = "course")
	private WebElement courseTab;
	@FindBy(xpath = "//span[@class='wrappers']/a[text()='Selenium Training']")
	private WebElement seleniumTrainingLink;
	@FindBy(xpath = "//select[@name='addresstype']")
	private WebElement categoryDropdown;
	@FindBy(xpath = "//a[text()='Contact Us']")
	private WebElement contactUsLink;

	// initialization
	public SkillraryDemoApp(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// utilization
	public String getHeader() {
		return pageHeader.getText();
	}

	public void mouseHoverToCourse(WebDriverUtility web) {
		web.mouseHover(courseTab);
	}

	public void clickSeleniumTraining() {
		seleniumTrainingLink.click();
	}

	public void selectCategory(WebDriverUtility web, int index) {
		web.dropdown(categoryDropdown, index);
	}

	public void clickContactUs() {
		contactUsLink.click();
	}

}
