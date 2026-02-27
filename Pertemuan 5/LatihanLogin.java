import java.util.Scanner;

public class LatihanLogin {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        String inputUsername, inputPassword;
        System.err.println("=== VALIDASI LOGIN ===");

        System.out.print("Username: ");
        inputUsername = input.nextLine();

        System.out.print("Password: ");
        inputPassword = input.nextLine();
        System.out.println("---");

        if(inputUsername.equals("admin")){
            System.out.println("Username valid");
            if(inputPassword.equals("admin123")){
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
