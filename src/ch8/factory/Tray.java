package ch8.factory;

import java.util.ArrayList;

public abstract class Tray<E> extends Item{
	protected ArrayList<Item> tray = new ArrayList();
	
	public Tray(String caption) {
		super(caption);
		// TODO Auto-generated constructor stub
	}
	public void add(Item item){
		tray.add(item);
	}

}
