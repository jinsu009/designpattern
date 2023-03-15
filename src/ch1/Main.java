package ch1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> bookArr = new ArrayList();	
		bookArr.add("모던 자바스크립트 DeepDive");
		bookArr.add("소플의 리액트");
		bookArr.add("자바스크립트 객체 지향");
		bookArr.add("실전리액트 프로그래밍");
		
		int leng = bookArr.size();
		
		BookShelf bookShelf = new BookShelf(leng);
		
		for(String i : bookArr) {
			bookShelf.appendBook(new Book(i));	
		}
		
		Iterator it = bookShelf.iterator();
		while(it.hasNext()){
			Book book = (Book)it.next();
			System.out.println(book.getName());
		}

	}

}
