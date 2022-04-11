package inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class test2 {
	public static void main(String[] args) {
		try {
			InetAddress ip = InetAddress.getLocalHost();
			String ipName = ip.getHostName();
			String ipAddress = ip.
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
