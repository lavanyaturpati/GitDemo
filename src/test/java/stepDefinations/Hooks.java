package stepDefinations;

import java.io.IOException;

import io.cucumber.java.Before;

public class Hooks {

	@Before("@DeletePlace")
	public void beforeScenario() throws IOException {
		
		stepDefination m = new stepDefination();
		if(stepDefination.place_id ==null) {
		
		m.add_place_payload_with("Lav", "French", "Asia");
		m.user_calls_with_http_request("AddPlaceAPI", "POST");
		m.verify_place_id_created_maps_to_using("Lav", "GetPlaceAPI");
		}
	}
}
