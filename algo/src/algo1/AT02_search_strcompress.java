package algo1;

public class AT02_search_strcompress {
	public static void main(String[] args) {
		System.out.println("abc".substring(0, 1));
	}
}
class Solution02 {
    public int solution(String s) {
        int answer = 0;
        int minL = s.length();
        int unit=0;
        for(unit=0;unit<s.length();unit++) {
        	
        }
        return answer;
    }
    
    int searchSame(String s, int unit, int minL) {
    	for(int i=0;i<s.length();i++) {
    		if(s.substring(i,unit+i+1));
    	}
    	
    	
    	
		return unit;
    }
}
/*
1. 단위 개수 1~length 하나하나 : 단위 수 == length?
2. 단위 별로 연속으로 반복되는가?
	인덱스 + 단위
3. 압축한 문자열 길이 구하기
4. min값 처리

*/