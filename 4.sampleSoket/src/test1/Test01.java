package test1;

import java.net.InetAddress;
import java.net.UnknownHostException;



public class Test01 {
public static void main(String[] args) {
	
	try {
		InetAddress address = InetAddress.getLocalHost();
		System.out.println(address.getHostName()); //내 아이피  아이디
		System.out.println(address.getHostAddress());
		
		System.out.println("========================");
		InetAddress address1 = InetAddress.getLocalHost();
		address1 = InetAddress.getByName("www.naver.com");//네이버 도매인네임 찾아보기
				System.out.println("naver : " + address1.getHostAddress());
	} catch (UnknownHostException e) {
		System.out.println("주소를 확인해주세요");
	
	}
	System.out.println( "메인 엔드");
	
	
}
}
