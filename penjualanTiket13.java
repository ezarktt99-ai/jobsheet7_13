import java.util.Scanner;

public class penjualanTiket13 {
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       int jumlahTiket, jumlahPelanggan;
       int hargaTiket = 50000;
       int totalTiket = 0;
       double totalPendapatan = 0;
       int totalHargaTiket;
       double diskon = 0;
       double biayaBayar;
       double subTotal;

       System.out.print("Masukkan jumlah pelanggan: ");
       jumlahPelanggan = sc.nextInt();

       for (int i = 1; i <= jumlahPelanggan; i++) {
        System.out.print("masukkan jumlah tiket: ");
        jumlahTiket = sc.nextInt();
        if (jumlahTiket <= 0) {
            System.out.println("input tidak valid, silahkan coba lagi");
            continue;
        }
        if (jumlahTiket > 10) {
            diskon = 0.15;
        }else if (jumlahTiket > 4) {
            diskon = 0.10;
        }
        subTotal = jumlahTiket * hargaTiket;
        biayaBayar = subTotal - (subTotal * diskon);
        totalTiket += jumlahTiket;
        totalPendapatan += biayaBayar;
        System.out.println("Total yang harus dibayar: Rp." + (int) biayaBayar);
       }
       System.out.println("total tiket terjual: " + totalTiket);
       System.out.println("total penjualan tiket: Rp. " + (int) totalPendapatan);
       sc.close();

    }
}
