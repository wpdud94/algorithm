package week1;


public class AT07_answer {

	public static void main(String[] args) {
		Solution07 s= new Solution07();
		String sed = "webs";
		System.out.println(s.solution(sed));
	}

}
 class Solution07{
	 public String solution(String s) {
        String answer = "";
        int length = 0;
        char[ ] temp = s.toCharArray();
        length = temp.length;
        
        if(length%2==0) {
        	int center = length/2;
        	answer += temp[center-1];
        	answer += temp[center];
        }else {
        	int center = length/2;
        	answer += temp[center];
        }
        return answer;
    }
 }
 