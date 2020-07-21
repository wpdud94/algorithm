package session2;

import java.util.ArrayList;
import java.util.Arrays;

public class AT11_DevelopFunction {
	
	/**
	 * 
	 * @param args
	 * 배포순서와 작업 속도가 상이한 기능 중 각 배포마다 몇 개의 기능이 배포되는지 리턴
	 */

	public static void main(String[] args) {
		Solution11 sol = new Solution11();
		int[] progresses = {93,30,55};
		int[] speeds = {1,30,5};
		System.out.println(Arrays.toString(sol.solution(progresses, speeds)));

	}

}
class Solution11 {
	public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        return answer;
    }
}
