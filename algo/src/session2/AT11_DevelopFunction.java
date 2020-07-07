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
        int[] temp = new int[progresses.length];
        // 주요 조건 : 배포 순서, 작업 속도
        // 작업속도 : (100-프로그래스)/스피드 = 필요 날짜 수인데 float 해서 올림하기
        int[] needDays = new int[progresses.length];
        for(int i=0;i<progresses.length;i++) {
        	needDays[i] = (int) Math.ceil((float) (100-progresses[i])/speeds[i]);
        }
        System.out.println(Arrays.toString(needDays));
        // 배포 순서 : 앞의 기능이 완료됐을 때 작업 다 된 뒷 기능을 함께 배포하기
        int idx=0;
        for(int i=0;i<needDays.length;i++) {
        	int cnt=0;
        	if(needDays[i]==0) continue;
        	for(int j=i;j<needDays.length;j++) {
        		if(needDays[i]>=needDays[j]) {
        			cnt++;
        			if(i!=j)needDays[j]=0;
        		}
        	}
        	
        	idx++;
        	temp[i]=cnt;
        }
        System.out.println(Arrays.toString(temp));
        int[] answer = new int[idx];
        idx=0;
        for(int i=0;i<temp.length;i++) {
        	if(temp[i]!=0) {
        		answer[idx]=temp[i];
        		idx++;
        	}
        }
        return answer;
    }
}
