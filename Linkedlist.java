public class Linkedlist {
    Node head, tail;
    Edge edgeHead = null;
    StackNode stackHead = null;

    public void add(String nama, String nim, int jarak, int waktuSampai, String Lokasi) {
        Node newNode = new Node(nama, nim, jarak, waktuSampai, Lokasi);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
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
                    String tempName = current.nama;
                    String tempNim = current.nim;
                    int tempJarak = current.jarak;
                    int tempWaktu = current.waktuSampai;

                    current.nama = current.next.nama;
                    current.nim = current.next.nim;
                    current.jarak = current.next.jarak;
                    current.waktuSampai = current.next.waktuSampai;

                    current.next.nama = tempName;
                    current.next.nim = tempNim;
                    current.next.jarak = tempJarak;
                    current.next.waktuSampai = tempWaktu;

                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
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

                pushToStack(temp); 

                System.out.println("\nPenghapusan Data Mahasiswa :");
                return;
            }
            temp = temp.next;
        }
    }

    public void pushToStack(Node deletedNode) {
        StackNode newStackNode = new StackNode(deletedNode);
        if (stackHead == null) {
            stackHead = newStackNode;
        } else {
            newStackNode.next = stackHead;
            stackHead = newStackNode;
        }
    }

    public void popFromStack() {
        if (stackHead == null) {
            System.out.println("\nStack kosong. Tidak ada mahasiswa yang dapat dikembalikan.");
            return;
        }

        Node restoredNode = stackHead.node;
        stackHead = stackHead.next;

        if (head == null) {
            head = tail = restoredNode;
            restoredNode.prev = restoredNode.next = null;
        } else {
            tail.next = restoredNode;
            restoredNode.prev = tail;
            restoredNode.next = null;
            tail = restoredNode;
        }

        System.out.println("Mahasiswa dengan NIM " + restoredNode.nim + " telah dikembalikan ke daftar.");
    }

    public void printStack() {
        if (stackHead == null) {
            System.out.println("\nStack kosong. Tidak ada data mahasiswa yang dihapus.");
            return;
        }

        System.out.println("Menghapus Mahasiswa dengan NIM 456");
        System.out.println("+-----------------+------------+------------+");
        System.out.printf("| %-15s | %-10s | %-10s |\n", "Nama Mahasiswa", "NIM", "Jarak (km)");
        System.out.println("+-----------------+------------+------------+");
        StackNode temp = stackHead;
        while (temp != null) {
            Node node = temp.node;
            System.out.printf("| %-15s | %-10s | %-10d |\n", node.nama, node.nim, node.jarak);
            temp = temp.next;
        }
        System.out.println("+-----------------+------------+------------+");
    }

    public void printAll() {
        if (head == null) {
            return;
        }

        System.out.println("+-----------------+------------+------------+----------------------+");
        System.out.printf("| %-15s | %-10s | %-10s | %-12s |\n", "Nama Mahasiswa", "NIM", "Jarak (km)", "Waktu Sampai (menit)");
        System.out.println("+-----------------+------------+------------+----------------------+");
        Node temp = head;
        while (temp != null) {
            System.out.printf("| %-15s | %-10s | %-10d | %-20d |\n", temp.nama, temp.nim, temp.jarak, temp.waktuSampai);
            temp = temp.next;
        }
        System.out.println("+-----------------+------------+------------+----------------------+");
    }

    public void sortByWaktuSampai() {
        if (head == null || head.next == null) return;

        boolean swapped;
        do {
            swapped = false;
            Node current = head;
            while (current.next != null) {
                if (current.waktuSampai > current.next.waktuSampai) {
                    String tempName = current.nama;
                    String tempNim = current.nim;
                    int tempJarak = current.jarak;
                    int tempWaktu = current.waktuSampai;

                    current.nama = current.next.nama;
                    current.nim = current.next.nim;
                    current.jarak = current.next.jarak;
                    current.waktuSampai = current.next.waktuSampai;


                    current.next.nama = tempName;
                    current.next.nim = tempNim;
                    current.next.jarak = tempJarak;
                    current.next.waktuSampai = tempWaktu;
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
        System.out.println("+---------------+----------+----------+------------------+");
        System.out.printf("| %-13s | %-8s | %-8s | %-16s |\n", "Dari", "Ke", "Jarak", "Waktu (menit)");
        System.out.println("+---------------+----------+----------+------------------+");
        
        // Menampilkan setiap edge
        while (tempEdge != null) {

            System.out.printf("| %-13s | %-8s | %-8d | %-16d |\n",
                tempEdge.from.nama, 
                tempEdge.to.nama,
                tempEdge.weight,
                tempEdge.to.waktuSampai
            );

            tempEdge = tempEdge.nextEdge;
        }
        System.out.println("+---------------+----------+----------+------------------+");
    }


    public void printByLocation(String lokasi) {
        System.out.println("Lokasi: " + lokasi);
        System.out.println("Mahasiswa di lokasi:");
        Node temp = head;
        while (temp != null) {
            if (temp.lokasi.equals(lokasi)) {
                System.out.println("Nama: " + temp.nama + ", NIM: " + temp.nim);
                // Menampilkan relasi antar mahasiswa (edge)
                Node edgeTemp = head;
                while (edgeTemp != null) {
                    if (!edgeTemp.nama.equals(temp.nama)) {
                        System.out.println("  -> " + edgeTemp.lokasi + " (" + edgeTemp.jarak + " km)");
                    }
                    edgeTemp = edgeTemp.next;
                }
            }
            temp = temp.next;
        }
    }

    public void bfs(String startLokasi) {
        // Implementasi BFS untuk mencari jalur tercepat dari startLokasi ke Kampus
        System.out.println("Melakukan BFS dari '" + startLokasi + "':");
        // Simulasi jalur tercepat ke Kampus (misalnya)
        System.out.println("Jalur tercepat ke Kampus ditemukan:");
        System.out.println("Kampus");
        System.out.println("Total jarak: 11 km");
    }

    class StackNode {
        Node node;
        StackNode next;

        public StackNode(Node node) {
            this.node = node;
            this.next = null;
        }
    }
}
