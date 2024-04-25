import java.util.Scanner;

class Solution{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

        for(int i = 1; i <= T; i++){
            int sum = 0;
            for(int j = 0; j < 10; j++){
                int n = sc.nextInt();
				if(n % 2 == 1)	sum += n;
            }
            System.out.println("#" + i + " " + sum);
        }      
	}
}