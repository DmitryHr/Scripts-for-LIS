package com.eqpicments;

import org.json.simple.JSONObject;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

import org.json.simple.JSONValue;

import com.projdh.nameElements.DataForSector;
import com.projdh.nameElements.NameForElements;

public class Create_Eqp {
	
	public static void main (String [] args) { 
		Map resultJson = new LinkedHashMap();
		NameForElements nmEpq = new NameForElements();
				
		for (int i =1; i<150; i++){
			resultJson.put("macroRegionId",new Integer(600));
			resultJson.put("equipmentStateId",new Integer(new Random().nextInt(3)));
			resultJson.put("equipmentTypeId",new Integer(new Random().nextInt(3)));
			resultJson.put("standardId",new Integer(new Random().nextInt(4)+600));
			resultJson.put("zoneId",new Integer(new Random().nextInt(99)+600));
			resultJson.put("regionId",new Integer(new Random().nextInt(99)+600));
			resultJson.put("sector", nmEpq.textForSector()[new Random().nextInt(nmEpq.textForSector().length)]);
			resultJson.put("endPoint", nmEpq.textForAdress()[new Random().nextInt(nmEpq.textForAdress().length)]);
			resultJson.put("regionMNP",new Integer(new Random().nextInt(99)));			
			
			resultJson.put("name","ur_"+nmEpq.nameForEpiquements()[new Random().nextInt(nmEpq.nameForEpiquements().length)]+"_"+ new Random().nextInt(1000));
			String jsonText = JSONValue.toJSONString(resultJson);
			System.out.print("curl --header \"authToken: $TOKEN\" --header \"Content-Type: application/json\" -d \'");
			System.out.print(jsonText);
			System.out.print("' http://srv2-gf-lisdv01.net.billing.ru/OAPI/v1/lis/logicalResources/equipments");
			
			
			
			System.out.println();
			
			
		}
	}
}

//"equipmentStateId":1-2
//"equipmentTypeId" :1-3
//"standardId":600, 602, 603
//"zoneId:627" - 699
//"regionId:627" -699