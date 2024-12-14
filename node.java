public class Node {
    String value;
    Edge edgeList;  // Pastikan Edge sudah didefinisikan sebelumnya
    Node nextNode;
    Node parent;
    int rank;
    Node next = null;

    // Constructor
    public Node(String value) {
        this.value = value;
        this.edgeList = null;
        this.nextNode = null;
        this.parent = this;  // Parent adalah dirinya sendiri pada awalnya
        this.rank = 0;
    }

    // Metode untuk mendapatkan data (bisa dikustomisasi)
    public String getData() {
        return this.value;  // Misalnya mengembalikan nilai dari value, bisa disesuaikan
    }

    // Getter dan setter untuk next
    public Node getNext() {
        return this.next;
    }

    public void setNext(Node n) {
        this.next = n;
    }

    // Getter dan setter untuk nextNode (jika perlu)
    public Node getNextNode() {
        return this.nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    // Getter dan setter untuk edgeList (jika perlu)
    public Edge getEdgeList() {
        return this.edgeList;
    }

    public void setEdgeList(Edge edgeList) {
        this.edgeList = edgeList;
    }

    // Getter dan setter untuk parent (jika perlu)
    public Node getParent() {
        return this.parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    // Getter dan setter untuk rank (jika perlu)
    public int getRank() {
        return this.rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
