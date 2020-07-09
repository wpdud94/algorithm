package instructors;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Algo04_findcoin {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int m = sc.nextInt();
		int[][] M = new int[m][2];
		for(int i=0;i<M.length;i++) {
			for(int j=0;j<M[0].length;j++) {
				M[i][j]=sc.nextInt();
			}
		}
		//for(int[] arr : M) System.out.println(Arrays.toString(arr));
		int answer = 0;
		// NxN 이차원 배열을 만든다
		int[][] mat = new int[N][N];
		int[] count = new int[N];
		//for(int[] arr : mat) System.out.println(Arrays.toString(arr));
		// M개의 statement를 읽는다
		for(int i=0;i<M.length;i++) {
			// x y이면 x행에 y열에  1를 배치.. y행 x열에 -1배치
			int x = M[i][0]-1;
			int y = M[i][1]-1;
			mat[x][y] = 1; count[x]++;
			mat[y][x] = -1; count[y]--;
		}
		//System.out.println("결과 : "+Arrays.toString(count));
		// 각 열(k)을 훓는데 1이 존재하는 열 x에 해당하는 행 y로 가서 1이 있는지 찾는다(y)
		for(int k=0;k<mat.length;k++) {
			for(int x=0;x<mat.length;x++) {
				if(mat[k][x]==1) {
					for(int y=0;y<mat[x].length;y++) {
						if(mat[x][y]==1) {
							// 만일 있으면 k행 y열에 1을 넣는다
							mat[k][y]=1; count[k]++;
							mat[y][k]=-1; count[y]--;
						}
					}
				}
			}
		}
		//System.out.println("최종행렬");
		//for(int[] arr:mat) System.out.println(Arrays.toString(arr));
		//System.out.println("결과 : "+Arrays.toString(count));
		int scount=0;
		for(int i=0;i<count.length;i++) {
			if(count[i]==N-1||count[i]==-(N-1)) {
				answer++;
			}else if(count[i]==N-2||count[i]==-(N-2)) {
				scount++;
				if(scount==2) answer=answer+2;
			}
		}
		System.out.println(answer);
		/*Solution04 sol = new Solution04();
		//System.out.println("정답은 : "+sol.findCoin(N, M));
		sol.findCoin(N, M)*/;
	}
}

/*
5 4
2 1
4 3
5 1
4 2

*/