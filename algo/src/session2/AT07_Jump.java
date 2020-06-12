package session2;

/**
 * 멀리 뛰기
 */

public class AT07_Jump {

	public static void main(String[] args) {
		Solution07 sol = new Solution07();
		System.out.println(sol.solution(4));
	}

}

class Solution07{
	public long solution(int n) {
        long answer = 0;
        //2의 개수에 따른 조합수.. 2개 q개 일 때 가능한 배치 경우의 수
        //pCq... maxp=n, maxq=n/2... nC0, n-1C1, ... ,n-maxqCmaxq
        //조합 pCq연산
        int son=1;
        int mother=1;
        int com=0;
        for(int p=n-1;p>=n/2;p--) {
        	int q = 1;
        	while(q>0) {
            	son*=p;
            	mother*=q;
            	com=son/mother;
            	p--;
            	q--;
            }
        	answer+=com;
        	
        	q++;
        	System.out.println(q);
        	if(q>n/2) break;
            
        }
        answer++;
        answer = answer%1234567;
        return answer;
    }
}