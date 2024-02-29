import java.util.Scanner;

public class TugasDemo129 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        sc.nextLine(); 
        
        Tugas129[] arrayMahasiswa = new Tugas129[jumlahMahasiswa];
        
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.printf("\nMasukkan data mahasiswa ke-%d\n", (i + 1));
            arrayMahasiswa[i] = new Tugas129();
            arrayMahasiswa[i].inputData(sc);
        }
        
        System.out.println("\nData Mahasiswa:");
        for (Tugas129 mhs : arrayMahasiswa) {
            mhs.cetakInfo();
        }
        
        double totalIpk = 0;
        for (Tugas129 mhs : arrayMahasiswa) {
            totalIpk += mhs.ipk;
        }
        double rataIpk = totalIpk / jumlahMahasiswa;
        System.out.printf("Rata-rata IPK: %.1f\n", rataIpk);
    }
}
