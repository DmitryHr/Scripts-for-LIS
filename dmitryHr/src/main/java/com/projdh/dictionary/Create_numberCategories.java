package com.projdh.dictionary;


import org.json.simple.JSONObject;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

import org.json.simple.JSONValue;

import com.projdh.nameElements.NameForElements;

public class Create_numberCategories {
	
	public static void main (String [] args) { 
		Map resultJson = new LinkedHashMap();
		NameForElements nmEpq = new NameForElements();
		
		for (int i =1; i<100; i++){
			resultJson.put("macroRegionId",new Integer(800));
			resultJson.put("name", "dv_phoneNumberStates" + i);
			
						
			String jsonText = JSONValue.toJSONString(resultJson);
			System.out.print("curl --header \"authToken: $TOKEN\" --header \"Content-Type: application/json\" -d \'");
			System.out.print(jsonText);
			System.out.print("' http://srv2-gf-lisdv01.net.billing.ru/OAPI/v1/lis/dictionaries/logicalResources/phoneNumberStates");
			
			
			
			System.out.println();
			
			
			
		}
	}
}
