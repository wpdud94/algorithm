package week1;

import java.util.*;

public class AT16 {

	public static void main(String[] args) {
		Solution16 s = new Solution16();
		String str = "122a23";
		System.out.println(s.solution(str));
	}

}
 class Solution16{
	  public boolean solution(String s) {
	        boolean answer = true;
	        boolean flag = true;
	        char[] carr = s.toCharArray();
	        
	        if(s.length()==4 || s.length()==6) {
	        	for(char c : carr) {
	        		if(!Character.isDigit(c)) answer=false;
	        	}
	        }else {
	        	answer=false;
	        }
	        	
	        	
	        return answer;
	    }
 }

 