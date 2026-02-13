/*
Nim : D1041241029
Nama : Raihan Fadhillah
Latihan 1 tentang tipe data primitive
*/

public class LatihDataMahasiswa {
    public static void main(String[] args) {
        // Inisialisasi variabel untuk tipe data primitive, untuk menyimpan data mahasiswa
        long nim = 1041241029; // Memakai long dikarenakan mungkin digit nim bisa bertambah, dan int tidak akan cukup menampung
        String nama = "Raihan Fadhillah";
        char kelas = 'C';
        boolean status = true;
        double ipk = 3.80;
        short sks = 64; // Memakai short, dikarenakan short bisa menampung hingga nilai 30.000 yang dimana cukup sedikit jika dibandingkan int, namun tetap cukup untuk menampung nilai jumlah SKS

        // Mengeluarkan data mahasiswa
        System.out.println("=== DATA MAHASISWA ===");
        System.out.println("Nim             : " + nim);
        System.out.println("Nama            : " + nama);
        System.out.println("Kelas           : " + kelas);
        System.out.println("Status Aktif    : " + status);
        System.out.println("IPK Semester    : " + ipk);
        System.out.println("Total SKS       : " + sks);

    }
}
