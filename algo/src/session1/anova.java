package session1;

public class anova {

	public static void main(String[] args) {
		solution s = new solution();
		int[] A = {230,226,228,232,226};
		int[] B = {226,227,224,229,226,230,226,225,226,228};
		int[] C = {228,231,228,233,230,230,230,232};
		int[] t = {230,226,228,232,226,226,227,224,229,226,230,226,225,226,228,228,231,228,233,230,230,230,232};
		double[] ans = s.sol(t, A, B, C);
		for(double a : ans) System.out.println(a);

	}

}

class solution{
	public double[] sol(int[] t, int[] A,int[] B, int[] C){
		double[] answer = new double[3];
		double SST;
		double SSB;
		double SSW;
				
		// total mean
		double sum=0;
		for(int i=0;i<t.length;i++) {
			sum += t[i];
		}
		double avg = sum/t.length;
		
		//SST
		double psumt=0;
		for(int in:t) {
			psumt += (in-avg)*(in-avg);
		}
		SST = psumt;
		
		//SSB
		double psumb=0;
		double suma=0.0;
		double sumb=0.0;
		double sumc=0.0;
		double ma=0.0;
		double mb=0.0;
		double mc=0.0;
		for(int inta : A) {
			suma += inta;
		}
		ma = suma/A.length;
		for(int intb : B) {
			sumb += intb;
		}
		mb = sumb/B.length;
		for(int intc : C) {
			sumc += intc;
		}
		mc = sumc/C.length;
		
		SSB = A.length*(ma-avg)*(ma-avg)+B.length*(mb-avg)*(mb-avg)+C.length*(mc-avg)*(mc-avg);
		
		//SSW
		double varan= 0.0;
		double varbn= 0.0;
		double varcn= 0.0;
		
		for(int a=0;a<A.length;a++) {
			varan+=(A[a]-ma)*(A[a]-ma);
		}
		for(int a=0;a<B.length;a++) {
			varbn+=(B[a]-mb)*(B[a]-mb);
		}
		for(int a=0;a<C.length;a++) {
			varcn+=(C[a]-mc)*(C[a]-mc);
		}
		SSW = varan+varbn+varcn;

		answer[0] = SST;
		answer[1] = SSB;
		answer[2] = SSW;
		
		return answer;
	}
	
}