import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] skills = new int[4];
        
        for (int i = 0; i < 4; i++) {
            skills[i] = sc.nextInt();
        }
        
        int firstTeam = skills[0] + skills[3];
        int secondTeam = skills[1] + skills[2];
        
        int result = Math.abs(firstTeam - secondTeam);
        
        System.out.println(result);
    }
}