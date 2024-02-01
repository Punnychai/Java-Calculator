import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;

public class MainPage extends JFrame {

	MainPage() {
		setSize(400,600);
		setVisible(true);
		setTitle("Punnychai's Calculator");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new MainPage();
	}
}
