package TeamWork.TW2022_03_15.service;


import TeamWork.TW2022_03_15.dao.AuthorDao;
import TeamWork.TW2022_03_15.vo.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Wei
 * Service类中注入dao实现类对象
 */

//使用注解创建对象：该对象为Service层对象，使用@Service对象
@Service(value = "service")
public class AuthorService {

    //注入dao
    @Autowired
    private AuthorDao authorDao;    //使用子类对象替换父类，里氏替换原则


    //通过service层调用dao层中的方法
        //增加
    public void add(Author author){
        int add = authorDao.add(author);
        if (add!=0){
            System.out.println("添加成功，影响行数为："+add);
        }else {
            System.out.println("操作失败");
        }
    }

        //删除
    public void delete(int id){
        int delete = authorDao.delete(id);
        if (delete!=0){
            System.out.println("删除成功，影响行数为："+delete);
        }else {
            System.out.println("操作失败");
        }

    }


        //修改
    public void modify(int id,String nation){
        int modify = authorDao.modify(id,nation);

        if (modify!=0){
            System.out.println("修改成功，影响行数为："+modify);
        }else {
            System.out.println("操作失败");
        }

    }

        //查询
            //查询返回某个值
    public void selectCount(){
        int author = authorDao.selectCount();
        if (author!=0){
            System.out.println("查找成功，查找到的行数为："+author);
        }else {
            System.out.println("操作失败");
        }

    }

}
