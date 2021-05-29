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

import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.FormDataBodyParameter as FormDataBodyParameter
import com.kms.katalon.core.testobject.RestRequestObjectBuilder
import com.kms.katalon.core.testobject.TestObjectProperty as TestObjectProperty

String baseUrl = "https://haibui-mattermost-demo.herokuapp.com/api/v4/users/"

for (int i = 1 ; i < findTestData('LOGIN_ACCOUNTSETTING_DATA/Data_InternalData_UserAPI').getRowNumbers(); i++) {

	
String userId = findTestData("LOGIN_ACCOUNTSETTING_DATA/Data_InternalData_UserAPI").getValue(1, i);
String accessToken = findTestData("LOGIN_ACCOUNTSETTING_DATA/Data_InternalData_UserAPI").getValue(2, i);
	
String url = baseUrl + userId

TestObjectProperty auth = new TestObjectProperty('Authorization', ConditionType.EQUALS, accessToken);
TestObjectProperty contentType = new TestObjectProperty('Content-Type', ConditionType.EQUALS, 'application/json')
TestObjectProperty accept = new TestObjectProperty('Accept', ConditionType.EQUALS, '*/*')

RequestObject req = new RestRequestObjectBuilder()
.withRestUrl(url)
.withHttpHeaders([auth, contentType, accept])
.withRestRequestMethod('GET')
.build()


ResponseObject res = WS.sendRequest(req)

WS.verifyResponseStatusCode(res, 200)

}