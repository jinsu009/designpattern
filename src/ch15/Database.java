package ch15;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Database {

	private Database() {
		
	} // new에서 인스턴스를 생성시키지 않기 위한 private 선언
	
	public static Properties getProperties(String dbName) {
		String fileName = dbName +".txt";
		Properties prop = new Properties();
		try {
			
			prop.load(new FileInputStream(fileName));
			
		}catch(IOException e) {
			System.out.println(fileName+" Not Found");
		}
		return prop;
	}
	
}
