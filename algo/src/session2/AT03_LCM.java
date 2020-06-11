package session2;
/**
 * 최소공배수 구하기
 */
import java.util.ArrayList;
import java.util.Arrays;

public class AT03_LCM {

	public static void main(String[] args) {
		Solution03 sol = new Solution03();
		int[] arr= {2,6,8,14};
		System.out.println(sol.solution(arr));
	}

}

class Solution03{
	public int solution(int[] arr) {
		Arrays.sort(arr);
		int answer = arr[arr.length-1];
		while(true) {
			int cnt =0;
			answer++;
			for(int i=0;i<arr.length;i++) {
				if(answer%arr[i]==0) cnt++;
			}
			if(cnt==arr.length) {
				break;
			}
		}
        
        return answer;
    }
}