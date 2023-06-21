package ch21;

public class Main {

	public static void main(String[] args) {
		Printable print = new PrinterProxy("apple");
		System.out.println(" 현재 이름 "+print.getPrinterName());
		print.setPrinterName("banana");
		System.out.println(" 현재 이름 "+print.getPrinterName());
		print.print("hello world");
	}
	
}
