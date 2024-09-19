package edu.ict.ex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ict.ex.mapper.DeptMapper;
import edu.ict.ex.mapper.EmpMapper;
import edu.ict.ex.vo.DeptVO;
import edu.ict.ex.vo.EmpVO;

//Command 계층 = 비지니스 로직
@Service
public class EmpService {

	@Autowired
	private EmpMapper empMapper;
	
	public List<EmpVO> getList(){
		System.out.println("getList() ..");
		
		return empMapper.getList();
	}
	
	public int insert(EmpVO vo){
		System.out.println("insert() ..");
		
		return empMapper.insert(vo);
	}


}
