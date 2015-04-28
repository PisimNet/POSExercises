package chap15;

import java.net.*;
import java.io.*;

public class DailyAdviceServer {
	
	String[] adviceList = {"very good!","cool!","oh jaja :)"};
	
	public void go(){
		try{
			ServerSocket serverSock = new ServerSocket(5000);
			while(true){
				Socket sock = serverSock.accept();
				
				PrintWriter writer = new PrintWriter(sock.getOutputStream());
				String advice = getAdvice();
				writer.println(advice);
				writer.close();
				System.out.println(advice);
			}
		} catch(IOException ex){
			ex.printStackTrace();
		}
	}

	private String getAdvice() {
		int random = (int) (Math.random()*adviceList.length);
		return adviceList[random];
	}
	public static void main(String[] args) {
		DailyAdviceServer server = new DailyAdviceServer();
		server.go();
	}
}
