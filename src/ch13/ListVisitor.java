package ch13;

import java.util.Iterator;

import ch13.Directory;
import ch13.File;

public class ListVisitor extends Visitor{
	
	private String currentDir = "";
	

	@Override
	public void visit(File file) {
		// TODO Auto-generated method stub
		System.out.println("[a] "+currentDir + "/"+file);
	}

	@Override
	public void visit(Directory dir) {				
		// TODO Auto-generated method stub
		System.out.println("[b] "+currentDir+ "/"+dir);
		
		String saveDir = currentDir;
		currentDir = currentDir+"/"+dir.getName();
		Iterator it = dir.iterator();
		while(it.hasNext()) {
			Entry entry = (Entry)it.next();
			entry.accept(this);
		}
		currentDir = saveDir;
		
	}

}
