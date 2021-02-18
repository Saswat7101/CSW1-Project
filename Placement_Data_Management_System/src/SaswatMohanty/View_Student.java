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
import java.awt.event.*;
import javax.swing.*;

public class View_Student implements ActionListener{
    JFrame frame;
    JTextField text;
    JLabel label1,label2;
    JButton button1,button2;

    View_Student(){
        frame=new JFrame("View");
        frame.setBackground(Color.green);
        frame.setLayout(null);

        label1=new JLabel();
        label1.setBounds(0,0,500,270);
        label1.setLayout(null);
        ImageIcon image=new ImageIcon(ClassLoader.getSystemResource("SaswatMohanty/icons/view.jpg"));
        label1.setIcon(image);


        label2=new JLabel("Student Id");
        label2.setVisible(true);
        label2.setBounds(40,60,250,30);
        label2.setForeground(Color.white);
        Font F1 = new Font("serif",Font.BOLD,30);
        label2.setFont(F1); 
        label1.add(label2);
        frame.add(label1);


        text=new JTextField();
        text.setBounds(240,60,220,30);
        label1.add(text);

        button1=new JButton("Search");
        button1.setBounds(240,150,100,30);
        button1.addActionListener(this);
        label1.add(button1);

        button2=new JButton("Cancel");
        button2.setBounds(360,150,100,30);
        button2.addActionListener(this);
        label1.add(button2);

        frame.setSize(500,270);
        frame.setLocation(450,250);
        frame.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent actionEvevnt){

        if(actionEvevnt.getSource()==button2){
            frame.setVisible(false);
            Details details=new Details();
        }
        if(actionEvevnt.getSource()==button1){
            frame.setVisible(false);
            Print_Data print=new Print_Data(text.getText());
        }

    }

    public static void main(String[]ar){
        View_Student view=new View_Student();
    }
}
