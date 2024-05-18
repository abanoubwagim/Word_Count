import javax.swing.JTextArea;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static class frame extends JFrame implements ActionListener
    {
        JButton count;
        JLabel countlabel;
        JTextArea textArea;
        public frame()
        {
            super("Word Count");
            this.setSize(600,300);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLayout(new FlowLayout());
            // Create button called Count
            count = new JButton("Count");
            count.addActionListener(this);

            // Create count label with initial value of zero
            countlabel = new JLabel("Word count : 0");

            // Create text area
            textArea = new JTextArea(15,30);

            // Add components to frame
            JPanel panel = new JPanel();
            panel.add(new JScrollPane(textArea));
            panel.add(count);
            panel.add(countlabel);
            this.add(panel);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            // Get text from text area
            String text = textArea.getText();
            // Split text into words
            String [] words = text.split(" ");
            // Count number of words
            int count = words.length;
            // Update count label
            countlabel.setText("Word count : "+count);
        }
    }
    public static void main(String[] args) {

        new frame().setVisible(true);
        }
    }
