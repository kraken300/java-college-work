import java.awt.*;
import java.awt.event.*;

public class GUI4 implements ActionListener{
	Frame frame;
	TextField tf;
	Button button;
	
	GUI4(){
		frame = new Frame("Fourth GUI");
		frame.setSize(720,480);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
		tf = new TextField();
		tf.setBounds(300,170,100,20);
		frame.add(tf);
		
		button = new Button("Click");
		button.setBounds(315,200,50,30);
		frame.add(button);
		button.addActionListener(this);	
	}
	
	public void actionPerformed(ActionEvent e){
		tf.setText("Hip Hip Hurray!!");
	}
	
	public static void main(String[] args){
		GUI4 obj = new GUI4();
	}
}