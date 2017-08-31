package com.mall.mapper;

import java.util.List;

import com.mall.bean.MallMark;

public interface MallMarkMapper {

	/**
	 * 
	 * @param flbh1 分类编号
	 * @return
	 */
	public List<MallMark> getMallMarkByFirstClassId(Integer flbh1);
	
}
