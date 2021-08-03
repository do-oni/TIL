package view;

import org.junit.Test;

import controller.BookController;

public class StartView {
	
	//책 한권 정보 요청하는 화면이라 가정
//	@Test
	public void getBook() {
//		BookController.bookOne("a");  // 없는 데이터 요청시
		BookController.bookOne("01a");  // 존재하는 데이터 요청시
	}
	
	//모든 책 정보 요청하는 화면이라 가정
	// 완성
	@Test
	public void getBookAll() {
		BookController.bookAll();
	}
}
