public class LatihanHariBulan {
   public static void main(String[] args) {
    System.out.println("=== JUMLAH HARI DALAM BULAN ===");
    int month = 2;
    switch (month) {

        // 31 hari
        case 1:
            if(month == 1) System.out.println("Bulan: Januari (bulan ke-" + month + ")");
        case 3:
            if (month == 3) System.out.println("Bulan: Maret (bulan ke-" + month + ")");
        case 5:
            if (month == 5) System.out.println("Bulan: Mei (bulan ke-" + month + ")");
        case 7:
            if (month == 7) System.out.println("Bulan: Juli (bulan ke-" + month + ")");
        case 8:
            if (month == 8) System.out.println("Bulan: Agustus (bulan ke-" + month + ")");
        case 10:
            if (month == 10) System.out.println("Bulan: Oktober (bulan ke-" + month + ")");
        case 12:
            if (month == 12) System.out.println("Bulan: Desember (bulan ke-" + month + ")");
            System.out.println("Jumlah hari: 31 hari");
            break;

        // 30 hari
        case 4:
            if(month == 4) System.out.println("Bulan: April (bulan ke-" + month + ")");
        case 6:
            if (month == 6) System.out.println("Bulan: Juni (bulan ke-" + month + ")");
        case 9:
            if (month == 9) System.out.println("Bulan: September (bulan ke-" + month + ")");
        case 11:
            if (month == 11) System.out.println("Bulan: November (bulan ke-" + month + ")");
            System.out.println("Jumlah hari: 30 hari");
            break;

        // Februari
        case 2:
            System.out.println("Bulan: Februari (bulan ke-" + month + ")");
            System.out.println("Jumlah hari: 28 hari");
            break;
    }
   } 
}
