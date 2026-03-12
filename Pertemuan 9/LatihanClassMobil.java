public class LatihanClassMobil {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        
        mobil.merk = "Toyota Avanza";
        mobil.warna = "Silver";
        mobil.tahun = 2020;
        mobil.kecepatan = 0;

        mobil.tampilkanSpesifikasi();
        System.out.println();

        mobil.percepat();
        mobil.percepat();
        mobil.tampilkanKecepatan();
    }    
}

class Mobil{
    String merk;
    String warna;
    int tahun;
    int kecepatan;
    
    void tampilkanSpesifikasi(){
        System.err.println("=== SPESIFIKASI MOBIL ===");
        System.out.println();
        System.err.println("Merk : " + merk);
        System.out.println();
        System.err.println("Warna: " + warna);
        System.out.println();
        System.err.println("Tahun: " + tahun);
        System.out.println();
    }

    void percepat(){
        kecepatan += 20;
        System.out.println("Mobil dipercepat...");
        System.out.println();
    }

    void tampilkanKecepatan(){
        System.out.println("Kecepatan saat ini: " + kecepatan + " km/jam");
        System.out.println();
    }
}
