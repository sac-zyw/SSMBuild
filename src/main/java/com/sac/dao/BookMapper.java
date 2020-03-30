package com.sac.dao;

import com.sac.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author ShiAC
 * @date 2020/3/30
 */
public interface BookMapper {
    /**
     * 增加一本书
     * @param book
     * @return
     */
    int addBook(Books book);

    /**
     * 根据id删除书籍
     * @param id
     * @return
     */
    int deleteBookById(@Param("bookId") int id);

    /**
     * 更新一本书
     * @param book
     * @return
     */
    int updateBook(Books book);

    /**
     * 根据id查询一本书
     * @param id
     * @return
     */
    Books queryBookById(@Param("bookId") int id);

    /**
     * 查询全部书籍
     * @return
     */
    List<Books> queryAllBooks();
}
