package ch7;

import java.io.*;

public class HTMLBuilder extends Builder{
	private String filename;
	File htmlFile = new File("Greeting.html");
	//private PrintWriter writer;
	
	BufferedWriter writer;
	
	public HTMLBuilder(BufferedWriter writer) {
		try {
			writer = new BufferedWriter(new FileWriter(htmlFile));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void makeTitle(String title) {
		// TODO Auto-generated method stub
		filename = title + ".html";
		try{
			writer = new BufferedWriter(new FileWriter(filename));
		}catch(IOException e){
			e.printStackTrace();
		}
		try {
			writer.write("<html><head><title>"+title+"</title></head></html>");
			writer.write("<h1>"+title+"</h1>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

	@Override
	public void makeString(String str) {
		// TODO Auto-generated method stub
		try {
			writer.write("<p>"+str+"</p>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void makeItems(String[] items) {
		// TODO Auto-generated method stub
		try {
			writer.append("<ul>");
			for(int i=0; i<items.length; i++){
				writer.write("<li>"+items[i]+"</li>");
			}
			writer.write("</ul>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		try {
			writer.write("</body></html>");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public String getResult(){		
		
		return filename;
	}

}
