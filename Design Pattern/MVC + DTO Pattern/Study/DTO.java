/* DTO pattern / VO pattern
 * - Data Transfer Object / Value Object
 * - 권장하는 클래스명
 *   Dept.java / DeptDTO.java / DeptVO.java / DeptBean.java
 *   java bean 용어
 *        - java 언어 자체를 개발한 sun microsystems에서 dto 구조의 클래스를 처음에 명시한 이름
 * - 개발 구조
 *  private 변수 / public 생성자 / public get,set 메소드 / toString() 재정의
 * 
 * 
 * - 변수
 *  - 멤버 변수들은 데이터 수만큼 선언
 *  - private 으로 외부에서 직접적인 호출(접근) 불가
 *  
 *  - 메소드
 *   - 외부에서 변수들 값을 수정(setXxx) 또는 반환(getXxx)을 위한 오픈된 public 메소드
 *   
 *   - 필요성
 *       가령 부서 번호는 절대 음수는 불가인 경우
 *       유효성 검증 로직 필수
 *       
 * - 생성자
 *  기본생성자 / 멤버 변수들값 초기화 하는 생성자
 *  
 * - toString() 재정의 권장
 *  java.lang.Object 클래스에서 상속받고 참조 변수값을 출력시에 "이름@위치값"이 출력
 *  이 반환은 중요하지 않아서 보편적으로 멤버 변수들값 취합해서 한번에 반환하는 로직으로 재정의 권장
 *  
 *  
 * 부서 정보 : 부서번호/부서명/부서위치
 */

package step06.mvc.model.dto;

public class DeptDTO {
	private int deptno;  //양수여야만 함
	private String dname;
	private String loc;
	
	public DeptDTO() { //() argument가 blank - 기본 생성자
		super();
	}

	public DeptDTO(int deptno, String dname, String loc) { //생성자
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		if(deptno > 0) { 
			this.deptno = deptno;
		}else {
			System.out.println("부서번호 오류");
		}
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "DeptDTO [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}
	
}
