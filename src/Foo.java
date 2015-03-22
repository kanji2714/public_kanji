import javax.swing.JFrame;
import javax.swing.JLabel;


public class Foo extends JFrame {

	public Foo() {
		setAlwaysOnTop(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800,600);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);

		JLabel label = new JLabel("Hello World!");
		add(label);
	}

	public static void main(String[] args) {
		new Foo();
	}
}
