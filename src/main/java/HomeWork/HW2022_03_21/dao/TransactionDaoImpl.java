package HomeWork.HW2022_03_21.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

//使用注解创建实例
@Repository //该注解用于将数据库访问层(DAO)的类标识为bean
@Transactional  //开启事务
public class TransactionDaoImpl implements TransactionDao {

    //注入jdbc模板对象
    @Autowired
    JdbcTemplate jdbcTemplate;


    //删除
    @Override
    public void delete(String sql,Object[] param) {
        jdbcTemplate.update(sql,param);
    }

    //保存
    @Override
    public void save(String sql,Object[] param) {
        jdbcTemplate.update(sql,param);
    }

}
