package edu.ict.ex.cotroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.ict.ex.page.Criteria;
import edu.ict.ex.page.PageVO;
import edu.ict.ex.service.DeptSevice;
import edu.ict.ex.service.EmpService;
import edu.ict.ex.vo.EmpVO;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ShopController {
		
	@GetMapping("/")
	public String shop(Model model) {
		
		System.out.println("shop()..");
		
		//model.addAttribute("empList",empService.getList());
		
		return "index";
	}
	

}
