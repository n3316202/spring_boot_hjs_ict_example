package edu.ict.ex.cotroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import edu.ict.ex.service.EmpService;


/* 상대 경로와 절대경로 */

@Controller
public class PathController {
	
	
	@GetMapping("/path")
	public String shop(Model model) {		
		
		//http://localhost:8282/path/images/404/404.png
		return "path/path";
	}
	
	//http://localhost:8282/images/404/404.png
	@GetMapping("/path/img")
	public String pathImg(Model model) {		
		return "path/path";
	}	

}
