package session1;

import java.util.Arrays;

public class AT29 {

	public static void main(String[] args) {
		Solution29 s = new Solution29();
		String str = "aBz";
		int n = 4;
		System.out.println(s.solution(str, n));
	}

}
class Solution29 {
	public String solution(String s, int n) {
        String answer = "";
        int idx = 0;
        String[] capAlpha = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String[] Alpha = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String[] str = s.split("");
        //System.out.println(Arrays.toString(str));
        
        for(int k=0; k<str.length;k++) {
        	for(int i=0;i<capAlpha.length;i++) {
        		if(str[k].equals(capAlpha[i])) {
        			str[k] = capAlpha[(i+n)%capAlpha.length];
        			//System.out.println(str[k]);
        			break;
        		}
        	}
    		for(int j=0;j<Alpha.length;j++) {
        		if(str[k].equals(Alpha[j])) {
        			str[k] = Alpha[(j+n)%Alpha.length];
        			break;
        		}
        	}
        	
        }
        //System.out.println(Arrays.toString(str));
        
        for(String sg : str) {
        	answer += sg;
        }
        
        
        return answer;
    }
}
 
