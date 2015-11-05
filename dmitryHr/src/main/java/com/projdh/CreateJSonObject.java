package testPack;


import org.json.simple.JSONObject;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

import org.json.simple.JSONValue;

public class CreateJSonObject {
	
	public static void main (String [] args) { 
		Map resultJson = new LinkedHashMap();
		String [] commutators = new String[]{
			"DV_Commutator",
			"DV_Test Commutator",
			"DV_UPVEL",
			"Dalnevostochny Commutator",
			"DV_PROFINET IRT",
			"DV_D-LINK",
			"Cisco"
		};
			
		for (int i =1; i<200; i++){
			resultJson.put("macroRegionId",new Integer(800));
			resultJson.put("equipmentStateId",new Integer(new Random().nextInt(3)+1));
			resultJson.put("equipmentTypeId",new Integer(1));
			resultJson.put("standardId",new Integer(new Random().nextInt(3)+1));
			resultJson.put("zoneId",new Integer(new Random().nextInt(3)+1));
			resultJson.put("regionId",new Integer(new Random().nextInt(3)+1));
			resultJson.put("name",commutators[new Random().nextInt(commutators.length)]+ " " +i);
			String jsonText = JSONValue.toJSONString(resultJson);
			System.out.print("curl --header \"authToken: $TOKEN\" --header \"Content-Type: application/json\" -d \'");
			System.out.print(jsonText);
			System.out.print("' http://srv2-gf-lisdv01.net.billing.ru/OAPI/v1/lis/logicalResources/equipments");
			System.out.println();
			
			
		}
	}
}