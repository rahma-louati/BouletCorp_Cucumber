package com.automation.e2eTests.setps_Definitions;

import com.automation.e2eTests.pages_Objects.BouletCorpPage;
import com.automation.e2eTests.utils.BasePage;
import com.automation.e2eTests.utils.ConfigFileReader;
import com.automation.e2eTests.utils.SeleniumUtils;
import com.automation.e2eTests.utils.Validations;

import io.cucumber.java.fr.Alors;
import io.cucumber.java.fr.Etantdonné;
import io.cucumber.java.fr.Quand;

public class BouletCorpStepDefinition extends BasePage {

	private ConfigFileReader configFileReader;
	private BouletCorpPage bouletCorpPage;
	private SeleniumUtils seleniumUtils;
	private Validations validations;

	public BouletCorpStepDefinition() {
		this.configFileReader = new ConfigFileReader();
		this.bouletCorpPage = new BouletCorpPage();
		this.validations = new Validations();
		this.seleniumUtils = new SeleniumUtils();
	}

	@Etantdonné("je me rends sur le site Bouletcorp {string}")
	public void jeMeRendsSurLeSiteBouletcorp(String url) {
		seleniumUtils.get(configFileReader.getProperties(url));
	}

	@Quand("je clique sur le bouton A propos")
	public void jeCliqueSurLeBoutonAPropos() {
		seleniumUtils.click(bouletCorpPage.aProposbutton);
	}

	@Alors("la page a change")
	public void laPageAChange() {
		validations.assertNotEquals(configFileReader.getProperties("bouletcorp.url"), seleniumUtils.getCurrentUrl());
	}

	@Alors("les Widgets twitch octodon et instagram sont bien affiches")
	public void lesWidgetsTwitchOctodonEtInstagramSontBienAffiches() {
		boolean twich = BouletCorpPage.twichWidget.isDisplayed();
		validations.assertTrue(twich);
		boolean octodon = BouletCorpPage.octonWidget.isDisplayed();
		validations.assertTrue(octodon);
		boolean instagram = BouletCorpPage.instgramWidget.isDisplayed();
		validations.assertTrue(instagram);
	}

}
