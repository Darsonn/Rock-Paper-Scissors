import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPanel extends JPanel implements ActionListener {
    public static final int HEIGHT = 100;
    public static final int WIDTH = 300;
    private final JButton startButton;
    private final JButton autorsButton;
    private final JButton settingsButton;

    public MenuPanel() {
        startButton = new JButton("Start");
        autorsButton = new JButton("Autorzy");
        settingsButton = new JButton("Ustawienia");

        startButton.addActionListener(this);
        autorsButton.addActionListener(this);
        settingsButton.addActionListener(this);

        setLayout(new FlowLayout());
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        add(startButton);
        add(autorsButton);
        add(settingsButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

//        if(source == startButton)
//            setBackground(Color.GREEN);
//
//        else if(source == autorsButton)
//            setBackground(Color.BLUE);
//
//        else if(source == redButton)
//            setBackground(Color.RED);
    }
}
