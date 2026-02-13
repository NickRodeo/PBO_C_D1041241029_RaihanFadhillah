/*
Nim : D1041241029
Nama : Raihan Fadhillah
Latihan 3 tentang penggunaan increment, decrement, dan compound assignment dalam program sederhana
*/

public class LatihanCounter {
    public static void main(String[] args) {
        int counter = 10; // Inisialisasi counter awal
        System.out.println("=== COUNTER ===");
        System.out.println("Nilai awal: " + counter);
        // Increment 2 kali
        counter++;
        counter++;
        System.out.println("Setelah ++ (2x): " + counter);
        // Decrement 1 kali
        counter--;
        System.out.println("Setelah --: " + counter);
        // Counter ditambah 5 dengan compound assignment
        counter += 5;
        System.out.println("Setelah += 5: " + counter);
        // Counter dikurang 3 dengan compound assignment
        counter -= 3;
        System.out.println("Setelah -= 3: " + counter);
        // Counter dikali 2 dengan compound assignment
        counter *= 2;
        System.out.println("Setelah *= 2: " + counter);
    }
}
