package HomeWork.HW2022_03_01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Wei
 * @create 2022/03/01  11:37
 */
public class TestBeanLife {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("HW2022_03_01.xml");
        //创建对象过程中实现了构造方法的调用、参数注入、初始化
        BeanLife beanLife=(BeanLife)context.getBean("beanLife");
        //执行关闭资源的方法自动调用销毁方法
        context.close();

    }
}
