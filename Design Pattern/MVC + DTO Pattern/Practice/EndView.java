package mvc.view;

import mvc.model.Model;
import mvc.model.dto.Director;
import mvc.model.dto.Name;

public class EndView {

	public static void printName(Name[] name2) {
		for(Name name : name2) {
			System.out.println(name);
		}
	}

	@SuppressWarnings("unused")
	public static void printDirector(Director[] dr2) {
		for(Director dr : dr2) {
			System.out.println("제목 : " + Name.getNames() + " 감독 : " + Model.getDirector());
		}
	}
	
	public static void printYear(int[] y) {
		for(int year : y) {
			System.out.println(year);
		}
		
	}
    
	public static void printMsg(String msg) {
		System.out.println(msg);
	}
}
