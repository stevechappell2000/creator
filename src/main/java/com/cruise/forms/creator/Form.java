package com.cruise.forms.creator;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;


public class Form {
	String created;
	String revisions;
	String _vid = "0";
	String _id = UUID.randomUUID().toString();
	String machineName = "machine name";
	String modified;
	String title = "default title";
	String display = "form";
	String name = "Name";
	String path = "Path";
	String project = "Project";
	String type = "form";
	String owner = "Owner";
	ArrayList<Access> access = new ArrayList<Access>();
	HashMap<String,String> tags = new HashMap<String,String>();
	HashMap<String,String> submissionAccess = new HashMap<String,String>();
	ArrayList<Components> components = new ArrayList<Components>();
	
	public String currentDataAsString() {
		LocalDateTime now = LocalDateTime.now();
		String isoFormat = DateTimeFormatter.ISO_INSTANT.format(now.toInstant(ZoneOffset.UTC));
		//System.out.println(isoFormat);
		return isoFormat;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public String getRevisions() {
		return revisions;
	}
	public void setRevisions(String revisions) {
		this.revisions = revisions;
	}
	public String get_vid() {
		return _vid;
	}
	public void set_vid(String _vid) {
		this._vid = _vid;
	}
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getMachineName() {
		return machineName;
	}
	public void setMachineName(String machineName) {
		this.machineName = machineName;
	}
	public String getModified() {
		return modified;
	}
	public void setModified(String modified) {
		this.modified = modified;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDisplay() {
		return display;
	}
	public void setDisplay(String display) {
		this.display = display;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public ArrayList<Access> getAccess() {
		return access;
	}
	public void setAccess(ArrayList<Access> access) {
		this.access = access;
	}
	public HashMap<String, String> getTags() {
		return tags;
	}
	public void setTags(HashMap<String, String> tags) {
		this.tags = tags;
	}
	public HashMap<String, String> getSubmissionAccess() {
		return submissionAccess;
	}
	public void setSubmissionAccess(HashMap<String, String> submissionAccess) {
		this.submissionAccess = submissionAccess;
	}
	public ArrayList<Components> getComponents() {
		return components;
	}
	public void setComponents(ArrayList<Components> components) {
		this.components = components;
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

