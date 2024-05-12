import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int t = Integer.parseInt(br.readLine());
			
			for(int i = 1; i <= t; i++) {
				String[] cmd = br.readLine().split(" ");
				int n = Integer.parseInt(cmd[0]);
				
				int cnt = 0;
				int sum = 0;
				int o = 1;
				int b = 1;
				String prev = "";
				for(int j = 1; j < cmd.length-1; j+= 2) {
					String r = cmd[j];
					int x = Integer.parseInt(cmd[j+1]);
					
					if(r.equals("B")) {
						if(r.equals(prev)) {
							cnt += Math.abs(x-b) + 1;
							sum += Math.abs(x-b) + 1;
						} else {
							if(Math.abs(x-b) <= cnt) {
								cnt = 1;
								sum ++;
							} else {
								cnt = (Math.abs(x-b) - cnt) + 1;
								sum += cnt;
							}
						}
						b = x;
						prev = "B";
					} else if(r.equals("O")) {
						if(r.equals(prev)) {
							cnt += Math.abs(x-o) + 1;
							sum += Math.abs(x-o) + 1;
						} else {
							if(Math.abs(x-o) <= cnt) {
								cnt = 1;
								sum ++;
							} else {
								cnt = (Math.abs(x-o) - cnt) + 1;
								sum += cnt;
							}
						}
						o = x;
						prev = "O";
					}
				}
				System.out.printf("#%d %d\n", i, sum);
			}
		} catch (IOException e) {}
	}
}