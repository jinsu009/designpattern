package ch1;

interface Aggregate {
	Iterator iterator();
}

public class BookShelf implements Aggregate{
	
	private Book[] books; // 해당 클래스 외부에서 변경되는 것을 방지 
	private int last = 0;
	public BookShelf(int maxsize){
		this.books = new Book[maxsize];
	}
	public Book getBookAt(int index) {
		return books[index];
	}
	public void appendBook(Book book){
		this.books[last] = book;
		last++;
	}
	public int getLength() {
		return last;
	}

	@Override
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}

}
