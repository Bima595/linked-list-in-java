import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Membuat ArrayList of String dengan nama Hewan
        ArrayList<String> Hewan = new ArrayList<String>();

        // Mengisi ArrayList Hewan sesuai dengan ketentuan
        Hewan.add("Angsa");
        Hewan.add("Bebek");
        Hewan.add("Cicak");
        Hewan.add("Domba");
        Hewan.add("Elang");
        Hewan.add("Gajah");

        // Menambahkan elemen "Badak" dan "Bebek" pada ArrayList Hewan
        Hewan.add("Badak");
        Hewan.add("Bebek");

        // Menghitung jumlah elemen "Bebek"
        int jumlahBebek = 0;
        for (String hewan : Hewan) {
            if (hewan.equals("Bebek")) {
                jumlahBebek++;
            }
        }

        System.out.println(Hewan);
        // Menampilkan jumlah elemen "Bebek" dan posisi index dari elemen "Bebek"
        System.out.println("Jumlah elemen \"Bebek\": " + jumlahBebek);
        System.out.println("Posisi index dari elemen \"Bebek\": " + Hewan.indexOf("Bebek"));

        
    }
}
