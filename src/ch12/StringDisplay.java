package ch12;

public class StringDisplay extends Display{
	
	private String str;
	public StringDisplay(String str) {
		this.str = str;
	}
	
	@Override
	public int getColumn() {
		// TODO Auto-generated method stub
		return str.getBytes().length;
	}

	@Override
	public int getRows() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public String getRowText(int row) {
		// TODO Auto-generated method stub
		if(row==0) return str;
		else return null;
	}

}
