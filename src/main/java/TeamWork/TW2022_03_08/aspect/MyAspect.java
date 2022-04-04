package TeamWork.TW2022_03_08.aspect;

/**
 * @author Wei
 * @create 2022/03/12  10:32
 * @Description 该类为切面类，定义了若干个增强方法(也称为通知)
 */
public class MyAspect {

    public void before(){
        System.out.println("这是一个前置通知！");
    }

    public void afterRunning(){
        System.out.println("这是一个后置通知");
    }

    public void after(){
        System.out.println("这是一个最终通知");
    }

}
