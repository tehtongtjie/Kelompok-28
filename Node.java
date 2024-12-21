public class Node {
    String nama, nim;
    int jarak, waktuSampai;
    Node prev, next;

    public Node(String nama, String nim, int jarak, int waktuSampai) {
        this.nama = nama;
        this.nim = nim;
        this.jarak = jarak;
        this.waktuSampai = waktuSampai;
    }

    public void print() {
        System.out.println("+-----------------+------------+------------+------------+");
        System.out.printf("| %-15s | %-10s | %-10s | %-10s |\n", "Nama Mahasiswa", "NIM", "Jarak (km)", "Waktu (m)");
        System.out.println("+-----------------+------------+------------+------------+");
        System.out.printf("| %-15s | %-10s | %-10d | %-10d |\n", nama, nim, jarak, waktuSampai);
        System.out.println("+-----------------+------------+------------+------------+");
    }
}