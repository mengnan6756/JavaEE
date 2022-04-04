package TeamWork.TW2022_03_15;

import TeamWork.TW2022_03_15.service.AuthorService;
import TeamWork.TW2022_03_15.vo.Author;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Wei
 * @create 2022/03/15  16:13
 */
public class TestJDBCTemplate {
    public static void main(String[] args) {

        //获取容器对象
        ApplicationContext context =
                new ClassPathXmlApplicationContext("TW2022_03_15.xml");

        //获取对象
        AuthorService service =(AuthorService) context.getBean("service");

        //调用方法

            //创建Author对象用于测试
        Author author  = new Author();
        author.setId(5);
        author.setAu_name("张爱玲");
        author.setNation("中国");


        //增加
        service.add(author);

        //修改
        service.modify(4,"希腊");

        //删除
        service.delete(3);


        //查询
        service.selectCount();

    }
}
