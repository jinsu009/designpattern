package ch15;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Properties;

public class PageMaker {
	
	private PageMaker() {
		
	} //인스턴스는 생성하지 않으므로 private선언
	
	public static void makeWelcomePage(String mailaddr, String filename) {
		try {
			Properties mailprop = Database.getProperties("maildata");
			String username = mailprop.getProperty(mailaddr);
			HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
			System.err.println(username);
			writer.title("welcome to "+username);
			writer.paragraph(username+" 의 페이지에 온걸 환영해");
			writer.paragraph("메일을 기다리고 있어");
			writer.mailto(mailaddr, username);
			writer.close();
			System.out.println(filename+" is created for "+mailaddr+" username : "+username);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
