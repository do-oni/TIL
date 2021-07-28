package step06.mvc.model;

import step06.mvc.model.dto.DeptDTO;
import step06.mvc.model.dto.Friend;

public class Model {
	
	//내 동료들 배열에 담아서 변환
	public static String[] getNames() {
		String[] names = {"A", "B", "C"};
		return names;
	}
	
	//내 동료들 이름 + 성별 배열에 담아서 반환(Friend[])
	// test 데이터는 3명이상의 데이터
	public static Friend[] getFriends() { 
		Friend[] fs = {new Friend("A","여"),
				       new Friend("B","여"),
				       new Friend("C","여")};
		return fs;
	}
	
	//부서정보 하나를 반환 (부서번호/부서명/부서위치)
	// 예정 : 차후엔 DB에서 직접 select 예정
	public static DeptDTO getDeptOne(){
		//public DeptDTO(int deptno, String dname, String loc)
		return new DeptDTO(10, "교육사업부", "남부터미널");
	}
	
	
	//모든 부서 반환
}
