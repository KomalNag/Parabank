package Resources;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileReader {
	Properties pro;
	public PropertyFileReader() {
		try {
			FileInputStream file = new FileInputStream("C:\\Users\\Shree\\eclipse-workspace\\MavenDecParabank\\Resources\\Configure.properties");
			pro =new Properties();
			pro.load(file);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getUserName() {
		String TUS =pro.getProperty("UserName");
		return TUS;
		
	}
	public String getpassword() {
		String TPWD =pro.getProperty("Password");
	return TPWD;
	
	}
	public String getURL() {
		String TURL =pro.getProperty("URL");
		return TURL;
	}
	public String getChromePath() {
		String TPATH =pro.getProperty("ChromePath");
		return TPATH;
	}

	}
 

