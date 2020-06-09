package week1;

import java.util.Arrays;
import java.util.Calendar;

public class AT24 {

	public static void main(String[] args) {
		Solution24 s = new Solution24();
		System.out.println(s.solution(5, 24));

	}

}
class Solution24 {
	public String solution(int a, int b) {
        String answer = "";
        // % 이용하면 같은 남은 수면 같은 요일
        // 시작 요일
        switch (a) {
		case 1: case 4: case 7:
			String[] cal1 = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
			answer = cal1[(b%7)];
			break;
		case 2: case 8:
			String[] cal2 = {"SUN", "MON", "TUE", "WED","THU", "FRI", "SAT"};
			answer = cal2[(b%7)];
			break;
		case 3: case 11:
			String[] cal3 = {"MON", "TUE", "WED","THU", "FRI", "SAT","SUN"};
			answer = cal3[(b%7)];
			break;
		case 5:
			String[] cal5 = {"SAT","SUN","MON", "TUE", "WED", "THU", "FRI"};
			answer = cal5[(b%7)];
			break;
		case 6:
			String[] cal6 = {"TUE", "WED", "THU", "FRI","SAT","SUN","MON"};
			answer = cal6[(b%7)];
			break;
		case 9: case 12:
			String[] cal9 = {"WED", "THU", "FRI","SAT","SUN","MON", "TUE"};
			answer = cal9[(b%7)];
			break;
		case 10:
			String[] cal10 = {"FRI","SAT","SUN","MON", "TUE", "WED", "THU"};
			answer = cal10[(b%7)];
			break;
		}
        return answer;
    }
}
 
