import java.util.Scanner;

class Node<T>{
    T data;
    Node next;

    Node(T data){
        this.data = data;
        next = null;
    }
}

class Operations<T> {
    Node<T> start;

    void addAtTheEnd(Node<T> node) {
        if(start == null) {
            start = node;
        } else {
            Node<T> itr = start;
            while(itr.next != null) {
                itr = itr.next;
            }
            itr.next = node;
        }
    }

    void printLL() {
        Node<T> itr = start;
        while(itr != null) {
            System.out.print(itr.data + " --> ");
            itr = itr.next;
        }
        System.out.println("NULL");
    }

    void addAtTheBegininning(Node<T> node) {
        if(start == null) {
            start = node;
        } else {
            node.next = start;
            start = node;
        }
    }

    void addInTheMiddle(Node<T> node, int pos) {
        if(pos == 0) {
            addAtTheBegininning(node);
        } else {
            int index = 1;
            Node<T> itr = start;
            while(index < pos) {
                index++;
                itr = itr.next;
            }
            node.next = itr.next;
            itr.next = node;
        }
    }

    void deleteAtTheBeginning() {
        if(start == null) {
            System.out.println("Linked List is already empty!!!");
        } else if (start.next == null) {
            start = null;
        } else {
            Node temp = start;
            start = start.next;
            temp.next = null;
            temp = null;
        }
    }

    void deleteAtTheEnd() {
        if(start == null) {
            System.out.println("Linked List is already empty!!!");
        } else if (start.next == null) {
            start = null;
        } else {
            Node temp = start;
            Node temp2 = start;
            while(temp.next != null) {
                temp2 = temp;
                temp = temp.next;
            }
            temp2. next = null;
            temp = null;
        }
    }

    void deleteAtTheMiddle(int pos) {
        if(start == null) {
            System.out.println("Linked List is already empty!!!");
        } else if (pos== 1) {
            deleteAtTheBeginning();
        } else {
            Node temp = start;
            Node temp2 = start;
            for(int i = 1; i < pos; i++) {
                temp2 = temp;
                temp = temp.next;
            }

            temp2.next = temp.next;
            temp.next = null;
            temp = null;
        }
    }
}

public class LinkedListOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operations<Integer> obj = new Operations<>();
        int choice,data,pos;
        Node node;
        while(true){
            System.out.println("Please select any of the choice: ");
            System.out.println("1. Enter an element at the end");
            System.out.println("2. Enter an element at the beginning");
            System.out.println("3. Enter an element in the middle");
            System.out.println("4. Print all the elements");
            System.out.println("5. Delete element at the beginning");
            System.out.println("6. Delete element at the end");
            System.out.println("7. Delete element at the middle");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Enter data to be inserted:");
                    data = sc.nextInt();
                    node = new Node(data);
                    obj.addAtTheEnd(node);
                break;
                case 2:
                    System.out.println("Enter data to be inserted:");
                    data = sc.nextInt();
                    node = new Node(data);
                    obj.addAtTheBegininning(node);
                break;
                case 3:
                    System.out.println("Enter data to be inserted:");
                    data = sc.nextInt();
                    node = new Node(data);
                    System.out.println("Enter position of insertion:");
                    pos = sc.nextInt();
                    obj.addInTheMiddle(node, pos);
                case 4:
                    obj.printLL();
                break;
                case 5:
                    obj.deleteAtTheBeginning();
                break;
                case 6:
                    obj.deleteAtTheEnd();
                break;
                case 7:
                    System.out.println("Enter position of insertion:");
                    pos = sc.nextInt();
                    obj.deleteAtTheMiddle(pos);
                
            }
        }
        
    }
}
