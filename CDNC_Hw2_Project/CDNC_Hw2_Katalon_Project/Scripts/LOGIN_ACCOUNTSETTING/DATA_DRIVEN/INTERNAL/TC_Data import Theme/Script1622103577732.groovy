import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser('')

WebUI.navigateToUrl('https://haibui-mattermost-demo.herokuapp.com/login')

WebUI.callTestCase(findTestCase('LOGIN_ACCOUNTSETTING/IF_ELSE/TC_Login Success'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Town Square - master devops Mattermost/button_vunam1218_style--none sidebar-header-dropdown__icon'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - master devops Mattermost/button_Account Settings'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - master devops Mattermost/button_General'))

for (int i = 1 ; i <  findTestData('Data_InternalData_EmailChange').getRowNumbers() ; i ++) {
	
	
	String newEmail = findTestData('Data_InternalData_EmailChange').getValue(1, i);
	String password =  findTestData('Data_InternalData_EmailChange').getValue(2, i);
	
	DriverFactory.getWebDriver().findElement(By.xpath('//button[@id=\'emailEdit\']')).click()
	
	TestObject primaryEmail = new TestObject().addProperty("xpath", ConditionType.EQUALS,'//input[@id=\'primaryEmail\']');
	TestObject confirmEmail = new TestObject().addProperty("xpath", ConditionType.EQUALS,'//input[@id=\'confirmEmail\']');
	TestObject currentPassword = new TestObject().addProperty("xpath", ConditionType.EQUALS,'//input[@id=\'currentPassword\']');
	
	WebUI.setText(primaryEmail, newEmail)
	WebUI.setText(confirmEmail, newEmail)
	WebUI.setText(currentPassword, password)
	
	WebUI.click(findTestObject('Object Repository/Page_Town Square - master devops Mattermost/button_Save'))
	
	TestObject emailChange = new TestObject().addProperty("xpath", ConditionType.EQUALS,'//div[@id=\'emailDesc\']');
	
	WebUI.verifyElementText(emailChange, newEmail)
}
