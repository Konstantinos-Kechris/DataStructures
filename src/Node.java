public class Node {

    private char character;
    private Node next;

    public Node() {

    }

    public Node(char c) {

        character = c;

    }

    public Node(char c, Node nextnode) {

        character = c;
        next = nextnode;

    }

    public void setCharacter (char c) {

        character = c;

    }

    public char getCharacter() {

        return character;

    }

    public Node getNext() {

        return next;

    }

    public void setNext(Node next) {

        this.next = next;

    }

    public void printInfo() {

        System.out.print(this.getCharacter()+ " ");

    }

}