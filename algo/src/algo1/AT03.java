package algo1;

import java.util.Arrays;

/**
 * 최소값 만들기
 */

public class AT03 {

	public static void main(String[] args) {

	}

}

class Solution3{
	public int solution(int[] arr, int num){
	       int cap=0;
			int idx=0;
			int days=0;
			while(true) {
				if(idx<arr.length) {
					cap+=arr[idx];
					idx++;
				}
				if(cap!=0) {
					cap-=num;
					days++;
				}
				if(cap<=0) {
					cap=0;
				}
				//System.out.println(cap);
				
				if(cap==0&idx==arr.length) {
					break;
				}
				
			}
			return days;
	    }
}
/*
문제 설명
당신은 냉장고 A/S센터에서 일을 하고 있습니다.

이 A/S센터에서는 하루에 최대 int num개의 냉장고를 고칠 수 있습니다.

 

당신의 임무는 매일 아침 센터에 도착하는 냉장고의 수에 대한 기록을 고려할 때, 모든 냉장고를 수리하기 위해 며칠을 일해야 되는지 계산하는것 입니다.

 

예를 들어, 센터에서 하루에서 최대 8개의 냉장고를 수리할 수 있고 5일 동안 각각 10개, 0개, 0개, 4개, 20개의 냉장고를 받는다고 가정하면, 센터는 1일과 2일에 운영되고 3일에는 일하지 않으며, 4일에서 7일 까지는 다시 운영됩니다. 일하는 일을 모두 합치면, 모든 냉장고를 수리하기 위해 6일이 소요 되는것을 알 수 있습니다.

 

각 일자별로 도착하는 냉장고의 개수를 나타내는, 정수 배열 타입 int[] arr와 하루에 최대로 고칠 수 있는 냉장고의 수를 나타내는 정수 int num이 주어집니다.

 

모든 냉장고를 고치기 위하여 필요한 작업 일수를 리턴하세요.

참고 / 제약 사항
arr는 1개 이상, 20개 이하 입니다.
arr의 각 요소의 값은 0이상 100이하 입니다.
day는 1이상 50이하 입니다.
테스트 케이스
int[] arr = [10,0,0,4,20]
int num = 8리턴(정답): 6
문제의 예제 입니다.

int[] arr = [0,0,0]
int num = 10리턴(정답): 0
int[] arr = [100,100]
int num = 10리턴(정답): 20
int[] arr = [27,0,0,0,0,9]
int num = 9리턴(정답): 4
int[] arr = [6,5,4,3,2,1,0,0,1,2,3,4,5,6]
int num = 3리턴(정답): 15
*/