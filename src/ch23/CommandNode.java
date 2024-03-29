package ch23;


public class CommandNode extends Node{

	private Node node;
	@Override
	public void parse(Context context) throws ParseException {
		// TODO Auto-generated method stub
		if(context.currentToken().equals("repeat")) {
			node = new RepeatCommandNode();
			node.parse(context);
		}else {
			node = new PrimitiveCommandNode();
			node.parse(context);
		}
	}

public String toString() {
	return node.toString();
}
}
