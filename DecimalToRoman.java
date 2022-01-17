/*Write a program that converts a decimal number to a roman number.


Eg: 5 -> V; 12 -> XII; 60 -> LX


Hint: The symbols are I, V, X, L, C, D, and M, standing respectively for 1, 5, 10, 50, 100, 500, and 1,000. Decimal is a term that describes the base-10 number system, probably the most commonly used number system.
*/
import java.io.*;
public class DecimalToRoman
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num;
		String str="";
		System.out.print("Enter a Number : ");
		num=Integer.parseInt(br.readLine()); //accepting decimal number

		/*Arrays storing the unique symbols of Roman Number System
		   and also the corresponding decimal equivalents in the second array*/
		String roman[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
		int decimal[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};

		if(num>0 && num<4000) { //checking whether the number entered is within the range [1-3999]
			for (int i=0; i<13; i++) {// i<13 because the total unique numbers stored in the above array=13
				/*The while loop is for printing repeated digits like XXX for 30 etc
					   and is also calculating the equivalent Roman number by adding the corresponding
					   Roman Digits from the Array to the String str*/
				while (num >= decimal[i]) { //123 >= 100
					
					num = num-decimal[i]; //123-100=23
					str = str+roman[i]; //CXXIII
				}
			}
			System.out.println("Roman Equivalent = "+str); //Printing the Roman equivalent
		}

		/*Displaying an error message if the number entered is out of range*/
		else
			System.out.println("You entered a number out of Range. Please enter a number in the range [1-3999]");
	}
}