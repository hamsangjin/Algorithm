import java.util.Scanner;

class Solution{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int i = 1; i <= T; i++){
            double sum = 0;
			for(int j = 0; j < 10; j++){
                double n = sc.nextDouble();
            	sum += n;
            }
            System.out.println("#" + i + " " + (int)Math.round(sum/10));
		}
	}
}