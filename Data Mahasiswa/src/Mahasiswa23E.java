import java.util.Scanner;

public class Mahasiswa23E {

    public static void main(String[] args) {

        // m23.readMahasiswa();
        // m23.insertMahasiswa("20230040042", "Budi", "Nusa Putra", "L");
        System.out.println("1. Tampilkan Data Mahasiswa");
        System.out.println("2. Input Data Mahasiswa");
        System.out.println("3. Cari Data Mahasiswa");
        System.out.println("4. Ubah Data Mahasiswa");
        System.out.println("5. Hapus Data Mahasiswa");
        System.out.println("6. Exit");

        Mahasiswa m23 = new Mahasiswa();
        String nim = "20230040045";

        Scanner sc = new Scanner(System.in);
        System.out.println("Silahkan Pilih Menu dibawah ini: ");

        int pilihan = sc.nextInt();

        if (pilihan == 1) {
            m23.readMahasiswa();
            return;
        }
        if (pilihan == 2) {
            m23.insertMahasiswa(nim, "RIZZI ALPADISTA", "Sukabumi", "L");
            m23.readMahasiswa();
            return;
        }
        if (pilihan == 3) {
            m23.readMahasiswa();
            // String nim = sc.next();
            boolean result = m23.findMahasiswaByNim(nim);
            if (result) {
                System.out.println("NIM sudah dipakai");
            } else {
                System.out.println("NIM Tidak Ditemukan");
            }
            return;
        }
        if (pilihan == 4) {
            m23.readMahasiswa();
            // String nim = sc.next();
            m23.updateMahasiswa("RIPAL", "Padang", "L", nim);
            return;
        }
        if (pilihan == 5) {
            m23.readMahasiswa();
            m23.deletemahasiswa(nim);
            m23.readMahasiswa();
            return;
        }
        if (pilihan == 6) {
            System.out.println("Berhasil Keluar");
            System.exit(0);
            return;
        }
    }
}