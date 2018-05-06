package praktek.pkg02;

public class LapanganVollyAksi {
    public static void main(String[] args) {
        LapanganVolly L1 = new LapanganVolly();
        L1.panjang = 18;
        L1.lebar = 9;
        
        L1.cetakInfo();
        System.out.println("Luas Lapngan Volly = "+L1.hitungLuas());
        L1.cetakLuas();
        
        LapanganVolly L2 = new LapanganVolly();
        L2.cetakInfo();
        
        LapanganVolly L3 = new LapanganVolly(70,50);
        L3.cetakInfo();
    }
    
}
