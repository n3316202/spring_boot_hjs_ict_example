package edu.ict.ex.mapper;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.ict.ex.vo.BoardVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class BoardMapperTest {

	@Autowired
	private BoardMapper boardMapper;
	
	
	@Disabled
	@Test
	void testGetList() {
		System.out.println(boardMapper.getList());
		
		for(BoardVO vo : boardMapper.getList()) {
			System.out.println(vo);
		}
		
	}
	
	@Test
	void testRead() {
		System.out.println(boardMapper.read(29));		
	}
	
	@Test
	void testDelete() {
		
		int count = boardMapper.delete(29);
		
		System.out.println("삭제된 갯수" +  count);
		
		if( boardMapper.read(29) == null) {
			System.out.println("제되로 삭제되었음");
		}		
				
	}
}
