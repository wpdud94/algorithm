package session1;

import java.util.Arrays;

public class AT28 {

	public static void main(String[] args) {
		Solution28 s = new Solution28();
		int n=10;
		int[] lost = {3,9,10};
		int[] reserve = {3,8,9};
		System.out.println(s.solution(n, lost, reserve));



	}

}
class Solution28 {
	public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int borrow = 0;
        
        for(int i=0;i<lost.length;i++) {
        	for(int j=0;j<reserve.length;j++) {
        		if(lost[i]==reserve[j]) {
        			reserve[j]=-1;
        			lost[i] = -10;
        	}
        	}
        }
        //1. ���� �ֵ� ���� �����ֱ�
        for(int i=0;i<lost.length;i++) {
        	for(int j=0;j<reserve.length;j++) {
        		if(lost[i]==reserve[j]-1) {
        			reserve[j]=-1;
        			lost[i] = -10;
        		}else if(lost[i]==reserve[j]+1) {
					//2. ū�� �����ֱ�
					reserve[j]=-1;
					lost[i] = -10;
	        	}
        		//System.out.println(Arrays.toString(reserve));
        	}
        }
        for(int k : lost) if(k==-10) borrow++;
        answer = n-lost.length+borrow;
        return answer;
    }
}
 