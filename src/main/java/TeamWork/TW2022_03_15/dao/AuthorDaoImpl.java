package TeamWork.TW2022_03_15.dao;


import TeamWork.TW2022_03_15.vo.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


/**
 * @author Wei
 * @create 2022/03/10  9:01
 *
 * dao实现类中注入JDBCTemplate模板
 */

//使用注解创建对象：该对象为dao层对象，使用@Repository对象
@Repository
public class AuthorDaoImpl implements AuthorDao {

    //注入JDBCTemplate模板对象
    @Autowired
    @Qualifier(value = "jdbcTemplate")
    JdbcTemplate jdbcTemplate;

    //添加
    @Override
    public int add(Author author) {

        Object[] args = {author.getId(),author.getAu_name(),author.getNation()};
        String sql = "insert into author values(?,?,?)";

        //调用update方法实现添加操作
            //参数1：sql语句
            //参数2：可变参数，设置sql语句中的值
        int update = jdbcTemplate.update(sql, args);
        return update;
    }

    //删除
    @Override
    public int delete(int id) {
        String sql ="delete from author where id = ?";
        int update = jdbcTemplate.update(sql, id);
        return update;
    }

    //修改
    @Override
    public int modify(int id,String nation) {
        String sql ="update author set nation =? where id = ?";
        int u = jdbcTemplate.update(sql, nation, id);
        return u;
    }


    //查询
    @Override
    public int selectCount() {

        /*
        查询表里面有多少个数，返回某个值
        使用JdbcTemplate实现查询返回某个值
            两个参数：
                1.sql语句
                2.返回类型class
         */
        String sql = "select count(*) from author";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        return  count;
    }


}
