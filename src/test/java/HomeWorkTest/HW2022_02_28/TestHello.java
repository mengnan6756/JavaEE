package HomeWorkTest.HW2022_02_28;

import HomeWork.HW2022_02_28.Service.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Wei
 * @create 2022/02/28  9:56
 */
public class TestHello {
    public static void main(String[] args) {
        //xml解析文件
        ApplicationContext context = new ClassPathXmlApplicationContext("HomeWork2.xml");

        //获取helloService对象
        HelloService helloService = (HelloService) context.getBean("helloService");

        //调用helloService中的方法
        helloService.sayHello();
    }
}
