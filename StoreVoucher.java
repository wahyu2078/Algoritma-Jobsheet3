import java.util.Scanner;

public class StoreVoucher {
    private String[] vouchers;
    
    public StoreVoucher(int size) {
        vouchers = new String[size];
    }
    
    public void addVouchers(Scanner sc) {
        for (int i = 0; i < vouchers.length; i++) {
            System.out.printf("Masukkan Voucher ke-%d: ", (i + 1));
            vouchers[i] = sc.nextLine();
        }
    }
    
    public void displayVouchers() {
        for (int i = 0; i < vouchers.length; i++) {
            System.out.printf("Voucher ke-%d: %s\n", (i + 1), vouchers[i]);
        }
    }
}
