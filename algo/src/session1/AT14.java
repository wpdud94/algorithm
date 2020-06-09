package session1;

import java.util.*;

public class AT14 {

	public static void main(String[] args) {


		
		
		
	}

}
 class Solution14{
	 public int[] solution(int n, int m) {
        int[] answer = new int[2];
        //최대 공약수
        int min = Math.min(n, m);
        for(int i=min;i>0;i--) {
        	if(n%i==0 && m%i==0) {
        		answer[0]=i;
        		break;
        	}
        }
        //최소공배수
        answer[1]= (n*m)/answer[0];
        
        return answer;
	 }
 }

 