package ch13;

import ch13.Directory;
import ch13.File;

public abstract class Visitor {
	public abstract void visit(File file);
	public abstract void visit(Directory dir);
}
