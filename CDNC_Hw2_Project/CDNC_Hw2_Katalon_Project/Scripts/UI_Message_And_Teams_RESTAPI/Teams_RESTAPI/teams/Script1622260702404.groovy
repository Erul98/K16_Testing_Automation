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
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.impl.HttpTextBodyContent
import com.kms.katalon.core.testdata.CSVData


def request = (RequestObject)findTestObject('Teams/createTeam')

CSVData data = findTestData("UI_Message_And_Teams_RESTAPI_DATA/CSVs/information_team_data")

def index = 0;

while(index < data.getRowNumbers()) {
	String body = '{"name": ' + '"' + data.getAllData()[index][0] + '",' + '"display_name": ' + '"' + data.getAllData()[index][1] + '",' + '"type": ' + '"' + data.getAllData()[index][2] + '"' + '}'
	System.out.println(body)
	try {
		request.setBodyContent(new HttpTextBodyContent(body, "UTF-8", "application/json"))
	} catch(Exception e) {
		System.out.println(e)
	}
	System.out.println(WS.sendRequest(request))
	WS.delay(5)
	index++
}

WS.callTestCase(findTestCase, null)