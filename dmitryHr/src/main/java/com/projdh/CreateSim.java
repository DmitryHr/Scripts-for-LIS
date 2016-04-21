package com.projdh;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.io.File;
import java.io.IOException;

public class CreateSim {
	public static void main(String[] args) throws IOException
    {
		Calendar dating = Calendar.getInstance();
        SimpleDateFormat formating = new SimpleDateFormat("YYYY_MM_dd_HH_mm_ss_SSS");
        String time = formating.format(dating.getTime()).toString();

		File newFile = new File("C:\\Users\\Alcom\\Desktop\\UR_sim-"+time+".txt");
		if (newFile.createNewFile()) {
			System.out.println("Новый файл создан");
		} else {
			System.out.println("Файл уже существует");
		}
		
		
	   PrintWriter zzz = null;
       String imsi = "611100000001300";
       String icc = "6111000000000001300";
       String key;
       //int acc, pin1, pin2, puc1, puc2, size, mem, edinitsa, bbb, ens, spc;
       //String ozer = "222 938 987 111 111 BIG 111 M 987 111 777";
       Long aa = Long.valueOf(imsi);
       Long bb = Long.valueOf(icc);
       int rand_min =  100;
       int rand_max = 999;
       long a = 0;
       long b = 0;
       
        try
        {
            zzz = new PrintWriter(new FileOutputStream(newFile));
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Ошибка записи файла");
            System.exit(0);
        }
        for (int i=1; i<50; i++){
        	a = aa + i;
        	b = bb + i;
        	zzz.print(a + " ");
        	zzz.print(b + "F ");
        	for (int ii=1; ii<6; ii++){
        		zzz.print(rand_min + (int) (Math.random() * (rand_max - rand_min)) + " ");
        	}
        	zzz.print("BIG ");
        	zzz.print(rand_min + (int) (Math.random() * (rand_max - rand_min)) + " ");
        	zzz.print("M ");
        	for (int ii=1; ii<4; ii++){
        		zzz.print(rand_min + (int) (Math.random() * (rand_max - rand_min)) + " ");
        	}
        	
        	zzz.println();
        	
        }
        zzz.close();
        
        System.out.println("Операция прошла успешно");
    }
}
