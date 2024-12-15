public class NodeLinked {
    String name, nim;
    NodeLinked prev, next;

    public NodeLinked(String name, String nim) {
        this.name = name;
        this.nim = nim;
    }

    public void print() {
        System.out.println("Nama Mahasiswa: " + name);
        System.out.println("NIM: " + nim);
    }
}

