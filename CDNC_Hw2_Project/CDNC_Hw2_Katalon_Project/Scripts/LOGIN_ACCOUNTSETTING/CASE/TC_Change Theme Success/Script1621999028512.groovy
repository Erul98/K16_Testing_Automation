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
import com.sun.java.util.jar.pack.Instruction.Switch

import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://haibui-mattermost-demo.herokuapp.com/login')

WebUI.callTestCase(findTestCase('LOGIN_ACCOUNTSETTING/IF_ELSE/TC_Login Success'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Town Square - master devops Mattermost/button_vunam1218_style--none sidebar-header-dropdown__icon'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - master devops Mattermost/button_Account Settings'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - master devops Mattermost/button_Display'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - master devops Mattermost/div_ThemeEditOpen to manage your theme'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - master devops Mattermost/label_Theme Colors'))

switch(theme){
	case 'Organization':		
		WebUI.click(findTestObject('Object Repository/Page_Town Square - master devops Mattermost/div_Organization'))
	break;
	case 'Windows Dark':
		WebUI.click(findTestObject('Object Repository/Page_Town Square - master devops Mattermost/div_Windows Dark'))
	break;
	case 'Mattermost Dark':
		WebUI.click(findTestObject('Object Repository/Page_Town Square - master devops Mattermost/div_Mattermost Dark'))
	break;
	case 'Mattermost':
		WebUI.click(findTestObject('Object Repository/Page_Town Square - master devops Mattermost/div_Mattermost'))
	break;
	default:
	break;
}

WebUI.click(findTestObject('Object Repository/Page_Town Square - master devops Mattermost/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - master devops Mattermost/button_Close'))

