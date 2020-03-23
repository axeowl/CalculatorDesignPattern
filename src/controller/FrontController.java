package controller;

import view.Display;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class FrontController {
    private Dispatcher dispatcher;

    public FrontController(Display d, JPanel panel)
    {
        dispatcher = new Dispatcher(d, panel);
    }

    public void dispatchRequest(String request, ActionEvent e)
    {
        dispatcher.dispatch(request, e);
    }
}
