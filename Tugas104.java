import java.util.Scanner;
public class Tugas104 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n;
        do{
            System.out.print("Masukkan nilai n: ");
            n = sc.nextInt();
            if (n < 1) {
                System.out.println("n minimal 1, silahkan masukan ulang.");
            }
        } while (n < 1);
            int total = 0;
            for(int baris = 1; baris <= n; baris++){
                for(int angka = 1; angka <= baris; angka ++){
                    System.out.print(angka);
                    if (angka < baris) {
                        System.out.print(" ");
                    }
                    total ++;
                }
                System.out.println();
            }
            System.out.println("Total angka tercetak: " + total);
    }
}