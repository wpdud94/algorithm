package session2;


import java.util.Arrays;
import java.util.LinkedList;


public class AT14_SavingBoat {
	
	/**
	 * 
	 * @param args
	 * N명 사람들을 구할 수 있는 최소한의 구명보트 사용 수 구하기
	 */

	public static void main(String[] args) {
		Solution14 sol = new Solution14();
		int[] people = {70,50,80,50};
		int limit = 100;
		System.out.println(sol.solution(people, limit));
	}

}
class Solution14 {
	public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        System.out.println(Arrays.toString(people));
        for(int i=0;i<people.length;i++) {
        	
        }
        return answer;
    }
	int function(int[] people, int limit, int n) {
		int answer = 0;
		for(int i=0;i<people.length;i++) {
			int total = 0;
			for(int j=i;j<n;j++) {
				total += people[j];
			}
			if((100-answer)>(100-total)) answer = total;
		}
		return answer;
	}
}
