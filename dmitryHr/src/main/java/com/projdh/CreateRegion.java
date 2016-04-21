package com.projdh;

 import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
 
public class CreateRegion{
	public static void main(String[] args)
     {
        PrintWriter zzz = null;
        String srting1 = "curl --header \"authToken: $TOKEN\" --header \"Content-Type: application/json\" -d '{";
        String zone = "\"zoneId\" : ";
        String name = "\"name\" : \"ur_region_ \",";
        String macroRegion = "\"macroRegionId\" : 600";
        String string4 = "}' http://srv2-gf-lisdv01.net.billing.ru/OAPI/v1/lis/logicalResources/SIMCards";
        
        int a = 0;
        int b = 0;
        int imsi = 600;
        int acc = 1;
        
         try
         {
             zzz = new PrintWriter(new FileOutputStream("c:\\Users\\Alcom\\Desktop\\doc.txt"));
         }
         catch(FileNotFoundException e)
         {
             System.out.println("error");
             System.exit(0);
         }
         for (int i=1; i<1000; i++){
        	 a = imsi + i;
        	 b = acc + i;
        	 zzz.println(srting1);
        	 zzz.println(zone + a);
        	 zzz.println(name + b);
        	 zzz.println(macroRegion);
        	 zzz.println(string4);
        	 zzz.println();
         }
         zzz.close();
         
         System.out.println("��������� ���������");
     }
 }