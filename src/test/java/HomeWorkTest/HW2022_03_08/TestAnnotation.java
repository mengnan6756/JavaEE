package HomeWorkTest.HW2022_03_08;

import HomeWork.HW2022_03_08.controller.TestController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Wei
 * @create 2022/03/08  15:59
 */
public class TestAnnotation {
    public static void main(String[] args) {

        //1.解析配置文件获取容器
        ApplicationContext context =
        new ClassPathXmlApplicationContext("HW2022_03_08.xml");

        //2.获取实例
        TestController testController = (TestController)context.getBean("testController");

        //3.调用测试方法
        testController.save();
    }
}
