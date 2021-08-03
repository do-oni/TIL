package controller;

import java.util.HashMap;

import model.BookModel;
import model.dto.Book;
import view.FailView;
import view.SuccessView;

public class BookController {
	//isbn을 화면으로 end user가 입력된 데이터값 받아서 Model에 검색 요청 후 결과에 따라 성공? 실패? view 지정
	/* Exception 반환시 FailView에게 실패 메세지 출력 위임
	 * Book 객체가 반환시 SuccessView에게 책 정보 정상 출력 위임
	 */
	
	//public static Book bookOne(String isbn) throws Exception {
	public static void bookOne(String isbn) {
		try {
			Book book = BookModel.bookOne(isbn);
			// SuccessView에게 책 정보 정상 출력 위임
			SuccessView.printBook(book);
		} catch (Exception e) {
			e.printStackTrace();
			// FailView에게 실패 메세지 출력 위임
			FailView.messaageView(e.getMessage());  //new Exception("니가 요청한 책 없다!!!") 메세지값
		}
	}
	
	public static void bookAll() {
		SuccessView.printBookAll();
//		HashMap<String, Book> books = BookModel.bookAll();
		
//		Iterator<String> keys = books.keySet().iterator();
		
//		String key = null;
//		while(keys.hasNext()) {
//			String key = keys.next();
//			System.out.println(books.get(key)));
		}
	}
