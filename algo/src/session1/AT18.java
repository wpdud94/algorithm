package session1;

import java.util.Arrays;

public class AT18 {

	public static void main(String[] args) {
		Solution18 s = new Solution18();
		//int i = (int) Math.floor((Math.random()*1000000000))+1;
		long i = 1000;
		System.out.println(Arrays.toString(s.solution(i)));
	}

}
 class Solution18{
	 public int[] solution(long n) {
		//배열 생성을 위한 사이즈 파악 후 배열 생성
        int size = (int) Math.log10(n);
        int[] answer = new int[size+1];
        
       //정수를 배열로 전환
        //1. 자릿수 별로 뽑는다.. by 10^n 나눗셈 후 버림
        // 1234 - 123.4*10 = 4
        //1230-12.3*100, = 30
        //(n-(n/10)*10)
        int cnt=0;
        while(n>0) {
        	answer[cnt]= (int) (n%10);
        	n/=10;
        	cnt++;
        }
        //System.out.println(Arrays.toString(answer));
        
        return answer;
    }
 }

 