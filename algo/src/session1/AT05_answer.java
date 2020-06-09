package week1;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

public class AT05_answer {

	public static void main(String[] args) {
		Solution05 s= new Solution05();
		System.out.println(s.solution("pppyyy"));
	}

}
 class Solution05{
	 boolean solution(String s) {
	        boolean answer = true;
	        int i=0;
	        int j=0;
	        char[ ] ca = new char[50];
	        ca = s.toCharArray();
	        for(char c : ca) {
	        	if(c=='p' || c=='P') i++;
	        	if(c=='y' || c=='Y') j++;
	        }
	        if(i!=j) answer = false;
	        return answer;
	    }
 }
 