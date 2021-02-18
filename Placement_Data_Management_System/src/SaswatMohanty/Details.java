/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SaswatMohanty;

/**
 *
 * @author SASWAT7101
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Details implements ActionListener{
    JFrame frame;
    JLabel label1,label2;
    JButton button1,button2,button3,button4;

    Details(){
        frame=new JFrame("Student Detail");
        frame.setBackground(Color.white);
        frame.setLayout(null);

        label1 = new JLabel();
        label1.setBounds(0,0,700,500);
        label1.setLayout(null);
        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("SaswatMohanty/icons/details.jpg"));
        label1.setIcon(icon1);
        frame.add(label1);

        label2 = new JLabel("Student Details");
        label2.setBounds(430,20,200,40);
        label2.setFont(new Font("serif",Font.BOLD,25));
        label2.setForeground(Color.white);
        label1.add(label2);

        button1=new JButton("Add");
        button1.setBounds(420,80,100,40);
        button1.setFont(new Font("serif",Font.BOLD,15));
        button1.addActionListener(this);
        label1.add(button1);


        button2=new JButton("View");
        button2.setBounds(530,80,100,40);
        button2.setFont(new Font("serif",Font.BOLD,15));
        button2.addActionListener(this);
        label1.add(button2);

        button3=new JButton("Remove");
        button3.setBounds(420,140,100,40);
        button3.setFont(new Font("serif",Font.BOLD,15));
        button3.addActionListener(this);
        label1.add(button3);

        button4=new JButton("Update");
        button4.setBounds(530,140,100,40);
        button4.setFont(new Font("serif",Font.BOLD,15));
        button4.addActionListener(this);
        label1.add(button4);

        frame.setVisible(true);
        frame.setSize(700,500);
        frame.setLocation(450,200);

    }

    public void actionPerformed(ActionEvent actionEvevnt){
        if(actionEvevnt.getSource()==button1){
            frame.setVisible(false);
            new Add_Student();
        }
        if(actionEvevnt.getSource()==button2){
            frame.setVisible(false);
            new View_Student();
        }
        if(actionEvevnt.getSource()==button3){
            frame.setVisible(false);
            new Remove_Student();
        }
        if(actionEvevnt.getSource()==button4){
            frame.setVisible(false);
            new Search_Student();
        }
    }

    public static void main(String[ ] arg){
        Details details = new Details();
    }
}
