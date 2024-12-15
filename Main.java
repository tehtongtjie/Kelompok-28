public class Main {
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();

        // add node
        list.add("Wadis", "123", 10, new String[]{"456", "789", "345", "234"}, new int[]{1, 2, 3, 4});
        list.add("Irfan", "456", 25, new String[]{"123", "345", "567", "890"}, new int[]{1, 5, 6, 7});
        list.add("Farid", "789", 17, new String[]{"012", "901"}, new int[]{8, 9});
        list.add("Ocha", "012", 11, new String[]{"789", "901"}, new int[]{8, 10});
        list.add("Budi", "345", 5, new String[]{"123", "456", "234"}, new int[]{3, 5, 11});
        list.add("Kanda", "678", 20, new String[]{"901", "234"}, new int[]{12, 13});
        list.add("Rayan", "901", 8, new String[]{"789", "012", "678", "567"}, new int[]{9, 10, 12, 14});
        list.add("Rafi", "234", 22, new String[]{"123", "345", "678", "567", "890"}, new int[]{4, 11, 13, 15, 16});
        list.add("Asep", "567", 15, new String[]{"456", "901", "234", "890"}, new int[]{6, 14, 15, 17});
        list.add("Adi", "890", 12, new String[]{"456", "234", "567"}, new int[]{7, 16, 17});

        System.out.println("Semua Mahasiswa:");
        list.printAll();

        // add edge
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

        System.out.println("\nDaftar Hubungan (Edges):");
        list.printEdges();

        //sorting
        list.sortingJarak();
        System.out.println("\nDaftar Mahasiswa Setelah Diurutkan Berdasarkan Jarak:");
        list.printAll();

        // searching
        String cariNim = "456";
        Node hasilCari = list.searchingNim(cariNim);
        System.out.println("\nHasil Pencarian Mahasiswa dengan NIM " + cariNim + ":");
        if (hasilCari != null) {
            hasilCari.print();
        } else {
            System.out.println("Mahasiswa dengan NIM " + cariNim + " tidak ditemukan.");
        }

        // delete
        list.delete("456");

        System.out.println("\nSetelah Menghapus Mahasiswa dengan NIM 456:");
        list.printAll();
        System.out.println("\nDaftar Hubungan (Edges):");
        list.printEdges();
    }
}