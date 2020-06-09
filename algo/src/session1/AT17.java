package week1;

import java.util.*;

public class AT17 {

	public static void main(String[] args) {
		Solution17 s = new Solution17();
		System.out.println(s.solution(1543948));
	}

}
 class Solution17{
	 public long solution(long n) {
        long answer = 0;
        int size=0;
        long j=1;
        while(n/j>=1) {
        	j=j*10;
        	size++;
        }
        int idx=0;
        long[] larr = new long[size];
        for(long i=10;i<Math.pow(10, size+1);i=i*10 ) {
        	larr[idx] =(long) ((n-(n/i)*i)/(0.1*i));
        	idx++;
        }
        long temp;
        for(int k=0;k<larr.length;k++){
        for(int i=0;i<larr.length-1;i++) {
        	if(larr[i]<larr[i+1]) {
        		temp = larr[i+1];
        		larr[i+1]=larr[i];
        		larr[i]=temp;
        	}
        }
        }
        idx=0;
        for(long m=(long) Math.pow(10, size-1);m>=1;m=m/10 ) {
        	answer += larr[idx]*m;
        	idx++;
        }
        return answer;
    }
 }

 