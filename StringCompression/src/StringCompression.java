/* Author: Lijun Xie Date:03/24/2014
 * Topic: Cracking the coding interview 1.5
 */

import java.util.Scanner;

public class StringCompression {
	public static void main(String[] args){
		System.out.println("Please enter a string: ");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = s1 + '\0';
	
		char[] ch1 = s2.toCharArray();
		char[] ch2 = new char[2*ch1.length];
		int count = 1;
		int flag = 0;
		
		for(int i=0;i<ch1.length-1;i++){
			if(ch1[i]==ch1[i+1]){
				count++;
			}
			else{
				String str = Integer.toString(count);
				ch2[flag]=ch1[i];
				for(int j=0; j<str.length();j++){
					ch2[flag+j+1]=str.charAt(j);
				}
				flag=flag+1+str.length();
				count = 1;
			}	
		}
		
		System.out.println(flag);
		
		if(flag>=(ch1.length-1))
			System.out.println(new String(ch1));
		else System.out.println(new String(ch2));
	}
}

