package session1;

import java.util.Arrays;

public class AT22 {

	public static void main(String[] args) {
		Solution22 s = new Solution22();
		int[] arr1 = {5,9,7,10};
		System.out.println(Arrays.toString(s.solution(arr1, 5)));
	}

}
class Solution22 {
	public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int[] temp = new int[arr.length];
        int size = 0;
        //1. 나누어 떨어지는 값 답행렬에 할당
        for(int i=0;i<arr.length;i++) {
        	if(arr[i]%divisor==0) {
        		temp[i] = arr[i];
        		size++;
        	}
        }
        if(size==0) {
    		temp[0] = -1;
    		size=1;
    	}
        //System.out.println(size);
        
        //1-1. 사이즈 맞추기
        answer = new int[size];
        int idx = 0;
        for(int i : temp) {
        	if(i!=0) {
        		answer[idx]=i;
        		idx++;
        	}else if(i == -1) {
        		answer[0] = -1;
        	}
        }
        
        //2. 오름차순 정렬
        int temp2= 0;
        for(int j=0;j<size;j++) {
        for(int i=0;i<size-1;i++) {
        	if(answer[i]>answer[i+1]) {
        		temp2 = answer[i+1];
        		answer[i+1] = answer[i];
        		answer[i] = temp2;
        	}
        }
        }
        
        return answer;
    }
}
 