package ch12;

public class SideBorder extends Border{

	private char borderChar; // 장식이 되는 문자
	
	public SideBorder(Display display, char ch) {
		super(display); // 생성자에서 Display라는 장식문자를 지정
		this.borderChar = ch;
	}
	
	@Override
	public int getColumn() {
		// TODO 문자순는 내용물의 양쪽에 장식 문자수를 더한 것
		return 1 + display.getColumn() + 1;
	}

	@Override
	public int getRows() {
		// TODO 행 수는 내용물의 행수와 동일
		return display.getRows();
	}

	@Override
	public String getRowText(int row) {
		// TODO 지정된 행의 내용은 내용물의 지정된 행의 양쪽에 장식문자를 붙인 것
		return borderChar + display.getRowText(row) + borderChar;
	}

}
