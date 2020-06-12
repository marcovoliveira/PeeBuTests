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



class CheckEmptyTransactionListStepsDef {

	@When("the user has the settings option chosen at panel")
	public void the_user_has_the_settings_option_chosen_at_panel() {
		WebUI.click(findTestObject('Object Repository/Page_client/button_Balance -2864557 _v-app-bar__nav-ico_365f6e'))
		WebUI.click(findTestObject('Object Repository/Page_client/a_Settings'))
	}

	@When("the user change api url")
	public void the_user_change_api_url_to_api() {
		WebUI.click(findTestObject('Object Repository/Page_client/button_API_v-icon notranslate v-icon--link _e3e81b'))
		WebUI.setText(findTestObject('Page_client/input_API_input-77'), "https://5ee0225c9ed06d001696db5d.mockapi.io/empty/empty")
		WebUI.click(findTestObject('Page_client/span_Update'))

		// Write code here that turns the phrase above into concrete actions
	}

	@When("the user change api url {string}")
	public void the_user_change_api_url(String api) {
		WebUI.click(findTestObject('Object Repository/Page_client/button_API_v-icon notranslate v-icon--link _e3e81b'))
		WebUI.setText(findTestObject('Page_client/input_API_input-77'), api)
		WebUI.click(findTestObject('Page_client/span_Update'))
	}

	@When("the user refresh the transaction list")
	public void the_user_refresh_the_transaction_list() {
		WebUI.click(findTestObject('Page_client/i_Transactions_v-icon notranslate mdi mdi-r_2ee13d'))
	}

	@Then("the user sees an empty transactions list")
	public void the_user_sees_an_empty_transactions_list() {
		WebUI.verifyElementVisible(findTestObject('Page_client/td_No data available'))
	}
}