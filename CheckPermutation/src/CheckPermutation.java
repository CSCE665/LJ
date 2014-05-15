/* Author: Lijun Xie Date:03/24/2014
 * Topic: Cracking the coding interview 1.3
 */

import java.util.Scanner;
import java.util.Arrays;

public class CheckPermutation {
	public static void main(String[] args){
		System.out.println("Please enter first string s1 that you want to check: ");
		Scanner sc1 = new Scanner(System.in);
		String s1 = sc1.nextLine();
		System.out.println("Please enter second string s2 that you want to check: ");
		Scanner sc2 = new Scanner(System.in);
		String s2 = sc2.nextLine();
		
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		
		checkStrings(ch1,ch2);
	}
	
	public static boolean checkStrings(char[] ch1, char[] ch2){
		if(ch1.length==ch2.length){
			    Arrays.sort(ch1);
				Arrays.sort(ch2);
				System.out.println(ch1);
				System.out.println(ch2);
				String s1 = new String(ch1);
				String s2 = new String(ch2);
				if(s1.equals(s2))
					System.out.println("Permulation exists!");
					return s1.equals(s2);
				}else
					System.out.println("Non exist!");
					return false;
		}
}
