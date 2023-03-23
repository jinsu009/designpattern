package ch7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args){
		
		/*if(args.length != 1 ){
			usage();
			System.exit(0);
		}
		
		if(args[0].equals("plain")){*/
			TextBuilder textbuilder = new TextBuilder();
			Director director1 = new Director(textbuilder);
			director1.construct();
			String result = textbuilder.getResult();
			System.out.println(result);
			
		/*}else if(args[0].equals("html")){*/
			File htmlFile = new File("Greeting.html");
			BufferedWriter writer;
			HTMLBuilder htmlbuilder;
			
			try {
				writer = new BufferedWriter(new FileWriter(htmlFile));
				htmlbuilder = new HTMLBuilder(writer);
				Director director2 = new Director(htmlbuilder);
				director2.construct();
				String filename = htmlbuilder.getResult();
				System.out.println(filename+" 가 작성되었습니다.");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			/*}else {
			usage();
			System.exit(0); // java 프로그램 강제 종료
		}*/
	}
	public static void usage(){
		System.out.println("Usage: java Main plain 일반텍스트 문서 작성");
		System.out.println("Usage: java Main html  HTML 문서 작성");
	}
}
