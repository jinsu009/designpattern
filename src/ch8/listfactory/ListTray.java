package ch8.listfactory;

import java.util.Iterator;

import ch8.factory.Item;
import ch8.factory.Tray;

public class ListTray extends Tray{
	public ListTray(String  caption){
		super(caption);
	}
	
	@Override
	public String makeHTML() {
		// TODO Auto-generated method stub
		StringBuffer buffer = new StringBuffer();
		buffer.append("<li>\n");
		buffer.append(caption+"\n");
		buffer.append("<ul>\n");
		
		Iterator<Item> it = tray.iterator();
		while(it.hasNext()){
			Item item = (Item)it.next();
			buffer.append(item.makeHTML());
		}
		buffer.append("</ul>\n");
		buffer.append("</li>\n");
		return buffer.toString();
	}

}
