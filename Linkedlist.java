public class Linkedlist {
    node head, tail;

    public void add(String name, String nim) {
        node newNode = new node(name, nim);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void delete(String nim) {
        node temp = head;
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
                System.out.println("Mahasiswa dengan NIM " + nim + " telah dihapus.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
    }

    public void printAll() {
        node temp = head;
        while (temp != null) {
            temp.print();
            temp = temp.next;
        }
    }
}
 