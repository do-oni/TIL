package step06.mvc.view;

import step06.mvc.controller.Controller;

public class StartView {

	public static void main(String[] args) {
		// public static void req(int no) {
		System.out.println("---동기들 이름---");
		Controller.req(1);
		
		System.out.println("---친구들 이름---");
		Controller.req(2);
			
		System.out.println("---한 부서 정보---");
		Controller.req(3);
	}

}
