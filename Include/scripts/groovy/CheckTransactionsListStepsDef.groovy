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


class CheckTransactionsListStepsDef {

	@Given("the user has an open browser")
	def openBrowser() {
		WebUI.openBrowser('')
	}

	@When("the user navigates to site")
	def navigateToSite() {
		WebUI.navigateToUrl(GlobalVariable.url)
	}

	@When("the user has the transaction option chosen at panel")
	public void the_user_has_the_transaction_option_chosen_at_panel() {
		WebUI.click(findTestObject('Object Repository/Page_client/i_Settings_v-icon notranslate mdi mdi-menu _d43718'))
		WebUI.click(findTestObject('Page_client/div_Dashboard'))
	}

	@When("the user has some transactions")
	public void the_user_has_some_transactions() {
		WebUI.waitForElementVisible(findTestObject('Object Repository/Page_client/td_1'), 3)
		WebUI.verifyElementVisible(findTestObject('Object Repository/Page_client/td_1'))
	}

	@Then("the user sees a transactions list")
	public void the_user_sees_a_transactions_list() {
		WebUI.verifyElementVisible(findTestObject('Page_client/div_Transactions Search'))

		WebUI.verifyElementVisible(findTestObject('Object Repository/Page_client/th_Entity'))

		WebUI.verifyElementVisible(findTestObject('Object Repository/Page_client/th_Id'))

		WebUI.verifyElementVisible(findTestObject('Object Repository/Page_client/th_Amount'))

		WebUI.verifyElementVisible(findTestObject('Object Repository/Page_client/th_Type'))

		WebUI.verifyElementVisible(findTestObject('Object Repository/Page_client/th_Source'))

		WebUI.verifyElementVisible(findTestObject('Object Repository/Page_client/th_Date'))

		WebUI.closeBrowser()
	}
}