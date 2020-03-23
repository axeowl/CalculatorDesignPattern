package view;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MainFrame extends JFrame {

    public MainFrame(Dimension d, String title)
    {
        ArrayList<Button> ab = new ArrayList<Button>();

        for(int i = 0; i < 10; i++)
        {
            Button b = new Button(Integer.toString(i));
            ab.add(b);
        }
        Calculator c = new Calculator(ab);
        this.add(c);
        this.setTitle(title);
        this.setSize(d);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
