package controller;

import business.Add;
import business.Context;
import business.Subtract;
import view.Button;
import view.Display;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Dispatcher {
    private Button buttonView;
    private Display displayView;
    private JPanel panel;

    public Dispatcher(Display d, JPanel panel)
    {
        super();
        this.displayView = d;
        this.panel = panel;
    }

    public void dispatch(String request, ActionEvent e)
    {
        if(((JButton)e.getSource()).getText().equals("+"))
        {
            Context c = new Context(new Add());
            int result = c.executeStrategy(this.displayView.showSymbol().getText());
            this.displayView.clear();
            this.displayView.setSymbol(Integer.toString(result));
            this.displayView.setValue(true);
        }
        else if(((JButton)e.getSource()).getText().equals("-"))
        {
            Context c = new Context(new Subtract());
            int result = c.executeStrategy(this.displayView.showSymbol().getText());
            this.displayView.clear();
            this.displayView.setSymbol(Integer.toString(result));
            this.displayView.setValue(true);
        }
        else
        {
            if(this.displayView.getValue())
            {
                this.displayView.clear();
                this.displayView.setValue(false);
            }
            this.displayView.setSymbol(((JButton)e.getSource()).getText());

        }
    }
}
