package ch12;

public class FullBorder extends Border{
	
	

	protected FullBorder(Display display) {
		super(display);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getColumn() {
		// TODO Auto-generated method stub
		return 1+ display.getColumn() +1;
	}

	@Override
	public int getRows() {
		// TODO Auto-generated method stub
		return 1+display.getRows()+1;
	}

	@Override
	public String getRowText(int row) {
		// TODO Auto-generated method stub
		if(row==0) {
			return "+"+makeLine('-', display.getColumn())+"+";
		}else if(row == display.getRows() +1) {
			return "+"+makeLine('-', display.getColumn())+"+";
		}else {
			return "|"+display.getRowText(row-1)+"|";
		}
	}
	
	private String makeLine(char ch, int cnt) {
		StringBuffer buf = new StringBuffer();
		for(int i=0; i<cnt; i++) {
			buf.append(ch);
		}
		return buf.toString();
	}


	
}
