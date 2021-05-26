package tugas.modul.pkg5;
public class SinglyLinkedListApp {
    
    public static void main(String[] args) {
        SinglyLinkedList lk = new SinglyLinkedList();
       /*
        Sebagai contoh:
        lk.insertAwal(10);
        lk.display();
        lk.insertAwal(20);
        lk.display();
        lk.insertAkhir(30);
        lk.display();
        lk.insertAwal(40);
        lk.display();
        lk.insertAtPos(50, 2);
        lk.display();
        lk.insertAkhir(60);
        lk.display();
        lk.deleteAtPos(2);
        lk.display();
*/
       lk.insertAwal(100);
       lk.display();
       lk.insertAkhir(200);
       lk.display();
       lk.insertAtPos(50, 1);
       lk.display();
       lk.insertAtPos(80, 2);
       lk.display();
       lk.deleteAtPos(1);
       lk.display();
    }
}
