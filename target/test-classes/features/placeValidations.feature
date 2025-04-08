Feature: Validating Place API's
@AddPlace @Regression
Scenario Outline: Verify if place is being successfully added using AddPlaceAPI
    Given Add place Payload with "<name>" "<language>" "<address>"
    When user calls "AddPlaceAPI" with "POST" http request
    Then the API Call is success with status code 200
    And "status" in response body is "OK"
    And "scope" in response body is "APP"
    And verify place_Id created maps to "<name>" using "GetPlaceAPI"
    
Examples:   
      |name    |language |address        |
      |lavanya |English  |testing address|
  #   |turpati |English  |address testing|
  
@DeletePlace @Regression
Scenario: verify if delete place api is working
     Given Delete place payload
     When user calls "DeletePlaceAPI" with "POST" http request
     Then the API Call is success with status code 200
     And "status" in response body is "OK"
     
     

      