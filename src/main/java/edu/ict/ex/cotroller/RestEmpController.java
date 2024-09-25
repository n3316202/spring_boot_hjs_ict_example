package edu.ict.ex.cotroller;

import java.util.List;

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
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/emps")
public class RestEmpController {

	@Autowired
	private EmpService empService;

	
	@GetMapping("/list")
	public  List<EmpVO>  list() {
		
		System.out.println("list()..");
		
		return empService.getList();
	}

}
