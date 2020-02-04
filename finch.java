import java.util.Scanner;

import edu.cmu.ri.createlab.terk.robot.finch.Finch;

public class finch {
	public static void main(String args[])
	{ 
		String number; 
		int n;
		int m;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter a hexadecimal number:");
		number = in.nextLine();
		
		hexToDecimal hex = new hexToDecimal();
		m = hex.hexToDecimal(number); 

		while (m < 144){
		   System.out.println("Error: Please enter a value above 90.");
		   System.out.println("Please enter a hexadecimal number:");
		   number = in.nextLine();
		   m = hex.hexToDecimal(number);
		 while (m > 255){
			 System.out.println("Error: Please enter a value below FF.");
			 System.out.println("Please enter a hexadecimal number:");
			 number = in.nextLine();
			 m = hex.hexToDecimal(number);}
		}
		
		while (m > 255){
			 System.out.println("Error: Please enter a value below FF.");
			 System.out.println("Please enter a hexadecimal number:");
			 number = in.nextLine();
			 m = hex.hexToDecimal(number);
		while (m < 144){
			   System.out.println("Error: Please enter a value above 90.");
			   System.out.println("Please enter a hexadecimal number:");
			   number = in.nextLine();
			   m = hex.hexToDecimal(number);}}
		
		
		int binary;
		int decimal;
		DecimalToBinary dec = new DecimalToBinary();
		decimal = dec.DecimalToBinary(m);
		
		String d = decimal + "";
		myStringToInteger bin = new myStringToInteger();
		String bini = d;
		
		int r = m % 100;
		if (r < 40){
			r = r + 30;
		}
		int red, green, blue;
		red = 255;
		green = 0;
		blue = 0;
		Finch myfinch = new Finch();
		
		for (int i = 0; i < bini.length(); i++) {
		     char Char = bini.charAt(i);
		     String k = Char + "";
		     binary = bin.myStringToInteger(k);
			
		     if (binary == 1){
		 			myfinch.setLED(red, green, blue);
		 			//myfinch.playClip();
					myfinch.setWheelVelocities(r, r, 6000);
				} 
				
				if (binary == 0){
					myfinch.setLED(red, green, blue);
					//myfinch.playTone(100, 10, 5000);
					myfinch.setWheelVelocities(-r, -r, 5000);
				}
				
		}
		myfinch.quit();	
	}
}