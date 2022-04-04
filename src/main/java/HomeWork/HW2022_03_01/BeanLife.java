package HomeWork.HW2022_03_01;

/**
 * @author Wei
 * @create 2022/03/01  11:27
 * bean生命周期的验证：构造方法--属性注入--初始化--销毁
 */
public class BeanLife {
    //属性
    private String name;
    //验证构造方法
    public BeanLife(){
        System.out.println("1:执行构造方法");
    }
    //验证属性注入
    public void setName(String name) {
        this.name = name;
        System.out.println("2:执行属性注入方法");
    }
    //验证初始化
    public void initMyself(){
        System.out.println("3:执行初始化方法");
    }
    //验证销毁
    public void destroy(){
        System.out.println("4:执行销毁方法");
    }


}
