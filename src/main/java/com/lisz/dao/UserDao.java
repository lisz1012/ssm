package com.lisz.dao;

import com.lisz.bean.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserDao {

	public User findById(@Param("id") Integer id);

}
