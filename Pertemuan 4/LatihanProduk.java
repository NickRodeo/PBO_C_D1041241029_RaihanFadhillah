/*
Nim : D1041241029
Nama : Raihan Fadhillah
Latihan 1 tentang naming convention, memberikan nama variabel sesuai ketentuan untuk meningkatkan readability dan pemahaman jangka panjang
*/

public class LatihanProduk {
    public static final double PAJAK = 0.11; // Constanta variabel
    
    public static void main(String[] args) {
        // Inisialisasi variabel sesuai dengan naming convention
        String namaProduk = "Laptop Asus";
        int hargaSatuan = 7000000;
        int jumlahStok = 15;
        boolean isTersedia = true;

        // Mengeluarkan data
        System.out.println("=== INFORMASI PRODUK ===");
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga Satuan: " + "Rp " + hargaSatuan);
        System.out.println("Jumlah Stok: " + jumlahStok);
        System.out.println("Status Tersedia: " + isTersedia);
        System.out.println("---");

        long totalNilaiStok = hargaSatuan * jumlahStok;
        System.out.println("Total Nilai Stok: " + "Rp " + totalNilaiStok);
        System.out.println("Pajak (" + (int) (PAJAK * 100) + "%): " + "Rp " + (long) (totalNilaiStok * PAJAK));

    }
    
}
