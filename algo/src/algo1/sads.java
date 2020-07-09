package algo1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class sads {

	public static void main(String[] args) {
		Solution33 sol = new Solution33();
		
		String[] currentLanes = {"AB","CD","E"};
		System.out.println(sol.solution(currentLanes));
	}

}

class Solution{
	public int solution(int[] candles){
		int days =0;
		int candleCount = 1;
		boolean flag = false;
		for(int j=0;j<candles.length;j++) {
			Arrays.sort(candles);
			for(int i=candles.length-1;i>candles.length-1-candleCount;i--) {
				//System.out.println(days+"날, : "+Arrays.toString(candles));
				candles[i]--;
				if(candles[i]<0) {
					days--;
					flag=true;
					break;
				}
			}
			days++;
			candleCount++;
			if(flag==true) break;
			System.out.println(days+"날, : "+Arrays.toString(candles));
		}
        return days;
    }
}
class Solution22{
    public int solution(int n, String[] actions){
    	int[][] mat = new int[n+1][n+1];
    	int bagCount=0;
    	//바닥에 놓인 상태
    	for(int i=1;i<=n;i++) {
    		mat[0][i]=i;
    	}
    	for(int[] iarr : mat) {
    		System.out.println(Arrays.toString(iarr));
    	}
    	//액숀
    	for(int i=0;i<actions.length;i++) {
    		String action = actions[i];
    		if(action.contains("PUT")) {
    			System.out.println(1);
    			String[] arr = action.split(" ");
    			int a = Integer.parseInt(arr[1]);
    			int b = Integer.parseInt(arr[3]);
    			
    			if(mat[0][a]==0||mat[0][b]==0) bagCount = -1;
    			
    			mat[b][a]=a;
    			mat[0][a]=0;
    			System.out.println(bagCount);
    			for(int[] iarr : mat) {
    	    		System.out.println(Arrays.toString(iarr));
    	    	}
    			
    		}else if(action.contains("SET")) {
    			System.out.println(2);
    			String[] arr = action.split(" ");
    			int a = Integer.parseInt(arr[1]);
    			
    			if(mat[0][a]==0) bagCount = -1;
    			
    			for(int j=0;j<mat[a].length;j++) {
    				if(mat[a][j]!=0) {
    					mat[0][j]=j;
    					mat[a][j]=0;
    				}
    				
    			}
    			System.out.println(bagCount);
    			for(int[] iarr : mat) {
    	    		System.out.println(Arrays.toString(iarr));
    	    	}
    		}else {
    			System.out.println(3);
    			String[] arr = action.split(" ");
    			int a = Integer.parseInt(arr[1]);
    			int b = Integer.parseInt(arr[3]);
    			
    			if(mat[0][a]==0||mat[0][b]==0) bagCount = -1;
    			
    			int[] temp = new int[n+1];
    			//a의 내용을 temp 옮기기
    			for(int j=0;j<mat[a].length;j++) {
    				temp[j]=mat[a][j];
    			}
    			//b의 내용을 a로 옮기기
    			for(int j=0;j<mat[b].length;j++) {
    				mat[a][j]=mat[b][j];
    			}
    			//temp를 b로 옮기기
    			for(int j=0;j<mat[a].length;j++) {
    				mat[b][j]=temp[j];
    			}
    			System.out.println(bagCount);
    			for(int[] iarr : mat) {
    	    		System.out.println(Arrays.toString(iarr));
    	    	}
    		}
    	}
    	System.out.println("=====================");
    	for(int[] iarr : mat) {
    		System.out.println(Arrays.toString(iarr));
    	}
    	// 바닥에 있는 가방 수 세기
    	if(bagCount!=-1) {
	    	for(int i=0;i<mat[0].length;i++) {
	    		if(mat[0][i]!=0) {
	    			bagCount++;
	    		}
	    	}
    	}
    	// 최종 상황에서 큰 수 가방이 작은 수에 들어가 있는지 확인
    	for(int i=1;i<mat.length;i++) {
    		for(int j=0;j<mat[0].length;j++) {
    			if(i<mat[i][j]) bagCount = -1;
    		}
    	}
        return bagCount;
    }
}

class Solution33{
    public int solution(String[] currentLanes){
    	int count =-1;
    	String car = "";
    	boolean flag = false;
    	int len = currentLanes.length;
    	int j=len-1;
    	int i = j%len;
    	while(true) {
    		
    		
    		
    			if(currentLanes[i].length()!=0) {
	    			System.out.println("전"+currentLanes[i]);
	    			String[] arr = currentLanes[i].split("");
	    			car=arr[0];
	    			currentLanes[i]=currentLanes[i].substring(1);
	    			if(car.equals("D")) {
	    				flag=true;
	        			break;
	        		}
	    			count++;
	    			System.out.println(currentLanes[i]);
	    			System.out.println("car"+car);
    			}
    		
    		System.out.println(Arrays.toString(currentLanes));
    		//System.out.println("car"+car);
    		if(flag) {
    			break;
    		}
    		
    	}
        return count;
    }
}