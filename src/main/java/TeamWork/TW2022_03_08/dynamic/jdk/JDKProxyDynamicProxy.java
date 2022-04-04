package TeamWork.TW2022_03_08.dynamic.jdk;

import TeamWork.TW2022_03_08.aspect.MyAspect;
import TeamWork.TW2022_03_08.dao.TestDao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Wei
 * @create 2022/03/12  10:29
 */
public class JDKProxyDynamicProxy implements InvocationHandler {

    //声明目标类接口对象(真实对象)
    private TestDao testDao;

    //创建动态代理对象，建立代理和真实对象的关系，并返回代理对象
    public Object createProxy(TestDao testDao){

        //获取客户端传进来的目标对象
        this.testDao = testDao;

        /*
        方法参数说明：
        ClassLoader loader: 类加载器
        Class<?>[] interfaces： 被代理对象实现的所有接口的信息
        InvocationHandler h:    当前代理类对象，通过此对象调用增强方法
         */
        //1.类加载器
        ClassLoader classLoader = testDao.getClass().getClassLoader();

        //2.目标对象的实现的所有接口信息
        Class<?>[] interfaces = testDao.getClass().getInterfaces();

        //3.使用JDK自带的代理类进行增强，并返回动态代理对象
            //代理对象中含有目标对象的信息以及此代理类的信息（可以调用invoke方法）
        return Proxy.newProxyInstance(classLoader,interfaces,this);
    }



    /*
    该方法实现业务增强逻辑
    proxy 为被代理的对象
    method 为将要被执行的方法
    args 为将要被执行的方法的参数
    return 返回代理结果
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //创建切面类
        MyAspect myAspect = new MyAspect();


        //对目标对象的指定方法进行增强
        if (method.getName().equals("save")){
            //前增强
            myAspect.before();
        }

        //在目标类上调用方法并传入参数，相当于调用testDao中的方法
        Object obj = method.invoke(testDao, args);

        return obj;
    }


}
