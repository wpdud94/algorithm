package session2;

import java.awt.Window.Type;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 두 가지 색으로 된 카펫 크기 맞추기
 */

public class AT06_carpetSize {

	public static void main(String[] args) {
		Solution06 sol = new Solution06();
		int brown =24;
		int yellow=24;
		System.out.println(Arrays.toString(sol.solution(brown, yellow)));
	}

}

class Solution06{
	public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        //노란색으로 만들 수 있는 사각형의 경우의 수들 = 약수
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=yellow;i++) {
        	if(yellow%i==0) {
        		list.add(i);
        	}
        }
        System.out.println(list);
        //해당 경우의 수 별 갈색수 비교
        //갈색수 = 2*(노랑 가로 + 노랑 세로 + 2)
        //int horizon = list.get(list.size()-i-1)
        //int vertical = list.get(i)
        for(int i=0;i<list.size();i++) {
        	int iscorrect = 2*(list.get(list.size()-i-1)+list.get(i)+2);
        	if(iscorrect==brown) {
        		answer[1] = list.get(list.size()-i-1)+2;
        		answer[0] = list.get(i)+2;
        	}
        }
        return answer;
	}
}