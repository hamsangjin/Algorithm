import java.io.*;
import java.util.*;

public class Main {
    static class Member {
        int age;
        String name;
        int order;

        public Member(int age, String name, int order) {
            this.age = age;
            this.name = name;
            this.order = order;
        }
    }

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Member> members = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            members.add(new Member(Integer.parseInt(st.nextToken()), st.nextToken(), i));
        }

        Collections.sort(members, (m1, m2) -> {
            if (m1.age != m2.age) return Integer.compare(m1.age, m2.age);
            return Integer.compare(m1.order, m2.order);
        });

        StringBuilder sb = new StringBuilder();
        for (Member m : members)        sb.append(m.age).append(" ").append(m.name).append("\n");

        System.out.println(sb);
    }
}