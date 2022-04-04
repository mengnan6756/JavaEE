package HomeWork.HW2022_03_08.service;

import HomeWork.HW2022_03_08.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author Wei
 * @create 2022/03/08  15:38
 * 该类为service接口的实现类
 */

//创建实例：value为唯一标识，若不写则默认为首字母小写的类名
@Service(value = "testService") //该注解用于标识一个业务逻辑组件类(Service层)
public class TestServiceImpl implements TestService {

    //声明TestDao对象
        //注入属性
    @Autowired  //该注解可以对类成员变量、方法、以及构造方法进行标注，完成自动装配的工作，消除setter方法和getter方法
    @Qualifier(value = "testDao")   //与上面的注解搭配使用，通过名称指定
    private TestDao testDao;

    @Override
    public void save() {
        //调用dao对象的方法
        testDao.save();
        System.out.println("testService save");
    }
}
