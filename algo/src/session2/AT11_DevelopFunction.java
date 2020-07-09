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
		// 주요 조건 : 배포 순서, 작업 속도
		int[] temp = new int[progresses.length];
 		//작업필요일자 : (100-프로그래스)/스피드 = 필요 날짜 수 나누어 떨어지지 않으면 +1하기
        int[] needDays = new int[progresses.length];
        for(int i=0;i<progresses.length;i++) {
        	needDays[i] = (100-progresses[i])/speeds[i];
        	if((100-progresses[i])%speeds[i]!=0) needDays[i]++;
        }
        System.out.println("필요 작업 일자 : "+Arrays.toString(needDays));
        
        // 배포 순서 : 앞의 기능이 완료됐을 때 작업 다 된 뒷 기능을 함께 배포하기
        int idx=0;
        for(int i=0;i<needDays.length;i++) {
        	int count =0;
        	if(needDays[i]!=0) {
	        	for(int j=needDays.length;j>0;j++) {
	        		if(needDays[i]>=needDays[j]) {
	        			count++;
	        			if(i!=j) needDays[j]=0;
	        		}
	        	}
	        	idx++;
	        	System.out.println("2 : "+Arrays.toString(needDays));
        	}
        	temp[i]=count;
        }
        System.out.println(Arrays.toString(temp));
        
        //temp 정리
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
/*
		int[] answer = {};
        
        int focus = 0;
        int idx=0;
        int[] temp = new int[progresses.length];
        int count=0;
        // 서비스 완성
        while(true) {
        	if(focus==progresses.length) break;
        	while(true) {
            	count=0;
            	// 앞이 작업이 완료됐을 때 -- 해당 작업 0 & 뒤의 100 이상 작업 0
            	if(progresses[focus]>=100) {
            		for(int i=progresses.length-1;i>focus-1;i--) {
            			//System.out.println(i);
            			if(progresses[i]>=100) {
            				count++;
            				progresses[i]=0;
            			}
            			System.out.println(Arrays.toString(progresses));
            		}
            		temp[focus]=count;
            		focus++;
            		idx++;
            		//System.out.println("count : "+count);
            		break;
            	}
            	// 이미 작업이 완료된 경우
            	if(progresses[focus]==0) {
            		focus++;
            		break;
            	}
            	// 작업
            	for(int i=0;i<progresses.length;i++) {
            		if(progresses[i]==0) continue;
            		progresses[i]+=speeds[i];
            		System.out.println(Arrays.toString(progresses));
            	}
            }
        }
        //배포
        
		System.out.println(Arrays.toString(progresses));
		System.out.println("temp : "+Arrays.toString(temp));
		
		answer = new int[idx];
		idx=0;
		for(int i=0;i<temp.length;i++) {
			if(temp[i]!=0) {
				answer[idx]=temp[i];
				idx++;
			}
		}
        
		return answer;
*/