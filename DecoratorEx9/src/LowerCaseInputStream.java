import java.io.FilterInputStream;
import java.io.InputStream;
import java.lang.*;


class LowerCaseInputStream extends FilterInputStream {

	protected LowerCaseInputStream(InputStream arg0) {
		super(arg0);	
	}

	public int read(){
		return 0;
		
	};
	
}
