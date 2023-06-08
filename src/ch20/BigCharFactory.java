package ch20;

import java.util.HashMap;

public class BigCharFactory {
	
	private HashMap pool = new HashMap();
	
	// 싱글톤
	private static BigCharFactory singleton = new BigCharFactory();
	
	// 생성자
	private BigCharFactory() {}
	
	public static BigCharFactory getInstance() {
		return singleton;
	}
	
	// bigchar 인스턴스 생성
	public synchronized BigChar getBigChar(char charname) {
		BigChar bc = (BigChar)pool.get(" "+charname);
		if(bc == null) {
			bc = new BigChar(charname);
			pool.put(" "+charname, bc);
		}
		return bc;
	}
	

}
