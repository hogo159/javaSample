package socket1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;

public class Server1 {

	public static void main(String[] args) {
		ServerSocket server = null;
		Socket socket = null;
	
	
		try {
		server = new ServerSocket(9000);
			System.out.println(" Server :접속대기중 ...");
		socket = server.accept();
			System.out.println(socket.getInetAddress()+" 접속함 ");
			
			OutputStream out = socket.getOutputStream();
			BufferedWriter bw =
					new BufferedWriter(new OutputStreamWriter(out));
					
					
					
			
			bw.write("전속을  환영합니다....");
			bw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			
			try {
				
			if(socket != null) socket.close();
			if(server != null) server.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
		

		}

}
}
