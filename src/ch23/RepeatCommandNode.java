package ch23;


public class RepeatCommandNode extends Node{

	private int num;
	private Node commandListNode;
	
	@Override
	public void parse(Context context) throws ParseException {
		// TODO Auto-generated method stub
		context.skipToken("repeat");
		num = context.currentNumber();
		context.nextToken();
		commandListNode = new CommandListNode();
		commandListNode.parse(context);
	}
	
	public String toString() {
		return "repeat " +num+"  "+commandListNode;
	}

}
