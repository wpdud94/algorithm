package session2;


import java.util.Arrays;
import java.util.LinkedList;


public class AT13_CutIron {
	
	/**
	 * 
	 * @param args
	 * 레이저에 의해 잘린 후 총 쇠막대기 수 구하기
	 */

	public static void main(String[] args) {
		Solution13 sol = new Solution13();
		String arrangement = "()(((()())(())()))(())";
		System.out.println(sol.solution(arrangement))	;

	}

}
class Solution13 {
	public int solution(String arrangement) {
        char[] arr = arrangement.toCharArray();
        //System.out.println(Arrays.toString(arr));
        //1. (( : 현재막대수 증가
        //2. )) : 현재막대수 감소, 최종막대수+1 
        //3. () : 최종막대수 += 현재막대수
        //4. )( : pass
        int nowIron = 0;
        int endIron = 0;
        for(int i=0;i<arr.length-1;i++) {
        	if(arr[i]=='('&&arr[i+1]=='(') {
        		nowIron++;
        	}else if(arr[i]==')'&&arr[i+1]==')') {
        		nowIron--;
        		endIron++;
        	}else if(arr[i]=='('&&arr[i+1]==')') {
        		endIron+=nowIron;
        	}else if(arr[i]==')'&&arr[i+1]=='(') {
        		continue;
        	}
        }
        //System.out.println(endIron);
        
        return endIron;
    }
}
