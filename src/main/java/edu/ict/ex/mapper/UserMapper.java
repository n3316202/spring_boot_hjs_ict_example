package edu.ict.ex.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import edu.ict.ex.page.Criteria;
import edu.ict.ex.vo.BoardVO;
import edu.ict.ex.vo.UserVO;

//마이바티스용 인터페이스라는걸 알려주는 애노테이션
@Mapper
public interface UserMapper {
	UserVO getUser(String username);
	
	@Insert("insert into users(username,password) VALUES (#{username},#{password})")
	int insertUser(UserVO userVO);
	
	@Insert("insert into authorities(username,authority) values(#{username},'ROLE_USER')")
	int insertAuthorities(UserVO userVO);
	
}
