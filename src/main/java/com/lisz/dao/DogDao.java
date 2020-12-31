package com.lisz.dao;

import com.lisz.bean.Dog;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DogDao {
	//@ResultMap("myDog")
	public Dog findById(@Param("id") Integer id);
}
