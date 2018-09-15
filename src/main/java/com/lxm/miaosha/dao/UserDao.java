package com.lxm.miaosha.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.lxm.miaosha.domain.User;

@Mapper
public interface UserDao {
	@Select("select * from user where id = #{id}")//不需要写配置文件
	public User getById(@Param("id")int id);
	
	@Insert("insert into user(id, name) values(#{id}, #{name})")
	public int insert(User user);
}
