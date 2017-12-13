package td_test;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
public class Client {

	public static void main(String[] args) {
		Socket socket = null;
		Scanner scanner = new Scanner(System.in);
		InputStream in = null;
		
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(in));
			
		
		InputStream sc = null;
				
		
	
		
		try {
			System.out.println(br.readLine());
		} catch (IOException e1) {
			e1.printStackTrace();
		}
			try {
				in=socket.getInputStream();
				socket = new Socket("70.12.109.55", 9000);
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}

}

