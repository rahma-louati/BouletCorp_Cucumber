package com.automation.e2eTests.pages_Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.automation.e2eTests.utils.BasePage;
import com.automation.e2eTests.utils.ConfigFileReader;
import com.automation.e2eTests.utils.Setup;
import com.automation.e2eTests.utils.Validations;

public class BouletCorpPage extends BasePage {

	private ConfigFileReader configFileReader;
	private Validations validations;

	final static String APROPOS_BUTTON = "//a[@href='/about']";
	final static String TWITCH_WIDGET = "//img[@src='/buttons/twitch.png']";
	final static String OCTODON_WIDGET = "//img[@src='/buttons/masto.png']";
	final static String INSTGRAM_WIDGET = "//img[@src='/buttons/insta.png']";
	/* @FindBy */

	@FindBy(how = How.XPATH, using = APROPOS_BUTTON)
	public static WebElement aProposbutton;

	@FindBy(how = How.XPATH, using = TWITCH_WIDGET)
	public static WebElement twichWidget;

	@FindBy(how = How.XPATH, using = OCTODON_WIDGET)
	public static WebElement octonWidget;

	@FindBy(how = How.XPATH, using = INSTGRAM_WIDGET)
	public static WebElement instgramWidget;

	public BouletCorpPage() {
		PageFactory.initElements(Setup.getDriver(), this);
		this.configFileReader = new ConfigFileReader();

	}

}
