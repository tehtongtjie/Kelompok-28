public class Edge {
    Node from;        // Node asal
    Node to;          // Node tujuan
    int weight;       // Bobot edge
    Edge nextEdge;    // Pointer ke edge berikutnya (jika membentuk linked list)

    // Konstruktor
    public Edge(Node from, Node to, int weight) {
        this.from = from;
        this.to = to;
        this.weight = weight;
        this.nextEdge = null;  // Inisialisasi nextEdge dengan null
    }

    // Getter dan Setter untuk properti `from`
    public Node getFrom() {
        return this.from;
    }

    public void setFrom(Node from) {
        this.from = from;
    }

    // Getter dan Setter untuk properti `to`
    public Node getTo() {
        return this.to;
    }

    public void setTo(Node to) {
        this.to = to;
    }

    // Getter dan Setter untuk properti `weight`
    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    // Getter dan Setter untuk properti `nextEdge`
    public Edge getNextEdge() {
        return this.nextEdge;
    }

    public void setNextEdge(Edge nextEdge) {
        this.nextEdge = nextEdge;
    }

    // Override toString() untuk memudahkan debugging dan visualisasi edge
    @Override
    public String toString() {
        return "Edge[from=" + from.getData() + ", to=" + to.getData() + ", weight=" + weight + "]";
    }
}
