package session2;
public class AT09_JumpTeleport {
	
	/**
	 * 
	 * @param args
	 * 점프와 순간이동
	 */

	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println("ans : "+sol.solution(5000));

	}

}
class Solution{
	int solution(int n){
	    int ans = 0;
	    //2의 배수면 나눈다  +홀수면 1뺀다, ++
	    while(n>0) {
	    	System.out.println(n);
	    	if(n%2==0) {
	    		n/=2;
	    	}else {
	    		n--;
	    		ans++;
	    	}
	    }
	    return ans;
	}
}