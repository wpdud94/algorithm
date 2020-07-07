package instructors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Algo02_CutSection {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. 영역 구성
		// 1-1. 가로 세로 한계선 받기
		int height = sc.nextInt();
		int width = sc.nextInt();
		// 2. 가로 세로 별 구분 데이터 추출
		// 2-1. 구분선 개수 받기
		int numOfCut = sc.nextInt();
		int numOfW = 0;
		int numOfH = 0;
		// 2-2. 구분선 모두 받기
		int[]lineArr = new int[numOfCut*2];
		for(int i=0;i<lineArr.length;i++) {
			 lineArr[i] = sc.nextInt();
			 if(i%2==0) {
				 if(lineArr[i]==0) numOfH++;
				 else numOfW++;
			 }
		}
		
		Solution02 sol = new Solution02();
		System.out.println(sol.CutSection(width, height, numOfW, numOfH, lineArr));
		
	}
}
class Solution02{
	public int CutSection(int width, int height, int numOfW, int numOfH, int[] lineArr) {
		int answer = 0;
		// 2-3. 0면 가로 구분선 배열에 , 1이면 세로 구분선 배열에 할당... 기본 0 할당 & 한계선 할당
		int[] wLine = new int[numOfW+2];
		int[] hLine = new int[numOfH+2];
		int widx = 1;
		int hidx = 1;
		for(int i=0;i<lineArr.length;i=i+2) {
			if(lineArr[i]==0) {
				hLine[hidx]=lineArr[i+1];
				hidx++;
			}else {
				wLine[widx]=lineArr[i+1];
				widx++;
			}
		}
		hLine[hLine.length-1]= width; 
		wLine[wLine.length-1]= height;
		Arrays.sort(hLine);
		Arrays.sort(wLine);
		System.out.println("세로구분선 : " + Arrays.toString(hLine));
		System.out.println("가로구분선 : " + Arrays.toString(wLine));
		// 2-4. 세로칸, 가로칸 배열 추출
		//가로칸
		int[] wCut = new int[numOfW+1];
		for(int i=0;i<wCut.length;i++) {
			wCut[i]=wLine[i+1]-wLine[i];
		}
		//세로칸
		int[] hCut = new int[numOfH+1];
		for(int i=0;i<hCut.length;i++) {
			hCut[i]=hLine[i+1]-hLine[i];
		}
		System.out.println("세로높이 : " + Arrays.toString(hCut));
		System.out.println("가로너비 : " + Arrays.toString(wCut));
		//3  영역 넓이 계산
		int[] area = new int[hCut.length*wCut.length];
		int areaidx = 0;
		for(int i=0;i<hCut.length;i++) {
			for(int j=0;j<wCut.length;j++){
				area[areaidx] = hCut[i]*wCut[j];
				areaidx++;
			}
		}
		//3-1 정렬
		Arrays.sort(area);
		answer = area[area.length-1];
		
		return answer;
	}
}
/*
10 8
3
0 3
1 4
0 2
*/
/*
50 50
4
0 45
0 30
0 29
0 48
*/