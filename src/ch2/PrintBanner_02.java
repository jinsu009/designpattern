package ch2;

public class PrintBanner_02 extends Print_02{
	private Banner banner;
	public PrintBanner_02(String string){
		this.banner = new Banner(string);
	}
	@Override
	public void printWeak() {
		// TODO Auto-generated method stub
		banner.showWithParen();
	}
	@Override
	public void printStrong() {
		// TODO Auto-generated method stub
		banner.showWithAster();
	}
}
