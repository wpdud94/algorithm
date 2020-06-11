package algo1;

import java.util.Arrays;

/**
 * 최소값 만들기
 */

public class AT02 {

	public static void main(String[] args) {

	}

}

class Solution2{
	public int solution(String code){
        //각 하나의 char로 분리한다.
		int sum =0;
		char[] arr = code.toCharArray();
		//해당 케이스별로 더한다
		for(char c : arr) {
			if(c=='1') {
				sum+=2;
			}else if(c=='7'){
				sum+=3;
			}else if(c=='4'){
				sum+=4;
			}else if(c=='2'||c=='3'||c=='5'){
				sum+=5;
			}else if(c=='0'||c=='6'||c=='9'){
				sum+=6;
			}else {
				sum+=7;
			}
		}
		return sum;
    }
}
/*
위 그림과 같이 각 숫자는 여러개의 대시(막대 모양 기호)로 구성됩니다. 숫자로 이루어진 문자열 메시지 String code가 주어졌을때 이 메시지를 표현하기 위해 필요한 대시의 숫자를 리턴하세요.

 

사용되는 대시의 수

숫자 0 - 6개

숫자 1 - 2개

숫자 2 - 5개

숫자 3 - 5개

숫자 4 - 4개

숫자 5 - 5개

숫자 6 - 6개

숫자 7 - 3개

숫자 8 - 7개

숫자 9 - 6개

참고 / 제약 사항
code는 1개 이상 50개 이하의 문자로 구성됩니다.
code의 각 요소는 문자 '0'과 '9' 사이로 구성 됩니다.
테스트 케이스
String code = "13579"리턴(정답): 21
2 + 5 + 5 + 3 + 6 = 21.

String code = "02468"리턴(정답): 28
*/