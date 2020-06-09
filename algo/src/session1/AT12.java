package session1;

import java.util.Scanner;

public class AT12 {

	public static void main(String[] args) {
		Solution12 s= new Solution12();
		System.out.println(s.solution(3));
		System.out.println(s.solution(2));
		
		
		
	}

}
 class Solution12{
	 public String solution(int num) {
        String answer = "";
        if(num%2==0) {
        	answer="Even";
        }else {
        	answer="Odd";
        }
        return answer;
    }
 }

 