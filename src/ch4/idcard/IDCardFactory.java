package ch4.idcard;

import ch4.framework.*;
import java.util.*;

public class IDCardFactory extends Factory{

	private List owners = new ArrayList();
	
	@Override
	protected Product createProduct(String owner) {
		// TODO Auto-generated method stub
		return new IDCard(owner);
	}

	@Override
	protected void registerProduct(Product product) {
		// TODO Auto-generated method stub
		owners.add(((IDCard)product).getOwner());
	}
	
	public List getOwners(){
		return owners;
	}

}
