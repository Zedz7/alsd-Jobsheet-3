import java.util.Scanner;

public class DosenDemo06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen06[] daftarDosen = new Dosen06[3];

        for (int i = 0; i < daftarDosen.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            
            System.out.print("Kode          : ");
            String kode = sc.nextLine();
            
            System.out.print("Nama          : ");
            String nama = sc.nextLine();
            
            System.out.print("Jenis Kelamin : ");
            String jk = sc.nextLine();
            boolean jenisKelamin = jk.equalsIgnoreCase("Pria"); 
            
            System.out.print("Usia          : ");
            int usia = Integer.parseInt(sc.nextLine());

            System.out.println("--------------------------------");

            daftarDosen[i] = new Dosen06(kode, nama, jenisKelamin, usia);
        }
        System.out.println("\n----- Data Semua Dosen -----");
        DataDosen06.dataSemuaDosen(daftarDosen);

        System.out.println("\n----- Jumlah Dosen Berdasarkan Jenis Kelamin -----");
        DataDosen06.jumlahDosenPerJenisKelamin(daftarDosen);

        System.out.println("\n----- Rata-rata Usia Dosen Berdasarkan Jenis Kelamin -----");
        DataDosen06.rerataUsiaDosenPerJenisKelamin(daftarDosen);

        System.out.println("\n-----  Dosen Paling Tua -----");
        DataDosen06.infoDosenPalingTua(daftarDosen);

        System.out.println("\n----- Dosen Paling Muda -----");
        DataDosen06.infoDosenPalingMuda(daftarDosen);
    }
}