package com.mall.mapper;

import java.util.List;

import com.mall.bean.FirstMallClass;

public interface FirstClassMapper {
	
	
	public List<Integer> getAllFirstIds();
	//查询所有
	public List<FirstMallClass> getAllFirstClass();
	
}
