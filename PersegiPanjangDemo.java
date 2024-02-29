import java.util.Scanner;

public class PersegiPanjangDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah persegi panjang: ");
        int jumlahPersegiPanjang = sc.nextInt();
        
        PersegiPanjang[] arrayOfPersegiPanjang = new PersegiPanjang[jumlahPersegiPanjang];
        int panjang, lebar;

        for (int i = 0; i < jumlahPersegiPanjang; i++) {
            System.out.println("Persegi panjang ke-" + (i + 1));
            System.out.print("Masukkan panjang: ");
            panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            lebar = sc.nextInt();
            arrayOfPersegiPanjang[i] = new PersegiPanjang(panjang, lebar);
        }
        
        for (int i = 0; i < jumlahPersegiPanjang; i++) {
            System.out.print("Persegi panjang ke-" + (i + 1) + ": ");
            arrayOfPersegiPanjang[i].cetakInfo();
            System.out.println("Luas: " + arrayOfPersegiPanjang[i].hitungLuas());
            System.out.println("Keliling: " + arrayOfPersegiPanjang[i].hitungKeliling());
        }
    }
}
