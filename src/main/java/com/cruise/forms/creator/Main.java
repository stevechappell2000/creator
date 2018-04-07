package com.cruise.forms.creator;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
	static String sample = "  {  \n    \"type\":\"form\",\n   \n    \"access\":[  \n       {  \n          \"roles\":[  \n             \"579814a4ff9b236800b09b23\",\n             \"579814a4ff9b236800b09b24\",\n             \"579814a5ff9b236800b09b25\",\n             \"579f879d5b7a477b0026f821\"\n          ],\n          \"type\":\"read_all\"\n       }\n    ],\n    \"owner\":\"553dbfc08d22d5cb1a7024f2\",\n    \"components\":[  \n       {  \n          \"conditional\":{  \n             \"eq\":\"\",\n             \"when\":\"\",\n             \"show\":\"\"\n          },\n          \"type\":\"columns\",\n          \"columns\":[  \n             {  \n                \"components\":[  \n                   {  \n                      \"isNew\":false,\n                      \"type\":\"textfield\",\n                      \"conditional\":{  \n                         \"eq\":\"\",\n                         \"when\":\"\",\n                         \"show\":\"\"\n                      },\n                      \"validate\":{  \n                         \"customPrivate\":false,\n                         \"custom\":\"\",\n                         \"pattern\":\"\",\n                         \"maxLength\":\"\",\n                         \"minLength\":\"\",\n                         \"required\":false\n                      },\n                      \"persistent\":true,\n                      \"unique\":false,\n                      \"protected\":false,\n                      \"defaultValue\":\"\",\n                      \"multiple\":false,\n                      \"suffix\":\"\",\n                      \"prefix\":\"\",\n                      \"placeholder\":\"Enter your first name\",\n                      \"key\":\"firstName\",\n                      \"label\":\"First Name\",\n                      \"inputMask\":\"\",\n                      \"inputType\":\"text\",\n                      \"tableView\":true,\n                      \"input\":true\n                   },\n                   {  \n                      \"conditional\":{  \n                         \"eq\":\"\",\n                         \"when\":\"\",\n                         \"show\":\"\"\n                      },\n                      \"type\":\"email\",\n                      \"persistent\":true,\n                      \"unique\":false,\n                      \"protected\":false,\n                      \"defaultValue\":\"\",\n                      \"suffix\":\"\",\n                      \"prefix\":\"\",\n                      \"placeholder\":\"Enter your email address\",\n                      \"key\":\"email\",\n                      \"label\":\"Email\",\n                      \"inputType\":\"email\",\n                      \"tableView\":true,\n                      \"input\":true\n                   }\n                ]\n             },\n             {  \n                \"components\":[  \n                   {  \n                      \"type\":\"textfield\",\n                      \"conditional\":{  \n                         \"eq\":\"\",\n                         \"when\":\"\",\n                         \"show\":\"\"\n                      },\n                      \"validate\":{  \n                         \"customPrivate\":false,\n                         \"custom\":\"\",\n                         \"pattern\":\"\",\n                         \"maxLength\":\"\",\n                         \"minLength\":\"\",\n                         \"required\":false\n                      },\n                      \"persistent\":true,\n                      \"unique\":false,\n                      \"protected\":false,\n                      \"defaultValue\":\"\",\n                      \"multiple\":false,\n                      \"suffix\":\"\",\n                      \"prefix\":\"\",\n                      \"placeholder\":\"Enter your last name\",\n                      \"key\":\"lastName\",\n                      \"label\":\"Last Name\",\n                      \"inputMask\":\"\",\n                      \"inputType\":\"text\",\n                      \"tableView\":true,\n                      \"input\":true\n                   },\n                   {  \n                      \"lockKey\":true,\n                      \"conditional\":{  \n                         \"eq\":\"\",\n                         \"when\":\"\",\n                         \"show\":\"\"\n                      },\n                      \"type\":\"checkbox\",\n                      \"validate\":{  \n                         \"required\":false\n                      },\n                      \"persistent\":true,\n                      \"protected\":false,\n                      \"defaultValue\":false,\n                      \"key\":\"havePhoneNumber\",\n                      \"label\":\"Do you have a phone number?\",\n                      \"hideLabel\":true,\n                      \"tableView\":true,\n                      \"inputType\":\"checkbox\",\n                      \"input\":true\n                   },\n                   {  \n                      \"conditional\":{  \n                         \"eq\":\"true\",\n                         \"when\":\"havePhoneNumber\",\n                         \"show\":\"true\"\n                      },\n                      \"type\":\"phoneNumber\",\n                      \"validate\":{  \n                         \"required\":false\n                      },\n                      \"defaultValue\":\"\",\n                      \"persistent\":true,\n                      \"unique\":false,\n                      \"protected\":false,\n                      \"multiple\":false,\n                      \"suffix\":\"\",\n                      \"prefix\":\"\",\n                      \"placeholder\":\"\",\n                      \"key\":\"phoneNumber\",\n                      \"label\":\"Phone Number\",\n                      \"inputMask\":\"(999) 999-9999\",\n                      \"tableView\":true,\n                      \"input\":true\n                   }\n                ]\n             }\n          ],\n          \"input\":false\n       },\n       {  \n          \"type\":\"textfield\",\n          \"conditional\":{  \n             \"eq\":\"\",\n             \"when\":\"\",\n             \"show\":\"\"\n          },\n          \"validate\":{  \n             \"customPrivate\":false,\n             \"custom\":\"\",\n             \"pattern\":\"\",\n             \"maxLength\":\"\",\n             \"minLength\":\"\",\n             \"required\":false\n          },\n          \"persistent\":true,\n          \"unique\":false,\n          \"protected\":false,\n          \"defaultValue\":\"\",\n          \"multiple\":true,\n          \"suffix\":\"\",\n          \"prefix\":\"\",\n          \"placeholder\":\"Enter your kids names\",\n          \"key\":\"kids\",\n          \"label\":\"Kids\",\n          \"inputMask\":\"\",\n          \"inputType\":\"text\",\n          \"tableView\":true,\n          \"input\":true\n       },\n       {  \n          \"conditional\":{  \n             \"eq\":\"\",\n             \"when\":\"\",\n             \"show\":\"\"\n          },\n          \"type\":\"datagrid\",\n          \"persistent\":true,\n          \"protected\":false,\n          \"key\":\"cars\",\n          \"label\":\"Cars\",\n          \"tableView\":true,\n          \"components\":[  \n             {  \n                \"hideLabel\":true,\n                \"type\":\"textfield\",\n                \"conditional\":{  \n                   \"eq\":\"\",\n                   \"when\":null,\n                   \"show\":\"\"\n                },\n                \"validate\":{  \n                   \"customPrivate\":false,\n                   \"custom\":\"\",\n                   \"pattern\":\"\",\n                   \"maxLength\":\"\",\n                   \"minLength\":\"\",\n                   \"required\":false\n                },\n                \"persistent\":true,\n                \"unique\":false,\n                \"protected\":false,\n                \"defaultValue\":\"\",\n                \"multiple\":false,\n                \"suffix\":\"\",\n                \"prefix\":\"\",\n                \"placeholder\":\"\",\n                \"key\":\"make\",\n                \"label\":\"Make\",\n                \"inputMask\":\"\",\n                \"inputType\":\"text\",\n                \"tableView\":true,\n                \"input\":true\n             },\n             {  \n                \"hideLabel\":true,\n                \"type\":\"textfield\",\n                \"conditional\":{  \n                   \"eq\":\"\",\n                   \"when\":null,\n                   \"show\":\"\"\n                },\n                \"validate\":{  \n                   \"customPrivate\":false,\n                   \"custom\":\"\",\n                   \"pattern\":\"\",\n                   \"maxLength\":\"\",\n                   \"minLength\":\"\",\n                   \"required\":false\n                },\n                \"persistent\":true,\n                \"unique\":false,\n                \"protected\":false,\n                \"defaultValue\":\"\",\n                \"multiple\":false,\n                \"suffix\":\"\",\n                \"prefix\":\"\",\n                \"placeholder\":\"\",\n                \"key\":\"model\",\n                \"label\":\"Model\",\n                \"inputMask\":\"\",\n                \"inputType\":\"text\",\n                \"tableView\":true,\n                \"input\":true\n             },\n             {  \n                \"hideLabel\":true,\n                \"type\":\"textfield\",\n                \"conditional\":{  \n                   \"eq\":\"\",\n                   \"when\":null,\n                   \"show\":\"\"\n                },\n                \"validate\":{  \n                   \"customPrivate\":false,\n                   \"custom\":\"\",\n                   \"pattern\":\"\",\n                   \"maxLength\":\"\",\n                   \"minLength\":\"\",\n                   \"required\":false\n                },\n                \"persistent\":true,\n                \"unique\":false,\n                \"protected\":false,\n                \"defaultValue\":\"\",\n                \"multiple\":false,\n                \"suffix\":\"\",\n                \"prefix\":\"\",\n                \"placeholder\":\"\",\n                \"key\":\"year\",\n                \"label\":\"Year\",\n                \"inputMask\":\"\",\n                \"inputType\":\"text\",\n                \"tableView\":true,\n                \"input\":true\n             }\n          ],\n          \"tree\":true,\n          \"input\":true\n       },\n       {  \n          \"type\":\"button\",\n          \"theme\":\"primary\",\n          \"disableOnInvalid\":true,\n          \"action\":\"submit\",\n          \"block\":false,\n          \"rightIcon\":\"\",\n          \"leftIcon\":\"\",\n          \"size\":\"md\",\n          \"key\":\"submit\",\n          \"tableView\":false,\n          \"label\":\"Submit\",\n          \"input\":true\n       }\n    ],\n    \"created\":\"2016-07-27T01:57:52.976Z\",\n    \"revisions\":\"\",\n    \"_vid\":0,\n    \"_id\":\"57981520ff9b236800b09b31\",\n    \"machineName\":\"pjmfogrfqptslvi:testForm\",\n    \"modified\":\"2016-08-09T02:10:03.990Z\",\n    \"title\":\"Test Form\",\n    \"display\":\"form\",\n    \"name\":\"testForm\",\n    \"path\":\"test\",\n    \"project\":\"579814a4ff9b236800b09b22\"\n };";

	// \"tags\":[ \n\n ], \"submissionAccess\":[ \n\n ],\n
	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		//mapper.disable(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE);
		//mapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
		//mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		String jsonInString = "{'name' : 'mkyong'}";
		// JSON from String to Object
		try {
			Form obj = mapper.readValue(sample, Form.class);
			
			String jsonInStringx = mapper.writeValueAsString(obj);
			
			System.out.println(jsonInStringx);
			
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
/**
 * { "created":"2016-07-27T01:57:52.976Z", "revisions":"", "_vid":0,
 * "_id":"57981520ff9b236800b09b31", "machineName":"pjmfogrfqptslvi:testForm",
 * "modified":"2016-08-09T02:10:03.990Z", "title":"Test Form", "display":"form",
 * "name":"testForm", "path":"test", "project":"579814a4ff9b236800b09b22"
 * "type":"form", "tags":[
 * 
 * ], "access":[ { "roles":[ "579814a4ff9b236800b09b23",
 * "579814a4ff9b236800b09b24", "579814a5ff9b236800b09b25",
 * "579f879d5b7a477b0026f821" ], "type":"read_all" } ], "submissionAccess":[
 * 
 * ], "owner":"553dbfc08d22d5cb1a7024f2", "components":[ { "conditional":{
 * "eq":"", "when":"", "show":"" }, "type":"columns", "columns":[ {
 * "components":[ { "isNew":false, "type":"textfield", "conditional":{ "eq":"",
 * "when":"", "show":"" }, "validate":{ "customPrivate":false, "custom":"",
 * "pattern":"", "maxLength":"", "minLength":"", "required":false },
 * "persistent":true, "unique":false, "protected":false, "defaultValue":"",
 * "multiple":false, "suffix":"", "prefix":"", "placeholder":"Enter your first
 * name", "key":"firstName", "label":"First Name", "inputMask":"",
 * "inputType":"text", "tableView":true, "input":true }, { "conditional":{
 * "eq":"", "when":"", "show":"" }, "type":"email", "persistent":true,
 * "unique":false, "protected":false, "defaultValue":"", "suffix":"",
 * "prefix":"", "placeholder":"Enter your email address", "key":"email",
 * "label":"Email", "inputType":"email", "tableView":true, "input":true } ] }, {
 * "components":[ { "type":"textfield", "conditional":{ "eq":"", "when":"",
 * "show":"" }, "validate":{ "customPrivate":false, "custom":"", "pattern":"",
 * "maxLength":"", "minLength":"", "required":false }, "persistent":true,
 * "unique":false, "protected":false, "defaultValue":"", "multiple":false,
 * "suffix":"", "prefix":"", "placeholder":"Enter your last name",
 * "key":"lastName", "label":"Last Name", "inputMask":"", "inputType":"text",
 * "tableView":true, "input":true }, { "lockKey":true, "conditional":{ "eq":"",
 * "when":"", "show":"" }, "type":"checkbox", "validate":{ "required":false },
 * "persistent":true, "protected":false, "defaultValue":false,
 * "key":"havePhoneNumber", "label":"Do you have a phone number?",
 * "hideLabel":true, "tableView":true, "inputType":"checkbox", "input":true }, {
 * "conditional":{ "eq":"true", "when":"havePhoneNumber", "show":"true" },
 * "type":"phoneNumber", "validate":{ "required":false }, "defaultValue":"",
 * "persistent":true, "unique":false, "protected":false, "multiple":false,
 * "suffix":"", "prefix":"", "placeholder":"", "key":"phoneNumber",
 * "label":"Phone Number", "inputMask":"(999) 999-9999", "tableView":true,
 * "input":true } ] } ], "input":false }, { "type":"textfield", "conditional":{
 * "eq":"", "when":"", "show":"" }, "validate":{ "customPrivate":false,
 * "custom":"", "pattern":"", "maxLength":"", "minLength":"", "required":false
 * }, "persistent":true, "unique":false, "protected":false, "defaultValue":"",
 * "multiple":true, "suffix":"", "prefix":"", "placeholder":"Enter your kids
 * names", "key":"kids", "label":"Kids", "inputMask":"", "inputType":"text",
 * "tableView":true, "input":true }, { "conditional":{ "eq":"", "when":"",
 * "show":"" }, "type":"datagrid", "persistent":true, "protected":false,
 * "key":"cars", "label":"Cars", "tableView":true, "components":[ {
 * "hideLabel":true, "type":"textfield", "conditional":{ "eq":"", "when":"",
 * "show":"" }, "validate":{ "customPrivate":false, "custom":"", "pattern":"",
 * "maxLength":"", "minLength":"", "required":false }, "persistent":true,
 * "unique":false, "protected":false, "defaultValue":"", "multiple":false,
 * "suffix":"", "prefix":"", "placeholder":"", "key":"make", "label":"Make",
 * "inputMask":"", "inputType":"text", "tableView":true, "input":true }, {
 * "hideLabel":true, "type":"textfield", "conditional":{ "eq":"", "when":"",
 * "show":"" }, "validate":{ "customPrivate":false, "custom":"", "pattern":"",
 * "maxLength":"", "minLength":"", "required":false }, "persistent":true,
 * "unique":false, "protected":false, "defaultValue":"", "multiple":false,
 * "suffix":"", "prefix":"", "placeholder":"", "key":"model", "label":"Model",
 * "inputMask":"", "inputType":"text", "tableView":true, "input":true }, {
 * "hideLabel":true, "type":"textfield", "conditional":{ "eq":"", "when":"",
 * "show":"" }, "validate":{ "customPrivate":false, "custom":"", "pattern":"",
 * "maxLength":"", "minLength":"", "required":false }, "persistent":true,
 * "unique":false, "protected":false, "defaultValue":"", "multiple":false,
 * "suffix":"", "prefix":"", "placeholder":"", "key":"year", "label":"Year",
 * "inputMask":"", "inputType":"text", "tableView":true, "input":true } ],
 * "tree":true, "input":true }, { "type":"button", "theme":"primary",
 * "disableOnInvalid":true, "action":"submit", "block":false, "rightIcon":"",
 * "leftIcon":"", "size":"md", "key":"submit", "tableView":false,
 * "label":"Submit", "input":true } ]
 * 
 * };
 */
