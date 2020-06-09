package session1;

public class AT03_answer {

	public static void main(String[] args) {
		String[] st = {"1", "1225", "4445","Kim", "2","4", "5"};
		Solution03 s3= new Solution03();
		System.out.println(s3.solution(st));
	}

}
 class Solution03{

	 public String solution(String[] seoul) {
	        String answer = "";
	        int i = 0;
	        for(String s : seoul) {
	        	if(s.equals("Kim")) {
	        		answer = "김서방은 "+i+"에 있다";
	        		break;
	        	}
	        	i++;
	        }
	        return answer;
	    }
 }
 