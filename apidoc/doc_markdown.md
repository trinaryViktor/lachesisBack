# LachesisBackendAPIs v1.0.0

Back end Restful API

- [patientFitbit_Required_body_Json_type](#patientfitbit_required_body_json_type)
	- [upload connect info](#upload-connect-info)
	
- [patientFitbit](#patientfitbit)
	- [delate connection informaiton](#delate-connection-informaiton)
	- [request patient fitbit connect informaiton](#request-patient-fitbit-connect-informaiton)
	- [update by connection](#update-by-connection)
	
- [patients_Required_body_Json_type](#patients_required_body_json_type)
	- [upload patients info](#upload-patients-info)
	
- [patients](#patients)
	- [delate patients informaiton](#delate-patients-informaiton)
	- [request patients informaiton](#request-patients-informaiton)
	- [update by patients id](#update-by-patients-id)
	


# patientFitbit_Required_body_Json_type

## upload connect info



	POST /uploadConnectById


# patientFitbit

## delate connection informaiton



	GET /delateConnectById={id}


### Parameters

| Name    | Type      | Description                          |
|---------|-----------|--------------------------------------|
| id			| id			|  <p>patients unique ID.</p>							|

## request patient fitbit connect informaiton



	GET /getConnectById={id}


### Parameters

| Name    | Type      | Description                          |
|---------|-----------|--------------------------------------|
| id			| id			|  <p>unique connection ID.</p>							|

## update by connection



	POST /updateConnect


# patients_Required_body_Json_type

## upload patients info



	POST /uploadPatientsByJSON


# patients

## delate patients informaiton



	GET /delateById={id}


### Parameters

| Name    | Type      | Description                          |
|---------|-----------|--------------------------------------|
| id			| id			|  <p>patients unique ID.</p>							|

## request patients informaiton



	GET /getbyid={id}


### Parameters

| Name    | Type      | Description                          |
|---------|-----------|--------------------------------------|
| id			| id			|  <p>patients unique ID.</p>							|

## update by patients id



	POST /updatePatientsByJSON



