package instructors;

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
			
			for(int i=0; i<Y; i++){			
				for(int j=0; j<X ;j++){
					map[i][j] = sc.next().charAt(0);
				}	
			
			}//fill map
			for(char[] carr:map) {
				System.out.println(Arrays.toString(carr));
			}
			for(int i=0; i<Y; i++){			
				for(int j=0; j<X ;j++){
					if(map[i][j]=='G') {
						int x = j;
						int y = i;
						//상
						findTarget(map, j, i, x, y-1, arr, tcn);
						x = j;
						y = i;
						//하
						findTarget(map, j, i, x, y+1, arr, tcn);
						x = j;
						y = i;
						//좌
						findTarget(map, j, i, x-1, y, arr, tcn);
						x = j;
						y = i;
						//우
						findTarget(map, j, i, x+1, y, arr, tcn);
					}//if
				}
			
			}//for 2개
			System.out.println(Arrays.toString(arr));
			for(int k=0;k<arr.length;k++) {
				System.out.println("#"+(k+1)+" "+arr[k]);
			}
			long end = System.currentTimeMillis();
			System.out.println("실행 시간 : "+(end-start)/1000.0+"초");
			
		
		
		
		
		}//tcn for

	}//main	
	public static int[] findTarget(char[][] map, int j, int i, int x, int y, int[] arr, int tcn) {
		//상
		//System.out.println("위치는 : "+map[y][x]);
		System.out.println("x : "+x+", y : "+y);
		try {
			if(y<i) {
				if(map[y][x]=='T') {
					System.out.println("찾았다.");
					map[y][x]='W';
					arr[tcn-1]++;
				}else if(map[y][x]=='0') {
					findTarget(map, j, i, x, y-1, arr, tcn);
				}else{
					System.out.println("막힘");
				}
			}else if(y>i) {//하
				if(map[y][x]=='T') {
					System.out.println("찾았다.");
					map[y][x]='W';
					arr[tcn-1]++;
				}else if(map[y][x]=='0') {
					findTarget(map, j, i, x, y+1, arr, tcn);
				}else{
					System.out.println("막힘");
				}
			}else if(x<j) {//좌
				if(map[y][x]=='T') {
					System.out.println("찾았다.");
					map[y][x]='W';
					arr[tcn-1]++;
				}else if(map[y][x]=='0') {
					findTarget(map, j, i, x-1, y, arr, tcn);
				}else{
					System.out.println("막힘");
				}
			}else if(x>j) {//우
				if(map[y][x]=='T') {
					System.out.println("찾았다.");
					map[y][x]='W';
					arr[tcn-1]++;
				}else if(map[y][x]=='0') {
					findTarget(map, j, i, x+1, y, arr, tcn);
				}else{
					System.out.println("막힘");
				}
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("지도 밖");
		}
		return arr;
	}
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






