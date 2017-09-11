package javabasics;

import javax.print.attribute.standard.PrinterMessageFromOperator;

public class PrintHelloWorldWithouSemiColon {

	public static void main(String[] args) {
		if(System.out.printf("Shishu Raj Pandey") != null)
		{
			
		}

		//Here output will be 10.0 even though int 10 is true, It will always gives more advanced data type
		double x=true?10:5.0;
		System.out.println(x);
	
		
		int a=1;
		int b=2;
		int c=3;
	//	maximum of three numbers
		if(a>b && a>c)
			System.out.println(a);
		else
			if(b>c)
				System.out.println(b);
			else
				System.out.println(c);
	}

}
