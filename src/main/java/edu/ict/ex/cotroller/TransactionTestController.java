package edu.ict.ex.cotroller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.ict.ex.page.Criteria;
import edu.ict.ex.page.PageVO;
import edu.ict.ex.service.BoardService;
import edu.ict.ex.service.DeptSevice;
import edu.ict.ex.service.TxService;
import edu.ict.ex.vo.BoardVO;
import lombok.extern.slf4j.Slf4j;
import oracle.jdbc.proxy.annotation.Post;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@Controller
@RequestMapping("/tx")
public class TransactionTestController {

	@Autowired
	private TxService txService;
		
	@GetMapping("/{num}")
	public String test(@PathVariable int num) throws SQLException{
		
		System.out.println(" 테스트 번호:" + num);
		
		// http://localhost:8282/tx/1
		if(num == 1) {
			txService.txTest1();
		}
		
		if(num == 2) {
			txService.txTest2();
		}
		
		if(num == 3) {
			txService.txTest3();
		}
		
		if(num == 4) {
			txService.txTest4();
		}
		
		return "redirect:/boards/rest";
	}	
}
