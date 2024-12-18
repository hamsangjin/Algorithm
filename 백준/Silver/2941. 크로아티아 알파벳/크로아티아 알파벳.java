import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(br.readLine()
                .replace("c=", "@")
                .replace("c-", "@")
                .replace("dz=", "@")
                .replace("d-", "@")
                .replace("lj", "@")
                .replace("nj", "@")
                .replace("s=", "@")
                .replace("z=", "@")
                .length());
    }
}