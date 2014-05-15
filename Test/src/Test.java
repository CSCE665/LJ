import java.util.*;

public class Test {
	public static void main(String[] args){
		int n =100;
		for(int i=2;i<n;i++){
			boolean flag = false;
			for(int j=2;j<=Math.sqrt(i*1.0);j++){
				if(i%j==0)
				{
					flag =true;
					break;
				}
			}
			if(!flag) System.out.println(i);
		}
				
	}
}
