public class Main {
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();

        list.add("Wadis", "123", 10, 30);
        list.add("Irfan", "456", 18, 54);
        list.add("Farid", "789", 17, 51);
        list.add("Ocha", "012", 11, 33);
        list.add("Budi", "345", 5, 15);
        list.add("Kanda", "678", 16, 48);
        list.add("Rayan", "901", 8, 24);
        list.add("Rafi", "234", 14, 42);
        list.add("Asep", "567", 15, 45);
        list.add("Adi", "890", 12, 36);
        list.add("qiqi", "334", 9, 27);
        list.add("intan", "775", 3, 9);
        list.add("yudi", "062", 18, 54);

        System.out.println("+------------------------------------------+");
        System.out.println("|************* SISTEM KAMPUSIN ************|");
        System.out.println("+------------------------------------------+");
        System.out.println("Daftar Mahasiswa:");
        list.printAll();

        list.sortingJarak();
        System.out.println("\nDaftar Mahasiswa Setelah Diurutkan Berdasarkan Jarak:");
        list.printAll();

        System.out.println("\nDaftar Mahasiswa Sebelum Diurutkan Berdasarkan Waktu Sampai:");
        list.printAll();

        list.sortByWaktuSampai();

        System.out.println("\nDaftar Mahasiswa Setelah Diurutkan Berdasarkan Waktu Sampai:");
        list.printAll();


        list.addEdge("456", "123", 1);
        list.addEdge("123", "789", 2);
        list.addEdge("345", "123", 3);
        list.addEdge("123", "234", 4);
        list.addEdge("345", "456", 5);
        list.addEdge("567", "456", 6);
        list.addEdge("456", "890", 7);
        list.addEdge("789", "012", 8);
        list.addEdge("901", "789", 9);
        list.addEdge("901", "012", 10);
        list.addEdge("234", "345", 11);
        list.addEdge("678", "901", 12);
        list.addEdge("234", "678", 13);
        list.addEdge("567", "901", 14);
        list.addEdge("567", "234", 15);
        list.addEdge("890", "234", 16);
        list.addEdge("567", "890", 17);

        System.out.println("\nDaftar Edge Antar Mahasiswa");
        list.printEdges();
        String nim = "456";
        System.out.println("\nPencarian Mahasiswa dengan NIM " + nim + ":");
        Node HasilPencarian = list.searchingNim(nim);
        if (HasilPencarian != null) {
            HasilPencarian.print();
        } else {
            System.out.println("+-------------------------------------------------------+");
            System.out.println("| Mahasiswa dengan NIM " + nim + " tidak ditemukan.|");
            System.out.println("+-------------------------------------------------------+");
        }

        list.delete("456");
        System.out.println("\nDaftar Mahasiswa yang Dihapus (Stack):");
        list.printStack();

        System.out.println("\nMengembalikan Mahasiswa yang Terakhir Dihapus:");
        list.popFromStack(); 
        list.printAll();

        System.out.println("\nPencarian Ulang Mahasiswa dengan NIM " + nim + ":");
        Node hasilCariUlang = list.searchingNim(nim);
        if (hasilCariUlang != null) {
            hasilCariUlang.print();
        } else {
            System.out.println("+------------------------------------------+");
            System.out.println("| Mahasiswa dengan NIM " + nim + " tidak ditemukan |");
            System.out.println("+------------------------------------------+");
        }

        System.out.println("\nDaftar Setelah Menghapus Mahasiswa dengan NIM 456:");
        list.printAll();

        System.out.println("\nDaftar Edge Antar Mahasiswa");
        list.printEdges();
    }
}