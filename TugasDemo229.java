import java.util.Scanner;

public class TugasDemo229 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah voucher: ");
        int jumlahVoucher = sc.nextInt();
        sc.nextLine();  
        
        StoreVoucher storeVoucher = new StoreVoucher(jumlahVoucher);
        
        storeVoucher.addVouchers(sc);
        
        System.out.println("\nDaftar Voucher:");
        storeVoucher.displayVouchers();
        
        System.out.print("\nMasukkan tanggal (dd mm yyyy): ");
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        
        SettingTanggal settingTanggal = new SettingTanggal();
        
        settingTanggal.setDate(day, month, year);
        
        System.out.println("\nTanggal yang diatur:");
        settingTanggal.displayDate();
    }
}
