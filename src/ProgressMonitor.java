import java.awt.*;
import javax.swing.*;

public class ProgressMonitor extends JFrame {

    JProgressBar current;
    int num = 0;

    public ProgressMonitor(String answer) {
        super("Progress Monitor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(205, 68);
        setLayout(new FlowLayout());
        current = new JProgressBar(0, 2000);
        current.setValue(0);
        current.setStringPainted(true);
        add(current);

        JTextArea out = new JTextArea();
        out.setBounds(415,415,330,300);
        add(out);

    }

    public void iterate() {
        while (num < 2000) {
            current.setValue(num);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) { }
            num += 95;

            if (num > 2000) {


                System.out.println("Finished");

                // JLabel label1 = new JLabel(answer);
                // label1.setBounds(500,500,100,100);
            }
        }
    }


}
