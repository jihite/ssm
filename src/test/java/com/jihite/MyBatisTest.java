package com.jihite;
import com.jihite.dao.BookDao;
import com.jihite.entity.Book;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisTest {
    @Test
    public void testMyBatis() {
        String resource = "mybatis-config2.xml";
        try {
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            BookDao bookDao = sqlSession.getMapper(BookDao.class);
            Book book = bookDao.queryById(1000);
            System.out.println(book);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
