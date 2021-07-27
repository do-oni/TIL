package step06.mvc.view;

import java.util.ArrayList;

import step06.mvc.model.dto.DeptDTO;
import step06.mvc.model.dto.Friend;

public class EndView {

	//String[]을 받아서 존재하는 수 만큼 반복 + 결과값을 출력
	public static void printNames(String[] ns) {
		for(String name : ns) {
			System.out.println(name);
			
		}
		ns[0] = "A";
	}
	
	
	//DeptDTO 객체를 받아서 부서 정보 출력
	/* 메소드명 : printDeptDTO
	 * 
	 */
	public static void printDeptDTO(DeptDTO dept) {
		System.out.println(dept.toString());
	}

	public static void printFriends(Friend[] datas) {
		for(Friend f : datas) {
			System.out.println("이름 - " + f.getName() + ", 성별 - " + f.getGender());
	}

}


	public static void printMsg(String msg) {
		System.out.println(msg);
	}
}
