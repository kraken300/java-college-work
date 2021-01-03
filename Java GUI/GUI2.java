import java.awt.*;
class GUI2{
	public static void main(String[] args){
		Frame frame = new Frame();
		Button button = new Button("Click me!!");
		button.setBounds(150,150,60,30);
		frame.add(button);
		frame.setTitle("My second GUI");
		frame.setSize(300,300);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}