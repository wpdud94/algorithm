package week1;

import java.util.*;

public class AT06_answer {

	public static void main(String[] args) {
		Solution06 s= new Solution06();
		int[ ] arr = {1, 1, 3, 3, 0, 1};
		int[] answer = s.solution(arr);
		for(int i : answer) System.out.println(i);
	}

}
 class Solution06{
	 public int[] solution(int []arr) {
        int j=0;
        int[ ] temp = new int[arr.length];
        
        for(int i=0;i<arr.length-1;i++) {
        	if(arr[i]!=arr[i+1]) {
    			temp[j]=arr[i];
    			j++;
        	}
        }
        temp[j]=arr[arr.length-1];
        int[ ] answer = new int[j+1];
        System.arraycopy(temp, 0, answer, 0, j+1);
        return answer;
    }
 }
 