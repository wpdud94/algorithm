package session1;

import java.util.Arrays;

public class AT27 {

	public static void main(String[] args) {
		Solution27 s = new Solution27();
		int[] d = {2,2,3,3};
		int budget = 10;
		System.out.println("�ִ� ��ǰ �� : "+s.solution(d, budget));


	}

}
class Solution27 {
	public int solution(int[] d, int budget) {
        int answer = 0;
        int sum=0;
        int cnt = 0;
        //1. ���� ȿ�������� �ֱ� ���� ������������ �ش�. �ֳ��ϸ� �ϳ��� �ְ� �� ������ d���� �۾ƾ� �ϱ� ����
        Arrays.sort(d);
        //System.out.println(Arrays.toString(d));
        //2. �ϴ� �� �� �� ������ �� �� ���� ������ �ش�
        /*for(int num : d) {
        	sum += num;
        	
        }
        System.out.println("sum : "+sum);
        
        while(budget>sum) {
        	budget/=sum;
        	answer += d.length;
        }
        System.out.println("���� ���� : "+budget);
        System.out.println("������� ���� : "+answer);*/
        //3. �ּҷ� ������ �� �ִ� �μ� ���� ���Ѵ�. �̶� �������� �ٷ� ���� ����.
        sum=0;
        for(int num : d) {
        	sum += num;
        	if(budget>sum) {
        		cnt++;
        		continue;
        	}else if(budget==sum){
        		answer = cnt+1;
        		return answer;
        	}else {
        		break;
        	}
        }
        //System.out.println("������� �� �� �ִ� ��ǰ �� : "+cnt);
        //4. 
        // 123 124 125 12n 134 135 13n ... n-2n-1n
        answer = cnt;
        return answer;
    }
}
 
