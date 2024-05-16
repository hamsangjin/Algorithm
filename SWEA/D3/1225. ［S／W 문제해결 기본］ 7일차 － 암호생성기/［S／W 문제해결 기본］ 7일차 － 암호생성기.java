import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			for(int t = 1; t <= 10; t++) {
				int n = Integer.parseInt(br.readLine());
				
				String[] temp = br.readLine().split(" ");
				Queue<Integer> q = new LinkedList<>();
				for (int i = 0; i < 8; i++)	q.add(Integer.parseInt(temp[i]));
				
				boolean flag = true;
				while(flag) {
					for(int i = 1; i <= 5; i++) {
						int x = q.poll();
						int y = x - i;
						if(y > 0)	q.add(y);
						else {
							q.add(0);
							flag = false;
							break;
						}
					}
				}
				
				String result = "";
				for(Integer x : q) {
					result += x + " ";
				}
				
				System.out.printf("#%d %s\n", t, result);
			}
		} catch (IOException e) {}
	}
}