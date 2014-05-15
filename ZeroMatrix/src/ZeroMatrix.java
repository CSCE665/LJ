/* Author: Lijun Xie Date:03/25/2014
 * Topic: Cracking the coding interview 1.7
 */

public class ZeroMatrix {
	public static void main(String[] args){
		int[][] arr1 = {{1,0,3,1},{1,2,1,1},{3,1,1,1}};
		boolean[] row = new boolean[arr1.length];
		boolean[] column = new boolean[arr1[0].length];
		
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr1[i].length;j++){
				System.out.print(" "+arr1[i][j]);
			}
			System.out.println("");
		}
		
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr1[i].length;j++){
				if(arr1[i][j]==0){
					row[i]=true;
					column[j]=true;
					}
				}
			}
			
		
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr1[i].length;j++){
				if(row[i]||column[j]){
					arr1[i][j]=0;
				}
			}
		}
		
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr1[i].length;j++){
				System.out.print(" "+arr1[i][j]);
			}
			System.out.println("");
		}
		
	}

}
