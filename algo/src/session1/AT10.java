package week1;

import java.util.Scanner;

public class AT10 {

	public static void main(String[] args) {
		Solution10 s= new Solution10();
		int[] arr = {1,2,3,4};
		System.out.println(s.solution(arr));
		
		
	}

}
 class Solution10{
	 public double solution(int[] arr) {
        double answer = 0;
        double sum = 0.0;
        for(int i : arr) {
        	sum += i;
        }
        answer = sum / arr.length;
        return answer;
    }
 }

 