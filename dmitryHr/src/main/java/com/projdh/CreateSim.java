package testPack;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class CreateSim {
	public static void main(String[] args)
    {
       PrintWriter zzz = null;
       String imsi = "8110000000000000";
       String icc = "8110000000000000000";
       String ozer = "2222 938 987 111 111 BIG 111 M   98770001 11111111  77731991";
       Long aa = Long.valueOf(imsi);
       Long bb = Long.valueOf(icc);
       long a = 0;
       long b = 0;
       
        try
        {
            zzz = new PrintWriter(new FileOutputStream("c:\\Users\\Dmitry\\Desktop\\many sim4 sv.txt"));
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Ошибка открытия файла many sim dv.txt");
            System.exit(0);
        }
        for (int i=1; i<30000; i++){
        	a = aa + i;
        	b = bb + i;
        	zzz.print(a + " ");
        	zzz.print(b + "F " + ozer);
        	zzz.println();
        }
        zzz.close();
        
        System.out.println("Программа завершена");
    }
}
