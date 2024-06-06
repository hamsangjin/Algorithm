import java.io.*;
import java.util.*;

public class Main {
    static Map<String, List<String>> map;
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int n = Integer.parseInt(br.readLine());

            map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                String[] input = br.readLine().split(" ");
                map.put(input[0], new ArrayList<>());
                map.get(input[0]).add(input[1]);
                map.get(input[0]).add(input[2]);
            }

            dfs1("A"); System.out.println();
            dfs2("A"); System.out.println();
            dfs3("A");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void dfs1(String node){
        if(node.equals(".")) return;
        else{
            System.out.print(node);
            List<String> strs = map.get(node);
            dfs1(strs.get(0));
            dfs1(strs.get(1));
        }
    }

    public static void dfs2(String node){
        if(node.equals(".")) return;
        else{
            List<String> strs = map.get(node);
            dfs2(strs.get(0));
            System.out.print(node);
            dfs2(strs.get(1));
        }
    }

    public static void dfs3(String node){
        if(node.equals(".")) return;
        else{
            List<String> strs = map.get(node);
            dfs3(strs.get(0));
            dfs3(strs.get(1));
            System.out.print(node);
        }
    }
}