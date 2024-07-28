import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String[] ab = br.readLine().split(" ");

            int a = Integer.parseInt(ab[0]);
            int b = Integer.parseInt(ab[1]);
            
            if(a == 0 && b == 0)    break;
            
            System.out.println(a + b);
        }
    }
}