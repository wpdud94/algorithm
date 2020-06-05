package week1;

import java.util.Arrays;

public class AT20 {

	public static void main(String[] args) {
		Solution20 s = new Solution20();
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		System.out.println(Arrays.toString(s.solution(array, commands)));

	}

}
class Solution20 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int temp = 0 ;
        for(int i=0;i<commands.length;i++) {
        	// 1. 자르기
        	int[] temp1 = new int[commands[i][1]-commands[i][0]+1];
        	System.arraycopy(array, commands[i][0]-1, temp1,0 ,commands[i][1]-commands[i][0]+1);
        	// 2. 정렬
        	for(int b=0;b<temp1.length;b++) {
        	for(int a=0;a<temp1.length-1;a++) {
        		if(temp1[a]>temp1[a+1]) {
        			temp = temp1[a];
        			temp1[a]=temp1[a+1];
        			
        			temp1[a+1]=temp;
        		}
        	}
        	}
        	// 3. k번째 배분
        	answer[i]=temp1[commands[i][2]-1];
        }
        return answer;
    }
}
 