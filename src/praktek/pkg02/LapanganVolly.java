package praktek.pkg02;

public class LapanganVolly {
    double panjang;
    double lebar;
    
    void cetakInfo(){
        System.out.println("==================");
        System.out.println("Panjang : "+panjang);
        System.out.println("Lebar : "+lebar);
        System.out.println("==================");
    }
    
    double hitungLuas(){
        double luas;
        luas=panjang*lebar;
        return luas;
    }
    
}
