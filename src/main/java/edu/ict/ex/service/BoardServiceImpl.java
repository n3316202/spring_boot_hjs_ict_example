package edu.ict.ex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ict.ex.mapper.BoardMapper;
import edu.ict.ex.vo.BoardVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardMapper boardMapper;
	
	
	@Override
	public List<BoardVO> getList() {
		log.info("getList() ..");
		
		return boardMapper.getList();
	}

	@Override
	public BoardVO get(int bno) {
		log.info("get() ..");
		
		
		return boardMapper.read(bno);
	}

	@Override
	public int remove(int bno) {
		log.info("remove()..");
		
		return boardMapper.delete(bno);
	}

	@Override
	public int writeBoard(BoardVO board) {
		log.info("writeBoard()..");
		
		return boardMapper.insertBoard(board);
	}

	@Override
	public int modifyBoard(BoardVO board) {
		log.info("modifyBoard()..");
		
		return boardMapper.updateBoard(board);
	}

}
