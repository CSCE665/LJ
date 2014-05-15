/* Author: Lijun Xie Date:03/30/2014
 * Topic: Leetcode Reverse words in a String
 */
import java.util.Arrays;
import java.util.Scanner;

public class ReverseWords {
	public static void main(String[] args){
		System.out.println("Please input the string you want to reverse: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		char[] ch = name.toCharArray();
		char[] ch2 = new char[ch.length];
		char[] ch3 = new char[ch.length];
		boolean[] flag = new boolean[ch.length+1];
		flag[ch.length]=true;
		int temp = 0;
		int counter = 0;
		
		ReverseWholeString(ch, ch2, 0, ch.length);
		Printout(ch2);
		CheckSpace(ch2,flag);
		
		for(int i=0; i<ch.length;i++){
			//System.out.println(flag[i]);
			if(flag[i]){
				//System.out.println("i:"+i);
				temp = i;
				ReverseWholeString(ch2,ch3, counter,i);
				ch3[i]=ch2[i];
				//System.out.println("ch2[i]: "+ch2[i]);
				counter = temp + 1;
				}
			}
		//System.out.println(counter);
		ReverseWholeString(ch2,ch3,counter,ch.length);
		Printout(ch3);
		
	}
	
	public static void ReverseWholeString(char[] ch, char[] ch2, int start, int end){
		int sum = start + end;
		for(int i=start;i<end;i++){
			ch2[sum-1-i]=ch[i];
		}
	}
	
	public static void CheckSpace(char[] ch, boolean[] flag){
		for(int i=0;i<ch.length;i++){
			if(ch[i]==' '){
				flag[i]=true;
				//System.out.println("flag i is: "+i);
			}else
				flag[i]=false;		
		}
	}
	
	public static void Printout(char[] ch){
		for(int i=0;i<ch.length;i++){
			System.out.print(ch[i]);
		}
		System.out.println("");
	}
}
