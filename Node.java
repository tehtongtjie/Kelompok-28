public class Node {
    String name, nim;
    int jarak;
    Node prev, next;

    public Node(String name, String nim, int jarak) {
        this.name = name;
        this.nim = nim;
        this.jarak = jarak;
    }

    public void print() {
        System.out.println("+-----------------+------------+------------+");
        System.out.printf("| %-15s | %-10s | %-10s |\n", "Nama Mahasiswa", "NIM", "Jarak (km)");
        System.out.println("+-----------------+------------+------------+");
        System.out.printf("| %-15s | %-10s | %-10d |\n", name, nim, jarak);
        System.out.println("+-----------------+------------+------------+");
    }
}