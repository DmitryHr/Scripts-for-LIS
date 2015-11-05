package testPack;

 import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
 
public class WriteDataInFile{
	public static void main(String[] args)
     {
        PrintWriter zzz = null;
        String srting1 = "curl --header \"authToken: $TOKEN\" --header \"Content-Type: application/json\" -d '{";
        String string2 = "\"IMSI\" : ";
        String stringACC = "\"ACC\" : \",";
        String string3 = "\"BBB\" : \"0123456789\", \n \"ESN\" : \"0123456789\", \n \"activationKey\" : \"0123456789\", \n \"SIZE\" : \"BIG\", \n \"MEMORY\" : \"10\", \n \"UNIT\" : \"MB\", \n \"PIN1\" : \"111\", \n \"PIN2\" : \"222\", \n \"PUK1\" : \"0001\", \n \"PUK2\" : \"0002\", \n \"macroRegionId\" : 800\";";
        String string4 = "}' http://srv2-gf-lisdv01.net.billing.ru/OAPI/v1/lis/logicalResources/SIMCards";
        
        int a = 0;
        int b = 0;
        int imsi = 123456;
        int acc = 35463728;
        
         try
         {
             zzz = new PrintWriter(new FileOutputStream("c:\\Users\\Dmitry\\Desktop\\doc.txt"));
         }
         catch(FileNotFoundException e)
         {
             System.out.println("Ошибка открытия файла my_test_file.txt");
             System.exit(0);
         }
         for (int i=1; i<1000; i++){
        	 a = imsi + i;
        	 b = acc + i;
        	 zzz.println(srting1);
        	 zzz.println(string2 + a);
        	 zzz.println(stringACC + b);
        	 zzz.println(string3);
        	 zzz.println(string4);
        	 zzz.println();
         }
         zzz.close();
         
         System.out.println("Программа завершена");
     }
 }