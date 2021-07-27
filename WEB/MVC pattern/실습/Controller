package mvc.controller;

import mvc.model.Model;
import mvc.model.dto.Director;
import mvc.model.dto.Name;
import mvc.view.EndView;

public class Controller {

	public static void req(int num) {

		if(num == 1) {
			EndView.printName(Model.getNames());
		}else if(num == 2) {
			EndView.printDirector(Model.getDirector());
		}else if(num == 3) {
			EndView.printYear(Model.getYear());
		}else {
			EndView.printMsg("다시 요청해주세요");
		}
	}

}
