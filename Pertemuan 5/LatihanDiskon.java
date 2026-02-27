import java.util.Scanner;
public class LatihanDiskon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Total Belanja: Rp ");
        double totalBelanja = input.nextDouble();
        double diskon;
        if(totalBelanja < 100000){
            diskon = 0;
        }else if(totalBelanja <= 499999){
            diskon = 0.05;
        }else if(totalBelanja <= 999999){
            diskon = 0.1;
        }else{
            diskon = 0.15;
        }

        System.out.println("Diskon (" + (int)(diskon * 100) + "%): Rp " + totalBelanja * diskon);
        System.out.println("Harga Akhir: Rp " + (totalBelanja - (totalBelanja * diskon)));
        System.out.println("Anda hemat : Rp " + totalBelanja * diskon);
    }
}
