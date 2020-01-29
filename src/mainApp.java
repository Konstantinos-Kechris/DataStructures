import javax.swing.*;
import java.awt.*;

public class mainApp {

    public static void main(String [] args) {

        char tempchar;
        JOptionPane.showMessageDialog(null, "Please give us a DNA sequence to determine if it is Watson-Crick complemented palindrome","Give a sequence",JOptionPane.PLAIN_MESSAGE);
        boolean valid = true;
        String input = JOptionPane.showInputDialog("Type DNA sequence here: ");
        String sequence = input.toUpperCase();

        while (true) {

            char[] characters = new char[sequence.length()];

            if (input.equals(" ")) {

                System.out.println("The sequence is Watson-Crick complemented palindrome ");
                break;

            }

            for (int i = 0; i < sequence.length(); i++) {

                tempchar = sequence.charAt(i);
                characters[i] = tempchar;

            }

            for (int j = 0; j < sequence.length(); j++) {
                tempchar = sequence.charAt(j);

                if (tempchar != 'A' && tempchar != 'T' && tempchar != 'C' && tempchar != 'G') {

                    valid = false;
                    break;

                }

                valid = true;

            }

            if (valid == false) {

                input = JOptionPane.showInputDialog("Type the DNA sequence here: ");
                sequence = input.toUpperCase();

            } else {

                break;

            }

        }

        MyQueue queue = new MyQueue();
        Node temp_node;
        char temp_char;

        MyQueue queue1 = new MyQueue();
        Node temp_node2;
        char temp_char2;

        for (int i = 0; i < sequence.length(); i++) {

            temp_char = sequence.charAt(i);
            temp_node = new Node(temp_char);
            queue.insertAtBack(temp_node);

            temp_char2 = sequence.charAt(i);
            temp_node2 = new Node(temp_char2);
            queue1.insertAtFront(temp_node2);

        }

        String answer;

        if ( queue.equals(queue1)) {

            answer = "Sequence is Watson-Crick complemented palindrome";

        } else {

            answer = "Sequence is not Watson-Crick complemented palindrome";

        }

        ProgressMonitor frame = new ProgressMonitor(answer);
        frame.setBounds(400,400,400,200);
        frame.setVisible(true);
        boolean flag1 = false;
        frame.iterate();

        JLabel l1 = new JLabel();
        l1.setText(answer);
        l1.setBounds(500,500,100,100);
        frame.add(l1);

    }
}
