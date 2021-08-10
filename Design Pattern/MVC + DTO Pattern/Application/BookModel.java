package model;

import java.util.HashMap;

import model.dto.Book;

public class BookModel {
	//HashMap은 멤버 변수로 저장? / 각 메소드 및 static{}에서 로컬 변수로 저장?
	private static HashMap<String, Book> books = new HashMap<>();
	
	//데이터를 HashMap에 저장
	static {
		//public Book(String isbn, String title, String author, int price)
		books.put("01a", new Book("01a", "타로", "타로마스터", 100));
		books.put("02a", new Book("02a", "IT기술", "Java마스터", 200));
		books.put("03a", new Book("03a", "시", "윤동주", 300));
	}
	
	//모든 검색 처리 메소드 / HashMap 반환
	public static HashMap<String, Book> bookAll() {
		return books;
	}
	
	//isbn 값으로 책 한권 검색하는 메소드 / HashMap에서 검색해서 반환
	//호출 문법 : BookModel.book("01a");
	/* parameter로 유입되는 isbn의 데이터가 존재한다면 해당 객체 반환
	 * "                 "    데이터가 미존재한다면 null 반환
	 * 
	 * HashMap의 데이터 존재 여부는 null로 비교
	 * - null 의미는 참조하는 객체가 없다 즉 주소값이 없음을 의미
	 * - 비교시 == 비교
	 * 
	 * 사고의 선택 1 : null 또는 Book 객체 반환
	 * 
	 */
	public static Book book(String isbn) {  //1
	    Book b = books.get(isbn);
	    if(b == null) {
	    	return null;
	    }else {
	    	return b;
	    }
	}
	
	public static Book book2(String isbn) {  //2
		return books.get(isbn);
	}
	
	//사고의 선택 2 : 데이터 존재할 경우 Book 객체 반환, 데이터가 없을 경우 Exception 이라는 예외 발생
	public static Book bookOne(String isbn) throws Exception {
		Book b = books.get(isbn);
		if(b == null) {
			//개발자가 로직에 맞게 예외를 직접 발생해서 이 메소드를 호출한 곳으로 처리 위임
			//예외 발생 상황에 따른 견고한 로직 구현
			//가장 득인 사람은 이 로직을 최초로 요청한 application 사용자 즉 end user
			throw new Exception("니가 요청한 책 없다!!!");
		}else {
			return b;
		}
	}
}
