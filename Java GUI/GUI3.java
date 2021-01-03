import java.awt.*;
public class GUI3{
	public static void main(String[] args){
		Frame frame = new Frame();
		frame.setSize(720,480);
		frame.setLayout(null);
		frame.setVisible(true);
		
		Label label = new Label("Enter name : ");
		label.setBounds(50,60,80,20);
		frame.add(label);
		
		TextField tf = new TextField();
		tf.setBounds(140,60,80,20);
		frame.add(tf);
	}
}