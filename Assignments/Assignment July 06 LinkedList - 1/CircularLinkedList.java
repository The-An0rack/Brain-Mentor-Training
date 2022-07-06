import java.util.Scanner;

class Node<T> {
    T data;
    Node next;

    Node(T data) {
        this.data = data;
        next = null;
    }
}

class Operations<T> {
    Node start;
    void addAtTheEnd(Node node){
        if(start == null) {
            start = node;
            start.next = start;
        } else {
            Node itr = start;
            while(itr.next != start) {
                itr = itr.next;
            }
            node.next = start;
            itr.next = node;
        }
    }

    void addAtTheBegininning(Node node) {
        if(start == null) {
            start = node;
            start.next = start;
        } else {
            Node itr = start;
            while(itr.next != start) {
                itr = itr.next;
            }
            node.next = start;
            start = node;
            itr.next = start;
        }
    }

    void addAtTheMiddle(Node node, int pos) {
        if(pos == 1) {
            addAtTheBegininning(node);
        } else {
            Node itr = start;
            int index = 1;
            while(index < pos - 1) {
                index++;
                itr = itr.next;
            }
            node.next = itr.next;
            itr.next = node;
        }
    }
    void printLL() {
        if(start == null) {
            System.out.println("Linked List is empty");
            return;
        }
        Node itr = start;
        while(itr.next != start) {
            System.out.print(itr.data + " -->");
            itr = itr.next;
        }
        System.out.println(itr.data + "--> START");
    }

    void deleteEndElement() {
        if(start == null) {
            System.out.println("LinkedList is empty!!!");
        } else if(start.next == start) {
            start.next = null;
            start = null;
        }
        else {
            Node itr1 = start;
            Node itr2 = start;
            while(itr1.next != start) {
                itr2 = itr1;
                itr1 = itr1.next;
            }

            itr2.next = start;
            itr1.next = null;
            itr1 = null;
        }
    }

    void deleteStartElement() {
        if(start == null) {
            System.out.println("LinkedList is empty!!!");
        } else if(start.next == start) {
            start.next = null;
            start = null;
        }
        else {
            Node itr = start;
            while(itr.next != start) {
                itr = itr.next;
            }
            Node temp = start;
            start = start.next;
            temp.next = null;
            temp = null;
            itr.next = start;
        }
    }

    void deleteMiddleElement(int pos) {
        if(pos == 1) {
            deleteStartElement();
        } else {
            Node itr1 = start;
            Node itr2 = start;
            for(int i = 1; i < pos; i++) {
                itr2 = itr1;
                itr1 = itr1.next;
            }
            itr2.next = itr1.next;
            itr1.next = null;
            itr1= null;
        }
    }
}

class CircularLinkedList {
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
            System.out.println("5. Delete end element in a LinkedList");
            System.out.println("6. Delete first element in a linkedList");
            System.out.println("7. Delete element in the middle");
            
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
                    break;

                case 4:
                    obj.printLL();
                    break;
                case 5:
                    obj.deleteEndElement();
                    break;
                case 6:
                    obj.deleteStartElement();
                    break;
                case 7:
                    System.out.println("Enter position to be deleted");
                    pos = sc.nextInt();
                    obj.deleteMiddleElement(pos);
                break;
            }
        }
    }    
}
