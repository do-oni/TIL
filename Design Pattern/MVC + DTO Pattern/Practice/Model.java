package mvc.model;

import mvc.model.dto.Director;
import mvc.model.dto.Name;

public class Model {
	
	//영화 이름, 감독
	//연도
	//주요 등장인물
	
	public static Name[] getNames() {
		Name[] names = {new Name("분노의 질주:더 얼티메이트"),
				        new Name("랑종"),
				        new Name("크루엘라")};
		return names;
	}
	
	public static Director[] getDirector() {
		Director[] dr = {new Director("저스틴 린"),
				         new Director("반종 피산다나쿤"),
				         new Director("크레이그 질레스피")};
		return dr;
		}
	

    public static int[] getYear() {
    	int[] year = {2021,2021,2021};
    	return year;

}
}
