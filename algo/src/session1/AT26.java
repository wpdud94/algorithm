package session1;

import java.util.Arrays;
import java.util.Calendar;

public class AT26 {

	public static void main(String[] args) {
		Solution26 s = new Solution26();
		System.out.println(s.solution(10));

	}

}
class Solution26 {
	public int solution(int n) {
int answer=0;
		
        for(int i=2;i<=n;i++) {
        	boolean flag = true;
        	for(int j=2;j<=Math.sqrt(i);j++) {
        		if(i%j==0) {
        			//System.out.println(i);
        			flag = false; 
        			break;
        		}
        	}
        	if(flag==true) answer++;
        }
        
        return answer;
    }
}
 
