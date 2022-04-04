package TeamWork.TW2022_03_08;

import TeamWork.TW2022_03_08.dao.TestDao;
import TeamWork.TW2022_03_08.dao.TestDaoImpl;
import TeamWork.TW2022_03_08.dynamic.jdk.JDKProxyDynamicProxy;

/**
 * @author Wei
 * @create 2022/03/12  10:25
 */
public class TestJDKDynamic {

    public static void main(String[] args) {

        //创建被代理的对象
        TestDao testDao = new TestDaoImpl();
        //创建代理对象
        JDKProxyDynamicProxy proxy = new JDKProxyDynamicProxy();
        //从代理对象中获取增强后的目标对象
        TestDao testDaoService = (TestDao)proxy.createProxy(testDao);
        //调用增强后的方法
        testDaoService.save();


        //无增强
        testDaoService.delete();

        testDaoService.modify();
    }

}
