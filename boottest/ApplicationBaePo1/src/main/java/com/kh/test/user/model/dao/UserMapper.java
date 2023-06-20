package com.kh.test.user.model.dao;

import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserMapper {

	String join(String userId);

}
