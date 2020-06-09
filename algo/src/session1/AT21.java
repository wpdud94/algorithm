package week1;

import java.util.Arrays;

public class AT21 {

	public static void main(String[] args) {
		Solution21 s = new Solution21();
		int x = 13;
		System.out.println(s.solution(x));

	}

}
class Solution21 {
	 public boolean solution(int x) {
        boolean answer = true;
        //1. 자릿수별 숫자 분리
        int[] temp = new int[(int) Math.log10(x)+1];
        int y= x;
        int idx = 0;
        while(x>0) {
        	temp[idx] = x%10;
        	x/=10;
        	idx++;
        }
        //System.out.println(Arrays.toString(temp));
        //2. 숫자 합
        int sum = 0;
        for(int i=0;i<temp.length;i++) {
        	sum+= temp[i];
        }
        //System.out.println(sum);
        //3 숫자 합을 나누어 나머지가 0
        if(y%sum!=0) answer = false;
        
        return answer;
    }
}
 