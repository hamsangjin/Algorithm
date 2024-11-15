import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[4];
		for(int i = 0; i < 4; i++)    arr[i] = Integer.parseInt(br.readLine());
		Arrays.sort(arr);
        
		int[] arr2 = new int[2];
		arr2[0] = Integer.parseInt(br.readLine());
		arr2[1] = Integer.parseInt(br.readLine());
		Arrays.sort(arr2);
		
		System.out.println(arr[1] + arr[2] + arr[3] + arr2[1]);
	}
}