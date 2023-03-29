import java.util.ArrayList;

public class TUGAS1 {
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
        Hewan.add("Badak");
        Hewan.add("Bebek");

        System.out.println("\nNomor 1 & 2");
        System.out.println(Hewan);

        int jmlhBebek = 0;
        for (int i = 0; i < Hewan.size(); i++) {
            if (Hewan.get(i).equals("Bebek")) {
                jmlhBebek++;
                System.out.println("Posisi index Bebek: " + i);
            }
        };
        // Menampilkan jumlah elemen "Bebek" dan posisi index dari elemen "Bebek"
        System.out.println("Jumlah elemen \"Bebek\": " + jmlhBebek);

        System.out.println("\nNomor 3");
        System.out.println(Hewan);
        Hewan.remove(1);
        System.out.println(Hewan);

        System.out.println("\nNomor 4");
        System.out.println(Hewan);
        System.out.println("Index ke-0 : " + Hewan.get(0));
        System.out.println("Index ke-2 : " + Hewan.get(2));
        Hewan.remove(0);
        System.out.println(Hewan);

        System.out.println("\nNomor 5 & 6");
        System.out.println("Before  : ");
        System.out.println(Hewan);
        // Mengubah elemen pada index ke-0 menjadi "Ular"
        Hewan.set(0, "Ular");

        // Menambahkan elemen baru "Itik" pada index ke-2
        Hewan.add(2, "Itik");
        System.out.println("After   : ");
        System.out.println(Hewan);
        Hewan.subList(1,5).clear();
        System.out.println("Index ke 1-5 di hapus menjadi : ");
        System.out.println(Hewan);


        System.out.println("\nNomor 7");
        System.out.println(Hewan);
        System.out.println("Elemen Pertama  : " + Hewan.get(1));
        System.out.println("Elemen Terakhir : " + Hewan.get(2));

        System.out.println("\nNomor 8");
        System.out.println(Hewan);
        System.out.println("Jumlah elemen pada ArrayList hewan: " + Hewan.size());

        System.out.println("\nNomor 9");
        System.out.println(Hewan);

        int jmlhBadak = 0;
        for (int i = 0; i < Hewan.size(); i++) {
            if (Hewan.get(i).equals("Badak")) {
                jmlhBadak++;
                System.out.println("Posisi index Badak " + i);
            }
        };

    }
}
