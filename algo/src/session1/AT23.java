package session1;

import java.util.Arrays;

public class AT23 {

	public static void main(String[] args) {
		Solution23 s = new Solution23();
		int[] answers = {1,3,2,4,2,2,4};
		System.out.println(Arrays.toString(s.solution(answers)));
	}

}
class Solution23 {
	public int[] solution(int[] answers) {
        int[] human1= {1,2,3,4,5};
        int[] human2= {2,1,2,3,2,4,2,5};
        int[] human3= {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        // ans.idx/human.len = human안에서 반복으로 돎
        int len1= human1.length;
        int len2= human2.length;
        int len3= human3.length;
        //1. 찍는 것의 해답 개수 확인
        int size1 =0;
        int size2 =0;
        int size3 =0;
        
 
        for(int i=0;i<answers.length;i++) {
        	if(answers[i]==human1[(i%len1)]) {
        		size1++;
        	}
        }
        for(int j=0;j<answers.length;j++) {
        	if(answers[j]==human2[(j%len2)]) {
        		size2++;
        	}
        }
        for(int k=0;k<answers.length;k++) {
        	if(answers[k]==human3[(k%len3)]) {
        		size3++;
        	}
        }
        //System.out.println(size1);
        //System.out.println(size2);System.out.println(size3);
        int flag = 0;
        int[] temp1 = new int[3];
        int[] temp2 = new int[1];
        int[] temp3 = new int[2];
        if(size1==size2 && size2==size3) {
        	temp1[0] = 1;
        	temp1[1] = 2;
        	temp1[2] = 3;
        	flag=0;
        }else if(size1>size2 && size1>size3) {
    		temp2[0] =1;
    		flag=1;
    	}else if(size2>size1 && size2>size3) {
    		temp2[0] =2;
    		flag=1;
    	}else if(size3>size1 && size3>size2) {
    		temp2[0] =3;
    		flag=1;
    	}
    	else if(size1==size2 && size1>size3) {
    		temp3[0] =1;
    		temp3[1] =2;
    		flag=2;
    	}else if(size1==size3 && size1>size2) {
    		temp3[0] =1;
    		temp3[1] =3;
    		flag=2;
    	}else if(size3==size2 && size3>size1) {
    		temp3[0] =2;
    		temp3[1] =3;
    		flag=2;
    	}
    	
        
        int[] answer = {};
        if(flag==0) {
        	answer = temp1;
        }else if(flag ==2){
        	answer = temp2;
        }else {
        	answer = temp3;
        }
       
        return answer;
    }
}
 
