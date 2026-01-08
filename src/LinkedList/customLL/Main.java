package LinkedList.customLL;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        LL list2 = new LL();
//
////        list2.insertFirst(5);
////        list2.insertFirst(6);list2.insertFirst(4);list2.insertFirst(3);list2.insertFirst(2);
////        list2.insertLast(1);
////        list2.insert(7, 1);
////        list2.display();
////        list2.deleteFirst();
////        list2.display();
//        list2.insertFirst(5);
//        list2.insertFirst(6);
//        list2.insert(1,1);
//        list2.insert(2,1);
//        list2.insert(4,0);
//        list2.display();
//        list2.delete(2);
//        list2.display();


        DoublyLL dobList2 = new DoublyLL();
//        dobList.insertFirst(4);
//        dobList.insertFirst(6);
//        dobList.insertFirst(2);
        dobList2.insertFirst(1);
//        //dobList.display();
        dobList2.insertLast(5);
        dobList2.insertLast(7);

        dobList2.insert(9, 2);

        dobList2.display();
        dobList2.insertAfter(7, 8);
        System.out.println();
        dobList2.display();
        dobList2.insertBefore(1, 4);
        System.out.println();
        dobList2.display();

//        System.out.println();
//
//        dobList.insert(8, 7);
//        dobList.display();

    }
}
