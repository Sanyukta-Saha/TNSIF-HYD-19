import java.awt.*;
public class JavaAwt {
	public static void main(String[] args) {
		Frame frame = new Frame("JAVA");
        Label label = new Label("Hello, Welcome to java ");
        frame.add(label);
        frame.setSize(300, 200);
        frame.setBackground(Color.lightGray);
        label.setForeground(Color.BLUE);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
		
	}

}
