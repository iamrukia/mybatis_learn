package service;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class MyBatisUtilOld {
    private static SqlSessionFactory factory;

    private MyBatisUtilOld() {
    }

    static
    {
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader("config/mybatis-config-old.xml");
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
        factory = new SqlSessionFactoryBuilder().build(reader);
    }

    public static SqlSessionFactory getSqlSessionFactory()
    {
        return factory;
    }
}
