/*A customer in the Personalised Gifts Store is awarded a prize when their bill number is a 3-digit number and all the 3 digits are in sorted order. 
Examples: 379, 256, 973, 652, 225, 522 .... Help Nickson in identifying the prize winners.

Input Format:
Input consists of a number that corresponds to the bill number.

Output Format:
The output consists of a string that is either 'yes' or 'no'. The output is yes when the customer receives the prize and is no otherwise.

Sample Input 1:
565
Sample Output 1:
no

Sample Input 2:
620
Sample Output 2:
yes

Sample Input 3:
66
Sample Output 3:
no*/
import java.util.Scanner;
public class PersonalizedGiftStore {
	
	public static boolean isSorted(int billNumber) {
		int a,b,c;
		int billNo = billNumber;
		a = billNo%10;
		billNo =billNo/10;
		b = billNo%10;
		c = billNo/10;
		
		if(billNumber>99 && billNumber<1000){
			if((a>b && b>c) || (a<b && b<c)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	public static void main (String[] args){	
		Scanner ip = new Scanner(System.in);
		char op;
		
		do{
			System.out.println("Enter the bill number");
			
			int billNumber = ip.nextInt();
			
			if(isSorted(billNumber)){
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			
			System.out.println("Do you want to continue? Yes - Y or No - N");
			op = ip.next().charAt(0);
		}while(op =='Y'||op=='y');
		
		System.out.println("Thanks for using it!");
	}
}