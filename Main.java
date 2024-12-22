public class Main {
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();

        list.add("Wadis", "123", 10, 30, "Sukamulia");
        list.add("Irfan", "456", 18, 54, "Gomong");
        list.add("Farid", "789", 17, 51, "Senggigi");
        list.add("Ocha", "012", 11, 33, "Kampus");
        list.add("Budi", "345", 5, 15, "Kekalik");
        list.add("Kanda", "678", 16, 48, "Jonggat");
        list.add("Rayan", "901", 8, 24, "Ampenan");
        list.add("Rafi", "234", 14, 42, "Sesela");
        list.add("Asep", "567", 15, 45, "Pagutan");
        list.add("Adi", "890", 12, 36, "Udayana");
        list.add("qiqi", "334", 9, 27, "LabuApi");
        list.add("intan", "775", 3, 9, "Jatisela");
        list.add("yudi", "062", 18, 54, "Bukit Tinggi");

        System.out.println("+------------------------------------------+");
        System.out.println("|************* SISTEM KAMPUSIN ************|");
        System.out.println("+------------------------------------------+");
        System.out.println("\nDaftar Mahasiswa:");
        list.printAll();

        String nim = "456";
        System.out.println("\nPencarian Mahasiswa dengan NIM " + nim + ":");
        Node HasilPencarian = list.searchingNim(nim);
        if (HasilPencarian != null) {
            System.out.println("Mahasiswa ditemukan");
            HasilPencarian.print();
        } else {
            System.out.println("+-------------------------------------------------------+");
            System.out.println("| Mahasiswa dengan NIM " + nim + " tidak ditemukan.|");
            System.out.println("+-------------------------------------------------------+");
        }

        list.delete("456");
        list.printStack();

        nim = "456";
        System.out.println("\nPencarian Mahasiswa dengan NIM " + nim + ":");
        HasilPencarian = list.searchingNim(nim);
        if (HasilPencarian != null) {
            System.out.println("Mahasiswa ditemukan");
            HasilPencarian.print();
        } else {
            System.out.println("+-------------------------------------------+");
            System.out.println("| Mahasiswa dengan NIM " + nim + " tidak ditemukan  |");
            System.out.println("+-------------------------------------------+");
        }

        System.out.println("\nDaftar Setelah Menghapus Mahasiswa dengan NIM 456:");
        list.printAll();
        
        System.out.println("\nMengembalikan Mahasiswa yang Terakhir Dihapus:");
        list.popFromStack(); 
        list.printAll();
        
        System.out.println("\nPencarian Ulang Mahasiswa dengan NIM " + nim + ":");
        Node hasilCariUlang = list.searchingNim(nim);
        if (hasilCariUlang != null) {
                System.out.println("Mahasiswa ditemukan");
                hasilCariUlang.print();
        } else {
            System.out.println("+------------------------------------------+");
            System.out.println("| Mahasiswa dengan NIM " + nim + " tidak ditemukan |");
            System.out.println("+------------------------------------------+");
        }

        System.out.println("\nDaftar Mahasiswa Sebelum Diurutkan Berdasarkan Waktu Sampai:");
        list.printAll();

        list.sortByWaktuSampai();
        System.out.println("\nDaftar Mahasiswa Setelah Diurutkan Berdasarkan Waktu Sampai:");
        list.printAll();

        list.sortingJarak();
        System.out.println("\nDaftar Mahasiswa Setelah Diurutkan Berdasarkan Jarak:");
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

        list.printByLocation("Kampus");
        list.printByLocation("Gomong");
        list.printByLocation("Kekalik");
        list.printByLocation("LabuApi");
            
        list.bfs("LabuApi");
    }
}