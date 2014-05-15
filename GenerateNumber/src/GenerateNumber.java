import java.util.Scanner;
import java.math.*;

public class GenerateNumber {
	public static void main (String[] args){
		System.out.println("Please enter the number of digits: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int base = 0;
		printNumber(n,base);
		
	}
	public static void printNumber(int n, int base){
		int temp;
		int DigitLastUsed = (base/((int)Math.pow(10, n)))%10;
		for(int i=DigitLastUsed+1;i<10;i++){
			temp = base + i*((int)Math.pow(10, n-1));
			if(n==1) 
				System.out.println(temp);
			else 
				printNumber(n-1,temp);
		}
	}
}
