package HomeWork.HW2022_03_21.service;

import HomeWork.HW2022_03_21.dao.TransactionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//创建实例：value为唯一标识，若不写则默认为首字母小写的类名
@Service("transactionService") //该注解用于标识一个业务逻辑组件类(Service层)
@Transactional(rollbackFor = {Exception.class})  //开启事务
public class TransactionServiceImpl implements TransactionService {

    //声明TestDao对象
        //注入属性
    @Autowired  //该注解可以对类成员变量、方法、以及构造方法进行标注，完成自动装配的工作，消除setter方法和getter方法
    private TransactionDao transactionDao;

    @Override
    public void test() {
        System.out.println("-----执行业务------");
        String sql1 = "delete from author where id = ?";
        Object[] param1 = {4};

        String sql2 = "insert into author values(?,?,?)";
        Object[] param2 = {6,"王小波","中国"};
        try{
            transactionDao.delete(sql1,param1);
            transactionDao.save(sql2,param2);
            //插入两条重复的数据
            transactionDao.save(sql2,param2);
        }catch (Exception e){
            System.out.println("主键重复，回滚");
            throw  new RuntimeException();
        }


    }
}
