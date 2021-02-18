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

public class Search_Student implements ActionListener{
    JFrame frame;
    JTextField textField;
    JLabel label1,label2;
    JButton button1,button2;

    Search_Student(){
        frame=new JFrame("Search");
        frame.setBackground(Color.green);
        frame.setLayout(null);

        label2=new JLabel();
        label2.setBounds(0,0,500,270);
        label2.setLayout(null);
        ImageIcon image=new ImageIcon(ClassLoader.getSystemResource("SaswatMohanty/icons/search.jpg"));
        label2.setIcon(image);


        label1=new JLabel("Student Id");
        label1.setVisible(true);
        label1.setBounds(40,50,250,30);
        label1.setForeground(Color.white);
        Font font1=new Font("serif",Font.BOLD,25);
        label1.setFont(font1); 
        label2.add(label1);
        frame.add(label2);

        textField=new JTextField();
        textField.setBounds(240,50,220,30);
        label2.add(textField);

        button1=new JButton("Search");
        button1.setBounds(240,150,100,30);
        button1.addActionListener(this);
        label2.add(button1);


        button2=new JButton("Cancel");
        button2.setBounds(360,150,100,30);
        button2.addActionListener(this);
        label2.add(button2);

        frame.setSize(500,270);
        frame.setLocation(450,250);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent actionEvent){
        if(actionEvent.getSource()==button2){
            frame.setVisible(false);
            Details details=new Details();
        }
        if(actionEvent.getSource()==button1){
            new Update_Student(textField.getText());
            frame.setVisible(false);
        }

    }
    
    public static void main(String[]ar){
        new Search_Student();
    }
}
