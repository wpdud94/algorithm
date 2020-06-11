package session2;
/**
 * 
 * @author Playdata
 *	수를 표현할 수 있는 자연수 연속의 합
 */
public class AT02_NumberExpression {

	public static void main(String[] args) {
		Solution02 sol = new Solution02();
		int n = 15;
		System.out.println(sol.solution(n));
		

	}

}

class Solution02{
	public int solution(int n) {
        int answer = 0;
        int i=1;
        //범위 줄여가면 더하기
        while(true) {
        	int j=i;
        	int sum=0;
        	while(true) {
        		sum+=j;
        		//System.out.println(sum);
        		if(sum<n) {
        			j++;
        			continue;
        		}else if(sum==n) {
        			answer++;
        			continue;
        		}else {
        			i++;
        			break;
        		}
        	}
        	
        	if(j>((n/2)+2)) break;
        }
        answer++;
        return answer;
    }
}