package HomeWorkTest.HW2022_03_14;

import HomeWork.HW2022_03_14.dao.TestDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Wei
 * @create 2022/03/14  17:09
 */
public class AnnotationAspectJTest {

    public static void main(String[] args) {

        //读取XML配置文件，获取容器
        ApplicationContext context =
                new ClassPathXmlApplicationContext("HW2022_03_14.xml");
        //获取实例
        TestDao dao=(TestDao)context.getBean("testDao");

        //调用增强后的方法
        dao.save();
    }
}
