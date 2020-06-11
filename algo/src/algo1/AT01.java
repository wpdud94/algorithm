package algo1;

import java.util.Arrays;

/**
 * 최소값 만들기
 */

public class AT01 {

	public static void main(String[] args) {
		Solution1 sol = new Solution1();
		System.out.println(sol.solution(101));
	}

}

class Solution1{
	public int solution(int n){
		int cnt = 0;
		for(int j=1;j<n;j++) {
			//각 자리수 별 숫자를 원소로 배열에 넣는다
	        String str = j+"";
	        String[] arr =str.split("");
	        Arrays.sort(arr);
	        //System.out.println(Arrays.toString(arr));
	        //하나라도 같으면 카운트를 증가시킨다. 단, 하나라도 찾으면 멈춘다.
	        for(int i=0;i<arr.length-1;i++) {
	        	if(arr[i].equals(arr[i+1])) {
	        		cnt++;
	        		break;
	        	}
	        }
	        
		}
		System.out.println(cnt);
        int answer = (n-1)-cnt;
        return answer;
    }
}
/*
문제 설명
int n 이 주어집니다.

이때 int n 보다 작으면서 각 자리 수가 서로 다른 양의 정수의 개수를 리턴하세요.

참고 / 제약 사항
n 은 1 이상 10000 이하의 정수입니다.
테스트 케이스
int n = 21리턴(정답): 19
1 과 20 사이의 양의 정수 중에서 11만 빼고 모두 조건에 성립합니다.

int n = 101리턴(정답): 90
int n = 1001리턴(정답): 738
int n = 1리턴(정답): 0
*/