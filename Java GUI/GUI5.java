import java.awt.*;
import java.awt.event.*;

public class GUI5 extends Frame implements MouseListener{
	
	//Frame frame;
	Label label;
	
	GUI5(){
		
		addMouseListener(this);
		//frame = new Frame();
		label = new Label();
		label.setBounds(300,200,100,50);
		add(label);
		
		setSize(720,480);
		setLayout(null);
		setVisible(true);
			
	}
	
	public void mouseClicked(MouseEvent e){
		label.setText("Mouse Clicked");
	}
	public void mouseEntered(MouseEvent e){
		label.setText("Mouse Entered");
	}
	public void mouseExited(MouseEvent e){
		label.setText("Mouse Exited");
	}
	public void mousePressed(MouseEvent e){
		label.setText("Mouse Pressed");
	}
	public void mouseReleased(MouseEvent e){
		label.setText("Mouse Released");
	}
	
	public static void main(String[] args){
		new GUI5();
	}
}
