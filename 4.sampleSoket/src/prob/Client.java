package prob;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String args[]){
		 try {
			Socket socket = new Socket("127.0.0.1",9000);
			System.out.println("접속");
			BufferedReader keyboard 
				= new BufferedReader(new InputStreamReader(System.in));
		
			InputStream in = socket.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			OutputStream out = socket.getOutputStream();
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
			
			String message = null;
			while((message = keyboard.readLine())!= null){
				if(message.equals("quit")) break;
				
				
				pw.println( message);
			
				pw.flush();
				String echoMessage = br.readLine();
				System.out.println(echoMessage);
			}
			br.close();
			pw.close();
			socket.close();
			} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}}}
class EchoServer {
	public static void main(String args[]) {
		ServerSocket server = null;
		try {
			server = new ServerSocket(9000);
			System.out.println("대기중");

			while (true) {
				Socket socket = server.accept();
				new NewThread(socket).start();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (server != null)
					server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}}}}

class NewThread extends Thread {
	Socket socket;
	public NewThread() {
	}

	public NewThread(Socket socket) {
		this.socket = socket;
	}
@Override
	public void run() {
		InetAddress address = socket.getInetAddress();
		System.out.println(address.getHostAddress() + "접속완료");
		try {
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));

			String message = null;
			while ((message = br.readLine()) != null) {
				//System.out.println("클라이언트 --> 서버로 : " + message);
				pw.println(message);
				pw.flush();
			}
			br.close();
			pw.close();
			socket.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			}}}
