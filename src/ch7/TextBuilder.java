package ch7;

import java.io.*;

public class TextBuilder extends Builder{
	
	private StringBuffer content = new StringBuffer();
	private String fileName = "Greeting.txt";	

	@Override
	public void makeTitle(String title) {
		// TODO Auto-generated method stub
		content.append("-----");
		content.append("\" " + title + " \"");
		content.append("\n");
	}

	@Override
	public void makeString(String str) {
		// TODO Auto-generated method stub
		content.append(" ★ "+ str);
		content.append("\n");
	}

	@Override
	public void makeItems(String[] items) {
		// TODO Auto-generated method stub
		for(int i=0; i<items.length; i++){
			content.append(" ... " + items[i] +" \n");
		}
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		content.append(" === \n");
	}
	
	public String getResult(){
		// StringBuffer 를 String으로 변환
			
		try {
			BufferedWriter buffer 
			= new BufferedWriter(new FileWriter(fileName,true)); // 필드 문서 구축
			buffer.write(content.toString());
			buffer.flush();
			buffer.close();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		//return buffer.toString();
		return null;
	}

}
