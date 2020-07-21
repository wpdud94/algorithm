package session2;


import java.util.LinkedList;


public class AT12_Tournament {
	
	/**
	 * 
	 * @param args
	 * 토너먼트에서 A와 B가 만나는 Round수 구하기
	 */

	public static void main(String[] args) {
		Solution12 sol = new Solution12();
		int n = 8;
		int a =5 ;
		int b = 7;
		System.out.println(sol.solution(n, a, b));

	}

}
class Solution12 {
	public int solution(int n, int a, int b){
        int answer = 0;
        LinkedList<Integer> que = new LinkedList<>();
        for(int i=1;i<n+1;i++) {
        	que.add(i);
        }
        System.out.println(que);
        while(true) {
        	System.out.println(que);
        	if(n==que.size()) {
        		n/=2;
        		answer++;
        	}
        	int x = que.poll();
        	int y = que.poll();
            if((x==a||x==b)&&(y==a||y==b)) {
            	break;
            }else {
            	if(x==a||y==a) {
            		que.add(a);
            	}else if(x==b||y==b) {
            		que.add(b);
            	}else {
            		que.add(x);
            	}
            }
        }
        return answer;
    }
}
