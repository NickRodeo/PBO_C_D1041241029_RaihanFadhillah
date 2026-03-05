public class LatihanDeretGanjil {
    public static void main(String[] args) {
        System.out.println("=== BILANGAN GANJIL 1-15 ===");
        int angka = 1;
        while(angka <= 15){
            if(angka % 2 != 0){
                System.out.print(angka + " ");
            }
            angka++;
        }
    }
}
