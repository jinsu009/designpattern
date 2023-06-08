package ch20;

public class Main {
	
	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("Usage : java main digits");
			System.out.println("Example : java Main 121212");
			System.exit(0);
		}
		BigString bs = new BigString(args[0]);
		bs.print();
	}

}
