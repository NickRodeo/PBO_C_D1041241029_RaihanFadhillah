import java.util.Scanner;
import java.io.Console;

public class LatihanLogin {
    public static void main(String[] args) {
        Console console = System.console();
        System.err.println("=== VALIDASI LOGIN ===");
        
        String inputUsername = console.readLine("Username: ");
        char[] inputPassword = console.readPassword("Password: ****");

        System.out.println("---");
        if(inputUsername.equals("admin")){
            System.out.println("Username valid");
            if(String.valueOf(inputPassword).equals("admin123")){
                System.out.println("Password benar");
                System.out.println("LOGIN BERHASIL!");
                System.out.println("Selamat datang, admin");
            }else{
                System.out.println("Password salah");
                System.out.println("LOGIN GAGAL!");
            }
        }else{
            System.out.println("Username invalid");
            System.out.println("LOGIN GAGAL!");
        }
        
    }
}
