package thread;

import javax.swing.JOptionPane;

public class Ex13_5 {
	public static void main(String[] args) {
		Runnable r = new ThreadEx5_1();
		Thread th1 = new Thread(r);
		
		th1.start();
		
		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���.");
		System.out.println("�Է��Ͻ� ���� : \""+input+"\"�Դϴ�.");
	}
}

class ThreadEx5_1 implements Runnable{

	@Override
	public void run() {
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				
			}
		}
	}
	
}
