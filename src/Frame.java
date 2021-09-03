import javax.swing.*;

public class Frame extends JFrame {
    public Frame() {
        super("Menu");

        JPanel menuPanel = new MenuPanel();
        add(menuPanel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
}
