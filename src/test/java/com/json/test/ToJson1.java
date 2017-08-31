package com.json.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.google.gson.Gson;
import com.mall.bean.Const;
import com.mall.bean.FirstMallClass;
import com.mall.factory.FactoryBulider;
import com.mall.mapper.FirstClassMapper;

public class ToJson1 {

	public static void main(String[] args) throws IOException {

		SqlSessionFactory sessionFactory = FactoryBulider.getFactory();
		SqlSession session = sessionFactory.openSession();
		FirstClassMapper fcMapper = session.getMapper(FirstClassMapper.class);

		List<FirstMallClass> classList = fcMapper.getAllFirstClass();

		Gson gson = new Gson();
		String jsonStr = gson.toJson(classList);

		FileOutputStream fos = new FileOutputStream(new File(Const.GENERNATE_JSON_PATH1 + Const.JSON_SUFFIX));
		fos.write(jsonStr.getBytes(Const.CHAR_ENCODE));
		if (fos != null) {
			fos.close();
		}
	}

}