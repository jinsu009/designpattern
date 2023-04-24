package ch13;

import java.util.Iterator;

public abstract class Entry implements Element{
	public abstract String getName();
	public abstract int getSize();
	
	// add 메소드는 Directory 에서만 유효 하므로 에러로 처리
	public Entry add(Entry entry) throws FileTreatmentException{
		throw new FileTreatmentException();
	}
	
	public Iterator iterator() throws FileTreatmentException{
		throw new FileTreatmentException();
	}
	
	public String toString() {
		return getName() + " ( "+ getSize()+ " ) ";
	}
	
	// ch11
	public void printList(){
		printList("");
	}
	protected abstract void printList(String prefix);

}
