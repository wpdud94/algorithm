package session1;

import java.util.*;

public class AT15 {

	public static void main(String[] args) {
		Solution15 s = new Solution15();
		System.out.println(s.solution(121));
		System.out.println(s.solution(11));

		

		
	}

}
 class Solution15{
	 public long solution(long n) {
        long answer = -1;
        double sqrt1 = Math.sqrt(n);
        int sqrt2 = (int) Math.sqrt(n);
        if(sqrt1==sqrt2)
        answer = (long) Math.pow((long) Math.sqrt(n)+1, 2);
        return answer;
    }
 }

 