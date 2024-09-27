import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] hiarc = br.readLine().split(" ");
        int h = Integer.parseInt(hiarc[0]);
        int i = Integer.parseInt(hiarc[1]);
        int a = Integer.parseInt(hiarc[2]);
        int r = Integer.parseInt(hiarc[3]);
        int c = Integer.parseInt(hiarc[4]);
        
        System.out.println(h*i - a*r*c);
    }
}