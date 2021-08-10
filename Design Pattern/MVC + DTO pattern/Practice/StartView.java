package mvc.view;

import mvc.controller.Controller;

public class StartView {

	public static void main(String[] args) {

		System.out.println("***영화 제목***");
		Controller.req(1);
		
		System.out.println("***영화 감독***");
		Controller.req(2);
		
		System.out.println("***개봉 연도***");
		Controller.req(3);
	}

}
