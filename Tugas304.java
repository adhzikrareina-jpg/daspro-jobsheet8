import java.util.Scanner;
public  class Tugas304 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahToko;
        do{
            System.out.print("Masukkan jumlah toko: ");
            jumlahToko = sc.nextInt();
            if (jumlahToko < 1) {
                System.out.println("Jumlah toko minimal 1. Silahkan masukkan ulang.");
            }
        } while (jumlahToko < 1);
        String ringkasan = "";
        int totalSemua = 0;
        int barangTerbanyak = -1;
        int tokoTerbanyak = 0;

        for(int toko = 1; toko <= jumlahToko; toko ++){
            int jumlahPelanggan;
            do{
                System.out.print("Toko " + toko + "- jumlah pelanggan: ");
                jumlahPelanggan = sc.nextInt();
                if (jumlahPelanggan < 0) {
                    System.out.println("Tidak boleh negatif, silahkan masukkan ulang.");
                }
            } while (jumlahPelanggan < 0 );
            int totalBarangToko = 0;
            for(int pelanggan = 1; pelanggan <= jumlahPelanggan; pelanggan ++){
                int barang;
                do{
                    System.out.print("Pelanggan " + pelanggan + "- jumlah barang: ");
                    barang = sc.nextInt();
                    if (barang < 0) {
                        System.out.println("Tidak boleh negatif, silahkan masukkan ulang.");
                    }
                } while (barang < 0 );
                totalBarangToko += barang;
            }
            ringkasan += "Toko " + toko + "- pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangToko + "\n";
            totalSemua += totalBarangToko;

            if (totalBarangToko > barangTerbanyak) {
                barangTerbanyak = totalBarangToko;
                tokoTerbanyak = toko;
            }
        }
        System.out.println();
        System.out.print(ringkasan);
        System.out.println("Total barang seluruh toko: " + totalSemua);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
    }
}