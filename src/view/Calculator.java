/*Is a Composite class*/
package view;

import controller.ButtonActionListener;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Calculator extends JPanel{

    private ArrayList<Button> keyboard;
    private Display d;
    public Calculator(ArrayList<Button> keyboard)
    {
        super();

        this.keyboard = keyboard;
        this.d = new Display();

        this.setLayout(new FlowLayout());
        this.setPreferredSize(new Dimension(600, 400));

        this.add(this.d.showSymbol());

        Iterator<Button> i = keyboard.iterator();
        while (i.hasNext())
        {
            JButton tmp = i.next().showSymbol();
            tmp.addActionListener(new ButtonActionListener(this.d, this));
            this.add(tmp);
        }
        JButton add = new JButton("+");
        JButton sub = new JButton("-");
        add.addActionListener(new ButtonActionListener(this.d, this));
        sub.addActionListener(new ButtonActionListener(this.d, this));
        this.add(add);
        this.add(sub);
    }
}
