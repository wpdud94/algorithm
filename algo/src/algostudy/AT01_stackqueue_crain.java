package algostudy;

import java.util.Stack;

public class AT01_stackqueue_crain {
	Solution01 sol = new Solution01();
}
class Solution01 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        // moves 대로 board 읽고 stack에 쌓기
        for(int i=0;i<moves.length;i++) {
        	int move = moves[i];
        	int rmove = move-1;
        	for(int j=0;j<board.length;j++) {
        		int doll = board[j][rmove];
        		if(doll==0) continue;
        		board[j][rmove]=0;
        		if(!stack.isEmpty()) {
        			if(doll==stack.peek()) {
            			stack.pop();
            			answer = answer + 2;
            			break;
            		}else{
            			stack.push(doll);
            			break;
            		}
        		}else {
        			stack.push(doll);
        			break;
        		}
        	}
        	//System.out.println((i+1)+", "+stack);
        }
        return answer;
    }
}