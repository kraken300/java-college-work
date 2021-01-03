import java.awt.*;
public class GUI1 {
    public static void main(String[] args){
        Frame frame = new Frame();
        Button b = new Button("Click me");
        b.setBounds(50,100,80,30);
        frame.add(b);
        frame.setTitle("My First GUI");
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
