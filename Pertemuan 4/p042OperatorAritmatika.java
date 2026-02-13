/*
Nim : D1041241029
Nama : Raihan Fadhillah
Program untuk belajar terkait operasi aritmatika sederhana
*/

public class p042OperatorAritmatika {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println(); // Untuk endline

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Pembagian dengan desimal
        double hasil = (double) a / b;
        System.out.println("a / b (desimal) = " + hasil);
    }
}
