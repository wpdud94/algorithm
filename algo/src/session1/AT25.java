package session1;

import java.util.Arrays;
import java.util.Calendar;

public class AT25 {

	public static void main(String[] args) {
		Solution25 s = new Solution25();
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		System.out.println(s.solution(participant, completion));

	}

}
class Solution25 {
	public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        int i;
        for(i=0;i<completion.length;i++) {
        	if(!participant[i].equals(completion[i])) {
        		return participant[i];
        	}
        	System.out.println(i);
        }
        return participant[i];
    }
}
 
