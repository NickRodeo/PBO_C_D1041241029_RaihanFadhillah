public class LatihanKombinasiLoop {
    public static void main(String[] args) {
        System.out.println("=== PENCARIAN KOORDINAT [2,3] ===");
        Boolean isFind = false;
        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <= 5; j++){
                System.out.println("Cek: [" + i + "," + j + "]");
                if(i == 2 && j == 3){
                    System.out.println("✓ Koordinat ditemukan!");
                    System.out.println("Pencarian selesai.");
                    isFind = true;
                }
                if(isFind) break;
            }
            if(isFind) break;
        }
    }
}
