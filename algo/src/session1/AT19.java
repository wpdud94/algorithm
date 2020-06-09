package week1;

public class AT19 {

	public static void main(String[] args) {
		Solution19 s = new Solution19();
		String phone_number="01033334444";
		System.out.println(s.solution(phone_number));
	}

}
class Solution19 {
    public String solution(String phone_number) {
        String answer = "";
        //핸들링할 수 있도록 String 배열로 한다...spilit
        String[] arr= phone_number.split("");
        
        
        //size-5까지가 가려야할 부분
        for(int i=0;i<arr.length-4;i++) {
        	arr[i]="*";
        }
        
        //System.out.println(Arrays.toString(arr));
        //배열을 다시 String, answer에 할당
        for(int i=0;i<arr.length;i++) {
        	answer += arr[i];
        }
        return answer;
    }
}
 