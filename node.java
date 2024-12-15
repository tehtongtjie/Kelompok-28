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
        System.out.println("Nama Mahasiswa: " + name);
        System.out.println("NIM: " + nim);
        System.out.println("Jarak: " + jarak);
        System.out.println("================================");

    }
}

