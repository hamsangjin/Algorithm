import java.io.*;

public class Solution {
	static String rh = "";
	static String rm = "";
	static String rs = "";
	
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int t = Integer.parseInt(br.readLine());
			for(int i = 1; i <= t; i++) {
				String[] before = br.readLine().split(":");
				int h1 = Integer.parseInt(before[0]);
				int m1 = Integer.parseInt(before[1]);
				int s1 = Integer.parseInt(before[2]);
				
				String[] after = br.readLine().split(":");
				int h2 = Integer.parseInt(after[0]);
				int m2 = Integer.parseInt(after[1]);
				int s2 = Integer.parseInt(after[2]);
				
				if(h1 > h2)			cal(h1, m1, s1, h2+24, m2, s2);
				else if(h1 == h2) {
					if(m1 > m2)		cal(h1, m1, s1, h2+24, m2, s2);
					else if(m1 == m2) {
						if(s1 > s2)	cal(h1, m1, s1, h2+24, m2, s2);
						else		cal(h1, m1, s1, h2, m2, s2);
					} else			cal(h1, m1, s1, h2, m2, s2);
				} else				cal(h1, m1, s1, h2, m2, s2);
				
				if(rh.length() == 1)	rh = "0"+rh;
				if(rm.length() == 1)	rm = "0"+rm;
				if(rs.length() == 1)	rs = "0"+rs;
				
				System.out.println("#" + i + " " + rh + ":" + rm + ":" + rs);
			}
		} catch (Exception e) {}
	}
		
	public static void cal(int h1, int m1, int s1, int h2, int m2, int s2) {
		if(s1 > s2) {
			if((m2 - 1) < 0) {
				h2 -= 1;
				m2 += 60;
			}
			m2 -= 1;
			s2 += 60;
		}
		rs = Integer.toString(s2-s1);
		
		if(m1 > m2) {
			h2 -= 1;
			m2 += 60;
		}
		rm = Integer.toString(m2 - m1);
		
		rh = Integer.toString(h2 - h1);
	}
}