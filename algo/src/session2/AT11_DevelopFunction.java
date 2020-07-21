package session2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

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
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<progresses.length;i++) {
        	if((100-progresses[i])%speeds[i]==0) list.add((100-progresses[i])/speeds[i]);
        	else list.add(((100-progresses[i])/speeds[i])+1);
        }
        
        ArrayList<Integer> temp = new ArrayList<>();
    	int first = list.get(0);
    	int cnt=1;
    	for(int i=1;i<list.size();i++) {
    		if(list.get(i)<=first) {
    			cnt++;
    		}else {
    			temp.add(cnt);
    			first=list.get(i);
    			cnt=1;
    		}
    	}
    	
    	//System.out.println("list : "+list);
    	temp.add(cnt);
        //System.out.println("temp : "+temp);
        
        int[] answer = new int[temp.size()];
        for(int i=0;i<answer.length;i++) answer[i]=temp.get(i);
        
        return answer;
    }
}
