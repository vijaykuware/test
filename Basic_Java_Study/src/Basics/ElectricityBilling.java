package Basics;

import java.util.Scanner;

public class ElectricityBilling
	{

		public static void main(String[] args) 
		{
			int a,b,c;
			double e,f,g,h;//a=> previous reading & b=> current reading 
			double d=0;
			try (Scanner s = new Scanner(System.in)) {
				System.out.println("Enter Previous reading ");
				a=s.nextInt();
				System.out.println("Enter current reading ");
				b=s.nextInt();
			}
			c=b-a;   //unit used
			System.out.println("Bill Details"+"\n");
						if(c<0)
						{
							System.out.println("Improper Reading taken Or Meater is Faulty");
							d=0;
							c=0;
						}
						else if(c>=0 && c<=100)
						{
							d=c*3.77;
							System.out.println("Unit used: "+c+"\n"+"Ele. Charge(3.77 R/unit): Rs "+c*3.77D);
						}
						else if(c>100 && c<=200)
						{
							d=377+(c-100)*7.86;
							System.out.println("Unit used "+c+"\n"+"Charge for first 100 units (3.77 Rs/unit):Rs 377 ");
							System.out.println("Charges for next "+(c-100)+" units (7.86 Rs/unit): Rs"+(c-100)*7.86 );
						}
						else if(c>200 && c<=300)
						{
							d=1163+(c-200)*8.09;
							System.out.println("Unit used "+c+"\n"+"Charge for first 100 (3.77 Rs/unit):Rs 377 ");
							System.out.println("Charge for next 100 units (7.86 Rs/unit):Rs 786 ");
							System.out.println("Charges for remaining "+(c-200)+" units (8.09 Rs/unit): Rs"+(c-200)*8.09 );
						}
						else if(c>300 && c<=1000)
						{
							d=1972+(c-300)*11.25;
							System.out.println("Unit used "+c+"\n"+"Charge for first 100 (3.77 Rs/unit):Rs 377 ");
							System.out.println("Charge for next 100 units (7.86 Rs/unit):Rs 786 ");
							System.out.println("Charge for next 100 units (8.09 Rs/unit):Rs 809 ");
							System.out.println("Charges for remaining "+(c-300)+" units (11.25 Rs/unit): Rs"+(c-300)*11.25 );
						}
						else
						{
							d=9038+(c-1000)*12;
							System.out.println("Unit used "+c+"\n"+"Charge for first 100 (3.77 Rs/unit):Rs 377 ");
							System.out.println("Charge for next 100 units (7.86 Rs/unit):Rs 786 ");
							System.out.println("Charge for next 100 units (8.09 Rs/unit):Rs 809 ");
							System.out.println("Charge for next 700 units (11.25 Rs/unit):Rs 7875 ");
							
							System.out.println("Charges for remaining "+(c-1000)+" units (12 Rs/unit): Rs"+(c-1000)*12 );
						}

						 e=	1.06*c;			//transport charges
						 f=0.16*d;			//fuel comp charges
						 g=102+d+e+f;		//total bili
						 h=g+20;
						 System.out.println("--------------------------------------------------------");
						 System.out.println("\n\n"+"Ele charges Rs: "+d);
						 System.out.println("ET charges(Rs 1.06/unit) Rs: "+e);
						 System.out.println("FC charges(16% of EC) Rs: "+f);
						 System.out.println("--------------------------------------------------------");
						 System.out.println("Your electricity bill is Rs "+g);
						 System.out.println("\n\n"+"If you pay after due date"+"\n" +"Bill will be Rs "+h);
		     }
		}
