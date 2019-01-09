package com.oopsconcept;
import java.util.Scanner;

public class VEHICLE_PRGM 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		vehicle v1 = new TwoWheeler();
		vehicle v = null;
		do	
		{
			System.out.println("1.TwoWheeler start 2.ThreeWheeler start  3.FourWheeler start 4.TwoWheeler stop 5.ThreeWheeler stop 6.FourWheeler stop 7. All vehicle stopped");
			switch(s.nextInt())
			{
				case 1: v = new  TwoWheeler();
						v.start();	break;
				
				case 2: v = new ThreeWheeler();
						v.start();	break;
		
				case 3: v = new FourWheeler();
						v.start();	break;
				
				case 4: TwoWheeler two = new  TwoWheeler();
						two.stop();	break;
		
				case 5: ThreeWheeler three = new ThreeWheeler();
						three.stop();	break;

				case 6: FourWheeler four = new FourWheeler();
						four.stop();	break;
				
				default: v1.stop1();	
			}
			System.out.println("Do u want to exit? 1.Continue 0.Exit");
		
		}	while(s.nextInt()==1);
		
		s.close();
	}
}