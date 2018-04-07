package com.cruise.forms.creator;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Components {
     Conditional conditional = new Conditional();
     Validate validate  = new Validate();
     boolean persistent = true;
     boolean unique = false;
     boolean Protected = false;
     String defaultValue = "";
     boolean multiple = false;
     String suffix = "";
     String prefix = "";
     String placeholder = "PlaceHolder Value";
     String key = "KeyValue";
     String label = "Field Label";
     String inputMask = "";
     String inputType = "text";
     boolean tableView = true;
     boolean input = true;
     String type;
     boolean isNew = false;
     boolean lockKey = false;
     ArrayList<Columns> columns = new ArrayList<Columns>();
     boolean hideLabel = false;
     boolean tree = true;
     String theme;
     boolean disableOnInvalid = false;
     String action;
     ArrayList<Components> components = new ArrayList<Components>();;
     boolean block = false;
     String rightIcon="";
     String leftIcon="";
     String size="md";


	public boolean isBlock() {
		return block;
	}
	public void setBlock(boolean block) {
		this.block = block;
	}
	public String getRightIcon() {
		return rightIcon;
	}
	public void setRightIcon(String rightIcon) {
		this.rightIcon = rightIcon;
	}
	public String getLeftIcon() {
		return leftIcon;
	}
	public void setLeftIcon(String leftIcon) {
		this.leftIcon = leftIcon;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public boolean isDisableOnInvalid() {
		return disableOnInvalid;
	}
	public void setDisableOnInvalid(boolean disableOnInvalid) {
		this.disableOnInvalid = disableOnInvalid;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public boolean isTree() {
		return tree;
	}
	public void setTree(boolean tree) {
		this.tree = tree;
	}
	public ArrayList<Components> getComponents() {
		return components;
	}
	public void setComponents(ArrayList<Components> components) {
		this.components = components;
	}
	public boolean isHideLabel() {
		return hideLabel;
	}
	public void setHideLabel(boolean hideLabel) {
		this.hideLabel = hideLabel;
	}
	public boolean isLockKey() {
		return lockKey;
	}
	public void setLockKey(boolean lockKey) {
		this.lockKey = lockKey;
	}
	public Conditional getConditional() {
		return conditional;
	}
	public void setConditional(Conditional conditional) {
		this.conditional = conditional;
	}
	public Validate getValidate() {
		return validate;
	}
	public void setValidate(Validate validate) {
		this.validate = validate;
	}
	public boolean isPersistent() {
		return persistent;
	}
	public void setPersistent(boolean persistent) {
		this.persistent = persistent;
	}
	public boolean isUnique() {
		return unique;
	}
	public void setUnique(boolean unique) {
		this.unique = unique;
	}
	public boolean isProtected() {
		return Protected;
	}
	public void setProtected(boolean protected1) {
		Protected = protected1;
	}
	public String getDefaultValue() {
		return defaultValue;
	}
	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}
	public boolean isMultiple() {
		return multiple;
	}
	public void setMultiple(boolean multiple) {
		this.multiple = multiple;
	}
	public String getSuffix() {
		return suffix;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	public String getPrefix() {
		return prefix;
	}
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	public String getPlaceholder() {
		return placeholder;
	}
	public void setPlaceholder(String placeholder) {
		this.placeholder = placeholder;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getInputMask() {
		return inputMask;
	}
	public void setInputMask(String inputMask) {
		this.inputMask = inputMask;
	}
	public String getInputType() {
		return inputType;
	}
	public void setInputType(String inputType) {
		this.inputType = inputType;
	}
	 
	public boolean isTableView() {
		return tableView;
	}
	public void setTableView(boolean tableView) {
		this.tableView = tableView;
	}
	public boolean isInput() {
		return input;
	}
	public void setInput(boolean input) {
		this.input = input;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@JsonProperty(value="isNew") 
	public boolean isNew() {
		return isNew;
	}
	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}
	public ArrayList<Columns> getColumns() {
		return columns;
	}
	public void setColumns(ArrayList<Columns> columns) {
		this.columns = columns;
	}
     
}
/**
{  
    "type":"form",
    "tags":[  

    ],
    "access":[  
       {  
          "roles":[  
             "579814a4ff9b236800b09b23",
             "579814a4ff9b236800b09b24",
             "579814a5ff9b236800b09b25",
             "579f879d5b7a477b0026f821"
          ],
          "type":"read_all"
       }
    ],
    "submissionAccess":[  

    ],
    "owner":"553dbfc08d22d5cb1a7024f2",
    "components":[  
       {  
          "conditional":{  
             "eq":"",
             "when":null,
             "show":""
          },
          "type":"columns",
          "columns":[  
             {  
                "components":[  
                   {  
                      "isNew":false,
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

