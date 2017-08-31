package com.json.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.google.gson.Gson;
import com.mall.bean.Const;
import com.mall.bean.SecondMallClass;
import com.mall.factory.FactoryBulider;
import com.mall.mapper.FirstClassMapper;
import com.mall.mapper.SecondClassMapper;

public class ToJson3 {

public static void main(String[] args) throws IOException {
		
		SqlSessionFactory factory = FactoryBulider.getFactory();
		SqlSession session = factory.openSession();
		SecondClassMapper secondClassMapper = session.getMapper(SecondClassMapper.class);
		
		FirstClassMapper firstClassMapper = session.getMapper(FirstClassMapper.class);
		List<Integer> firstIds = firstClassMapper.getAllFirstIds();
		for (Integer flmch1 : firstIds) {
			List<SecondMallClass> secondClassByFirstId = secondClassMapper.getSecondClassByFirstId(flmch1);
			
			Gson gson = new Gson();
			String jsonStr = gson.toJson(secondClassByFirstId);
			FileOutputStream fos = new FileOutputStream(new File(Const.GENERNATE_JSON_PATH2 + flmch1 + Const.JSON_SUFFIX));
			fos.write(jsonStr.getBytes(Const.CHAR_ENCODE));
			if (fos != null) {
				fos.close();
			}
		}
		
	}
	
}
