import java.util.LinkedList;

public class latihan1 {
    public static void main(String[] args) {
        // membuat objek List hewan
        LinkedList<String> hewan = new LinkedList<>();
        hewan.add("sapi");
        hewan.add("Kelinci");
        hewan.add("kambing");
        hewan.add("Unta");
        hewan.add("Domba");

        System.out.println(hewan);

        // membuat objek List deleteHewan

        LinkedList<String> deleteHewan = new LinkedList<>();
        deleteHewan.add("Kelinci");
        deleteHewan.add("kambing");
        deleteHewan.add("Unta");

        for (String del : deleteHewan
             ) {
            hewan.remove(del);
        }

        // tampilkan hasil
        System.out.println("Hewan setelah dihapus:");
        System.out.println(hewan);
    }
}
