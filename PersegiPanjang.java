public class PersegiPanjang {
    int panjang;
    int lebar;

    public PersegiPanjang(int p, int l) {
        panjang = p;
        lebar = l;
    }

    public void cetakInfo() {
        System.out.println("Panjang: " + panjang + ", lebar: " + lebar);
    }

    public int hitungLuas() {
        return panjang * lebar;
    }

    public int hitungKeliling() {
        return 2 * (panjang + lebar);
    }
}
