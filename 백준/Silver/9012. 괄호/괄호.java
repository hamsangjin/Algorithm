import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String ps = sc.next();
            Stack<String> st = new Stack<>();
            for(String x : ps.split("")){
                if(!st.isEmpty() && st.peek().equals("(") && x.equals(")")){
                    st.pop();
                } else{
                    st.push(x);
                }
            }

            if(st.isEmpty())    System.out.println("YES");
            else    System.out.println("NO");
        }
    }
}