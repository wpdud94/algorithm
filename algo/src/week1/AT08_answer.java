package week1;


public class AT08_answer {

	public static void main(String[] args) {
		Solution08 s= new Solution08();
		long[] temp=s.solution(0, 7);
		for(long l : temp) System.out.println(l);
		
	}

}
 class Solution08{
	 public long[] solution(long x, int n) {
        long[] answer = new long[n];
        long cnt = x;
        
        for(int i=0;i<n;i++) {
        	answer[i]= x;
        	x += cnt;
        }
        return answer;
	    }
 }
 