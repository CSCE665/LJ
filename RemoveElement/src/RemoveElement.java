/* Author: Lijun Xie Date:03/25/2014
 * Topic: Leetcode(25) Remove Element
 * For this code, it can be extended to other data type, such as character, float, etc.
 */

import java.util.Scanner;
import java.util.*;

public class RemoveElement {
	public static void main(String[] args){
		System.out.println("Please enter the value of the element that you want to remove.");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int[] arr = {4,5};
		System.out.println("The length of array before removing: "+arr.length);
		
		 ArrayList<Integer> sb = new ArrayList<Integer>();
	        for(int i=0;i<arr.length;i++){
	            if(arr[i]!=a){
	                sb.add(Integer.valueOf(arr[i]));
	            }
	        }
	        
		System.out.println("The length of array after removing: "+ sb.size());
		System.out.println(sb);
	}
}
