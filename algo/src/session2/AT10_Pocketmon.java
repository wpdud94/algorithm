package session2;

import java.util.ArrayList;
import java.util.Arrays;

public class AT10_Pocketmon {
	
	/**
	 * 
	 * @param args
	 * 포켓몬을 다양성을 최대로 하며 고르기
	 */

	public static void main(String[] args) {
		Solution10 sol = new Solution10();
		int[] nums = {3,1,2,3};
		System.out.println(sol.solution(nums));

	}

}
class Solution10 {
	public int solution(int[] nums) {
        int answer = 1;
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++) {
        	if(nums[i]!=nums[i+1]) list.add(nums[i]);
        }
        if(list.size()>=nums.length/2) {
        	answer=nums.length/2;
        }else {
        	answer=list.size()+1;
        }
        return answer;
    }
}

/*
	public int solution(int[] nums) {
        int answer = 1;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++) {
        	if(nums[i]!=nums[i+1]) answer++;
        	if(answer==nums.length/2) break;
        }
        return answer;
    }
*/