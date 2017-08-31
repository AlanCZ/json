package com.mall.mapper;

import java.util.List;

import com.mall.bean.SecondMallClass;

public interface SecondClassMapper {

	public List<SecondMallClass> getSecondClassByFirstId(Integer flmch1);
	
}
