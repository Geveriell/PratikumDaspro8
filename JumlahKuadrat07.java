import java.util.Scanner;

public class JumlahKuadrat07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        int jumlah = 0, jumlahKuadrat = 0;

        for (int i = 1; i <= n; i++) {
            jumlah += i;
            jumlahKuadrat += i * i;
            System.out.println("n = " + i + " → jumlah = " + jumlah + ", jumlah kuadrat = " + jumlahKuadrat);
        }
    }
}
