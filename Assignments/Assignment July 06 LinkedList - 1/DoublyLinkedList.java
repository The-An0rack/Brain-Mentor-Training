import java.util.Scanner;

class Node<T>{
    T data;
    Node prev;
    Node next;

    Node(T data) {
        this.data = data;
        prev = null;
        next = null;
    }
}

class Operations<T> {
    Node start;
    Node end;

    void addAtTheEnd(Node<T> node) {
        if(start == null) {
            start = node;
            end = node;
        } else {
            Node itr = start;
            while(itr.next != null) {
                itr = itr.next;
            }
            node.prev = itr;
            itr.next = node;
            end = node;
        }
    }

    void printLL() {
        Node itr = start;
        while(itr != null) {
            System.out.print(itr.data + " <--> ");
            itr = itr.next;
        }
        System.out.println("NULL");
    }

    void printRev() {
        Node itr = end;
        while(itr != null) {
            System.out.print(itr.data + " <--> ");
            itr = itr.prev;
        }
        System.out.println("NULL");
    }

    void addAtTheBegininning(Node node) {
        if(start == null) {
            start = node;
        } else {
            node.next = start;
            start.prev = node;
            start = node;
        }
    }

    void addAtTheMiddle(Node node, int pos) {
        if(pos == 1) {
            addAtTheBegininning(node);
        } else {
            Node itr1 = start;
            Node itr2 = start;
            for(int i = 1; i < pos; i++) {
                itr2 = itr1;
                itr1 = itr1.next;
            }
            node.next = itr1;
            itr1.prev = node;

            node.prev = itr2;
            itr2.next = node;
        }
    }

    void deleteEndElement() {
        if(start == null) {
            System.out.println("LinkedList is empty!!!");
        } else if(start.next == null) {
            start = null;
        } else {
            Node<T> itr = start;
            while(itr.next.next != null){
                itr = itr.next;
            }
            Node temp = itr.next;
            temp.prev = null;
            itr.next = null;
            temp = null;
        }
    }

    void deleteStartElement() {
        if(start == null) {
            System.out.println("LinkedList is empty!!!");
        } else if(start.next == null) {
            start = null;
        } else {
            Node temp = start.next;
            temp.prev = null;
            start.next = null;
            start = temp;
        }
    }

    void deleteMiddleElement(int pos) {
        if(start == null) {
            System.out.println("LinkedList is empty!!!");
        } else if(pos == 1) {
            deleteStartElement();
        } else {
            Node itr =start;
            for(int i = 1; i < pos; i++) {
                itr = itr.next;
            }
            Node temp1 = itr.prev;
            Node temp2 = itr.next;
            temp1.next = temp2;
            temp2.prev = temp1;
            itr.next = null;
            itr.prev = null;
            itr = null;
        }
    }

}

class DoublyLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operations<Integer> obj = new Operations<>();
        Node node;
        int data,pos;
        while(true) {
            System.out.println("Please select any of the choice: ");
            System.out.println("1. Enter an element at the end");
            System.out.println("2. Enter an element at the beginning");
            System.out.println("3. Enter an element somewhere at the middle");
            System.out.println("4. Print LinkedList");
            System.out.println("5. Print LinkedList in reverse");
            System.out.println("6. Delete end element in a LinkedList");
            System.out.println("7. Delete first element in a linkedList");
            System.out.println("8. Delete element in the middle");
            
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Enter data to be added: ");
                    data = sc.nextInt();
                    node = new Node(data);
                    obj.addAtTheEnd(node);
                break;
                case 2:
                    System.out.println("Enter data to be added: ");
                    data = sc.nextInt();
                    node = new Node(data);
                    obj.addAtTheBegininning(node);
                break;
                case 3:
                    System.out.println("Enter data to be added: ");
                    data = sc.nextInt();
                    node = new Node(data);
                    System.out.println("Enter the position: ");
                    pos = sc.nextInt();
                    obj.addAtTheMiddle(node, pos);

                case 4:
                    obj.printLL();
                    break;
                case 5:
                    obj.printRev();
                    break;
                case 6:
                    obj.deleteEndElement();
                    break;
                case 7:
                    obj.deleteStartElement();
                    break;
                case 8:
                    System.out.println("Enter position to be deleted");
                    pos = sc.nextInt();
                    obj.deleteMiddleElement(pos);
                break;
                
            }
        }
    }

}
