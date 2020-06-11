package session2;

import java.util.Arrays;

/**
 * 최대값 최소값 구하기
 */

public class AT04_masmin {

	public static void main(String[] args) {
		Solution04 sol = new Solution04();
		String s = "-1 -2 -3 -4";
		System.out.println(sol.solution(s));
	}

}

class Solution04{
	public String solution(String s) {
        String answer = "";
        //문자열 " "단위로 쪼개기
        String[] arr = s.split(" ");
        //정수로 변환
        int[] iarr = new int[arr.length];
        for(int i=0;i<arr.length;i++) {
        	iarr[i]=Integer.parseInt(arr[i]);
        }
        //최대값 최소값 구하기
        Arrays.sort(iarr);
        answer = iarr[0]+" "+iarr[iarr.length-1];
        return answer;
    }
}