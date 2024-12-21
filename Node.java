public class Node {
    String nama, nim;
    int jarak, waktu;
    Node prev, next;

    public Node(String nama, String nim, int jarak, int waktu) {
        this.nama = nama;
        this.nim = nim;
        this.jarak = jarak;
        this.waktu = waktu;
    }

    public void print() {
        System.out.println("+-----------------+------------+------------+");
        System.out.printf("| %-15s | %-10s | %-10s |\n", "Nama Mahasiswa", "NIM", "Jarak (km)", "Waktu (menit)");
        System.out.println("+-----------------+------------+------------+");
        System.out.printf("| %-15s | %-10s | %-10d |\n", nama, nim, jarak, waktu);
        System.out.println("+-----------------+------------+------------+");
    }
}