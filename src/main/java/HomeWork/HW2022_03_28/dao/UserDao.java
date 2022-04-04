package HomeWork.HW2022_03_28.dao;

import HomeWork.HW2022_03_28.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Wei
 * @create 2022/04/02  9:49
 * dao类，该类的实现类为SQL映射文件，即对应的UserMapper.xml
 */
@Repository()
@Mapper
//使用spring自动扫描Mybatis的接口并装配
public interface UserDao {

    public User selectUserById(int id);
    public List<User> selectAllUsers();
    public int addUser(User user);
    public int updateUser(User user);
    public int removeUserById(int id);

}
