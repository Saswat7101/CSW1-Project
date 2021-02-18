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
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;

public class Update_Student extends Add_Student implements ActionListener{
    JFrame frame;
    JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13,label14,label15,label16;
    JTextField text1,text2,text3,text4,text5,text6,text7,text8,text9,text10,text11,text12;
    JButton button1,button2,button3,button4; 
    String id_stu;

    Update_Student(String idaa){
        super(0);
        frame=new JFrame("Update Student details");
        frame.setVisible(true);
        frame.setSize(900,500);
        frame.setLocation(450,250);
        frame.setBackground(Color.white);
        frame.setLayout(null);

        id_stu=idaa;    
        label14=new JLabel();
        label14.setBounds(0,0,900,500);
        label14.setLayout(null);
        ImageIcon image=new ImageIcon(ClassLoader.getSystemResource("SaswatMohanty/icons/add.jpg"));
        label14.setIcon(image);

        label9 = new JLabel("Update Student Details:");
        label9.setBounds(50,10,500,50);
        label9.setFont(new Font("serif",Font.ITALIC,40));
        label9.setForeground(Color.black);
        label14.add(label9);
        frame.add(label14);


        label2 = new JLabel("Name:");  
        label2.setBounds(50,100,100,30);
        label2.setFont(new Font("serif",Font.BOLD,20));
        label14.add(label2);

        text2=new JTextField();
        text2.setBounds(200,100,150,30);
        label14.add(text2);

        label3 = new JLabel("Father's Name:");
        label3.setBounds(400,100,200,30);
        label3.setFont(new Font("serif",Font.BOLD,20));
        label14.add(label3);

        text3=new JTextField();
        text3.setBounds(600,100,150,30);
        label14.add(text3);

        label4= new JLabel("Company:");
        label4.setBounds(50,150,100,30);
        label4.setFont(new Font("serif",Font.BOLD,20));
        label14.add(label4);

        text4=new JTextField();
        text4.setBounds(200,150,150,30);
        label14.add(text4);

        label5= new JLabel("Mobile No:");
        label5.setBounds(400,150,100,30);
        label5.setFont(new Font("serif",Font.BOLD,20));
        label14.add(label5);

        text5=new JTextField();
        text5.setBounds(600,150,150,30);   
        label14.add(text5);

        label6= new JLabel("Email Id:");
        label6.setBounds(50,200,100,30);
        label6.setFont(new Font("serif",Font.BOLD,20));
        label14.add(label6);

        text6=new JTextField();
        text6.setBounds(200,200,150,30);
        label14.add(text6);

        label7= new JLabel("Package:");
        label7.setBounds(400,200,100,30);
        label7.setFont(new Font("serif",Font.BOLD,20));    
        label14.add(label7);

        text7=new JTextField();
        text7.setBounds(600,200,150,30);
        label14.add(text7);

        label8= new JLabel("Placed? :");
        label8.setBounds(50,250,100,30);
        label8.setFont(new Font("serif",Font.BOLD,20));
        label14.add(label8);

        text8=new JTextField();
        text8.setBounds(200,250,150,30);
        label14.add(text8);

        label10= new JLabel("Aadhar No:");
        label10.setBounds(400,250,100,30);  
        label10.setFont(new Font("serif",Font.BOLD,20));
        label14.add(label10);

        text9=new JTextField();
        text9.setBounds(600,250,150,30);
        label14.add(text9);

        label11= new JLabel("Student Id:");
        label11.setBounds(50,300,150,30);
        label11.setFont(new Font("serif",Font.BOLD,20));
        label14.add(label11);
        frame.setVisible(false);
        text10=new JTextField();
        text10.setBounds(200,300,150,30);
        label14.add(text10);

        button1=new JButton("Update");
        button1.setBounds(250,400,100,30);
        button1.addActionListener(this);
        label14.add(button1);

        button2=new JButton("Cancel");
        button2.setBounds(450,400,100,30);
        button2.addActionListener(this);
        label14.add(button2);

        showData(idaa);
    }

    int i=0;
    String age,dat;

    void showData(String string){
        try{
            conn con = new conn();
            String str = "select * from student where stu_id = '"+string+"'";
            ResultSet resultSet = con.statement.executeQuery(str);

            if(resultSet.next()){
                frame.setVisible(true);
                i=1;

                text2.setText(resultSet.getString(1));
                text3.setText(resultSet.getString(2));
                text4.setText(resultSet.getString(5));
                text5.setText(resultSet.getString(6));
                text6.setText(resultSet.getString(7));
                text7.setText(resultSet.getString(8));
                text8.setText(resultSet.getString(9));
                text9.setText(resultSet.getString(10));
                text10.setText(resultSet.getString(11));

                age=resultSet.getString(3);
                dat=resultSet.getString(4);
            }
            if(i==0)
                JOptionPane.showMessageDialog(null,"Id not found");
            new Search_Student();
        }catch(Exception ex){}
        frame.setVisible(true);
        frame.setSize(900,500);
        frame.setLocation(400,100);
    }

    public void actionPerformed(ActionEvent actionEvent){
        if(actionEvent.getSource()==button1 && i==1){
            try{
                conn con = new conn();
                String str = "update student set name='"+text2.getText()+"',fname='"+text3.getText()+"',age='"+age+"',dob='"+dat+"',company='"+text4.getText()+"',phone='"+text5.getText()+"',email='"+text6.getText()+"',package='"+text7.getText()+"',placed_non_placed='"+text8.getText()+"',aadhar='"+text9.getText()+"',stu_id='"+text10.getText()+"' where stu_id='"+id_stu+"'";
                con.statement.executeUpdate(str);
                JOptionPane.showMessageDialog(null,"successfully updated");
                frame.setVisible(false);
                new Details();
            }catch(Exception e){
                System.out.println("The error is:"+e);
            }
        }
        if(actionEvent.getSource()==button2){
            frame.setVisible(false);
            Details details=new Details();
        }
    }

    public static void main(String[] arg){
        new Update_Student("Update Student");
    }
}
