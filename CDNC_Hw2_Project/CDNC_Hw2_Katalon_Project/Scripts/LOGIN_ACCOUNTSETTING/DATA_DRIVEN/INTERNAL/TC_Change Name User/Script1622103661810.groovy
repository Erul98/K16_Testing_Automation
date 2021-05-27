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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By
WebUI.openBrowser('')

WebUI.navigateToUrl('https://haibui-mattermost-demo.herokuapp.com/login')

WebUI.callTestCase(findTestCase("LOGIN_ACCOUNTSETTING/IF_ELSE/TC_Login Success"), null, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Town Square - master devops Mattermost/button_vunam1218_style--none sidebar-header-dropdown__icon'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - master devops Mattermost/button_Account Settings'))

DriverFactory.getWebDriver().findElement(By.xpath( "//button[@id='generalButton']")).click();

for (int i = 1 ; i < findTestData('Data_InternalData_NameAccount').getRowNumbers(); i++ ) {
	DriverFactory.getWebDriver().findElement(By.xpath( "//button[@id='nameEdit']")).click();
	
	String firstName = findTestData('Data_InternalData_NameAccount').getValue(1, i);
	String lastName = findTestData('Data_InternalData_NameAccount').getValue(2, i);
	
	WebUI.setText(findTestObject('Object Repository/Page_Town Square - master devops Mattermost/input_First Name_firstName'), firstName);
	WebUI.setText( findTestObject('Object Repository/Page_Town Square - master devops Mattermost/input_Last Name_lastName'),lastName);
	
	WebUI.click(findTestObject('Object Repository/Page_Town Square - master devops Mattermost/button_Save'));
}