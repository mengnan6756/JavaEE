package HomeWork.HW2022_03_08.controller;

import HomeWork.HW2022_03_08.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author Wei
 * @create 2022/03/08  15:38
 * 该类为控制类
 */

//创建实例：value为唯一标识，若不写则默认为首字母小写的类名
@Controller(value = "testController") //该注解用于标识一个控制器组件类(Controller层)
public class TestController {

    //声明service对象
        //属性注入
    @Autowired  //该注解可以对类成员变量、方法、以及构造方法进行标注，完成自动装配的工作，消除setter方法和getter方法
    @Qualifier(value = "testService")   //与上面的注解搭配使用，通过名称指定
    private TestService testService;

    public void save(){
        //调用service对象的方法
        testService.save();
        System.out.println("testController save");

    }


}
