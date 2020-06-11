package session2;
/**
 * 
 * @author Playdata
 *	피보나치수열
 */
public class AT01_Pibonacci {

	public static void main(String[] args) {
		Solution01 sol = new Solution01();
		int n = 50;
		System.out.println(sol.solution(n));
		

	}

}

class Solution01{
	 public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n+1];
        arr[0]=0;
        arr[1]=1;
        //1. 피보나치 개념을 적용한다
        //F(n)=F(n-1)+F(n-2), n>=2
        for(int i=2;i<=n;i++) {
        	arr[i]=(arr[i-1]+arr[i-2])%1234567;
        }
        
        //2. 피보나치 수를 1234567로 나눈다. 그 나머지 출력: answer = y%1234567
        answer=arr[n];
        
        return answer;
    }
}