import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("DEBER");
        frame.setContentPane(new login().panel_principal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,400);
        frame.setVisible(true);
        frame.pack();

    }
}