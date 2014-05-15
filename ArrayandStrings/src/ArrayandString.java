/* Author: Lijun Xie Date:03/24/2014
 * Topic: Cracking the coding interview 1.1
 */

import java.util.Scanner;

public class ArrayandString {
	public static void main(String[] args){
		System.out.println("Please input the string you want to check: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int len = name.length();
		
		outerloop:
		for(int i=0;i<len-1;i++){
			for(int j=i+1;j<len;j++){
			if(name.charAt(i)==name.charAt(j)){
				System.out.println("Duplicate Character Found: "+name.charAt(i));
				break outerloop;
			}	
		}
		
		}
	}
}
