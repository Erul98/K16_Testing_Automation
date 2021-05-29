<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Get List Bot</name>
   <tag></tag>
   <elementGuidId>eafc74bb-c708-47c4-ab0f-91a6e7ac4497</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Cookie</name>
      <type>Main</type>
      <value>rl_anonymous_id=%2216618e78-b830-4a0f-9f00-d1a7e2471519%22; rl_user_id=%22o534txa51pfhfcdzbemj6yqdiy%22; rl_trait=%7B%7D; MMAUTHTOKEN=4uc4z4bcufb7iq3r9ob8zgf1eo; MMUSERID=i7qdye41u7d5xbt4bw5izt8p6y; MMCSRF=bthdzou7jpbgtfnr3xx57b8ize</value>
   </httpHeaderProperties>
   <katalonVersion>8.0.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>https://haibui-mattermost-demo.herokuapp.com/api/v4/bots</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()


WS.verifyResponseStatusCode(response, 200)

assertThat(response.getStatusCode()).isEqualTo(200)


WS.verifyElementPropertyValue(response, '[0].user_id', 'bzq3xys4bfgbmxznn1e8z8f9jr')
WS.verifyElementPropertyValue(response, '[0].username', 'surveybot')
</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
