import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String alp = br.readLine().toLowerCase();

        if(alp.equals("n"))    System.out.println("Naver D2");
        else                   System.out.println("Naver Whale");
    }
}