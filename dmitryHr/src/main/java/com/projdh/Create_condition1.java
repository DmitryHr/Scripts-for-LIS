package com.projdh;


import org.json.simple.JSONObject;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

import org.json.simple.JSONValue;

import com.projdh.nameElements.NameForElements;

public class Create_condition1 {
	
	public static void main (String [] args) { 
		Map resultJson = new LinkedHashMap();
		NameForElements nmEpq = new NameForElements();
		String num = "12";
		int rand_min = 1000;
		int rand_max = 9000;
		
		for (int i =1; i<300; i++){
			resultJson.put("macroRegionId",new Integer(800));
			resultJson.put("name", "ur_condition" + i + new Random().nextInt(10000));
			resultJson.put("isActive", new Random().nextBoolean());
			resultJson.put("conditionString", ":1=1 and :2=2");
			resultJson.put("testMSISDN", num + rand_min + (int) (Math.random() * (rand_max - rand_min)));
			
			String jsonText = JSONValue.toJSONString(resultJson);
			System.out.print("curl --header \"authToken: $TOKEN\" --header \"Content-Type: application/json\" -d \'");
			System.out.print(jsonText);
			System.out.print("' http://srv2-gf-lisdv01.net.billing.ru/OAPI/v1/lis/logicalResources/phoneNumberClassTemplates/2158800/conditions");
			
			
			
			System.out.println();
			
			
			
		}
	}
}
