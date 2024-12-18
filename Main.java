public class Main {
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();

        list.add("Wadis", "123", 10);
        list.add("Irfan", "456", 25);
        list.add("Farid", "789", 17);
        list.add("Ocha", "012", 11);
        list.add("Budi", "345", 5);
        list.add("Kanda", "678", 20);
        list.add("Rayan", "901", 8);
        list.add("Rafi", "234", 22);
        list.add("Asep", "567", 15);
        list.add("Adi", "890", 12);

        System.out.println("Daftar Mahasiswa:");
        list.printAll();

        list.sortingJarak();
        System.out.println("\nDaftar Mahasiswa Setelah Diurutkan Berdasarkan Jarak:");
        list.printAll();

        String nim = "456";
        System.out.println("\nPencarian Mahasiswa dengan NIM " + nim + ":");
        Node hasilCari456 = list.searchingNim(nim);
        if (hasilCari456 != null) {
            hasilCari456.print();
        } else {
            System.out.println("+-------------------------------------------------------+");
            System.out.println("| Mahasiswa dengan NIM " + nim + " tidak ditemukan.|");
            System.out.println("+-------------------------------------------------------+");
        }

        list.delete("456");

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
    }
}
