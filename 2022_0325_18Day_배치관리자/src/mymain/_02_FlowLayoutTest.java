package mymain;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class _02_FlowLayoutTest extends JFrame {

	public _02_FlowLayoutTest() {
		super("FlowLayout 연습");
		
		//JFrame은 원래 BorderLayout->FlowLayout변경
		FlowLayout fl = new FlowLayout(FlowLayout.CENTER,10,10);
		this.setLayout(fl);

		for(int i = 0; i < 10; i++) {
			String title = String.format("버튼%02d",i);
			JButton jbt1 = new JButton(title);
			this.add(jbt1);
		}

		//위치             x   y
		super.setLocation(200, 200);

		//크기
		super.setSize(400, 400);

		//보여주기
		this.setVisible(true);

		//종료
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new _02_FlowLayoutTest();
	}
}
