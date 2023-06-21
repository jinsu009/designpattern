package ch21;

public class Printer implements Printable{
	private String name;
	public Printer() {
		heavyJob("Printer의 인스턴스를 생성 중");
	}
	
	public Printer(String name) {
		this.name = name;
		heavyJob("printer 인스턴스 "+name+" 을 생성 중");
	}

	@Override
	public void setPrinterName(String name) {
		// TODO Auto-generated method stub
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
		System.out.println(" === "+name+" === ");
		System.out.println(str);
	}

	private void heavyJob(String msg) {
		System.out.println(msg);
		for(int i=0; i<5; i++) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {}
			System.out.println(".");
		}
		System.out.println("완료");
	}
}
