import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(Math.min(Math.min(sc.nextInt(), sc.nextInt()), sc.nextInt()) + Math.min(sc.nextInt(), sc.nextInt()) - 50);

    try {
			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}