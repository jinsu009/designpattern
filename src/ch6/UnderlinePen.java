package ch6;

import ch6.framework.*;

public class UnderlinePen implements Product{
	private char ulchar;
	public UnderlinePen(char ulchar){
		this.ulchar = ulchar;
	}
	
	@Override
	public void use(String s) {
		// TODO Auto-generated method stub
		int length = s.getBytes().length;
		System.out.println("\""+s+"\"");
		System.out.print("");
		for(int i=0; i<length; i++){
			System.out.print(ulchar);
		}
		System.out.println("");
	}

	@Override
	public Product createClone() {
		// TODO Auto-generated method stub
		Product p = null;
		try{
			p = (Product)clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return p;
	}

}
