package HomeWorkTest.HW_2022_03_21;

import HomeWork.HW2022_03_21.service.TransactionServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Wei
 * @create 2022/03/22  15:14
 */
public class TransactionTest {

    public static void main(String[] args) {

        //获取IOC容器
        ApplicationContext context =
                    new ClassPathXmlApplicationContext("HW2022_03_21.xml");

        TransactionServiceImpl service =(TransactionServiceImpl)context.getBean("transactionService", TransactionServiceImpl.class);

        service.test();
    }
}
