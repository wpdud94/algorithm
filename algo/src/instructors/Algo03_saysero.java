package instructors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Algo03_saysero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCount = sc.nextInt();
		sc.nextLine();
		String[][] mat = new String[5*testCount][1];
		int maxLength=0;
		for(int i=0;i<mat.length;i++) {
			mat[i]=sc.nextLine().split("");
			if(mat[i].length>maxLength) maxLength = mat[i].length;
		}
		for(String[] arr : mat) {
			System.out.println(Arrays.toString(arr));
		}
		
		Solution03 sol = new Solution03();
		System.out.println(sol.saysero(testCount, mat, maxLength));
		
		
		
		
		
	}
}
class Solution03{
	ArrayList<String> saysero(int testCount, String[][] mat, int maxLength){
		ArrayList<String> answerlist = new ArrayList<>();
		int start=0;
		int cnt=1;
		while(cnt<=testCount) {
			String answer = "";
			for(int row=0;row<maxLength;row++) {
				for(int col=start;col<start+5;col++) {
					try {
						answer+=mat[col][row];
					}catch(IndexOutOfBoundsException e) {
						answer+="";
					}
				}
			}
			start=start+5;
			cnt++;
			answerlist.add(answer);
		}
		return answerlist;
	}
}
/*
Input Data

2
ABCDE
abcde
01234
FGHIJ
fghij
AABCDD
afzz
09121
a8EWg6
P5h3kx

------------------------

Output Data

#1 Aa0FfBb1GgCc2HhDd3IiEe4Jj
#2 Aa0aPAf985Bz1EhCz2W3D1gkD6x

*/