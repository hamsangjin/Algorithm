import java.util.Scanner;

public class Main {
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] triangle = new int[n][];
        
        for(int i = 1; i <= n; i++){
            triangle[i-1] = new int[i];
            for(int j = 0; j < i; j++){
                triangle[i-1][j] = sc.nextInt();
            }
        }

        for(int i = n-1; i >= 0; i--){
            for(int j = 0; j < triangle[i].length-1; j++){
                triangle[i-1][j] += Math.max(triangle[i][j], triangle[i][j+1]);
            }
        }

        System.out.println(triangle[0][0]);
    }
}