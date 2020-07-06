package instructors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Algo02_CutSection {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. ���� ����
		// 1-1. ���� ���� �Ѱ輱 �ޱ�
		int height = sc.nextInt();
		int width = sc.nextInt();
		// 2. ���� ���� �� ���� ������ ����
		// 2-1. ���м� ���� �ޱ�
		int numOfCut = sc.nextInt();
		int numOfW = 0;
		int numOfH = 0;
		// 2-2. ���м� ��� �ޱ�
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
		// 2-3. 0�� ���� ���м� �迭�� , 1�̸� ���� ���м� �迭�� �Ҵ�... �⺻ 0 �Ҵ� & �Ѱ輱 �Ҵ�
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
		System.out.println("���α��м� : " + Arrays.toString(hLine));
		System.out.println("���α��м� : " + Arrays.toString(wLine));
		// 2-4. ����ĭ, ����ĭ �迭 ����
		//����ĭ
		int[] wCut = new int[numOfW+1];
		for(int i=0;i<wCut.length;i++) {
			wCut[i]=wLine[i+1]-wLine[i];
		}
		//����ĭ
		int[] hCut = new int[numOfH+1];
		for(int i=0;i<hCut.length;i++) {
			hCut[i]=hLine[i+1]-hLine[i];
		}
		System.out.println("���γ��� : " + Arrays.toString(hCut));
		System.out.println("���γʺ� : " + Arrays.toString(wCut));
		//3  ���� ���� ���
		int[] area = new int[hCut.length*wCut.length];
		int areaidx = 0;
		for(int i=0;i<hCut.length;i++) {
			for(int j=0;j<wCut.length;j++){
				area[areaidx] = hCut[i]*wCut[j];
				areaidx++;
			}
		}
		//3-1 ����
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