import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class CheckAutomaticCategorizationStepsDef {
	@When("the user activate automatic categorization")
	public void the_user_activate_automatic_categorization() {
		WebUI.click(findTestObject('Page_client/div_Transactions_v-input--selection-controls__ripple'))
	}

	@Then("all transactions from the same entity are categorized")
	public void all_transactions_from_the_same_entity_are_categorized() {
		WebDriver driver = DriverFactory.getWebDriver()
		List<WebElement> tableElements = driver.findElements(By.cssSelector("#inspire tr td:nth-child(7)"));
		ArrayList<String> tableValues = new ArrayList<String>();
		for(int i=0; i < tableElements.size(); i++){
			String str = tableElements.get(i).getText();
			tableValues.add(str);
		}

		ArrayList<String> referenceValues = new ArrayList<String>();
		for(int i=0; i < tableValues.size(); i++){
			referenceValues.add(tableValues.get(i))
		}

		Collections.sort(referenceValues)

		assert referenceValues.equals(tableValues)
	}
}