public class Edge {
    Node from;
    Node to;
    int weight;
    Edge nextEdge;
    public Edge(Node from, Node to, int weight) {
        this.from = from;
        this.to = to;
        this.weight = weight;
        this.nextEdge = null;
    }
    public Node getFrom() {
        return this.from;
    }
    public void setFrom(Node from) {
        this.from = from;
    }
    public Node getTo() {
        return this.to;
    }
    public void setTo(Node to) {
        this.to = to;
    }
    public int getWeight() {
        return this.weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public Edge getNextEdge() {
        return this.nextEdge;
    }
    public void setNextEdge(Edge nextEdge) {
        this.nextEdge = nextEdge;
    }
}
