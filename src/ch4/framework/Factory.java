package ch4.framework;

public abstract class Factory {
	/**
	 * final을 붙임 으로서 IDCardFactory에서 override를 제한 시킨다.
	 * @param owner
	 * @return
	 */
	public final Product create(String owner) {
		Product p = createProduct(owner);
		registerProduct(p);
		return p;
}
	protected abstract Product createProduct(String owner);
	protected abstract void registerProduct(Product product);
}
