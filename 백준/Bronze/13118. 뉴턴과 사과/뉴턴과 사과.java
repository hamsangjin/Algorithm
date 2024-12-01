import java.util.Scanner;
 
public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        int[] pointArr = new int[4];
        for (int i = 0; i < 4; i++) {
            pointArr[i] = sc.nextInt();
        }
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        
        boolean isCrash = false;
        for (int i = 0; i < 4; i++) {
            if (pointArr[i] == x) {
                System.out.print(i + 1);
                isCrash = true;
            }
        }
        
        if (isCrash == false) {
             System.out.print(0);
        }
 
    }
}