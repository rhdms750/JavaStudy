package myutil;

public interface Channel {
	//상수
	int MIN = 0;
	int MAX = 999;
	
	//추상메소드
	void channelUp();
	void channelDown();
	void setChannel();
}
