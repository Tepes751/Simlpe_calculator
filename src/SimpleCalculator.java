import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * Created by Влад on 29.01.2016.
 */
public class SimpleCalculator {


    JPanel windowContent;
    private JTextField displayFiled;

    JButton buttonC;
    JButton button0;
    JButton button00;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    JButton buttonPoint;
    JButton buttonEqual;
    JButton buttonPlus;
    JButton buttonMinus;
    JButton buttonUmnogenie;
    JButton buttonDelenie;

    JPanel p1;

    public void setDisplayValue (String val){
        displayFiled.setText(val);
    }

    public String getDisplayVlaue(){
        return displayFiled.getText();
    }

    SimpleCalculator(){

        windowContent = new JPanel();

        BorderLayout bl = new BorderLayout();
        windowContent.setLayout(bl);

        displayFiled = new JTextField(30);
        windowContent.add("North", displayFiled);

        buttonC = new JButton("C");
        button0 = new JButton("0");
        button00 = new JButton("00");
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        buttonPoint = new JButton(".");
        buttonEqual = new JButton("=");
        buttonPlus = new JButton("+");
        buttonMinus = new JButton("-");
        buttonUmnogenie = new JButton("*");
        buttonDelenie = new JButton("/");

        p1 = new JPanel();
        GridLayout gl = new GridLayout(6,4);
        p1.setLayout(gl);

        p1.add(buttonC);
        p1.add(button0);
        p1.add(button00);
        p1.add(button1);
        p1.add(button2);
        p1.add(button3);
        p1.add(button4);
        p1.add(button5);
        p1.add(button6);
        p1.add(button7);
        p1.add(button8);
        p1.add(button9);
        p1.add(buttonPoint);
        p1.add(buttonEqual);
        p1.add(buttonPlus);
        p1.add(buttonMinus);
        p1.add(buttonUmnogenie);
        p1.add(buttonDelenie);

        CalculatorEngene calcEngine = new CalculatorEngene(this);
        buttonC.addActionListener(calcEngine);
        button0.addActionListener(calcEngine);
        button00.addActionListener(calcEngine);
        button1.addActionListener(calcEngine);
        button2.addActionListener(calcEngine);
        button3.addActionListener(calcEngine);
        button4.addActionListener(calcEngine);
        button5.addActionListener(calcEngine);
        button6.addActionListener(calcEngine);
        button7.addActionListener(calcEngine);
        button8.addActionListener(calcEngine);
        button9.addActionListener(calcEngine);
        buttonPoint.addActionListener(calcEngine);
        buttonEqual.addActionListener(calcEngine);
        buttonPlus.addActionListener(calcEngine);
        buttonMinus.addActionListener(calcEngine);
        buttonUmnogenie.addActionListener(calcEngine);
        buttonDelenie.addActionListener(calcEngine);

        windowContent.add("Center", p1);

        JFrame frame = new JFrame("My calculator");
        frame.setContentPane(windowContent);

        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }




    public static void main (String[] args)
    {
        new SimpleCalculator();
    }
}
