/* Author: Lijun Xie Date:03/24/2014
 * Topic: Cracking the coding interview 1.4
 */

import java.util.Scanner;

public class CheckSpace {
	public static void main(String[] args){
		System.out.println("Please enter a string: ");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		char[] ch1 = s1.toCharArray();
		int count=0;
			for(int i=0; i<ch1.length;i++){
				if((int)ch1[i]==32){
					count++;
				}
			}
			int newLength = ch1.length + 2*count;
			char[] ch2 = new char[newLength];
			for(int i=ch1.length-1;i>=0;i--){
				if((int)ch1[i]==32){
					ch2[newLength-1]='0';
					ch2[newLength-2]='2';
					ch2[newLength-3]='%';	
					newLength = newLength-3;
				}
				else{
					ch2[newLength-1]=ch1[i];
					newLength = newLength-1;
					}
			}
			System.out.println(new String(ch2));
		}
}
