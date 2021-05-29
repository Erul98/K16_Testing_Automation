<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Create Channel</name>
   <tag></tag>
   <elementGuidId>6f9f2ed2-fe5a-4494-a084-df4bf4b02e9c</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;\n  {\&quot;team_id\&quot;:\&quot;dasmq3h6ejbwjetj66zran8mfw\&quot;,\&quot;name\&quot;:\&quot;private-channel-5\&quot;,\&quot;display_name\&quot;:\&quot;Private Channel 5\&quot;,\&quot;purpose\&quot;:\&quot;\&quot;,\&quot;header\&quot;:\&quot;\&quot;,\&quot;type\&quot;:\&quot;P\&quot;,\&quot;create_at\&quot;:0,\&quot;creator_id\&quot;:\&quot;\&quot;,\&quot;delete_at\&quot;:0,\&quot;extra_update_at\&quot;:0,\&quot;group_constrained\&quot;:false,\&quot;id\&quot;:\&quot;\&quot;,\&quot;last_post_at\&quot;:0,\&quot;scheme_id\&quot;:\&quot;\&quot;,\&quot;total_msg_count\&quot;:0,\&quot;update_at\&quot;:0}\n&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Cookie</name>
      <type>Main</type>
      <value>MMAUTHTOKEN=b9adoz76q38ndp9845gy6dpzte; MMUSERID=s741x4mmj7gkxx1nh7waq4cweo</value>
   </httpHeaderProperties>
   <katalonVersion>8.0.0</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://haibui-mattermost-demo.herokuapp.com/api/v4/channels</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
