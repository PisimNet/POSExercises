package cleint;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.*;
import java.net.*;

public class DailyAdviceClient {

	public void go(){
		try{
			Socket s = new Socket("127.0.0.1",4242);
			
			InputStreamReader streamReader = new InputStreamReader(s.getInputStream());
			BufferedReader reader = new BufferedReader(streamReader);
			
			String advice = reader.readLine();
			System.out.print("Heute durfst du: "+ advice);
			
			reader.close();
		} catch(IOException ex){ex.printStackTrace();
		}
	}
}
