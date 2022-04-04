package HomeWorkTest.HW2022_02_22;

import HomeWork.HW2022_02_22.dao.TestDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Wei
 * @create 2022/02/22  19:33
 */
public class TestHello {
    public static void main(String[] args) {

        //初始化Spring容器ApplicationContext对象，加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("hello.xml");

        //获取对象
        TestDaoImpl hello = (TestDaoImpl) applicationContext.getBean("hello");

        //调用对象的方法
        hello.sayHello();

    }
}
