package ch12;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display b1 = new StringDisplay("hello world");
		Display b2 = new SideBorder(b1,'#');
		Display b3 = new FullBorder(b2);
		b1.show();
		b2.show();
		b3.show();
		Display b4 = 
				new SideBorder(new FullBorder(new FullBorder(new SideBorder(new FullBorder(new StringDisplay("안녕하세요")), '*'))), '/');
		b4.show();
	}

}
