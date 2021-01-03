package PracticalPractice;

import java.awt.*;
import java.awt.event.*;

class AWTFactorial implements ActionListener{
	
	Frame frame;
	TextField tf;
	Label lb1,lb2,lb3;
	Button btnAns,btnClear;
	
	AWTFactorial(){
		frame = new Frame("FACTORIAL");
		
		lb1 = new Label("Enter number : ");
		//lb1.setFont(lb1.getFont().deriveFont(5f));
		lb1.setBounds(50,60,100,30);
		frame.add(lb1);
		
		tf = new TextField();
		//tf.setFont(tf.getFont().deriveFont(20f));
		tf.setBounds(160,60,100,30);
		frame.add(tf);
		
		lb2 = new Label("Result : ");
		lb2.setBounds(50,100,100,30);
		frame.add(lb2);
		
		lb3 = new Label();
		lb3.setBounds(160,100,50,30);
		frame.add(lb3);
		
		frame.setSize(480,480);
		frame.setLayout(null);
		frame.setVisible(true);
		
		btnAns = new Button("Calculate");
		btnAns.setBounds(50,140,60,30);
		frame.add(btnAns);
		btnAns.addActionListener(this);
		
		btnClear = new Button("Clear");
		btnClear.setBounds(120,140,50,30);
		frame.add(btnClear);
		btnClear.addActionListener(this);
		
		frame.setSize(480,480);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setResizable(false);
		
	}
	
	public void actionPerformed(ActionEvent e){
		int temp = 1;
		if(e.getSource() == btnAns){
			String a = tf.getText();
			int x = Integer.parseInt(a);
			while(x >= 1){
				temp = temp*x;
				x--;
			}
			String ans = Integer.toString(temp);
			lb3.setText(ans);
		}
		
		else{
			tf.setText(null);
			lb3.setText(null);
			tf.requestFocus();
		}
	}
	
	public static void main(String[] args){
		AWTFactorial obj = new AWTFactorial();
	}
}