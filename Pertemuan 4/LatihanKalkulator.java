/*
Nim : D1041241029
Nama : Raihan Fadhillah
Latihan 2 tentang operator aritmatika melalui program kalkulator sederhana
*/

public class LatihanKalkulator {
    public static void main(String[] args) {
        // Inisialisasi angka 1 dan 2
        int angkaPertama = 25;
        int angkaKedua = 4;

        // Mengeluarkan angka 1 dan 2
        System.out.println("=== KALKULATOR ===");
        System.out.println("Angka 1: " + angkaPertama);
        System.out.println("Angka 2: " + angkaKedua);

        // Melakukan operasi aritmatika
        System.out.println("---");
        System.out.println("Penjumlahan: " + (angkaPertama + angkaKedua));
        System.out.println("Pengurangan: " + (angkaPertama - angkaKedua));
        System.out.println("Perkalian: " + (angkaPertama * angkaKedua));
        System.out.println("Pembagian: " + (angkaPertama / angkaKedua));
        System.out.println("Sisa Bagi: " + (angkaPertama % angkaKedua));
        System.out.println("Pembagian Desimal: " + ((double) angkaPertama / angkaKedua)); // Casting dari int ke double
    }
}
