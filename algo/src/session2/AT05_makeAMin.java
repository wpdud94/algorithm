package session2;

import java.util.Arrays;

/**
 * 최소값 만들기
 */

public class AT05_makeAMin {

	public static void main(String[] args) {
		Solution05 sol = new Solution05();
		
	}

}

class Solution05{
	public int solution(int []A, int []B){
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i=0;i<A.length;i++) {
        	answer+=A[i]*B[B.length-i-1];
        }

        return answer;
    }
}