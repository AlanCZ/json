package com.mall.factory;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mall.bean.Const;

public class FactoryBulider {

	public static SqlSessionFactory getFactory() {

		String resource = Const.MAPPER_CONFIG_PATH;

		InputStream is = null;
		try {
			is = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}

		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);

		return sessionFactory;

	}

}
