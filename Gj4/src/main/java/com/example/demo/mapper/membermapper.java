package com.example.demo.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.vo.member;

@Mapper
public interface membermapper {

	//creat
	@Insert("insert into member(name,username,password,email)"
			+ "values(#{name},#{username},#{password},#{email})")
	void add();
	
	
	//read
	@Select("select from member where username=#{username},passwored=#{password}")
	member querymember(String username,String password);
	
	@Select("select from member where username=#{username}")
	member queryusername(String username);
	//udpate
	
	
	
	//delete
	
	
	
}
