import java.util.Scanner;

public class LatihanRestoran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== MENU RESTORAN ===");
        System.out.print("Kode Menu: ");
        int menuCode = input.nextInt();
        System.out.print("Jumlah: ");
        int quantity = input.nextInt();
        
        System.out.println();
        System.out.println("Pesanan Anda: ");

        int harga = 0;
        switch (menuCode) {
            case 1:
                harga = 15000;
                System.out.println("Nama Menu: Nasi Goreng");
                break;
            case 2:
                harga = 12000;
                System.out.println("Nama Menu: Mie Ayam");
                break;
            case 3:
                harga = 10000;
                System.out.println("Nama Menu: Bakso");
                break;
            case 4:
                harga = 13000;
                System.out.println("Nama Menu: Soto Ayam");
                break;
            case 5:
                harga = 3000;
                System.out.println("Nama Menu: Es Teh");
                break;
        }
        System.out.println("Harga Satuan: Rp " + harga);
        System.out.println("Jumlah: " + quantity);
        System.out.println("---");
        System.out.println("Total Bayar: Rp " + (harga * quantity));


    }
}
