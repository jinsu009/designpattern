package ch23;

import java.util.StringTokenizer;

public class Context {

	private StringTokenizer tokenizer;
	private String currentToken;
	
	public Context(String txt) {
		tokenizer = new StringTokenizer(txt);
		nextToken();
	}
	public String nextToken() {
		if(tokenizer.hasMoreTokens()) {
			currentToken = tokenizer.nextToken();
		}else {
			currentToken = null;
		}
		return currentToken;
	}
	public String currentToken() {
		return currentToken;
	}
	public void skipToken(String token) throws ParseException{
		if(!token.equals(currentToken)) {
			throw new ParseException("Warning : "+token+" is expected, but "+currentToken+" is found");
		}
		nextToken();
	}
	public int currentNumber() throws ParseException{
		int num = 0;
		try {
			num = Integer.parseInt(currentToken); 
		}catch(NumberFormatException e) {
			throw new ParseException("Warning : "+e);
		}
		return num;
	}
}
