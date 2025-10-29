import java.util.Scanner;

public class NilaiKelompok07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1; 
        while (i <= 6) { //6 kelompok
            System.out.println("Kelompok " + i);
            double totalNilai = 0;

            // inner loop 
            for (int j = 1; j <= 5; j++) {
                System.out.print(" Nilai dari Kelompok Penilai " + j + " = ");
                double nilai = sc.nextDouble();
                totalNilai += nilai;
            }

            double rataNilai = totalNilai / 5;
            System.out.println("Rata-rata Nilai Kelompok " + i + " = " + rataNilai);
            i++;
        }

        sc.close();
    }
}
