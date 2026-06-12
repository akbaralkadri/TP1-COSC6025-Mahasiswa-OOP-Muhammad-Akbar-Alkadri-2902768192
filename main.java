import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Mahasiswa[] daftar = new Mahasiswa[5];
        daftar[0] = new Mahasiswa("Andi Pratama", "2440001", "Teknik Informatika", 3.75);
        daftar[1] = new Mahasiswa("Budi Santoso", "2440002", "Sistem Informasi", 3.40);
        daftar[2] = new Mahasiswa("Citra Lestari", "2440003", "Teknik Informatika", 3.90);
        daftar[3] = new Mahasiswa("Joni Suhartono", "2440004", "Teknik Industri", 3.00);
        daftar[4] = new Mahasiswa("Bulan Suci", "2440005", "Akuntansi", 3.20);

        System.out.println("############################################");
        System.out.println("# Soal 1: Data Awal Seluruh Mahasiswa       #");
        System.out.println("############################################\n");

        for (Mahasiswa m : daftar) {
            m.tampilkanInfo();
            System.out.println();
        }

        System.out.println("############################################");
        System.out.println("# Soal 2: Update IPK Mahasiswa              #");
        System.out.println("############################################\n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan NIM mahasiswa yang ingin diupdate: ");
        String nimInput = scanner.nextLine();

        System.out.print("Masukkan IPK baru: ");
        double ipkBaru = scanner.nextDouble();

        boolean ditemukan = false;
        for (Mahasiswa m : daftar) {
            if (m.getNim().equals(nimInput)) {
                m.updateIpk(ipkBaru);
                ditemukan = true;

                System.out.println("\nData berhasil diperbarui!");
                m.tampilkanInfo();
                System.out.println("Status: " + m.cekKelulusan());
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("\nMahasiswa dengan NIM " + nimInput + " tidak ditemukan.");
        }

        System.out.println("\n############################################");
        System.out.println("# Soal 3: Status Kelulusan & Predikat       #");
        System.out.println("# Akademik Seluruh Mahasiswa                #");
        System.out.println("############################################\n");

        for (Mahasiswa m : daftar) {
            m.tampilkanInfo();
            System.out.println("Status: " + m.cekKelulusan());
            System.out.println("Predikat: " + m.hitungPredikat());
            System.out.println();
        }

        scanner.close();
    }
}