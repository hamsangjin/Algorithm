import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        StringBuilder sb = new StringBuilder();
        while (true){
            String input = br.readLine();

            if(input.equals("."))   break;

            Stack<Character> s = new Stack<>();
            for(int i = 0; i < input.length(); i++){
                char c = input.charAt(i);

                if(Character.isAlphabetic(c) || c == ' ' || c == '.')     continue;

                if(map.containsKey(c) && !s.isEmpty() && s.peek() == map.get(c))            s.pop();
                else                                                                        s.push(c);
            }

            if(s.isEmpty())     sb.append("yes").append("\n");
            else                sb.append("no").append("\n");
        }
        System.out.println(sb);
    }
}