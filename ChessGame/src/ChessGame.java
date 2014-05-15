public class ChessGame {
	public static int findCount(char[][] matrix, int n, char c){
		int count = 0;
		for(int i=0; i<n; i++){              //transverse horizonally
			for(int j=0; j<n-2;j++){
				if(matrix[i][j]==c && matrix[i][j+1]==c && matrix[i][j+2]==c){
					count++;
				}
			}
		}
		for(int i=0;i<n-2;i++){ 
			for(int j=0; j<n-2;j++){//transverse diagnoally
			if(matrix[i][j]==c && matrix[i+1][j+1]==c && matrix[i+2][j+2]==c){
				count++;
			}
		}
		}
		for(int i=2; i<n;i++){
			for(int j=0; j<n-2;j++)
				if(matrix[i][j]==c && matrix[i-1][j+1]==c && matrix[i-2][j+2]==c){
					count++;
				}
		}
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n-2;j++){
				if(matrix[j][i]==c && matrix[j+1][i]==c && matrix[j+2][i]==c){
					count++;
				}
			}
		}
		return count;
		
	}
	
	public static void main(String args[]){
		char[][] matrix = {{'r','r','r','b'},{'b','r','b','r'},{'b','r','r','b'},{'b','r','b','b'}}; 
		int n = 4; //n is the matrix size as defined
		int red_count = findCount(matrix,n,'r');
		int blue_count = findCount(matrix,n,'b');
		System.out.println("The points that A gets are " + red_count);
		System.out.println("The points that B gets are " + blue_count);
	}
    

}
