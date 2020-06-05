package week1;

import java.util.Arrays;

public class AT27 {

	public static void main(String[] args) {
		Solution27 s = new Solution27();
		int[] d = {2,2,3,3};
		int budget = 10;
		System.out.println("최대 물품 수 : "+s.solution(d, budget));


	}

}
class Solution27 {
	public int solution(int[] d, int budget) {
        int answer = 0;
        int sum=0;
        int cnt = 0;
        //1. 가장 효율적으로 주기 위해 오름차순으로 준다. 왜냐하면 하나씩 주고 그 다음은 d값이 작아야 하기 때문
        Arrays.sort(d);
        //System.out.println(Arrays.toString(d));
        //2. 일단 다 줄 수 있으면 줄 수 있을 때까지 준다
        /*for(int num : d) {
        	sum += num;
        	
        }
        System.out.println("sum : "+sum);
        
        while(budget>sum) {
        	budget/=sum;
        	answer += d.length;
        }
        System.out.println("남은 예산 : "+budget);
        System.out.println("현재까지 개수 : "+answer);*/
        //3. 최소로 나눠줄 수 있는 부서 수를 구한다. 이때 딱맞으면 바로 답을 낸다.
        sum=0;
        for(int num : d) {
        	sum += num;
        	if(budget>sum) {
        		cnt++;
        		continue;
        	}else if(budget==sum){
        		answer = cnt+1;
        		return answer;
        	}else {
        		break;
        	}
        }
        //System.out.println("현재까지 줄 수 있는 물품 수 : "+cnt);
        //4. 
        // 123 124 125 12n 134 135 13n ... n-2n-1n
        answer = cnt;
        return answer;
    }
}
 
