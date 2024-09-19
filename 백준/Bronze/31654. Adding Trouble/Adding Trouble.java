import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] abc = br.readLine().split(" ");
        
        System.out.println(Integer.parseInt(abc[0]) + Integer.parseInt(abc[1]) == Integer.parseInt(abc[2]) ? "correct!" : "wrong!");
    }
}