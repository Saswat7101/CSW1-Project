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
import java.lang.Thread;
import java.awt.event.*;

public class Front_page implements ActionListener{
    JFrame frame; 
    JLabel image,l1;
    JButton button;

    Front_page(){
 
        frame=new JFrame("Placement Data Management System");
        frame.setBackground(Color.red);
        frame.setLayout(null);
        
        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("SaswatMohanty/icons/front.png"));
        Image icon2 = icon1.getImage().getScaledInstance(700,300,Image.SCALE_DEFAULT);
        ImageIcon icon3 = new ImageIcon(icon2);
        JLabel l1 = new JLabel(icon3);
        
        l1.setBounds(0,150,1360,530);
        frame.add(l1);


        button = new JButton("CLICK HERE TO CONTINUE");
        button.setBackground(Color.RED);
        button.setForeground(Color.WHITE);
        

        button.setBounds(500,600,300,70);
        button.addActionListener(this);

        image=new JLabel();
        image.setBounds(0,0,1360,750);
        image.setLayout(null);
        
   

        JLabel label2=new JLabel("PLACEMENT DATA MANAGEMENT SYSTEM");
        label2.setBounds(50,20,1500,100);
        label2.setFont(new Font("serif",Font.PLAIN,60));
        label2.setForeground(Color.magenta);
        image.add(label2);

        image.add(button);
        frame.add(image);
        
        
        frame.getContentPane().setBackground(Color.WHITE);

        frame.setVisible(true);
        frame.setSize(1360,750);
        frame.setLocation(200,100);

        while(true){
            label2.setVisible(false); // lid =  j label
            try{
                Thread.sleep(500); //1000 = 1 second
            }catch(Exception e){} 
            label2.setVisible(true);
            try{
                Thread.sleep(500);
            }catch(Exception e){}
        }

    }
    public void actionPerformed(ActionEvent actionEvent){

        if(actionEvent.getSource()==button){
            frame.setVisible(false);
            new Login();    
        }
    }

    public static void main(String[] arg){
        Front_page f = new Front_page();
    }
}
