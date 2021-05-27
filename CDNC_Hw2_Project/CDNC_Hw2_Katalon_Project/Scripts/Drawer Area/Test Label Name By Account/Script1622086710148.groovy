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
import com.kms.katalon.core.testdata.InternalData


InternalData data = findTestData('Drawer Data/List Account')
for (def index : (0..data.getRowNumbers() - 1)) {
	WebUI.openBrowser('https://haibui-mattermost-demo.herokuapp.com/master-devops/channels')
	WebUI.setText(findTestObject('Object Repository/Login Page/Username Input'), data.internallyGetValue("email", index))
	WebUI.setText(findTestObject('Object Repository/Login Page/Password Input'), data.internallyGetValue("password", index))
	WebUI.click(findTestObject('Object Repository/Login Page/Login Button'))
	if(WebUI.getText(findTestObject('Object Repository/Drawer Obj Repo/Label Name Account'))==data.internallyGetValue("name", index)) {
		System.out.print('Success')
	}
	else {
		FailureHandling.CONTINUE_ON_FAILURE
	}
//	WebUI.click(findTestObject('Object Repository/Drawer Obj Repo/Create Public Channel Button'))
//	WebUI.setText(findTestObject('Object Repository/Popup New Chanel/Name Input'), data.internallyGetValue("name", index))
//	WebUI.click(findTestObject('Object Repository/Popup New Chanel/Create Chanel Button'))
	WebUI.closeBrowser()
}