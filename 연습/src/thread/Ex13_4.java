package thread;

public class Ex13_4 {
	
	static long startTime = 0;
	
	public static void main(String[] args) {
		
		startTime = System.currentTimeMillis();
		
		for(int i = 0; i < 300; i++) {
			System.out.printf("%s",new String("-"));
		}
		
		System.out.println("소요시간1:"+(System.currentTimeMillis()-startTime));
		
		ThreadEx13_4_1 th1 = new ThreadEx13_4_1();
		th1.start();
	}
}

class ThreadEx13_4_1 extends Thread{
	@Override
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.printf("%s",new String("|"));
		}
		
		System.out.println("소요시간2:"+(System.currentTimeMillis()-Ex13_4.startTime));
	}
}
