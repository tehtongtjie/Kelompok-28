public class Linkedlist {
    Node head, tail;
    Edge edgeHead = null;

    public void add(String name, String nim, int jarak, String[] connectedNim, int[] weights) {
        Node newNode = new Node(name, nim, jarak);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        for (int i = 0; i < connectedNim.length; i++) {
            addEdge(newNode.nim, connectedNim[i], weights[i]);
        }
    }

    public void addEdge(String fromNim, String toNim, int weight) {
        Node fromNode = searchingNim(fromNim);
        Node toNode = searchingNim(toNim);
        if (fromNode != null && toNode != null) {
            Edge newEdge = new Edge(fromNode, toNode, weight);
            if (edgeHead == null) {
                edgeHead = newEdge;
            } else {
                Edge lastEdge = edgeHead;
                while (lastEdge.nextEdge != null) {
                    lastEdge = lastEdge.nextEdge;
                }
                lastEdge.nextEdge = newEdge;
            }
        }
    }

    public void delete(String nim) {
        Node temp = head;
        while (temp != null) {
            if (temp.nim.equals(nim)) {
                if (temp == head) {
                    head = temp.next;
                    if (head != null)
                        head.prev = null;
                } else if (temp == tail) {
                    tail = temp.prev;
                    if (tail != null)
                        tail.next = null;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }

                if (edgeHead != null) {
                    Edge prevEdge = null;
                    Edge currentEdge = edgeHead;
                    while (currentEdge != null) {
                        if (currentEdge.from.nim.equals(nim) || currentEdge.to.nim.equals(nim)) {
                            if (prevEdge == null) {
                                edgeHead = currentEdge.nextEdge;
                            } else {
                                prevEdge.nextEdge = currentEdge.nextEdge;
                            }
                        } else {
                            prevEdge = currentEdge;
                        }
                        currentEdge = currentEdge.nextEdge;
                    }
                }

                System.out.println("Mahasiswa dengan NIM " + nim + " telah dihapus.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
    }


    public void printAll() {
        Node temp = head;
        while (temp != null) {
            temp.print();
            temp = temp.next;
        }
    }

    public void sortingJarak() {
        if (head == null || head.next == null) return;

        boolean swapped;
        do {
            swapped = false;
            Node current = head;
            while (current.next != null) {
                if (current.jarak > current.next.jarak) {
                    String tempName = current.name;
                    String tempNim = current.nim;
                    int tempJarak = current.jarak;

                    current.name = current.next.name;
                    current.nim = current.next.nim;
                    current.jarak = current.next.jarak;

                    current.next.name = tempName;
                    current.next.nim = tempNim;
                    current.next.jarak = tempJarak;

                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

    public Node searchingNim(String nim) {
        Node temp = head;
        while (temp != null) {
            if (temp.nim.equals(nim)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void printEdges() {
        Edge tempEdge = edgeHead;
        while (tempEdge != null) {
            System.out.println(tempEdge.from.name + " -> " + tempEdge.to.name + " (" + tempEdge.weight + " km)");
            tempEdge = tempEdge.nextEdge;
        }
    }
}
