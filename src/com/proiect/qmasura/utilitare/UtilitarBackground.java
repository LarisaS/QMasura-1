package com.proiect.qmasura.utilitare;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

import com.proiect.qmasura.R;



public class UtilitarBackground {

	private static int[] desert={R.drawable.desert1,R.drawable.desert2,R.drawable.desert3};
	private static int[] craciun;
	private static int[] paste;
	private static int[] mic_dejun;
	private static int[] pranz;
	private static int[] cina;
	private static int[] vegetarian;
	private static int[] traditional;
	private static int happy_new_year;
	
	
	public static int imagineHomePage()
	{
		int bg= R.drawable.default_bg;
		/*
		 * Idee: putem folosi o imagine data de un url -  daca are conexiune la internet
		 * Alegerea imaginii trebuie facuta in acest caz intr-o functie de php
		 */
		
		Calendar c = Calendar.getInstance();
		SimpleDateFormat sdf_month = new SimpleDateFormat("MM");
		SimpleDateFormat sdf_year = new SimpleDateFormat("yyyy");
		SimpleDateFormat sdf_day= new SimpleDateFormat("dd");
		SimpleDateFormat sdf_hour= new SimpleDateFormat("HH");
		String luna = sdf_month.format(c.getTime());
		String an= sdf_year.format(c.getTime());
		String zi= sdf_day.format(c.getTime());
		String ora= sdf_hour.format(c.getTime());
		
		int[] sarbatoare = verificaSarbatoare(zi, luna,an);
		
		bg= pozaRandom(desert);
		
		return bg;
		
	}


	private static int[] verificaSarbatoare(String zi, String luna, String an) {
		// TODO Auto-generated method stub
		int[] poze=null;
		try{
		int zi_i=Integer.parseInt(zi);
		int luna_i=Integer.parseInt(luna);
		
		switch(luna_i)
		{
		case 12:
				{
					if(zi_i>1 && zi_i<30)
						poze=craciun;
					break;
				}
		
		}
		
		return poze;
		}
		catch(Exception e)
		{
			return null;
		}
		
	}
	
	private static int pozaRandom(int[] sursa)
	{
		int max= sursa.length-1;
		Random rand = new Random();

		int  n = rand.nextInt(max);
	
		return sursa[n];
		
	}
	
}
