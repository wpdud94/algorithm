package session2;

import java.util.Arrays;

public class AT15_EngilshConnecting {
	
	/**
	 * 
	 * @param args
	 * 끝말잇기 중 진사람의 번호와 차례 리턴
	 */

	public static void main(String[] args) {
		Solution15 sol = new Solution15();
//		String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
		String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};
		int n = 2;
		System.out.println(Arrays.toString(sol.solution(n, words)));
	}

}
class Solution15 {
	public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        int turn = 0;
        boolean flag = false;
        //중복 체크
        for(int i=0;i<words.length-1;i++) {
        	for(int j=i+1;j<words.length;j++) {
        		if(words[i].equals(words[j])) {
        			answer[0] = (j%n)+1;
        			answer[1] = (j/n)+1;
        			flag=true;
        			break;
        		}
        	}
        }
        System.out.println("answer : "+Arrays.toString(answer));
        //끝말잇기 맞는지
        while(turn<words.length-1) {
        	int index  = (turn % n)+1;
            int round = (turn/n)+1;
            int lastIndex = words[turn].length();
            System.out.println(index+", "+round);
            System.out.println(words[turn].substring(lastIndex-1,lastIndex));
            System.out.println(words[turn+1].substring(0, 1));
            System.out.println("-----");
            if(!words[turn].substring(lastIndex-1,lastIndex).equals(words[turn+1].substring(0, 1))) {
            	if((round<=answer[1]&&index<answer[0])||!flag) {
            		answer[0] = index;
                	answer[1] = round;
                	break;
            	}
            }
            turn++;
        }
        return answer;
    }
	
}
