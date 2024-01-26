package MVC;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class studview extends JFrame{
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JButton b1,b2,b3,b4,b5;
	public studview()
	{
	setLayout(new FlowLayout());
	l1=new JLabel("Enter Roll no");
	l2=new JLabel("Enter Name");
	l3=new JLabel("Enter Marks");
	t1=new JTextField(20);
	t2=new JTextField(20);
	t3=new JTextField(20);
	b1=new JButton("Add");
	b2=new JButton("Update");
	b3=new JButton("Delete");
	b4=new JButton("Search");
	b5=new JButton("Clear");
	b1.addActionListener(new studController(this));
	b2.addActionListener(new studController(this));
	b3.addActionListener(new studController(this));
	b4.addActionListener(new studController(this));
	b5.addActionListener(new studController(this));
	add(l1);
	add(t1);
	add(l2);
	add(t2);
	add(l3);
	add(t3);
	add(b1);
	add(b2);
	add(b3);
	add(b4);
	add(b5);
	setSize(400,400);
	setVisible(true);
	}
	public static void main(String[] args) {
		studview fr = new studview();
		
	}

}
