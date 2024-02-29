public class SettingTanggal {
    private int day;
    private int month;
    private int year;
    
    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public void displayDate() {
        System.out.printf("Tanggal: %02d/%02d/%d\n", day, month, year);
    }
}
