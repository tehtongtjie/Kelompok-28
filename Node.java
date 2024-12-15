public class Node {
    String nama;
    String nim;
    int jarak;
    Node prev, next;

    public Node(String nama, String nim, int jarak) {
        this.nama = nama;
        this.nim = nim;
        this.jarak = jarak;

    }

    public void print() {
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jarak: " + jarak + " km");
        System.out.println("================================");

    }
}

