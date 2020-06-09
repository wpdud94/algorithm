package session1;

public class AT04_answer {

	public static void main(String[] args) {
		Solution04 s4= new Solution04();
		System.out.println(s4.solution(12));
	}

}
 class Solution04{
	 public int solution(int n) {
	        int answer = 0;
	        for(int i=1;i<n+1;i++) if(n%i==0) answer += i;
	        return answer;
	    }
 }
 