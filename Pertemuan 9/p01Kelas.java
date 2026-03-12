 public class p01Kelas { 
    public static void main(String args[]) { 
        // Cara 1: Deklarasi dan instansiasi terpisah 
        Calc obj;                // Deklarasi 
        obj = new Calc();        // Instansiasi 
         
        // Cara 2: Deklarasi dan instansiasi dalam 1 baris 
        Calc obj1 = new Calc(); 
         
        // Mengisi atribut object 
        obj.num1 = 3; 
        obj.num2 = 5; 
         
         // Tampilkan result sebelum perhitungan 
         System.out.println("Sebelum perform(): " + obj.result); 
         
         // Panggil method untuk melakukan perhitungan 
         obj.perform(); 
          
         // Tampilkan result setelah perhitungan 
         System.out.println("Setelah perform(): " + obj.result); 
    } 
}

//Kelas Calc dibawah agar jadi subclass
class Calc { 
    // Atribut - Object knows something 
    int num1; 
    int num2; 
    int result; 
     
    // Method - Object does something 
    public void perform() { 
        result = num1 + num2; 
    } 
} 