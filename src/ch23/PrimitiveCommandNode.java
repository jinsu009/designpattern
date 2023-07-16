package ch23;



public class PrimitiveCommandNode extends Node{

	private String name;
		
	@Override
	public void parse(Context context) throws ParseException {
		// TODO Auto-generated method stub
		name = context.currentToken();
		if(!name.equals("go") && !name.equals("rigth") && !name.equals("left")) {
			throw new ParseException(name+" is undefined");
		}
	}

	public String toString() {
		return name;
	}
}
