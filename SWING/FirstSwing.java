import javax.swing.*;
class FirstSwing{
	public static void main(String[] args){
		JFrame frame = new JFrame("FIRST");
		
		JButton b1 = new JButton("CLICK");
		b1.setBounds(100,100,50,30);
		frame.add(b1);
		
		frame.setSize(720,480);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}