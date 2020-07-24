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
        int answer = people.length;
        Arrays.sort(people);
        //System.out.println(Arrays.toString(people));
        
        
        for(int i=0;i<people.length-1;i++) {
        	if(people[i]>0) {
        		int total=0;
            	int max = 0;
            	int[] temp = new int[2];
            	for(int j=i+1;j<people.length;j++) {
            		total = people[i]+people[j];
            		if(total>limit) {
            			answer++;
            			break;
            		}
            		if(max<total) {
            			max=total;
            			temp[0]=i;
            			temp[1]=j;
            		}
            	}
            	people[temp[0]]=0;
            	people[temp[1]]=0;
            	answer--;
            	System.out.println(Arrays.toString(people));
        	}
        }
        return answer;
    }
	
}
