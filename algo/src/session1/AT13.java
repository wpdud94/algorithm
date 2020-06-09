package session1;

import java.util.*;

public class AT13 {

	public static void main(String[] args) {
		Solution13 s= new Solution13();
		System.out.println(s.solution(123));

		
		
		
	}

}
 class Solution13{
	 public int solution(int n) {
        int answer = 0;
        int i = 10;
        if(n>9) {
        	while((double)n/i>=0.1) {
        		answer += ((double) n/i * i - n/i*i)/(i/10);
        		n = n/i * i;
        		i= i*10;
        		System.out.println(answer);
        	}
        }else {
        	answer = n;
        }
        return answer;
    }
 }

 