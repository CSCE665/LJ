/* Author: Lijun Xie Date:03/25/2014
 * Topic: Leetcode(26) Remove Duplicates from Sorted Array
 * Topic: Leetcode(81) Remove Duplicates from Sorted Array(2)
 * For this code, it can be extended to other data type, such as character, float, etc.
 * Pay attention to the head and tail: special cases.
 */

public class RemoveDuplicate {
	public static void main(String[] args){
		int[] arr={1,1,1,1,1,2,2,3,4};
		boolean[] flag=new boolean[arr.length];
		int newlen = DeDuplicates(arr,flag);
		int[] newarr = new int[newlen];
		int j = 0;
		for(int i=0;i<arr.length;i++){
			//System.out.println(flag[i]); for test
			if(flag[i]) {
				newarr[j]=arr[i];
				j++;
			}
		}
		System.out.println("The new array is as follows:");
		for(int i=0;i<newlen;i++){
			System.out.print(" "+newarr[i]);
		}
		System.out.println("");
		System.out.println("The new length of the array after removing duplicates is :" + newlen);
	}
	
	public static int DeDuplicates(int[] array, boolean[] flag){
		int length = array.length;
		int count = 1;
		if(length<2) length=1;
		else{
		for(int i=0;i<array.length-1;i++){
			if(array[i]==array[i+1]){
				length = length -1;
				flag[i]=false;
				count++;
			}
			else {
				if(count>=2 && i>2){                                      //Add this part for only reserve two place for duplicates
					//System.out.println("i1: "+i);                      //if the number of duplicates is more than 2
					flag[i-1]=true;
					flag[i]=true;
					length = length +1;
				}else{
					//System.out.println("count: "+count);
					//System.out.println("i2: "+i);
					flag[i]=true;
				}
					count = 1;
				if(i==array.length-2) flag[i+1]=true;
			}
		}
		}
		//System.out.println(flag[7]);   for test
		return length;
	}
}
