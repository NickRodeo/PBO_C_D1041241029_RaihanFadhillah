/*
Nim : D1041241029
Nama : Raihan Fadhillah
Latihan 2 tentang latihan perhitungan dengan simulasi penarikan dan penyetoran saldo
*/

public class LatihPerhitungan {
    public static void main(String[] args) {
        System.out.println("=== SIMULASI TRANSAKSI BANK ===");
        // Inisialisasi saldo awal
        int saldo = 1000000;
        System.out.println("Saldo Awal          : " + saldo);

        // Simulasi setoran, penambahan saldo
        System.out.println("Setoran             : " + 500000);
        saldo += 500000;
        System.out.println("Saldo Setelah Setor : " + saldo);

        // Simulasi penarikan, pengurangan saldo
        System.out.println("Penarikan           : " + 250000);
        saldo -= 250000;

        // Tampilkan saldo akhir
        System.out.println("Saldo akhir         : " + saldo);
    }
}
