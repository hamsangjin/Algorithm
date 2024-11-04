import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < M; i++) {
            String[] cmd = br.readLine().split(" ");

            switch (cmd[0]){
                case "add":
                    set.add(cmd[1]);
                    break;
                case "remove":
                    set.remove(cmd[1]);
                    break;
                case "check":
                    if(set.contains(cmd[1]))        sb.append(1).append("\n");
                    else                            sb.append(0).append("\n");
                    break;
                case "toggle":
                    if(set.contains(cmd[1]))        set.remove(cmd[1]);
                    else                            set.add(cmd[1]);
                    break;
                case "all":
                    set = new HashSet<>(Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"));
                    break;
                case "empty":
                    set = new HashSet<>();
                    break;
            }
        }
        System.out.println(sb);
    }
}