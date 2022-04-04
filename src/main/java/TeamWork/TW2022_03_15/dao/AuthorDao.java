package TeamWork.TW2022_03_15.dao;


import TeamWork.TW2022_03_15.vo.Author;

import java.util.List;

/**
 * @author Wei
 * @create 2022/03/10  9:01
 */
public interface AuthorDao {

    //添加
    int add(Author author);

    //删除
    int delete(int id);

    //修改
    int modify(int id,String nation);

    //查询
        //返回是一个值
    int selectCount();

}
