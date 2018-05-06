package praktek.pkg02;

public class LapanganVolly {
    double panjang;
    double lebar;

    public LapanganVolly() {
        panjang=20;
        lebar=11;
    }

    public LapanganVolly(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
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
    
    void cetakLuas(){
       System.out.println("Luasnya adalah: "+hitungLuas()); 
    }
    
}
