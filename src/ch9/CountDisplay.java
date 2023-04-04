package ch9;

public class CountDisplay extends Display{

	public CountDisplay(DisplayImpl impl) {
		super(impl);
		// TODO Auto-generated constructor stub
	}
	public void multiDisplay(int items){
		open();
		for(int i=0; i<items; i++){
			print();
		}
		close();
	}

}
