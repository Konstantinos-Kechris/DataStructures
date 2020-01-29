import java.util.NoSuchElementException;

public class MyQueue {

    private Node first;
    private Node last;
    private int counter;

    public MyQueue(){

        first = last = null;
        counter = 0;

    }

    public MyQueue(Node first,Node last) {

        this.first = first;
        this.last = last;
        counter = 0;

    }

    public Node getFirst(){

        return first;

    }

    public Node getLast() {

        return last;

    }

    public boolean isEmpty() {

        if (counter == 0) {

            return true;

        }

        return false;

    }

    public int getSize() {

        return counter;

    }

    public void insertAtBack(Node n) {

        if(isEmpty()) {

            first = last = n;

        } else {

            last.setNext(n);
            last = n;

        }

        counter++;

    }

    public void insertAtFront(Node n) {

        if (n.getCharacter() == 'A') {

            n.setCharacter('T');

        } else if (n.getCharacter() == 'T') {

            n.setCharacter('A');

        } else if (n.getCharacter() == 'C') {

            n.setCharacter('G');

        } else {

            n.setCharacter('C');

        }

        if (isEmpty()) {

            first = last = n;

        } else {

            n.setNext(getFirst());
            first = n;

        }

        counter++;
    }

    public void print() {

        Node temp = first;

        for(int i = 0; i < getSize(); i++) {

            temp.printInfo();
            temp = temp.getNext();

        }

    }

    public void removeFromFront() throws NoSuchElementException {

        if (isEmpty()) {

            throw new NoSuchElementException();

        } else {

            first = first.getNext();

        }

        counter--;
    }

    public Node peek() {

        return getFirst();

    }

    public boolean equals(MyQueue q1) {

        boolean answer = false;
        Node temp1 = this.getFirst();
        Node temp2 = q1.getFirst();

        for (int j = 0; j < getSize(); j++) {

            if (temp1.getCharacter() == temp2.getCharacter()) {

                answer = true;

            } else {

                answer = false;

            }

            temp1 = temp1.getNext();
            temp2 = temp2.getNext();

        }

        return answer;

    }

}
