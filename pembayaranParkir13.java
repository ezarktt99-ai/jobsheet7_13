import java.util.Scanner;

public class pembayaranParkir13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi, total = 0;
        
        do {
            System.out.print("masukkan jenis kendaraan (1: mobil, 2: mobil, 0: keluar): ");
            jenis = sc.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("masukkan durasi (jam): ");
                durasi = sc.nextInt();

                if (jenis == 1) {
                    total += durasi * 3000;
                }else {
                    total += durasi * 2000;
                }
            }

        }while (jenis!= 0);

        System.out.println("total pembayaran parkir: Rp. " + total);

        
    }
    
}
