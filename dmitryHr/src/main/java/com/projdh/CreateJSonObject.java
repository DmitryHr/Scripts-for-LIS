package com.projdh;


import org.json.simple.JSONObject;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

import org.json.simple.JSONValue;

import com.projdh.nameElements.NameForElements;

public class CreateJSonObject {
	
	public static void main (String [] args) { 
		Map resultJson = new LinkedHashMap();
		NameForElements nmEpq = new NameForElements();
		
		for (int i =1; i<nmEpq.nameForEpiquements().length; i++){
			resultJson.put("macroRegionId",new Integer(800));
			resultJson.put("equipmentStateId",new Integer(new Random().nextInt(3)+1));
			resultJson.put("equipmentTypeId",new Integer(1));
			resultJson.put("standardId",new Integer(new Random().nextInt(3)+1));
			resultJson.put("zoneId",new Integer(new Random().nextInt(3)+1));
			resultJson.put("regionId",new Integer(new Random().nextInt(3)+1));
						
			resultJson.put("name",nmEpq.nameForEpiquements()[new Random().nextInt(nmEpq.nameForEpiquements().length)]);
			String jsonText = JSONValue.toJSONString(resultJson);
			System.out.print("curl --header \"authToken: $TOKEN\" --header \"Content-Type: application/json\" -d \'");
			System.out.print(jsonText);
			System.out.print("' http://srv2-gf-lisdv01.net.billing.ru/OAPI/v1/lis/logicalResources/equipments");
			
			
			
			System.out.println();
			
			
			
		}
	}
}
