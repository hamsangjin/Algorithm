import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        
        for(int i = 1; i <= n; i++){
            String[] nm = br.readLine().split(" ");
            
            System.out.println("Case " + i + ": " + (Integer.parseInt(nm[0]) + Integer.parseInt(nm[1])));
        }
    }
}