package algo1;

import java.util.Arrays;

/**
 * 최소값 만들기
 */

public class AT04 {

	public static void main(String[] args) {

	}

}

class Solution4{
	public String[] solution(String[] sequence){
        //정수로 반환하며 정수배열에 넣기
		int[] arr = new int[sequence.length];
		int idx=0;
		for(String str : sequence) {
			arr[idx]=Integer.parseInt(str);
			idx++;
		}
		//System.out.println(Arrays.toString(arr));
		//정렬
		int temp=0;
		for(int j=0;j<arr.length;j++) {
			for(int i=0;i<arr.length-1;i++) {
				if(arr[i]>arr[i+1]) {
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
		//System.out.println(Arrays.toString(arr));
		//문자열로 다시 반환하며 문자열배열에 넣기
		idx=0;
		for(int i : arr) {
			sequence[idx]=i+"";
			idx++;
		}
        return sequence;
    }
}
/*
문제 설명
정렬할때, 숫자들을 문자열 처럼 취급하는것은 흔한 실수입니다.

 

예를 들어, ["1", "174", "23", "578", "71", "9"]와 같이 정렬된 배열은 해당 요소가 문자열이 아닌 숫자로 해석되는 경우 올바르지 않습니다.

문자열 비교를 사용하여 정렬된 문자열 배열 String[] sequence가 제공됩니다.

숫자 비교를 사용하여 이 시퀀스를 오름차순  정렬하여 리턴하세요.

 

참고 / 제약 사항
sequence는 2개 이상 50개 이하 의 요소를 가지고 있습니다.
sequence의 요소의 길이는 1이상 9이하 입니다.
sequence의 요소는 '0'이상 '9' 이하의 문자로만 이루어져 있습니다.
sequence의 요소는 사전순으로 정렬되어 있습니다.
테스트 케이스
String[] sequence = ["1","174","23","578","71","9"]리턴(정답): ["1","9","23","71","174","578"]
String[] sequence = ["172","172","172","23","23"]리턴(정답): ["23","23","172","172","172"]
*/