public class main {
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();

        // Tambahkan beberapa data
        list.add("Alice", "123", 10);
        list.add("Bob", "456", 25);
        list.add("Charlie", "789", 17);
        list.add("David", "012", 30);
        list.add("Budi", "345", 5);

        System.out.println("Semua Mahasiswa:");
        list.printAll();

        // Hapus data
        list.delete("456");

        System.out.println("\nSetelah Menghapus Mahasiswa dengan NIM 456:");
        list.printAll();
    }
}