public class Linkedlist {
    Node head, tail;

    public void add(String name, String nim, int jarak) {
        Node newNode = new Node(name, nim, jarak);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
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
                System.out.println("\nPenghapusan Data Mahasiswa :");
                System.out.println("x--------------------------------------------------------------------------------x");
                System.out.println("| Mahasiswa dengan NIM " + nim + " dihapus karena tidak pernah masuk kuliah tanpa kabar. |");
                System.out.println("x--------------------------------------------------------------------------------x");
            }
            temp = temp.next;
        }
    }

    public void printAll() {
        if (head == null) {
            return;
        }

        System.out.println("+-----------------+------------+------------+");
        System.out.printf("| %-15s | %-10s | %-10s |\n", "Nama Mahasiswa", "NIM", "Jarak (km)");
        System.out.println("+-----------------+------------+------------+");
        Node temp = head;
        while (temp != null) {
            System.out.printf("| %-15s | %-10s | %-10d |\n", temp.name, temp.nim, temp.jarak);
            temp = temp.next;
        }
        System.out.println("+-----------------+------------+------------+");
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
}
