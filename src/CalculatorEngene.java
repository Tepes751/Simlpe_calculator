import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Влад on 29.01.2016.
 */
public class CalculatorEngene implements ActionListener {

    private SimpleCalculator parent;

    private String operetion = "";
    private double temp = 0;

    private boolean newnum = false;


    CalculatorEngene (SimpleCalculator parent){
        this.parent = parent;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        JButton clickedButton = (JButton) e.getSource();

        String dispFiledText = parent.getDisplayVlaue();

        String clickedButtonLabel = clickedButton.getText();

        if (clickedButtonLabel.equals("C")) parent.setDisplayValue("");
        else if (clickedButtonLabel.equals(".") && ( isHavePoint(dispFiledText))) {}
        else if (clickedButtonLabel.equals(".") && (dispFiledText.isEmpty()))
        {
            parent.setDisplayValue("0.");
        }
        else if (clickedButtonLabel.equals("+")) {
            temp = Double.parseDouble(dispFiledText);
            operetion = "+";
            newnum = true;
        }
        else if (clickedButtonLabel.equals("-")) {
            temp = Double.parseDouble(dispFiledText);
            operetion = "-";
            newnum = true;
        }
        else if (clickedButtonLabel.equals("*")) {
            temp = Double.parseDouble(dispFiledText);
            operetion = "*";
            newnum = true;
        }
        else if (clickedButtonLabel.equals("/")) {
            temp = Double.parseDouble(dispFiledText);
            operetion = "/";
            newnum = true;
        }
        else if (clickedButtonLabel.equals("="))
        {
            if (operetion.equals("+"))
            {
                parent.setDisplayValue(result(temp + Double.parseDouble(dispFiledText)));
            }
            if (operetion.equals("-"))
            {
                parent.setDisplayValue(result(temp - Double.parseDouble(dispFiledText)));
            }
            if (operetion.equals("*"))
            {
                parent.setDisplayValue( result(temp * Double.parseDouble(dispFiledText)));
            }
            if (operetion.equals("/"))
            {
                parent.setDisplayValue(result(temp / Double.parseDouble(dispFiledText)));
            }
        }
        else if ((clickedButtonLabel.equals("0") || clickedButtonLabel.equals("00")) && dispFiledText.equals("0"))
        {
            dispFiledText = "0";
        }
        else if (newnum)
        {
            parent.setDisplayValue(clickedButtonLabel);
            newnum = false;
        }
        else
        parent.setDisplayValue(dispFiledText + clickedButtonLabel);

    }


    public String result (Double i)
    {
        String result = "";
        int j = i.intValue();

        if ((j - i) < 0)  result  += i;
        else   result += j;

        return result;
    }


    public boolean isHavePoint (String s)
    {
        for (int i = 0; i < s.length(); i++)
        {
            if ( ("" + s.charAt(i)).equals(".") ) return true;
        }

        return false;
    }


}
