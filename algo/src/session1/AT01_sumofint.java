package session1;
/**
 * 
 * @author Playdata
 * 두 수 사이의 정수 합
 */
public class AT01_sumofint {

	public static void main(String[] args) {
		Solution01 s1 = new Solution01();
		System.out.println(s1.solution(4, 1));
		

	}

}
 class Solution01{
	 
	 public long solution(int a, int b) {
	        long answer =0;
			if(a==b) answer = a;
			else if(a>b) {
				for(int i=0;i<a-b+1;i++) answer += b+i;
				}
			else{
				for(int i=0;i<b-a+1;i++) answer += a+i;
				}
			return answer;
	    }
 }
 