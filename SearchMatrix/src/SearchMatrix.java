
public class SearchMatrix {
	public static void main(String[] args){
		int[][] a = {{2,3},{4,5},{6,7}};
		int t = 5;
		boolean b = searchMatrix(a,t);
		System.out.println(b);
	}
	
	 public static boolean searchMatrix(int[][] matrix, int target) {
	        
	        if(matrix==null || matrix.length==0)
	            return false;
	            
	        int temp1;
	        int temp2;

	        boolean tag=false;
	        
	        if(matrix.length==1){
	            for(int i=0;i<matrix[0].length;i++){
	                if(matrix[0][i]==target){
	                tag=true;
	                break;
	                }
	            }
	        }
	        for(int i=0;i<matrix.length-1;i++){
	            temp1=matrix[i][0]-target;
	            temp2=matrix[i+1][0]-target;
	            if((temp1<0)&&(temp2>0)){
	               for(int j=0;j<matrix[0].length;j++){
	                 if(matrix[i][j]==target){
	                     tag=true;
	                     break;
	                }
	              }
	               break;
	            }
	        }
	        
	        return tag;
	    }
}
