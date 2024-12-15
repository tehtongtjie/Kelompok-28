public class main {
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();

        // Tambahkan beberapa data
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

        System.out.println("Semua Mahasiswa:");
        list.printAll();

        // Hapus data
        list.delete("456");

        System.out.println("\nSetelah Menghapus Mahasiswa dengan NIM 456:");
        list.printAll();
    }
}