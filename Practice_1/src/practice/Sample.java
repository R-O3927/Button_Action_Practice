package practice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;



public class Sample extends JFrame {
	
	JLabel label;
	JTextField field;
	JButton button;
	
	public Sample() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		
		//JLanelの組み込み
		String msg0 = "<html><h3>Welcome</h3></html>";
		label = new JLabel(msg0);
		label.setSize(200, 30);
		label.setLocation(20,20);
		this.add(label);
		
		//JTextFieldの組み込み
		field = new JTextField();
		field.setSize(200, 20);
		field.setLocation(20, 50);
		this.add(field);
		
		//JButtonの組み込み
		button = new JButton("Check");
		button.setSize(100, 25);
		button.setLocation(20, 80);
		button.addActionListener(new ActionAdapter(this));
		this.add(button);
		
	}
	
	

	public static void main(String[] args) {
		
		Sample s = new Sample();
		
		//ウィンドウ自体の題名を設定
		s.setTitle("Sample Title");
		
		//ウィンドウを表示
		s.setVisible(true);

	}

}

class ActionAdapter implements ActionListener {
	
	Sample sample;
	
	public ActionAdapter(Sample s) {
		this.sample = s;
	}
	
	public void actionPerformed(ActionEvent ev) {
		String s = sample.field.getText();
		sample.label.setText("貴方は「" + s + "」と記入しました。");
	}
}