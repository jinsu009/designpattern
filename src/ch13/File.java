package ch13;

import ch13.Visitor;

public class File extends Entry{
	private String name;
	private int size;
	public File(String name, int size){
		this.name = name;
		this.size = size;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	protected void printList(String prefix) {
		// TODO Auto-generated method stub
		System.out.println(prefix+"/"+this);
		// prefix + "/" + this.toStirng();
		// prefix + "/" + toString()
	}
	
	//ch13 
	public void accept(Visitor v) {
		v.visit(this);
	}

}
