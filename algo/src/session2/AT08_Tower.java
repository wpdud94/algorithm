package session2;

import java.util.Arrays;

/**
 * 탑 통신
 */

public class AT08_Tower {

	public static void main(String[] args) {
		Solution08 sol = new Solution08();
		int[] heights1= {6,9,5,7,4};
		int[] heights2= {3,9,9,3,5,7,2};
		int[] heights3= {1,5,3,6,7,6,5};
		
		System.out.println(Arrays.toString(sol.solution(heights3)));
		
	}

}

class Solution08{
	public int[] solution(int[] heights) {
        int[] answer = new int[heights.length];
        
        //자신의 왼쪽으로 하나씩 높이가 높은지 확인+첫 번째부터 반복
        //첫번째는 무조건 0
        answer[0]=0;
        //[idx-i]>[idx]
        for(int i=1;i<heights.length;i++) {
        	int j = 1;
        	
        	while(i>=j) {
        		if(heights[i-j]>heights[i]) {
        			answer[i]=i-j+1;
        			System.out.println("송신탑 : "+(i+1)+", 수신탑 : "+(i-j+1));
        			break;
        		}
        		j++;
        	}
        }
        
        return answer;
    }
}