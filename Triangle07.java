import java.util.Scanner;

public class Triangle07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        int i = 0; // perulangan luar
        while (i < n) {
            int j = 0; // perulangan inner
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println(); 
            i++;
        }

        sc.close();
    }
}