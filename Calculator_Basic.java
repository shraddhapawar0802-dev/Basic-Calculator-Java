import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Calculator_Basic
{
    public static void main(String [] args)
    {
        JFrame f = new JFrame("Calculator");
        
        JButton b1 = new JButton("+");
        JButton b2 = new JButton("-");
        JButton b3 = new JButton("X");
        JButton b4 = new JButton("/");
        JButton b5 = new JButton("clear");
        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField t3 = new JTextField();
        JLabel l1 = new JLabel("Number 1");
        JLabel l2 = new JLabel("Number 2");
        JLabel l3 = new JLabel("Result");

    
b1.setBounds(300, 50, 50, 50);
b2.setBounds(350, 50, 50, 50); 
b3.setBounds(300, 100, 50, 50); 
b4.setBounds(350, 100, 50, 50); 
b5.setBounds(300, 150, 100, 50); 
t1.setBounds(150, 50, 150, 50);
t2.setBounds(150, 100, 150, 50);
t3.setBounds(150, 150, 150, 50);

l1.setBounds(50, 50, 100, 50);
l2.setBounds(50, 100, 100, 50);
l3.setBounds(50, 150, 100, 50);


        b1.addActionListener(e->{
            try{
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            int n3=n1+n2;
            t3.setText(" "+n3);
            }
            catch(NumberFormatException ex)
            {
                t3.setText("Invalid input!");
            }
        });
        b2.addActionListener(e->{
            try{
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            int n3=n1-n2;
            t3.setText(" "+n3);
            }
             catch(NumberFormatException ex)
            {
                t3.setText("Invalid input!");
            }
        });
        b3.addActionListener(e->{
            try{
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            int n3=n1*n2;
            t3.setText(" "+n3);
            }
             catch(NumberFormatException ex)
            {
                t3.setText("Invalid input!");
            }
        });
        b4.addActionListener(e->{
            try{
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            if(n2==0)
            {
                t3.setText("Cannot Divide by Zero");
            }
            else
            {
                int n3 =n1/n2;
                t3.setText(" "+n3);
            }
        }
        catch(Exception ex)
        {
            t3.setText("Invalid input!");
        }
        });
        b5.addActionListener(e->{
           t1.setText(" ");
           t2.setText(" ");
           t3.setText(" ");
        });
        
        f.setLayout(null);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(l1);
        f.add(l2);
        f.add(l3);

        f.setSize(500,500);
        f.setVisible(true);
    }
}
