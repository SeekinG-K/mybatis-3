package com.alex.test;

import com.alex.test.dao.BookDAO;
import com.alex.test.dao.UserDao;
import com.alex.test.entry.Book;
import com.alex.test.entry.User;
import com.alex.test.util.SessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;

public class MainTest {
  public static void main(String[] args) {
    SqlSession session = SessionUtil.getSession();
    BookDAO mapper = session.getMapper(BookDAO.class);

    List<Integer> list = new ArrayList<>();
    list.add(1);
    List<Book> allBooks = mapper.getAllBooks(list);
    allBooks.forEach(book -> {
      System.out.println(book.getPrice());
    });


  }
}
