package com.wcs.java.basics.exercises.w3c.MinMax;

public class MinMax {

	public static void main (String [] args) {
		
		double ersterWert = Double.parseDouble(args[0]);
		double zweiterWert = Double.parseDouble(args[1]);
		double dritterWert = Double.parseDouble(args[2]);

		double temp = 0;
		
			if (ersterWert>zweiterWert) {
				temp = ersterWert;
				ersterWert=zweiterWert;
				zweiterWert=temp; 
			}
			if(zweiterWert>dritterWert) {
				temp=zweiterWert;
				zweiterWert=dritterWert;
				dritterWert= temp;
			}
			
		System.out.println("min: " + ersterWert + " max: " + dritterWert);
		
	}
	
}
