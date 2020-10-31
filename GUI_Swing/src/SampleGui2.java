import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SampleGui2 implements ActionListener {
    JButton button;
    public static void main(String[] args) {
        SampleGui2 gui = new SampleGui2();
        gui.go();

    }

    void go(){
        JFrame frame = new JFrame();
        button = new JButton("Click me!!");

        button.addActionListener(this);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);

        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        button.setText("I have been clicked");
    }
}
