package resources;

import java.util.ArrayList;
import java.util.List;

import pojo.AddPlaceSerialize;
import pojo.Location;

public class TestDataBuild {

	public AddPlaceSerialize addPlacePayLoad(String name, String language, String address){
		AddPlaceSerialize addPlaceData = new AddPlaceSerialize();
		addPlaceData.setAccuracy(50);
		addPlaceData.setName(name);
		addPlaceData.setPhone_number("(+91) 983 893 3937");
		addPlaceData.setAddress(address);
		addPlaceData.setWebsite("http://google.com");
		addPlaceData.setLanguage(language);
		
		List<String> myList = new ArrayList<String>();
		myList.add("shoe park");
		myList.add("shop");
		addPlaceData.setTypes(myList);
		
		Location loc = new Location();
		loc.setLat(-38.383494);
		loc.setLng(33.427362);
		addPlaceData.setLocation(loc);
		return addPlaceData;
	}
	
	public String deletePayload(String placeId) {
		
		return "{\r\n"+ "\"place_id\": \""+placeId+"\"\r\n"+ "}";
	}
	
}
