package session1;

import java.util.Arrays;

public class AT30 {

	public static void main(String[] args) {
		Solution30 s = new Solution30();
		int n = 6;
		int[] arr1 = {46,33,33,22,31,50};
		int[] arr2 = {27,56,19,14,14,10};
		System.out.println(Arrays.toString(s.solution(n, arr1, arr2)));

	}

}
class Solution30 {
	public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		for(int i=0;i<n;i++) {
			String result = Integer.toBinaryString(arr1[i]|arr2[i]);
			answer[i]=result.replaceAll("1","#").replaceAll("0", " ");
		}
/*        int[] temp = new int[n];
        int idx=0;
        //1. 이진수화 + 합치기
        for(int i=0;i<n;i++) {
        	int two = 0;
        	String str="";
        	for(int j=n-1;j>-1;j--) {
        		if(arr1[i]/Math.pow(2, j)>1) {
        			arr1[i]=(int) (arr1[i]-Math.pow(2, j));
        			two+=Math.pow(10, j);
        		}else if(arr1[i]%Math.pow(2, j)==0.0) {
        			two+=Math.pow(10, j);
        			break;
        		}else if(arr1[i]/Math.pow(2, j)>0) {
        			continue;
        		} 
        	}
        	for(int j=n-1;j>-1;j--) {
        		if(arr2[i]/Math.pow(2, j)>1) {
        			arr2[i]=(int) (arr2[i]-Math.pow(2, j));
        			two+=Math.pow(10, j);
        		}else if(arr2[i]%Math.pow(2, j)==0.0) {
        			two+=Math.pow(10, j);
        			break;
        		}else if(arr2[i]/Math.pow(2, j)>0) {
        			continue;
        		}
        	}
        	temp[i]= two;
        }
        //System.out.println(Arrays.toString(temp));
        //2. 0이면 공백 아니면 #
        for(int i : temp) {
        	String str = "";
        	int t=n-1;
        	while(t>-1) {
        		if(i/Math.pow(10, t)>=1) {
        			i=i-(int) ((int)(i/Math.pow(10, t))*Math.pow(10, t));
        			str+="#";
        		}else {
        			str+=" ";
        		}
        		t--;
        	}
        	answer[idx]= str;
        	idx++;
        }
        
       // System.out.println(Arrays.toString(answer));
       */
        return answer;
    }
}
 
