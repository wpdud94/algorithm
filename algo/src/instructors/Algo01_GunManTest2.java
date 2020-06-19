package instructors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Algo01_GunManTest2 {

	public static void main(String[] args)throws Exception {
		long start = System.currentTimeMillis();
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] arr = new int[T];
		//System.out.println(T);
		for(int tcn=1; tcn<=T; tcn++){
			int Y = sc.nextInt();
			int X = sc.nextInt();
			
			char[ ][ ] map = new char[Y][X];
			ArrayList<Integer> list = new ArrayList<>();
			for(int i=0; i<Y; i++){			
				for(int j=0; j<X ;j++){
					if((map[i][j] = sc.next().charAt(0))=='G') {
						list.add(j);
						list.add(i);
					}
				}	
			
			}//fill map
			for(char[] carr:map) {
				System.out.println(Arrays.toString(carr));
			}
			//System.out.println(list);
			for(int i=0;i<list.size();i=i+2) {
				int a=0;
				while(a<Math.max(X, Y)) {
					a=i;
					
				}
			}
			System.out.println(Arrays.toString(arr));
			for(int k=0;k<arr.length;k++) {
				System.out.println("#"+(k+1)+" "+arr[k]);
			}
			long end = System.currentTimeMillis();
			System.out.println("실행 시간 : "+(end-start)/1000.0+"초");
			
		
		
		
		
		}//tcn for

	}//main	
	
}//class




/*
Input Data
 
2
5 7
T 0 T 0 G 0 G
0 W T W W W 0
T W G 0 T W T
0 0 0 T G W 0
0 0 T 0 0 W 0
2 10
T W 0 G 0 W 0 G 0 W
G 0 T W T 0 T W T 0

*/

/*
Output

#1 6 
#2 2 
 */






