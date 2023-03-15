package ch2;

public class Main {
	public static void main(String[] args){
		Print p = new PrintBanner("Hello");
		p.printWeak();
		p.printStrong();
		
		Print_02 p_02 = new PrintBanner_02("Hello");
		p_02.printWeak();
		p_02.printStrong();
		
	}
}
