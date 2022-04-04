package HomeWorkTest.HW2022_03_28;

import HomeWork.HW2022_03_28.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Wei
 * @create 2022/04/02  10:00
 * 整合mybatis和spring的测试类
 */
public class MybatisSpringTest {
    public static void main(String[] args) {

        //读取配置文件获取IOC容器
        ApplicationContext context =
                new ClassPathXmlApplicationContext("HW2022_03_28.xml");
        UserController userController =(UserController) context.getBean("userController");
        userController.test();
    }

}
