package view;

import javax.swing.*;

public class Button implements CalculatorComponent{

    private String symbol;

    public Button(String symbol)
    {
        this.symbol = symbol;
    }
    public Button()
    {
        super();
    }

    public void setSymbol(String symbol)
    {
        this.symbol = symbol;
    }
    public JButton showSymbol()
    {
        return new JButton(symbol);
    }
}
