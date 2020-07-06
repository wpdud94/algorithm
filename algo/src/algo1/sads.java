package algo1;

public class sads {

	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution(41,46, 56));

	}

}

class Solution{
    public int solution(int a, int b, int range){
        int min = 0;
        int max =0;
        if(a>b){
            min=b;
            max=a;
        }else {
            min=a;
            max=b;
        }

        int sum=0;
        for(int i=1;i<=range;i++){
            if(i%min==0||i%max==0){
                sum+=i;
            }
        }
        return sum;
    }
}
