package ch21;

public class PrinterProxy implements Printable{
	private String name;
	private Printer real;
	public PrinterProxy() {}
	
	public PrinterProxy(String name) {
		this.name = name;
	}
	
	@Override
	public synchronized void setPrinterName(String name) {
		// TODO Auto-generated method stub
		if(real!=null) {
			real.setPrinterName(name);
		}
		this.name = name;
	}

	@Override
	public String getPrinterName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void print(String str) {
		// TODO Auto-generated method stub
		realize();
		real.print(str);
	}
	
	private synchronized void realize() {
		if(real == null) {
			real = new Printer(name);
		}
	}

}
