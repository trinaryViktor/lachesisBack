define({ "api": [
  {
    "type": "Post",
    "url": "/uploadConnectById",
    "title": "upload connect info",
    "name": "uploadConnect",
    "group": "patientFitbit_Required_body_Json_type",
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "return",
            "description": "<p>toString type</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "error",
            "description": "<p>500</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "src/main/java/com/inf191/lachesis/Controller/PatientsFitbitController.java",
    "groupTitle": "patientFitbit_Required_body_Json_type"
  },
  {
    "type": "get",
    "url": "/delateConnectById={id}",
    "title": "delate connection informaiton",
    "name": "delatePatientById",
    "group": "patientFitbit",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "id",
            "optional": false,
            "field": "id",
            "description": "<p>patients unique ID.</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "integer",
            "description": ""
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "error",
            "description": "<p>500</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "src/main/java/com/inf191/lachesis/Controller/PatientsFitbitController.java",
    "groupTitle": "patientFitbit"
  },
  {
    "type": "get",
    "url": "/getConnectById={id}",
    "title": "request patient fitbit connect informaiton",
    "name": "getById",
    "group": "patientFitbit",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "id",
            "optional": false,
            "field": "id",
            "description": "<p>unique connection ID.</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "JSON",
            "description": "<p>Type information</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "error",
            "description": "<p>500</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "src/main/java/com/inf191/lachesis/Controller/PatientsFitbitController.java",
    "groupTitle": "patientFitbit"
  },
  {
    "type": "post",
    "url": "/updateConnect",
    "title": "update by connection",
    "name": "updateConnect",
    "group": "patientFitbit",
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "integer",
            "description": ""
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "error",
            "description": "<p>500</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "src/main/java/com/inf191/lachesis/Controller/PatientsFitbitController.java",
    "groupTitle": "patientFitbit"
  },
  {
    "type": "Post",
    "url": "/uploadPatientsByJSON",
    "title": "upload patients info",
    "name": "uploadPatients",
    "group": "patients_Required_body_Json_type",
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "return",
            "description": "<p>toString type</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "error",
            "description": "<p>500</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "src/main/java/com/inf191/lachesis/Controller/PatientsController.java",
    "groupTitle": "patients_Required_body_Json_type"
  },
  {
    "type": "get",
    "url": "/delateById={id}",
    "title": "delate patients informaiton",
    "name": "delatePatientById",
    "group": "patients",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "id",
            "optional": false,
            "field": "id",
            "description": "<p>patients unique ID.</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "integer",
            "description": ""
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "error",
            "description": "<p>500</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "src/main/java/com/inf191/lachesis/Controller/PatientsController.java",
    "groupTitle": "patients"
  },
  {
    "type": "get",
    "url": "/getbyid={id}",
    "title": "request patients informaiton",
    "name": "getPatients",
    "group": "patients",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "id",
            "optional": false,
            "field": "id",
            "description": "<p>patients unique ID.</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "JSON",
            "description": "<p>Type information</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "error",
            "description": "<p>500</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "src/main/java/com/inf191/lachesis/Controller/PatientsController.java",
    "groupTitle": "patients"
  },
  {
    "type": "post",
    "url": "/updatePatientsByJSON",
    "title": "update by patients id",
    "name": "updatePatietns",
    "group": "patients",
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "integer",
            "description": ""
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "error",
            "description": "<p>500</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "src/main/java/com/inf191/lachesis/Controller/PatientsController.java",
    "groupTitle": "patients"
  }
] });
