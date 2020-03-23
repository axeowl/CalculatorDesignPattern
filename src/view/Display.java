package view;

import javax.swing.*;

public class Display implements CalculatorComponent {

    private String currentText;
    private Boolean value;

    public Display()
    {
        super();
        this.value = false;
        this.currentText = "";
    }

    public void setSymbol(String symbol)
    {
        this.currentText += symbol + " ";
    }

    public void setValue(Boolean value)
    {
        this.value = value;
    }

    public Boolean getValue()
    {
        return value;
    }

    public void clear()
    {
        this.currentText = "";
    }
    public JLabel showSymbol()
    {
        return new JLabel(this.currentText);
    }
}
