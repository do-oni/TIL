package step06.mvc.controller;

import step06.mvc.model.Model;
import step06.mvc.model.dto.DeptDTO;
import step06.mvc.model.dto.Friend;
import step06.mvc.view.EndView;

public class Controller {
    //조건문 1 : 동기들 이름 요청
	//조건문 2 : 동기들 이름 + 성별 요청
	
	public static void req(int no) {
		//이름들만 요청
		if(no == 1) {
			//public static String[] getNames()
			String[] ns = Model.getNames();
			ns[0] = "E";
			EndView.printNames(ns);
			System.out.println("--------------");
			System.out.println(ns[0]);
			
			
			
		}else if(no == 2) { //이름과 성별 요청
			//ctrl + shift + o 입력시 import 문장 자동 생성
			EndView.printFriends(Model.getFriends());
			
			
		}else if(no == 3) { //부서 정보 검색 요청으로 간주

//			DeptDTO dept = Model.getDeptOne();
//			EndView.printDeptDTO(dept);
			
			//dept 변수는 선언 없이 한 문장으로 처리 하는 현 코드가 더 권장
			EndView.printDeptDTO(Model.getDeptOne());
		}
		else {  //1 또는 2 아니다.. 경우의 수 처리
			EndView.printMsg("요청 자체가 잘못되었습니다");
		}
	}
}

/* StartView.java에서 요청 1(String[]) or 2(Friend 객체들) 요청 -> Controller : 1번? 2번? 요청에 따라 응답 데이터 다름
 * -> Model 작업 수행 -> 결과값을 Controller가 받아서 
 * -> EndView에게 출력(String[] or Friend 객체 출력 구분)
 * 
 */
