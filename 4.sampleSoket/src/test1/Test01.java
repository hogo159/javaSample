package test1;

import java.net.InetAddress;
import java.net.UnknownHostException;



public class Test01 {
public static void main(String[] args) {
	
	try {
		InetAddress address = InetAddress.getLocalHost();
		System.out.println(address.getHostName()); //�� ������  ���̵�
		System.out.println(address.getHostAddress());
		
		System.out.println("========================");
		InetAddress address1 = InetAddress.getLocalHost();
		address1 = InetAddress.getByName("www.naver.com");//���̹� �����γ��� ã�ƺ���
				System.out.println("naver : " + address1.getHostAddress());
	} catch (UnknownHostException e) {
		System.out.println("�ּҸ� Ȯ�����ּ���");
	
	}
	System.out.println( "���� ����");
	
	
}
}
