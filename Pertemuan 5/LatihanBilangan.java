import java.util.Scanner;

public class LatihanBilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== PEMERIKSAAN BILANGAN ===");
        System.out.print("Bilangan: ");
        int number = input.nextInt();
        if(number > 0){
            System.out.println("Jenis: Bilangan positif");
            if(number % 2 == 0){
                System.out.println("Tipe: Genap");
            }else{
                System.out.println("Tipe: Ganjil");
            }
        }else if(number < 0){
            System.out.println("Jenis: Bilangan negatif");
            if(number % 2 == 0){
                System.out.println("Tipe: Genap");
            }else{
                System.out.println("Tipe: Ganjil");
            }
        }else{
            System.out.println("Jenis: Bilangan Nol");
        }
    }
}
