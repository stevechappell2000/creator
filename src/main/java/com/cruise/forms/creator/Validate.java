package com.cruise.forms.creator;

public class Validate {
    boolean customPrivate = false;
    String custom = "";
    String pattern = "";
    String maxLength = "";
    String minLength = "";
    boolean required = false;
	public boolean isCustomPrivate() {
		return customPrivate;
	}
	public void setCustomPrivate(boolean customPrivate) {
		this.customPrivate = customPrivate;
	}
	public String getCustom() {
		return custom;
	}
	public void setCustom(String custom) {
		this.custom = custom;
	}
	public String getPattern() {
		return pattern;
	}
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	public String getMaxLength() {
		return maxLength;
	}
	public void setMaxLength(String maxLength) {
		this.maxLength = maxLength;
	}
	public String getMinLength() {
		return minLength;
	}
	public void setMinLength(String minLength) {
		this.minLength = minLength;
	}
	public boolean isRequired() {
		return required;
	}
	public void setRequired(boolean required) {
		this.required = required;
	}
    
}
/**
...
                      "validate":{  
                         "customPrivate":false,
                         "custom":"",
                         "pattern":"",
                         "maxLength":"",
                         "minLength":"",
                         "required":false
                      },
                      "persistent":true,
                      "unique":false,
                      "protected":false,
                      "defaultValue":"",
                      "multiple":false,
                      "suffix":"",
                      "prefix":"",
                      "placeholder":"Enter your first name",
                      "key":"firstName",
                      "label":"First Name",
                      "inputMask":"",
                      "inputType":"text",
                      "tableView":true,
                      "input":true
                   },
                   {  
                      "conditional":{  
                         "eq":"",
                         "when":null,
                         "show":""
                      },
                      "type":"email",
                      "persistent":true,
                      "unique":false,
                      "protected":false,
                      "defaultValue":"",
                      "suffix":"",
                      "prefix":"",
                      "placeholder":"Enter your email address",
                      "key":"email",
                      "label":"Email",
                      "inputType":"email",
                      "tableView":true,
                      "input":true
                   }
                ]
             },
             {  
                "components":[  
                   {  
                      "type":"textfield",
                      "conditional":{  
                         "eq":"",
                         "when":"",
                         "show":""
                      },
                      "validate":{  
                         "customPrivate":false,
                         "custom":"",
                         "pattern":"",
                         "maxLength":"",
                         "minLength":"",
                         "required":false
                      },
                      "persistent":true,
                      "unique":false,
                      "protected":false,
                      "defaultValue":"",
                      "multiple":false,
                      "suffix":"",
                      "prefix":"",
                      "placeholder":"Enter your last name",
                      "key":"lastName",
                      "label":"Last Name",
                      "inputMask":"",
                      "inputType":"text",
                      "tableView":true,
                      "input":true
                   },
                   {  
                      "lockKey":true,
                      "conditional":{  
                         "eq":"",
                         "when":null,
                         "show":""
                      },
                      "type":"checkbox",
                      "validate":{  
                         "required":false
                      },
                      "persistent":true,
                      "protected":false,
                      "defaultValue":false,
                      "key":"havePhoneNumber",
                      "label":"Do you have a phone number?",
                      "hideLabel":true,
                      "tableView":true,
                      "inputType":"checkbox",
                      "input":true
                   },
                   {  
                      "conditional":{  
                         "eq":"true",
                         "when":"havePhoneNumber",
                         "show":"true"
                      },
                      "type":"phoneNumber",
                      "validate":{  
                         "required":false
                      },
                      "defaultValue":"",
                      "persistent":true,
                      "unique":false,
                      "protected":false,
                      "multiple":false,
                      "suffix":"",
                      "prefix":"",
                      "placeholder":"",
                      "key":"phoneNumber",
                      "label":"Phone Number",
                      "inputMask":"(999) 999-9999",
                      "tableView":true,
                      "input":true
                   }
                ]
             }
          ],
          "input":false
       },
       {  
          "type":"textfield",
          "conditional":{  
             "eq":"",
             "when":null,
             "show":""
          },
          "validate":{  
             "customPrivate":false,
             "custom":"",
             "pattern":"",
             "maxLength":"",
             "minLength":"",
             "required":false
          },
          "persistent":true,
          "unique":false,
          "protected":false,
          "defaultValue":"",
          "multiple":true,
          "suffix":"",
          "prefix":"",
          "placeholder":"Enter your kids names",
          "key":"kids",
          "label":"Kids",
          "inputMask":"",
          "inputType":"text",
          "tableView":true,
          "input":true
       },
       {  
          "conditional":{  
             "eq":"",
             "when":null,
             "show":""
          },
          "type":"datagrid",
          "persistent":true,
          "protected":false,
          "key":"cars",
          "label":"Cars",
          "tableView":true,
          "components":[  
             {  
                "hideLabel":true,
                "type":"textfield",
                "conditional":{  
                   "eq":"",
                   "when":null,
                   "show":""
                },
                "validate":{  
                   "customPrivate":false,
                   "custom":"",
                   "pattern":"",
                   "maxLength":"",
                   "minLength":"",
                   "required":false
                },
                "persistent":true,
                "unique":false,
                "protected":false,
                "defaultValue":"",
                "multiple":false,
                "suffix":"",
                "prefix":"",
                "placeholder":"",
                "key":"make",
                "label":"Make",
                "inputMask":"",
                "inputType":"text",
                "tableView":true,
                "input":true
             },
             {  
                "hideLabel":true,
                "type":"textfield",
                "conditional":{  
                   "eq":"",
                   "when":null,
                   "show":""
                },
                "validate":{  
                   "customPrivate":false,
                   "custom":"",
                   "pattern":"",
                   "maxLength":"",
                   "minLength":"",
                   "required":false
                },
                "persistent":true,
                "unique":false,
                "protected":false,
                "defaultValue":"",
                "multiple":false,
                "suffix":"",
                "prefix":"",
                "placeholder":"",
                "key":"model",
                "label":"Model",
                "inputMask":"",
                "inputType":"text",
                "tableView":true,
                "input":true
             },
             {  
                "hideLabel":true,
                "type":"textfield",
                "conditional":{  
                   "eq":"",
                   "when":null,
                   "show":""
                },
                "validate":{  
                   "customPrivate":false,
                   "custom":"",
                   "pattern":"",
                   "maxLength":"",
                   "minLength":"",
                   "required":false
                },
                "persistent":true,
                "unique":false,
                "protected":false,
                "defaultValue":"",
                "multiple":false,
                "suffix":"",
                "prefix":"",
                "placeholder":"",
                "key":"year",
                "label":"Year",
                "inputMask":"",
                "inputType":"text",
                "tableView":true,
                "input":true
             }
          ],
          "tree":true,
          "input":true
       },
       {  
          "type":"button",
          "theme":"primary",
          "disableOnInvalid":true,
          "action":"submit",
          "block":false,
          "rightIcon":"",
          "leftIcon":"",
          "size":"md",
          "key":"submit",
          "tableView":false,
          "label":"Submit",
          "input":true
       }
    ],
    "created":"2016-07-27T01:57:52.976Z",
    "revisions":"",
    "_vid":0,
    "_id":"57981520ff9b236800b09b31",
    "machineName":"pjmfogrfqptslvi:testForm",
    "modified":"2016-08-09T02:10:03.990Z",
    "title":"Test Form",
    "display":"form",
    "name":"testForm",
    "path":"test",
    "project":"579814a4ff9b236800b09b22"
 };
*/

