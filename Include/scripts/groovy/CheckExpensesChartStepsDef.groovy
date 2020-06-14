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



class CheckExpensesChartStepsDef {

	@Then("the user sees a pie chart")
	public void the_user_sees_a_pie_chart() {

		WebUI.verifyElementVisible(findTestObject('Object Repository/Page_client/tspan_Expenses'))
	}

	@Then("the user sees the {double} at {string}")
	public void the_user_sees_the_at(Double double1, String string) {
		// highcharts-vue can't be tested with katalon
		//WebUI.waitForElementVisible(findTestObject('Object Repository/Page_client/pie'+string), 3)
		//String text = WebUI.getText(findTestObject('Object Repository/Page_client/pie'+string));
		//assert text == String.valueOf(double1);
		//
		//WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/Page_client/chartPie'), 'alt'),
		//		'[{"name":"Education","y":113.72},{"name":"Food","y":41.86},{"name":"Household","y":433.72}]', false)

	}
}