public class LatihanValidasi {
    public static void main(String[] args) {

        System.out.println("=== VALIDASI NILAI UJIAN ===");
        System.out.println();
        
        int i = 1;
        int nilai;
        do {
            if(i == 1) nilai = -10;
            else if(i == 2) nilai = 150;
            else nilai = 85;

            System.out.println("Percobaan input: " + nilai);

            if (nilai < 0 || nilai > 100) {
                System.out.println("Error: Nilai harus antara 0-100!");
                System.out.println();
            } else {
                System.out.println("✓ Nilai valid: " + nilai);
            }
            i++;
        } while (i <= 3);
    }
}