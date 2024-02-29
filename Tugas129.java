import java.util.Scanner;

public class Tugas129 {
    String nama;
    String nim;
    char jenisKelamin;
    double ipk;

    public Tugas129() {
    }

    public void inputData(Scanner sc) {
        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukkan jenis kelamin (L/P): ");
        jenisKelamin = sc.nextLine().charAt(0);
        System.out.print("Masukkan IPK: ");
        ipk = sc.nextDouble();
        sc.nextLine();  
    }

    public void cetakInfo() {
        System.out.printf("Nama: %s\nNIM: %s\nJenis kelamin: %c\nNilai IPK: %.1f\n\n", nama, nim, jenisKelamin, ipk);
    }
}
