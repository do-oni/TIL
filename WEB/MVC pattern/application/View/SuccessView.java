package view;

import model.BookModel;
import model.dto.Book;

public class SuccessView {

	//null 존재 여부 확인 필요성? 없음 왜? model에서 이미 검증 했기 때문
	public static void printBook(Book book) {
		System.out.println(book);  //book.toString()으로 자동 변환
	}
	
	public static void printBookAll() {
		System.out.println(BookModel.bookAll());
	}
}
