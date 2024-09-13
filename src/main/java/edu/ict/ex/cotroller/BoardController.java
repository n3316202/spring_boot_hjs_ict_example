package edu.ict.ex.cotroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.ict.ex.service.BoardService;
import edu.ict.ex.service.DeptSevice;
import edu.ict.ex.vo.BoardVO;
import lombok.extern.slf4j.Slf4j;
import oracle.jdbc.proxy.annotation.Post;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@Controller
@RequestMapping("/board")
public class BoardController {

	@Autowired
	private BoardService boardSevice;
	
	
	@GetMapping("/list")
	public String list(Model model) {
		log.info("list().. ");
	
		
		model.addAttribute("boards",boardSevice.getList());
		
		return "board/list";
	}
	
	//http://localhost:8282/board/content_view?bid=29
	@GetMapping("/content_view")
	public String content_view(BoardVO boardVO,Model model) {
		log.info("content_view().. ");
	
		
		model.addAttribute("content_view",boardSevice.get(boardVO.getBid()));
		
		return "board/content_view";
	}
	
	//http://localhost:8282/board/delete?bid=32
	@GetMapping("/delete")
	public String delete(BoardVO boardVO) {
		log.info("delete().. ");
	
		int bid = boardVO.getBid();
		boardSevice.remove(bid);	
				
		return "redirect:/board/list";
	}
	
	//http://localhost:8282/board/write_view
	@GetMapping("/write_view")
	public String write_view() {
		log.info("write_view().. ");

		return "/board/write_view";
	}
	
	//http://localhost:8282/board/write
	@PostMapping("/write")
	public String write(BoardVO boardVO) {
		log.info("write().. ");
		
		boardSevice.writeBoard(boardVO);
		
		return "redirect:/board/list";
	}
	
	//http://localhost:8282/board/modify
	@PostMapping("/modify")
	public String modify(BoardVO boardVO) {
		log.info("modify().. ");
		
		boardSevice.modifyBoard(boardVO);
		
		return "redirect:/board/list";
	}
}
