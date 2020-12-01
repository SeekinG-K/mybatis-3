package com.alex.test.dao;

import com.alex.test.entry.User;
import com.alex.test.util.SessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserDao {

    SqlSession session = SessionUtil.getSession();

    public int insert(User user){
        int rint = session.insert("employeeMapper.insertUser",user); // 第一个参数是mapper xml里的namespace+MappedStatement对应的id
        session.commit();// 不要忘记提交
        return rint;
    }

  public List<Object> queryList(){
    List<Object> objects = session.selectList("employeeMapper.selectAll");// 第一个参数是mapper xml里的namespace+MappedStatement对应的id
    session.commit();// 不要忘记提交
    return objects;
  }

  public List<Object> queryForEachList(){
    List<Object> objects = session.selectList("employeeMapper.selectAll");// 第一个参数是mapper xml里的namespace+MappedStatement对应的id
    session.commit();// 不要忘记提交
    return objects;
  }
}
