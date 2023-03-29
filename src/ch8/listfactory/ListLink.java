package ch8.listfactory;

import ch8.factory.Link;

public class ListLink extends Link{
	public ListLink(String caption, String url){
		super(caption, url);
	}
	
	@Override
	public String makeHTML() {
		// TODO Auto-generated method stub
		return " <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
	}

}
