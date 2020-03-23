package controller;

import business.Add;
import business.Context;
import view.Display;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonActionListener implements ActionListener {

    private FrontController fc;
    private Display d;
    private JPanel panel;
    public ButtonActionListener(Display d, JPanel panel)
    {
        super();
        fc = new FrontController(d, panel);
        this.d = d;
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        this.panel.remove(0);
        fc.dispatchRequest("button", e);
        this.panel.add(this.d.showSymbol(), 0);
        this.panel.revalidate();
        this.panel.repaint();

}
}
