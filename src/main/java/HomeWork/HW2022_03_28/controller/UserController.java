package HomeWork.HW2022_03_28.controller;

import HomeWork.HW2022_03_28.dao.UserDao;
import HomeWork.HW2022_03_28.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * @author Wei
 * @create 2022/04/02  11:01
 */

@Controller()
public class UserController {

    @Qualifier("userDao")
    @Autowired
    private UserDao userDao;

    public void test() {
//根据id查找用户

        User user = userDao.selectUserById(4);
        System.out.println(user);
        System.out.println("====================");

//添加用户
        User user1 = new User(6, "猛男", "男");
        int i = userDao.addUser(user1);
        System.out.println("添加了"+i+"条记录");
        System.out.println("====================");

//修改用户
        User user2 = new User(2, "张涛", "男");
        int i1 = userDao.updateUser(user2);
        System.out.println("修改了"+i+"条记录");
        System.out.println("====================");

//根据id删除用户
        int i2 = userDao.removeUserById(5);
        System.out.println("删除了"+i+"条记录");
        System.out.println("====================");

//查找所有用户
        List<User> users = userDao.selectAllUsers();
        for (User u : users) {
            System.out.println(u);
        }
        System.out.println("====================");

    }
}
