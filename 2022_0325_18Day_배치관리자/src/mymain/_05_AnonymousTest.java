package mymain;

class TestA{
	int a;
	
	public void sub() {
		System.out.println("--TestA : sub()--");
	}
}

class TestB extends TestA{
	int b;
}

public class _05_AnonymousTest {
	public static void main(String[] args) {
		TestA a = new TestB();
		a.sub();
		
		TestA aa = new TestA() {
			
			@Override
			public void sub() {
				// TODO Auto-generated method stub
				super.sub();
			}
			
		};
	}
}
