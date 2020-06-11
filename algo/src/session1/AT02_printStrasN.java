package session1;
/**
 * 
 * @author Playdata
 *	수박수박수
 *	n만큼 문자열패턴 반복
 */
public class AT02_printStrasN {

	public static void main(String[] args) {
		Solution02 s2 = new Solution02();
		System.out.println(s2.solution(5));

	}

}
 class Solution02{
	 
	 
	 
	 public String solution(int n) {
	 String answer ="";
	 
	 for(int i=0;i<n;i++) {
		 if(i%2!=0) {
			answer += "박";
		 }else {
			answer += "수";
		 }
	 }
	 return answer;
	 }
 }
 