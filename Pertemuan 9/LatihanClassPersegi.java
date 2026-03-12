public class LatihanClassPersegi {
    public static void main(String[] args) {
        Persegi persegi = new Persegi();
        
        persegi.sisi = 5;

        persegi.hitungLuas();
        persegi.hitungKeliling();
        persegi.tampilkanHasil();
    }
}

class Persegi{
    int sisi;
    int luas;
    int keliling;

    void hitungLuas(){
        luas = sisi * sisi;
    }

    void hitungKeliling(){
        keliling = sisi * 4;
    }

    void tampilkanHasil(){
        System.out.println("=== PERSEGI ===");
        System.out.println();
        System.out.println("Sisi    : " + sisi + " cm");
        System.out.println();
        System.out.println("Luas    : " + luas + " cm²");
        System.out.println();
        System.out.println("Keliling: " + keliling + " cm");
        System.out.println();
    }
}