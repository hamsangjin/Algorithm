import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		int D = Integer.parseInt(br.readLine());
		
		//월 일만 잘 분리해서 출력해주면 된다.
		if(M < 2) {
			System.out.println("Before");
		}else if(M == 2){
			if(D < 18) {
				System.out.println("Before");
			}else if(D == 18) {
				System.out.println("Special");
			}else {
				System.out.println("After");
			}
		}else {
			System.out.println("After");
		}
	}

}