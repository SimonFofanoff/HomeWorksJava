import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame {
    public void initWindow(){
        setSize(1024, 768);
        setLocation(450, 150);
        int value = WindowConstants.EXIT_ON_CLOSE;
        setDefaultCloseOperation(value);

        GridLayout Layout = new GridLayout(1,2);
        JPanel panel = new JPanel(Layout);
//        panel.setSize(1024,100);
        JButton buttonOne = new JButton("Бесполезная кнопка");
        JButton buttonTwo = new JButton("Ещё одна бесполезная кнопка");
//        buttonOne.setSize(512,100);
//        buttonTwo.setSize(512,100);
        panel.add(buttonOne);
        panel.add(buttonTwo);
        add(panel, BorderLayout.NORTH);
        setVisible(true);
    }
}
