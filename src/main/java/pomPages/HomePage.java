package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	// Declaration
	@FindBy(xpath = "//img[@alt='SkillRary']")
	private WebElement logo;
	@FindBy(xpath = "//a[text()=' GEARS ']")
	private WebElement gearsTab;
	@FindBy(xpath = "//ul[@class='dropdown-menu gear_menu']/descendant::a[text()=' SkillRary Demo APP']")
	private WebElement skillraryDemoAppLink;
	@FindBy(xpath = "//input[@name='q']")
	private WebElement SearchBar;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement SearchButton;

	// initialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// utilization
	public WebElement getLogo() {
		return logo;
	}

	public void clickGears() {
		gearsTab.click();
	}

	public void clickSkillraryDemoApp() {
		skillraryDemoAppLink.click();
	}

	public void clickSearchBar() {
		SearchBar.click();
	}

	public void clicksearchButton() {
		SearchButton.click();
	}
}
