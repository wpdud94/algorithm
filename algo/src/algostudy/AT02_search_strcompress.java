package algostudy;

import java.util.LinkedList;
import java.util.Queue;

public class AT02_search_strcompress {
	public static void main(String[] args) {
		String s = "abcabcdede";
		Solution02 sol = new Solution02();
		System.out.println(sol.solution(s));
	}
}
class Solution02 {
    public int solution(String s) {
        int answer = 0;
        int unit =1;
        int min = s.length();
        while(unit<=s.length()) {
        	LinkedList<String> que = new LinkedList<>();
        	for(int i=0;i<s.length();i=i+unit) {
        		try {
        			que.add(s.substring(i, i+unit));
        		}catch(StringIndexOutOfBoundsException e) {
        			que.add(s.substring(i));
        		}
        	}
        	//System.out.println(que);
        	String result = "";
        	int cnt=1;
        	while(!que.isEmpty()) {
        		String sout = que.pop();
        		//System.out.println(sout);
        		//System.out.println("peek : "+que.peek());
        		if(sout.equals(que.peek())) {
        			cnt++;
        			continue;
        		}else {
        			if(cnt!=1) result += cnt+sout;
        			else result += sout; 
        			cnt=1;
        			//System.out.println("result : "+result);
        		}
        	}
        	//System.out.println("min : "+min);
        	if(min>result.length()) min = result.length();
        	unit++;
        }
        answer = min;
        return answer;
    }
}
/*

*/