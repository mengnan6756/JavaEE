package HomeWork.HW2022_02_28.Service;

import HomeWork.HW2022_02_28.Dao.HelloDao;

/**
 * @author Wei
 * @create 2022/02/28  9:49
 * 要求：使用两种注入方法对属性进行注入
 */
public class HelloService {

    //将dao接口作为本类的属性
    HelloDao helloDao;

//测试时只能取一个，必要时将其注释掉


    //1.通过构造方法注入
    public HelloService(HelloDao helloDao){
        this.helloDao = helloDao;
    }


    //2.通过setter方法注入
    public void setHelloDao(HelloDao helloDao) {
        this.helloDao = helloDao;
    }

    //调用helloDao中的方法
    public void sayHello(){
        helloDao.sayHello();
    }

}
