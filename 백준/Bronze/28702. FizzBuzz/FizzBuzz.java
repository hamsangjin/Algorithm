import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        for(int i = 0; i < 3; i++){
            try{
                int a = Integer.parseInt(br.readLine()) + (3-i);
                if(a % 3 == 0 && a % 5 == 0)    System.out.println("FizzBuzz");
                else if(a % 3 == 0)             System.out.println("Fizz");
                else if(a % 5 == 0)             System.out.println("Buzz");
                else                            System.out.println(a);
                break;
            } catch (Exception e){
                continue;
            }
        }
    }
}