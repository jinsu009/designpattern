package ch8.listfactory;

import java.util.Iterator;

import ch8.factory.Item;
import ch8.factory.Page;

public class ListPage extends Page{
	public ListPage(String title, String author){
		super(title, author);
	} 
	
	@Override
	public String makeHTML() {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append("<html><head><title>"+title+"</title></head>\n");
		sb.append("<body>\n");
		sb.append("<h1>"+title+"</h>\n");
		sb.append("<ul>\n");
		Iterator<Item> it = content.iterator();
		while (it.hasNext()){
			Item item = (Item)it.next();
			sb.append(item.makeHTML());
		}
		sb.append("</ul>\n");
		sb.append("<hr><address>"+author+"</address>");
		sb.append("</body></html>\n");
		
		return sb.toString();
	}

}
