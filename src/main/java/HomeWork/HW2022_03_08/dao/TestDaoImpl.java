package HomeWork.HW2022_03_08.dao;

import org.springframework.stereotype.Repository;

/**
 * @author Wei
 * @create 2022/03/08  15:37
 * 该类为dao接口的实现类
 */

//使用注解创建实例
@Repository(value = "testDao")  //该注解用于将数据库访问层(DAO)的类标识为bean
public class TestDaoImpl implements TestDao {

    @Override
    public void save() {
        System.out.println("testDao Save");
    }
}
