import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int wavelength = Integer.parseInt(br.readLine());

        if (620 <= wavelength && wavelength <= 780) {
            System.out.println("Red");
        } else if (590 <= wavelength && wavelength < 620) {
            System.out.println("Orange");
        } else if (570 <= wavelength && wavelength < 590) {
            System.out.println("Yellow");
        } else if (495 <= wavelength && wavelength < 570) {
            System.out.println("Green");
        } else if (450 <= wavelength && wavelength < 495) {
            System.out.println("Blue");
        } else if (425 <= wavelength && wavelength < 450) {
            System.out.println("Indigo");
        } else if (380 <= wavelength && wavelength < 425) {
            System.out.println("Violet");
        }
    }
}