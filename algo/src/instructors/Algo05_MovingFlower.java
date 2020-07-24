package instructors;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Algo05_MovingFlower {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		for(int i=0;i<testCase;i++) {
			int weight = sc.nextInt();
			int typeOfBag = sc.nextInt();
			int min = 0;
			int[] cap = new int[typeOfBag];
			for(int j=0;j<cap.length;j++) {
				cap[j]=sc.nextInt();
			}
			System.out.println(weight);
			System.out.println(cap.length);
			System.out.println(Arrays.toString(cap));
			//여기서부터 시작
			System.out.println("--------------------------");
			//1. cap 정렬
			Arrays.sort(cap);
			Solution05 sol = new Solution05();
			System.out.println("#"+(i+1)+" "+sol.function(weight, cap, min));
		}
		
	}
}
class Solution05{
	int function(int weight, int[] cap, int min) {
		int answer = 0;
		
		//2. 역순으로 반복 :: 큰 봉지에 담을수록 최소값임
		for(int i=cap.length-1;i>-1;i--) {
			if(weight / cap[i]!=0) {
				answer += weight / cap[i];
				weight = weight % cap[i];
				System.out.println("cap : "+cap[i]);
				System.out.println("weight : "+weight);
				System.out.println("answer : "+answer);
			}
		}
		if(weight!=0) answer = -1;
		return answer;
	}
}
// 입력
/*
3
8
3
1 4 6 
7
2
5 3
18
2
5 3

*/