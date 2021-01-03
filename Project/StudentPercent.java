import java.io.*;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

class StudentPercent implements ActionListener{
	
	JFrame frame;
	JDialog dialog;
	JLabel title,note,name,dept,sub1,sub2,sub3,sub4,sub5,total,percent,avg,totalOut,percentOut,avgOut,submit;
	JTextField tfname,tfdept,tfsub1,tfsub2,tfsub3,tfsub4,tfsub5;
	JButton btn1,btnclear;
	
	StudentPercent(){
		frame = new JFrame("Student Total Percentage Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		title = new JLabel();
		title.setText("Student Percentage Calculator");
		title.setFont(title.getFont().deriveFont(25f));
		title.setForeground(Color.BLUE);
		title.setBounds(50,5,500,30);
		frame.add(title);
		
		note = new JLabel();
		note.setText("*Note : Each subject is of 100 marks, percentage is calculated based on the total 0f 500 Marks and do not forget to clear your data after getting your results");
		note.setForeground(Color.RED);
		note.setBounds(50,35,900,70);
		frame.add(note);
		
		name = new JLabel("Enter Name :");
		name.setFont(name.getFont().deriveFont(20f));
		name.setBounds(50,100,240,20);
		frame.add(name);
		
		tfname = new JTextField();  //Name
		tfname.setFont(tfname.getFont().deriveFont(18f));
		tfname.setBounds(320,100,200,30);
		frame.add(tfname);
		
		dept = new JLabel("Enter Department :");
		dept.setFont(dept.getFont().deriveFont(20f));
		dept.setBounds(50,140,240,20);
		frame.add(dept);
		
		tfdept = new JTextField();  //Department
		tfdept.setFont(tfdept.getFont().deriveFont(18f));
		tfdept.setBounds(320,140,200,30);
		frame.add(tfdept);
		
		sub1 = new JLabel("Enter Subject 1 Marks: ");
		sub1.setFont(sub1.getFont().deriveFont(20f));
		sub1.setBounds(50,180,240,20);
		frame.add(sub1);
		
		tfsub1 = new JTextField();   //Sub1
		tfsub1.setFont(tfsub1.getFont().deriveFont(18f));
		tfsub1.setBounds(320,180,200,30);
		frame.add(tfsub1);
		
		sub2 = new JLabel("Enter Subject 2 Marks: ");
		sub2.setFont(sub2.getFont().deriveFont(20f));
		sub2.setBounds(50,220,240,20);
		frame.add(sub2);
		
		tfsub2 = new JTextField();   //Sub2
		tfsub2.setFont(tfsub2.getFont().deriveFont(18f));
		tfsub2.setBounds(320,220,200,30);
		frame.add(tfsub2);
		
		sub3 = new JLabel("Enter Subject 3 Marks: ");
		sub3.setFont(sub3.getFont().deriveFont(20f));
		sub3.setBounds(50,260,240,20);
		frame.add(sub3);
		
		tfsub3 = new JTextField();   //Sub3
		tfsub3.setFont(tfsub3.getFont().deriveFont(18f));
		tfsub3.setBounds(320,260,200,30);
		frame.add(tfsub3);
		
		sub4 = new JLabel("Enter Subject 4 Marks: ");
		sub4.setFont(sub4.getFont().deriveFont(20f));
		sub4.setBounds(50,300,240,20);
		frame.add(sub4);
		
		tfsub4 = new JTextField();  //Sub4
		tfsub4.setFont(tfsub4.getFont().deriveFont(18f));
		tfsub4.setBounds(320,300,200,30);
		frame.add(tfsub4);
		
		sub5 = new JLabel("Enter Subject 5 Marks: ");
		sub5.setFont(sub5.getFont().deriveFont(20f));
		sub5.setBounds(50,340,240,20);
		frame.add(sub5);
		
		tfsub5 = new JTextField();  //Sub5
		tfsub5.setFont(tfsub5.getFont().deriveFont(18f));
		tfsub5.setBounds(320,340,200,30);
		frame.add(tfsub5);
		
		total = new JLabel("Total :");
		total.setFont(total.getFont().deriveFont(20f));
		total.setBounds(50,380,150,25);
		frame.add(total);
		
		totalOut = new JLabel();
		totalOut.setFont(totalOut.getFont().deriveFont(18f));
		totalOut.setBounds(200,380,200,30);
		frame.add(totalOut);
		
		percent = new JLabel("Percentage :");
		percent.setFont(percent.getFont().deriveFont(20f));
		percent.setBounds(50,420,150,25);
		frame.add(percent);
		
		percentOut = new JLabel();
		percentOut.setFont(percentOut.getFont().deriveFont(18f));
		percentOut.setBounds(200,420,200,30);
		frame.add(percentOut);
		
		avg = new JLabel("Average :");
		avg.setFont(avg.getFont().deriveFont(20f));
		avg.setBounds(50,460,150,25);
		frame.add(avg);
		
		avgOut = new JLabel();
		avgOut.setFont(avgOut.getFont().deriveFont(18f));
		avgOut.setBounds(200,460,200,30);
		avgOut.setBounds(200,460,200,30);
		frame.add(avgOut);
		
		btn1 = new JButton("Submit");
		btn1.setFont(btn1.getFont().deriveFont(20f));
		btn1.setBounds(50,500,100,30);
		frame.add(btn1);
		btn1.addActionListener(this);
		
		btnclear = new JButton("Clear");
		btnclear.setFont(btnclear.getFont().deriveFont(20f));
		btnclear.setBounds(200,500,100,30);
		frame.add(btnclear);
		btnclear.addActionListener(this);
		
		submit = new JLabel();
		submit.setFont(submit.getFont().deriveFont(18f));
		submit.setForeground(Color.RED);
		submit.setBounds(50,540,150,20);
		frame.add(submit);
		
		frame.setSize(1080,720);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		if (e.getSource() == btn1){
			
			String s1 = tfsub1.getText();
			int a = Integer.parseInt(s1);
			
			String s2 = tfsub2.getText();
			int b = Integer.parseInt(s2);
			
			String s3 = tfsub3.getText();
			int c = Integer.parseInt(s3);
			
			String s4 = tfsub4.getText();
			int d = Integer.parseInt(s4);
			
			String s5 = tfsub5.getText();
			int f = Integer.parseInt(s5);
			
			float Total = a+b+c+d+f;
			String sTotal = Float.toString(Total);
			
			double Percent = 100*(Total/500);
			String sPercent = Double.toString(Percent);
			
			float Average = Total/5;
			String sAverage = Float.toString(Average);
			
			String Name= tfname.getText();
			String Dept = tfdept.getText();
			
			totalOut.setText(sTotal);
			percentOut.setText(sPercent+"%");
			avgOut.setText(sAverage);
			submit.setText("Submitted!!");
			
			try{
				FileWriter data = new FileWriter("records.txt",true);
				BufferedWriter bw = new BufferedWriter(data);
				bw.write(Name+", "+Dept+", "+s1+", "+s2+", "+s3+", "+s4+", "+s5+", "+sTotal+", "+sPercent+", "+sAverage);

				bw.newLine();
				bw.close();
			}
			catch(IOException ex){
				System.out.println("Error!");
				ex.printStackTrace();
			}
		}
		
		else{
			tfname.setText(null);
			tfdept.setText(null);
			tfsub1.setText(null);
			tfsub2.setText(null);
			tfsub3.setText(null);
			tfsub4.setText(null);
			tfsub5.setText(null);
			submit.setText(null);
			avgOut.setText(null);
			percentOut.setText(null);
			totalOut.setText(null);
			name.requestFocus();
		}
	}
	
	public static void main(String[] args){
		StudentPercent obj = new StudentPercent();
	}
}
