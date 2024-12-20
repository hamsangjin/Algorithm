public class Main {
    public static void main(String[] args) {
        boolean[] ch = new boolean[10001];

        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= 10000; i++) {

            if(!ch[i])  sb.append(i).append("\n");

            int sum = i;
            for(char c : Integer.toString(i).toCharArray())     sum += c - '0';

            if(sum <= 10000)    ch[sum] = true;
        }
        System.out.println(sb.toString().trim());
    }
}