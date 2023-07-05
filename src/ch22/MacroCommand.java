package ch22;

import java.util.Iterator;
import java.util.Stack;

public class MacroCommand implements Command{

	// 명령의 집합
	private Stack commands = new Stack();
	
	@Override
	public void execute() {
		Iterator it = commands.iterator();
		while(it.hasNext()) {
			((Command)it.next()).execute();
		}
	}
	
	public void append(Command cmd) {
		if(cmd!=this) {
			commands.push(cmd);
		}
	}
	// 마지막 명령 삭제
	public void undo() {
		if(!commands.empty()) {
			commands.pop();
		}
	}
	
	public void clear() {
		commands.clear();
	}
}
